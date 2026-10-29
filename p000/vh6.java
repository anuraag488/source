package p000;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vh6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32626a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f32627b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f32628c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ cp6 f32629d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean f32630e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ oj6 f32631f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f32632g;

    public /* synthetic */ vh6(byte b) {
        this.f32626a = b;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        dn6 dn6Var;
        AtomicReference atomicReference;
        switch (this.f32626a) {
            case 0:
                String str = this.f32628c;
                String str2 = this.f32627b;
                qx5 qx5Var = (qx5) this.f32632g;
                oj6 oj6Var = this.f32631f;
                oa6 oa6Var = (oa6) oj6Var.f36084a;
                Bundle bundle = new Bundle();
                try {
                    try {
                        s56 s56Var = oj6Var.f26789h;
                        if (s56Var == null) {
                            d76 d76Var = oa6Var.f26514f;
                            oa6.m9016l(d76Var);
                            d76Var.f16835j.m12506c("Failed to get user properties; not connected to service", str2, str);
                            dn6Var = oa6Var.f26517i;
                            oa6.m9014j(dn6Var);
                            dn6Var.m4608h0(qx5Var, bundle);
                            return;
                        }
                        List<xm6> listMo5580w = s56Var.mo5580w(str2, str, this.f32630e, this.f32629d);
                        Bundle bundle2 = new Bundle();
                        if (listMo5580w != null) {
                            for (xm6 xm6Var : listMo5580w) {
                                String str3 = xm6Var.f34431h;
                                String str4 = xm6Var.f34428e;
                                if (str3 != null) {
                                    bundle2.putString(str4, str3);
                                } else {
                                    Long l = xm6Var.f34430g;
                                    if (l != null) {
                                        bundle2.putLong(str4, l.longValue());
                                    } else {
                                        Double d = xm6Var.f34433j;
                                        if (d != null) {
                                            bundle2.putDouble(str4, d.doubleValue());
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            oj6Var.m9139I();
                            dn6 dn6Var2 = oa6Var.f26517i;
                            oa6.m9014j(dn6Var2);
                            dn6Var2.m4608h0(qx5Var, bundle2);
                            return;
                        } catch (RemoteException e) {
                            e = e;
                            bundle = bundle2;
                            d76 d76Var2 = oa6Var.f26514f;
                            oa6.m9016l(d76Var2);
                            d76Var2.f16835j.m12506c("Failed to get user properties; remote exception", str2, e);
                            dn6Var = oa6Var.f26517i;
                            oa6.m9014j(dn6Var);
                            dn6Var.m4608h0(qx5Var, bundle);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bundle = bundle2;
                            dn6 dn6Var3 = oa6Var.f26517i;
                            oa6.m9014j(dn6Var3);
                            dn6Var3.m4608h0(qx5Var, bundle);
                            throw th;
                        }
                    } catch (RemoteException e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.f32632g;
                synchronized (atomicReference2) {
                    try {
                        try {
                            oj6 oj6Var2 = this.f32631f;
                            s56 s56Var2 = oj6Var2.f26789h;
                            if (s56Var2 == null) {
                                d76 d76Var3 = ((oa6) oj6Var2.f36084a).f26514f;
                                oa6.m9016l(d76Var3);
                                d76Var3.f16835j.m12507d("(legacy) Failed to get user properties; not connected to service", null, this.f32627b, this.f32628c);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(s56Var2.mo5580w(this.f32627b, this.f32628c, this.f32630e, this.f32629d));
                            } else {
                                atomicReference2.set(s56Var2.mo5566b(null, this.f32627b, this.f32628c, this.f32630e));
                            }
                            oj6Var2.m9139I();
                            atomicReference = (AtomicReference) this.f32632g;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e3) {
                            d76 d76Var4 = ((oa6) this.f32631f.f36084a).f26514f;
                            oa6.m9016l(d76Var4);
                            d76Var4.f16835j.m12507d("(legacy) Failed to get user properties; remote exception", null, this.f32627b, e3);
                            ((AtomicReference) this.f32632g).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f32632g;
                        }
                    } catch (Throwable th3) {
                        ((AtomicReference) this.f32632g).notify();
                        throw th3;
                    }
                }
                break;
        }
    }
}
