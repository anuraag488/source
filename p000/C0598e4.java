package p000;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: e4 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0598e4 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f17677a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ bs4 f17678b;

    public /* synthetic */ C0598e4(byte b) {
        this.f17677a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.f17677a) {
            case 0:
                mw3 mw3Var = (mw3) ((aj0) obj).mo2998b(qw3.m10145a());
                bs4 bs4Var = this.f17678b;
                Object obj3 = mw3Var.f25263a.get(bs4Var);
                if (obj3 == null) {
                    obj3 = qw3.f28853d;
                }
                if (obj3 != qw3.f28853d) {
                    return obj3;
                }
                C1354y3 c1354y3 = new C1354y3();
                c1354y3.f34828a = k43.m7398w(null);
                c1354y3.f34829b = new w94();
                c1354y3.f34830c = new w94();
                c1354y3.f34831d = new w94();
                VarHandle.storeStoreFence();
                mw3Var.f25263a.put(bs4Var, c1354y3);
                return c1354y3;
            case 1:
                aj0 aj0Var = (aj0) obj;
                mw3 mw3Var2 = (mw3) aj0Var.mo2998b(qw3.m10145a());
                bs4 bs4Var2 = this.f17678b;
                Object obj4 = mw3Var2.f25263a.get(bs4Var2);
                if (obj4 == null) {
                    obj4 = qw3.f28853d;
                }
                if (obj4 != qw3.f28853d) {
                    return obj4;
                }
                xz4 xz4Var = (xz4) aj0Var.mo2998b(la1.f23888a);
                Context applicationContext = ((Context) aj0Var.mo2998b(AndroidCompositionLocals_androidKt.f14651b)).getApplicationContext();
                C0459am c0459am = (C0459am) aj0Var.mo2998b(AbstractC0496bm.m3626a());
                xn2 xn2Var = (xn2) aj0Var.mo2998b(yn2.f35357b);
                xn2 xn2VarM12723c = xn2Var != null ? xn2Var.m12723c("AdState") : null;
                C0898m6 c0898m6 = new C0898m6((byte) 0);
                c0898m6.f24677b = xz4Var;
                VarHandle.storeStoreFence();
                C0861l6 c0861l6 = new C0861l6();
                c0861l6.f23812a = c0898m6;
                c0861l6.f23813b = (dc6) ((cr6) wo5.m12345f(applicationContext).f33573h).mo4146j();
                c0861l6.f23814c = k43.m7398w(Boolean.FALSE);
                c0861l6.f23815d = lb5.m7910S(zp0.m13670b(c0459am.f14619a), null, cp0.f16326b, new C0824k6(c0861l6, xn2VarM12723c, applicationContext, null), 1);
                VarHandle.storeStoreFence();
                mw3Var2.f25263a.put(bs4Var2, c0861l6);
                return c0861l6;
            case 2:
                aj0 aj0Var2 = (aj0) obj;
                mw3 mw3Var3 = (mw3) aj0Var2.mo2998b(qw3.m10145a());
                bs4 bs4Var3 = this.f17678b;
                Object obj5 = mw3Var3.f25263a.get(bs4Var3);
                Object obj6 = obj5;
                if (obj5 == null) {
                    obj6 = qw3.f28853d;
                }
                Object obj7 = obj6;
                if (obj6 == qw3.f28853d) {
                    xn2 xn2Var2 = (xn2) aj0Var2.mo2998b(yn2.f35357b);
                    xn2 xn2VarM12723c2 = xn2Var2 != null ? xn2Var2.m12723c("Analytics") : null;
                    if (((Boolean) AbstractC1138sa.f30028c.m11153t((a44) aj0Var2.mo2998b(h44.m6217a()), AbstractC1138sa.f30026a[0])).booleanValue()) {
                        Context context = (Context) aj0Var2.mo2998b(AndroidCompositionLocals_androidKt.f14651b);
                        synchronized (hg1.f20543k) {
                            try {
                                if (hg1.f20544l.containsKey("[DEFAULT]")) {
                                    hg1.m6386c();
                                } else {
                                    ug1 ug1VarM11543a = ug1.m11543a(context);
                                    if (ug1VarM11543a == null) {
                                        Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                                    } else {
                                        hg1.m6387f(context, ug1VarM11543a);
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (c20.f15759a == null) {
                            synchronized (c20.f15760b) {
                                if (c20.f15759a == null) {
                                    hg1 hg1VarM6386c = hg1.m6386c();
                                    hg1VarM6386c.m6388a();
                                    c20.f15759a = FirebaseAnalytics.getInstance(hg1VarM6386c.f20545a);
                                }
                            }
                        }
                        FirebaseAnalytics firebaseAnalytics = c20.f15759a;
                        C1101ra c1101ra = new C1101ra();
                        c1101ra.f29107a = xn2VarM12723c2;
                        c1101ra.f29108b = firebaseAnalytics;
                        VarHandle.storeStoreFence();
                        obj2 = c1101ra;
                    } else {
                        C1064qa c1064qa = new C1064qa();
                        c1064qa.f28330a = xn2VarM12723c2;
                        VarHandle.storeStoreFence();
                        obj2 = c1064qa;
                    }
                    mw3Var3.f25263a.put(bs4Var3, obj2);
                    obj7 = obj2;
                    break;
                }
                return obj7;
            case 3:
                mw3 mw3Var4 = (mw3) ((aj0) obj).mo2998b(qw3.m10145a());
                bs4 bs4Var4 = this.f17678b;
                Object obj8 = mw3Var4.f25263a.get(bs4Var4);
                if (obj8 == null) {
                    obj8 = qw3.f28853d;
                }
                if (obj8 != qw3.f28853d) {
                    return obj8;
                }
                s92 s92Var = i92.f21187c.f21188a;
                ka2 ka2Var = new ka2(new s92(true, true, (q90) s92Var.f30012e, s92Var.f30011d));
                mw3Var4.f25263a.put(bs4Var4, ka2Var);
                return ka2Var;
            case 4:
                mw3 mw3Var5 = (mw3) ((aj0) obj).mo2998b(qw3.m10145a());
                bs4 bs4Var5 = this.f17678b;
                Object obj9 = mw3Var5.f25263a.get(bs4Var5);
                if (obj9 == null) {
                    obj9 = qw3.f28853d;
                }
                if (obj9 != qw3.f28853d) {
                    return obj9;
                }
                w94 w94Var = new w94();
                mw3Var5.f25263a.put(bs4Var5, w94Var);
                return w94Var;
            case 5:
                aj0 aj0Var3 = (aj0) obj;
                mw3 mw3Var6 = (mw3) aj0Var3.mo2998b(qw3.m10145a());
                bs4 bs4Var6 = this.f17678b;
                Object obj10 = mw3Var6.f25263a.get(bs4Var6);
                if (obj10 == null) {
                    obj10 = qw3.f28853d;
                }
                if (obj10 != qw3.f28853d) {
                    return obj10;
                }
                Context context2 = (Context) aj0Var3.mo2998b(AndroidCompositionLocals_androidKt.f14651b);
                File cacheDir = context2.getCacheDir();
                File dataDir = context2.getDataDir();
                C1409zl c1409zl = new C1409zl();
                c1409zl.f36164a = cacheDir;
                c1409zl.f36165b = dataDir;
                VarHandle.storeStoreFence();
                mw3Var6.f25263a.put(bs4Var6, c1409zl);
                return c1409zl;
            case 6:
                aj0 aj0Var4 = (aj0) obj;
                mw3 mw3Var7 = (mw3) aj0Var4.mo2998b(qw3.m10145a());
                bs4 bs4Var7 = this.f17678b;
                Object obj11 = mw3Var7.f25263a.get(bs4Var7);
                Object obj12 = obj11;
                if (obj11 == null) {
                    obj12 = qw3.f28853d;
                }
                Object obj13 = obj12;
                if (obj12 == qw3.f28853d) {
                    Application application = (Application) ((Context) aj0Var4.mo2998b(AndroidCompositionLocals_androidKt.f14651b)).getApplicationContext();
                    xn2 xn2Var3 = (xn2) aj0Var4.mo2998b(yn2.f35357b);
                    xn2 xn2VarM12723c3 = xn2Var3 != null ? xn2Var3.m12723c("WindowHost") : null;
                    xz4 xz4Var2 = new xz4();
                    xz4Var2.f34746a = application;
                    xz4Var2.f34747b = xn2VarM12723c3;
                    xz4Var2.f34748c = k43.m7398w(null);
                    C1071qh c1071qh = new C1071qh((byte) 6);
                    c1071qh.f28461b = xz4Var2;
                    VarHandle.storeStoreFence();
                    xz4Var2.f34749d = s94.m10566b(c1071qh);
                    xz4Var2.f34750e = new w94();
                    VarHandle.storeStoreFence();
                    mw3Var7.f25263a.put(bs4Var7, xz4Var2);
                    obj13 = xz4Var2;
                }
                return obj13;
            default:
                aj0 aj0Var5 = (aj0) obj;
                mw3 mw3Var8 = (mw3) aj0Var5.mo2998b(qw3.m10145a());
                bs4 bs4Var8 = this.f17678b;
                Object obj14 = mw3Var8.f25263a.get(bs4Var8);
                if (obj14 == null) {
                    obj14 = qw3.f28853d;
                }
                if (obj14 != qw3.f28853d) {
                    return obj14;
                }
                b23 b23Var = new b23();
                b23Var.f15038a = new a83(0);
                b23Var.f15039b = k43.m7398w(null);
                VarHandle.storeStoreFence();
                mw3Var8.f25263a.put(bs4Var8, b23Var);
                return b23Var;
        }
    }
}
