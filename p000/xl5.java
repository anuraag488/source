package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.lang.invoke.VarHandle;
import java.util.Set;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xl5 extends mh5 implements rt1, st1 {

    /* JADX INFO: renamed from: q */
    public static final ll5 f34392q = zl5.f36171a;

    /* JADX INFO: renamed from: j */
    public Context f34393j;

    /* JADX INFO: renamed from: k */
    public km5 f34394k;

    /* JADX INFO: renamed from: l */
    public ll5 f34395l;

    /* JADX INFO: renamed from: m */
    public Set f34396m;

    /* JADX INFO: renamed from: n */
    public C0602e8 f34397n;

    /* JADX INFO: renamed from: o */
    public p64 f34398o;

    /* JADX INFO: renamed from: p */
    public bt0 f34399p;

    @Override // p000.rt1
    public final void onConnected() {
        GoogleSignInAccount googleSignInAccountM4060a;
        p64 p64Var = this.f34398o;
        p64Var.getClass();
        try {
            p64Var.f27404d.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                sc4 sc4VarM10627a = sc4.m10627a(p64Var.getContext());
                String strM10628b = sc4VarM10627a.m10628b("defaultGoogleSignInAccount");
                if (!TextUtils.isEmpty(strM10628b)) {
                    String strM10628b2 = sc4VarM10627a.m10628b("googleSignInAccount:" + strM10628b);
                    if (strM10628b2 != null) {
                        try {
                            googleSignInAccountM4060a = GoogleSignInAccount.m4060a(strM10628b2);
                        } catch (JSONException unused) {
                            googleSignInAccountM4060a = null;
                        }
                    }
                }
                googleSignInAccountM4060a = null;
            } else {
                googleSignInAccountM4060a = null;
            }
            Integer num = p64Var.f27406f;
            y42.m12854a0(num);
            jm5 jm5Var = new jm5(2, account, num.intValue(), googleSignInAccountM4060a);
            bm5 bm5Var = (bm5) p64Var.getService();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(bm5Var.f23221c);
            int i = sl5.f30377a;
            parcelObtain.writeInt(1);
            int iM9092Q = oh6.m9092Q(parcelObtain, 20293);
            oh6.m9091P(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            oh6.m9087L(parcelObtain, 2, jm5Var, 0);
            oh6.m9094S(parcelObtain, iM9092Q);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                bm5Var.f23220b.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                gm5 gm5Var = new gm5(1, new lk0(8, null, null), null);
                ar1 ar1Var = new ar1((byte) 7);
                ar1Var.f14799c = this;
                ar1Var.f14798b = gm5Var;
                VarHandle.storeStoreFence();
                this.f34394k.post(ar1Var);
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // p000.st1
    public final void onConnectionFailed(lk0 lk0Var) {
        this.f34399p.m3673f(lk0Var);
    }

    @Override // p000.rt1
    public final void onConnectionSuspended(int i) {
        bt0 bt0Var = this.f34399p;
        ol5 ol5Var = (ol5) ((tt1) bt0Var.f15569f).f31420j.get((C0458al) bt0Var.f15566c);
        if (ol5Var != null) {
            if (ol5Var.f26864i) {
                ol5Var.m9181m(new lk0(17, null, null));
            } else {
                ol5Var.onConnectionSuspended(i);
            }
        }
    }
}
