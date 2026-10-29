package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import internal.p002J.AbstractC0768N;
import java.io.IOException;
import java.util.Locale;
import org.chromium.net.HttpNegotiateAuthenticator;
import org.chromium.net.NetError;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zb6 implements AccountManagerCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35934a;

    /* JADX INFO: renamed from: b */
    public qh6 f35935b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ HttpNegotiateAuthenticator f35936c;

    public /* synthetic */ zb6(byte b) {
        this.f35934a = b;
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture accountManagerFuture) {
        switch (this.f35934a) {
            case 0:
                qh6 qh6Var = this.f35935b;
                long j = qh6Var.f28484a;
                try {
                    Account[] accountArr = (Account[]) accountManagerFuture.getResult();
                    int length = accountArr.length;
                    if (length != 0) {
                        byte b = 1;
                        if (length <= 1) {
                            HttpNegotiateAuthenticator httpNegotiateAuthenticator = this.f35936c;
                            if (!httpNegotiateAuthenticator.lacksPermission(x06.f33904a, "android.permission.USE_CREDENTIALS", true)) {
                                Account account = accountArr[0];
                                qh6Var.f28488e = account;
                                AccountManager accountManager = qh6Var.f28485b;
                                String str = qh6Var.f28487d;
                                Bundle bundle = qh6Var.f28486c;
                                zb6 zb6Var = new zb6(b);
                                zb6Var.f35936c = httpNegotiateAuthenticator;
                                zb6Var.f35935b = qh6Var;
                                accountManager.getAuthToken(account, str, bundle, true, (AccountManagerCallback<Bundle>) zb6Var, new Handler(i20.m6575J().getLooper()));
                            } else {
                                Log.e("cn_net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.");
                                AbstractC0768N.M0s8NeYn(j, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
                            }
                        } else {
                            Locale locale = Locale.US;
                            Log.w("cn_net_auth", "ERR_MISSING_AUTH_CREDENTIALS: Found " + length + " accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.");
                            AbstractC0768N.M0s8NeYn(j, NetError.ERR_MISSING_AUTH_CREDENTIALS, null);
                        }
                    } else {
                        Log.w("cn_net_auth", "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ");
                        AbstractC0768N.M0s8NeYn(j, NetError.ERR_MISSING_AUTH_CREDENTIALS, null);
                    }
                } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                    Log.w("cn_net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e);
                    AbstractC0768N.M0s8NeYn(j, -9, null);
                    return;
                }
                break;
            default:
                qh6 qh6Var2 = this.f35935b;
                try {
                    Bundle bundle2 = (Bundle) accountManagerFuture.getResult();
                    if (!bundle2.containsKey("intent")) {
                        this.f35936c.processResult(bundle2, qh6Var2);
                    } else {
                        Context context = x06.f33904a;
                        context.registerReceiver(new q30(this, context), new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"), null, null, 0);
                    }
                } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
                    Log.w("cn_net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", e2);
                    AbstractC0768N.M0s8NeYn(qh6Var2.f28484a, -9, null);
                }
                break;
        }
    }
}
