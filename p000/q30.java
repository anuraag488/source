package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import java.lang.invoke.VarHandle;
import org.chromium.net.HttpNegotiateAuthenticator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q30 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28191a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f28192b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f28193c;

    public q30(zb6 zb6Var, Context context) {
        this.f28192b = context;
        this.f28193c = zb6Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        byte b = this.f28191a;
        Object obj = this.f28193c;
        Object obj2 = this.f28192b;
        switch (b) {
            case 0:
                if (!z62.m13387o(intent.getPackage(), ((C0950nl) obj2).f25922c)) {
                    ((mg3) obj).mo5493n(intent);
                }
                break;
            default:
                ((Context) obj2).unregisterReceiver(this);
                zb6 zb6Var = (zb6) obj;
                qh6 qh6Var = zb6Var.f35935b;
                AccountManager accountManager = qh6Var.f28485b;
                Account account = qh6Var.f28488e;
                String str = qh6Var.f28487d;
                Bundle bundle = qh6Var.f28486c;
                HttpNegotiateAuthenticator httpNegotiateAuthenticator = zb6Var.f35936c;
                zb6 zb6Var2 = new zb6((byte) 1);
                zb6Var2.f35936c = httpNegotiateAuthenticator;
                zb6Var2.f35935b = qh6Var;
                VarHandle.storeStoreFence();
                accountManager.getAuthToken(account, str, bundle, true, (AccountManagerCallback<Bundle>) zb6Var2, (Handler) null);
                break;
        }
    }

    public q30(C0950nl c0950nl, mg3 mg3Var) {
        this.f28192b = c0950nl;
        this.f28193c = mg3Var;
    }
}
