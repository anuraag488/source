package p000;

import ads_mobile_sdk.C0313rh;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.invoke.VarHandle;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tu5 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31461a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f31462b;

    public /* synthetic */ tu5(byte b) {
        this.f31461a = b;
    }

    /* JADX WARN: Code duplicated, block: B:94:0x0207 A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:66:0x017b, B:68:0x0188, B:73:0x019b, B:76:0x01ab, B:80:0x01b5, B:82:0x01b9, B:84:0x01c4, B:86:0x01d1, B:90:0x01e2, B:91:0x01fb, B:88:0x01d9, B:92:0x01fe, B:94:0x0207, B:95:0x0210, B:74:0x01a7, B:71:0x0193), top: B:109:0x017b }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0216  */
    /* JADX WARN: Code duplicated, block: B:98:0x021f  */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        nq5 nq5Var;
        int i;
        int i2 = 0;
        int i3 = 1;
        switch (this.f31461a) {
            case 0:
                zu5 zu5Var = (zu5) this.f31462b;
                C0927mz c0927mz = zu5Var.f36397e;
                synchronized (c0927mz.f25313a) {
                    try {
                        if (c0927mz.f25314b != 3) {
                            boolean z = c0927mz.f25314b == 1;
                            if (TextUtils.isEmpty(null)) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                                qv5.m10134b(bundle, c0927mz.f25316d, c0927mz.f25311D.longValue());
                            }
                            synchronized (c0927mz.f25313a) {
                                nq5Var = c0927mz.f25321i;
                                break;
                            }
                            C0927mz c0927mz2 = zu5Var.f36397e;
                            if (nq5Var == null) {
                                c0927mz2.m8435D(0);
                                int i4 = zu5Var.f36396d;
                                f00 f00Var = rz5.f29767j;
                                c0927mz2.m8434C(C0313rh.f10790h1, i4, f00Var);
                                zu5Var.m13799d(f00Var);
                            } else {
                                String packageName = c0927mz2.f25319g.getPackageName();
                                try {
                                    eq5 eq5Var = (eq5) nq5Var;
                                    if (eq5Var.m5279N(packageName, 25, "inapp") == 0) {
                                        C0927mz c0927mz3 = zu5Var.f36397e;
                                        Context context = c0927mz3.f25319g;
                                        synchronized (d24.class) {
                                        }
                                        synchronized (d24.class) {
                                        }
                                        synchronized (d24.class) {
                                        }
                                        synchronized (d24.class) {
                                        }
                                        long jMin = 100;
                                        Exception e = null;
                                        while (true) {
                                            long j = i2;
                                            if (j <= 3) {
                                                try {
                                                    Boolean boolValueOf = Boolean.valueOf(z);
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putString("callingPackage", c0927mz3.f25319g.getPackageName());
                                                    qv5.m10134b(bundle2, c0927mz3.f25316d, c0927mz3.f25311D.longValue());
                                                    if (c0927mz3.f25337y != null) {
                                                        bundle2.putBoolean("enablePendingPurchases", true);
                                                    }
                                                    eq5Var.m5288W(c0927mz3.f25319g.getPackageName(), bundle2, new fw5(c0927mz3, zu5Var, boolValueOf, i2));
                                                } catch (SecurityException e2) {
                                                    zu5Var.m13800e(e2, z, i2);
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    if (j != 3) {
                                                        qv5.m10141i("BillingClient", "Transient error during initialize(), retrying in " + jMin + "ms", e);
                                                        try {
                                                            Thread.sleep(jMin);
                                                            jMin = (long) Math.min(jMin * 2.0d, 60000.0d);
                                                            i2++;
                                                        } catch (InterruptedException e4) {
                                                            Thread.currentThread().interrupt();
                                                            zu5Var.m13800e(e4, z, i2);
                                                        }
                                                    } else {
                                                        zu5Var.m13800e(e, z, i2);
                                                    }
                                                }
                                            }
                                        }
                                        zu5Var.m13800e(e, z, i2);
                                    } else {
                                        int iM5279N = 3;
                                        int i5 = 29;
                                        while (true) {
                                            if (i5 >= 3) {
                                                try {
                                                    qv5.m10139g("BillingClient", c75.m3877i(i5, "trying subs apiVersion: "));
                                                    iM5279N = bundle == null ? eq5Var.m5279N(packageName, i5, "subs") : eq5Var.m5280O(i5, packageName, "subs", bundle);
                                                    if (iM5279N == 0) {
                                                        qv5.m10139g("BillingClient", c75.m3877i(i5, "highestLevelSupportedForSubs: "));
                                                    } else {
                                                        i5--;
                                                    }
                                                } catch (Exception e5) {
                                                    zu5Var.m13801f(e5, z);
                                                }
                                            } else {
                                                i5 = 0;
                                            }
                                        }
                                        C0927mz c0927mz4 = zu5Var.f36397e;
                                        c0927mz4.getClass();
                                        c0927mz4.f25323k = i5 >= 3;
                                        if (i5 < 3) {
                                            qv5.m10139g("BillingClient", "In-app billing API does not support subscription on this device.");
                                            i3 = 9;
                                        }
                                        for (int i6 = 29; i6 >= 3; i6--) {
                                            qv5.m10139g("BillingClient", c75.m3877i(i6, "trying inapp apiVersion: "));
                                            iM5279N = bundle == null ? eq5Var.m5279N(packageName, i6, "inapp") : eq5Var.m5280O(i6, packageName, "inapp", bundle);
                                            if (iM5279N == 0) {
                                                c0927mz4.f25324l = i6;
                                                qv5.m10139g("BillingClient", "mHighestLevelSupportedForInApp: " + i6);
                                                C0927mz.m8429q(c0927mz4, c0927mz4.f25324l);
                                                if (c0927mz4.f25324l < 3) {
                                                    qv5.m10140h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                                    i3 = 36;
                                                }
                                                i = i3;
                                                C0927mz.m8430r(c0927mz4, iM5279N);
                                                if (iM5279N == 0) {
                                                    zu5Var.m13798c(0, z);
                                                    zu5Var.m13799d(rz5.f29766i);
                                                } else {
                                                    f00 f00Var2 = rz5.f29759b;
                                                    zu5Var.m13797b(f00Var2, i, null, z, 0);
                                                    zu5Var.m13799d(f00Var2);
                                                }
                                            }
                                        }
                                        C0927mz.m8429q(c0927mz4, c0927mz4.f25324l);
                                        if (c0927mz4.f25324l < 3) {
                                            qv5.m10140h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                            i3 = 36;
                                        }
                                        i = i3;
                                        C0927mz.m8430r(c0927mz4, iM5279N);
                                        if (iM5279N == 0) {
                                            zu5Var.m13798c(0, z);
                                            zu5Var.m13799d(rz5.f29766i);
                                        } else {
                                            f00 f00Var3 = rz5.f29759b;
                                            zu5Var.m13797b(f00Var3, i, null, z, 0);
                                            zu5Var.m13799d(f00Var3);
                                        }
                                    }
                                } catch (Exception e6) {
                                    zu5Var.m13801f(e6, z);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return null;
            case 1:
                bt5 bt5Var = ((n96) this.f31462b).f25588o;
                ee6 ee6Var = new ee6("internal.logger", (byte) 2);
                ee6Var.f18038d = bt5Var;
                HashMap map = ee6Var.f17272b;
                map.put("log", new eq6(ee6Var, false, true));
                map.put("silent", new dj6("silent", (byte) 1));
                ((dp5) map.get("silent")).mo4623c("log", new eq6(ee6Var, true, true));
                map.put("unmonitored", new dj6("unmonitored", (byte) 2));
                ((dp5) map.get("unmonitored")).mo4623c("log", new eq6(ee6Var, false, false));
                VarHandle.storeStoreFence();
                return ee6Var;
            default:
                qm6 qm6Var = ((jc6) this.f31462b).f22167a;
                qm6Var.m9928A();
                q76 q76Var = qm6Var.f28598h;
                qm6.m9925S(q76Var);
                q76Var.mo5038t();
                throw new IllegalStateException("Unexpected call on client side");
        }
    }
}
