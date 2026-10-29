package p000;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wb6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33223a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f33224b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f33225c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f33226d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f33227e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f33228f;

    public /* synthetic */ wb6(byte b) {
        this.f33223a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        dn6 dn6Var;
        String str;
        switch (this.f33223a) {
            case 0:
                jc6 jc6Var = (jc6) this.f33226d;
                cp6 cp6Var = (cp6) this.f33225c;
                Bundle bundle = (Bundle) this.f33227e;
                x56 x56Var = (x56) this.f33228f;
                String str2 = (String) this.f33224b;
                qm6 qm6Var = jc6Var.f22167a;
                qm6Var.m9928A();
                try {
                    x56Var.mo10982t(qm6Var.m9949b0(bundle, cp6Var));
                    return;
                } catch (RemoteException e) {
                    qm6Var.mo9019b().f16835j.m12506c("Failed to return trigger URIs for app", str2, e);
                    return;
                }
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) this.f33226d;
                synchronized (atomicReference2) {
                    try {
                        try {
                            oj6 oj6Var = (oj6) this.f33228f;
                            s56 s56Var = oj6Var.f26789h;
                            if (s56Var == null) {
                                d76 d76Var = ((oa6) oj6Var.f36084a).f26514f;
                                oa6.m9016l(d76Var);
                                d76Var.f16835j.m12507d("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.f33224b, (String) this.f33227e);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(s56Var.mo5575p((String) this.f33224b, (String) this.f33227e, (cp6) this.f33225c));
                            } else {
                                atomicReference2.set(s56Var.mo5574n(null, (String) this.f33224b, (String) this.f33227e));
                            }
                            oj6Var.m9139I();
                            atomicReference = (AtomicReference) this.f33226d;
                            atomicReference.notify();
                            return;
                        } catch (Throwable th) {
                            ((AtomicReference) this.f33226d).notify();
                            throw th;
                        }
                    } catch (RemoteException e2) {
                        d76 d76Var2 = ((oa6) ((oj6) this.f33228f).f36084a).f26514f;
                        oa6.m9016l(d76Var2);
                        d76Var2.f16835j.m12507d("(legacy) Failed to get conditional properties; remote exception", null, (String) this.f33224b, e2);
                        ((AtomicReference) this.f33226d).set(Collections.EMPTY_LIST);
                        atomicReference = (AtomicReference) this.f33226d;
                    }
                }
                break;
            case 2:
                qx5 qx5Var = (qx5) this.f33227e;
                String str3 = (String) this.f33226d;
                String str4 = (String) this.f33224b;
                oj6 oj6Var2 = (oj6) this.f33228f;
                oa6 oa6Var = (oa6) oj6Var2.f36084a;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        s56 s56Var2 = oj6Var2.f26789h;
                        if (s56Var2 == null) {
                            d76 d76Var3 = oa6Var.f26514f;
                            oa6.m9016l(d76Var3);
                            d76Var3.f16835j.m12506c("Failed to get conditional properties; not connected to service", str4, str3);
                            dn6Var = oa6Var.f26517i;
                        } else {
                            arrayList = dn6.m4572j0(s56Var2.mo5575p(str4, str3, (cp6) this.f33225c));
                            oj6Var2.m9139I();
                            dn6Var = oa6Var.f26517i;
                        }
                    } catch (RemoteException e3) {
                        d76 d76Var4 = oa6Var.f26514f;
                        oa6.m9016l(d76Var4);
                        d76Var4.f16835j.m12507d("Failed to get conditional properties; remote exception", str4, str3, e3);
                    }
                    oa6.m9014j(dn6Var);
                    dn6Var.m4609i0(qx5Var, arrayList);
                    return;
                } catch (Throwable th2) {
                    dn6 dn6Var2 = oa6Var.f26517i;
                    oa6.m9014j(dn6Var2);
                    dn6Var2.m4609i0(qx5Var, arrayList);
                    throw th2;
                }
            case 3:
                wo5 wo5Var = (wo5) this.f33226d;
                Handler handler = (Handler) wo5Var.f33567b;
                fx5 fx5Var = (fx5) wo5Var.f33574i;
                Activity activity = (Activity) this.f33225c;
                f70 f70Var = (f70) this.f33227e;
                cl0 cl0Var = (cl0) this.f33228f;
                bl0 bl0Var = (bl0) this.f33224b;
                try {
                    f70Var.getClass();
                    Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + kx5.m7743x0((Application) wo5Var.f33566a) + "\") to set this as a debug device.");
                    e00 e00VarM10193d = ((r36) wo5Var.f33572g).m10193d(wo5Var.m12351g(((yg3) wo5Var.f33571f).m13124v(activity, f70Var)));
                    mq5 mq5Var = (mq5) wo5Var.f33569d;
                    mq5Var.f25152b.edit().putInt("consent_status", e00VarM10193d.f17552a).commit();
                    int i = e00VarM10193d.f17553b;
                    SharedPreferences.Editor editorEdit = mq5Var.f25152b.edit();
                    if (i == 1) {
                        str = "UNKNOWN";
                    } else if (i == 2) {
                        str = "NOT_REQUIRED";
                    } else {
                        if (i != 3) {
                            throw null;
                        }
                        str = "REQUIRED";
                    }
                    editorEdit.putString("privacy_options_requirement_status", str).commit();
                    ((gu5) wo5Var.f33570e).f20143c.set((hu5) e00VarM10193d.f17554c);
                    fx5Var.m5845a((Queue) fx5Var.f19398f.get(), 8, 9, null);
                    Executor executor = ((c16) wo5Var.f33573h).f15758a;
                    yn3 yn3Var = new yn3((byte) 24);
                    yn3Var.f35360b = wo5Var;
                    yn3Var.f35361c = cl0Var;
                    yn3Var.f35362d = e00VarM10193d;
                    VarHandle.storeStoreFence();
                    executor.execute(yn3Var);
                    return;
                } catch (RuntimeException e4) {
                    fx5Var.m5845a((Queue) fx5Var.f19398f.get(), 8, 9, "RequestConsentUpdate RuntimeException. ".concat(String.valueOf(e4.getMessage())));
                    n56 n56Var = new n56(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e4))));
                    dq6 dq6Var = new dq6((byte) 0);
                    dq6Var.f17289b = bl0Var;
                    dq6Var.f17290c = n56Var;
                    VarHandle.storeStoreFence();
                    handler.post(dq6Var);
                    return;
                } catch (n56 e5) {
                    fx5Var.m5845a((Queue) fx5Var.f19398f.get(), 8, 9, c75.m3879k("RequestConsentUpdate exception. Error: ", e5.getMessage(), ", cause: ", String.valueOf(e5.getCause())));
                    oz5 oz5Var = new oz5((byte) 28);
                    oz5Var.f27249b = bl0Var;
                    oz5Var.f27250c = e5;
                    VarHandle.storeStoreFence();
                    handler.post(oz5Var);
                    return;
                }
            default:
                wp5 wp5Var = (wp5) this.f33226d;
                String str5 = (String) this.f33224b;
                String str6 = (String) this.f33225c;
                Bundle bundle2 = (Bundle) this.f33227e;
                lo5 lo5Var = (lo5) this.f33228f;
                try {
                    b86 b86Var = (b86) wp5Var.f33584b.f16551l;
                    if (b86Var == null) {
                        return;
                    }
                    ((k36) b86Var).m7366N(wp5Var.f33583a.getPackageName(), str5, str6, bundle2, lo5Var);
                    return;
                } catch (DeadObjectException e6) {
                    Log.e("HsdpClientImpl", "hsdpService is dead", e6);
                    return;
                } catch (RemoteException e7) {
                    Log.e("HsdpClientImpl", "Failed to call hsdpService.show", e7);
                    return;
                }
        }
    }
}
