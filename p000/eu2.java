package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class eu2 implements du2 {

    /* JADX INFO: renamed from: a */
    public Context f18489a;

    /* JADX INFO: renamed from: b */
    public um0 f18490b;

    /* JADX INFO: renamed from: c */
    public z73 f18491c;

    /* JADX INFO: renamed from: d */
    public t82 f18492d;

    @Override // p000.du2
    /* JADX INFO: renamed from: D */
    public final float mo4740D() {
        wm0 wm0Var;
        yb4 yb4Var;
        if (this.f18492d == null) {
            Context context = this.f18489a;
            lw2 lw2Var = o15.f26290a;
            synchronized (lw2Var) {
                try {
                    Object objM8132g = lw2Var.m8132g(context);
                    wm0Var = null;
                    if (objM8132g == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        f40 f40VarM5333H = ev0.m5333H(-1, null, null, 6);
                        vt0 vt0VarM10032p = qq2.m10032p(new C0667fx(contentResolver, uriFor, new n15(f40VarM5333H, Handler.createAsync(Looper.getMainLooper())), f40VarM5333H, context, (wm0) null));
                        pe4 pe4VarM5675m = AbstractC0647fd.m5675m();
                        pw0 pw0Var = l01.f23664a;
                        um0 um0Var = new um0(qs5.m10089N(pe4VarM5675m, mp2.f25111a));
                        ub4 ub4Var = new ub4();
                        VarHandle.storeStoreFence();
                        Float fValueOf = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                        C1253ve c1253veM13037q = y70.m13037q(vt0VarM10032p, 1);
                        ac4 ac4VarM3547a = bc4.m3547a(fValueOf);
                        xj3 xj3Var = new xj3(ac4VarM3547a, lb5.m7909R(um0Var, (ro0) c1253veM13037q.f32551d, ub4Var.equals(p54.f27386a) ? cp0.f16325a : cp0.f16328d, new C1312wz(ub4Var, (si1) c1253veM13037q.f32549b, ac4VarM3547a, fValueOf, (wm0) null)));
                        lw2Var.m8138m(context, xj3Var);
                        objM8132g = xj3Var;
                    }
                    yb4Var = (yb4) objM8132g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f18491c.m13400i(((Number) yb4Var.getValue()).floatValue());
            um0 um0Var2 = this.f18490b;
            if (um0Var2 == null) {
                C1077qn.m9989o("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.f18492d = lb5.m7910S(um0Var2, null, null, new it1((Object) yb4Var, (Object) this, wm0Var, (byte) 8), 3);
        }
        return this.f18491c.m13399h();
    }

    @Override // p000.ro0
    public final Object fold(mq1 mq1Var, Object obj) {
        return mq1Var.invoke(obj, this);
    }

    @Override // p000.ro0
    public final po0 get(qo0 qo0Var) {
        return AbstractC1356y5.m12929w(this, qo0Var);
    }

    @Override // p000.ro0
    public final ro0 minusKey(qo0 qo0Var) {
        return AbstractC1356y5.m12896E(this, qo0Var);
    }

    @Override // p000.ro0
    public final ro0 plus(ro0 ro0Var) {
        return qs5.m10089N(this, ro0Var);
    }
}
