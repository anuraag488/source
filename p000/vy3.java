package p000;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vy3 {

    /* JADX INFO: renamed from: a */
    public jy3 f32958a;

    /* JADX INFO: renamed from: b */
    public C1289wd f32959b;

    /* JADX INFO: renamed from: c */
    public xh1 f32960c;

    /* JADX INFO: renamed from: d */
    public d63 f32961d;

    /* JADX INFO: renamed from: e */
    public boolean f32962e;

    /* JADX INFO: renamed from: f */
    public g03 f32963f;

    /* JADX INFO: renamed from: g */
    public iy3 f32964g;

    /* JADX INFO: renamed from: h */
    public gy3 f32965h;

    /* JADX INFO: renamed from: i */
    public boolean f32966i;

    /* JADX INFO: renamed from: j */
    public byte f32967j;

    /* JADX INFO: renamed from: k */
    public tx3 f32968k;

    /* JADX INFO: renamed from: l */
    public ty3 f32969l;

    /* JADX INFO: renamed from: m */
    public b71 f32970m;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m12028a(long j, ym0 ym0Var) throws Throwable {
        ry3 ry3Var;
        vy3 vy3Var;
        Throwable th;
        pl3 pl3Var;
        if (ym0Var instanceof ry3) {
            ry3Var = (ry3) ym0Var;
            int i = ry3Var.f29735w;
            if ((i & Integer.MIN_VALUE) != 0) {
                ry3Var.f29735w = i - Integer.MIN_VALUE;
            } else {
                ry3Var = new ry3(this, ym0Var);
            }
        } else {
            ry3Var = new ry3(this, ym0Var);
        }
        Object obj = ry3Var.f29733u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = ry3Var.f29735w;
        if (i2 != 0) {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pl3Var = ry3Var.f29732t;
            try {
                k43.m7376J(obj);
                vy3Var = this;
                vy3Var.f32966i = false;
                return jx4.m7330a(pl3Var.f27736a);
            } catch (Throwable th2) {
                th = th2;
                vy3Var = this;
                vy3Var.f32966i = false;
                throw th;
            }
        }
        k43.m7376J(obj);
        pl3 pl3Var2 = new pl3();
        pl3Var2.f27736a = j;
        this.f32966i = true;
        try {
            xw2 xw2Var = xw2.f34665a;
            vy3Var = this;
            try {
                sy3 sy3Var = new sy3(vy3Var, pl3Var2, j, null);
                ry3Var.f29732t = pl3Var2;
                ry3Var.f29735w = 1;
                if (vy3Var.m12034g(xw2Var, sy3Var, ry3Var) == ap0Var) {
                    return ap0Var;
                }
                pl3Var = pl3Var2;
                vy3Var.f32966i = false;
                return jx4.m7330a(pl3Var.f27736a);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                vy3Var.f32966i = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            vy3Var = this;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12029b() {
        C1289wd c1289wd;
        return this.f32958a.mo6020c() || this.f32958a.mo6018a() || ((c1289wd = this.f32959b) != null && c1289wd.m12218e());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:6:0x000b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    /* JADX INFO: renamed from: c */
    public final Object m12030c(long j, boolean z, of4 of4Var) {
        int i;
        long jM7331b;
        uy3 uy3Var;
        C1289wd c1289wd;
        Object objInvoke;
        if (z) {
            xh1 xh1Var = this.f32960c;
            ay3 ay3Var = dy3.f17503a;
            if (!(xh1Var instanceof aw0)) {
                if (this.f32961d == d63.f16815b) {
                    i = 1;
                } else {
                    i = 2;
                }
                jM7331b = jx4.m7331b(j, 0.0f, 0.0f, i);
                uy3Var = new uy3(this, null);
                c1289wd = this.f32959b;
                if (c1289wd == null && m12029b()) {
                    Object objM12215b = c1289wd.m12215b(jM7331b, uy3Var, of4Var);
                    if (objM12215b == ap0.f14763a) {
                        return objM12215b;
                    }
                } else {
                    objInvoke = uy3Var.invoke(jx4.m7330a(jM7331b), of4Var);
                    if (objInvoke == ap0.f14763a) {
                        return objInvoke;
                    }
                }
            }
        } else {
            if (this.f32961d == d63.f16815b) {
                i = 1;
            } else {
                i = 2;
            }
            jM7331b = jx4.m7331b(j, 0.0f, 0.0f, i);
            uy3Var = new uy3(this, null);
            c1289wd = this.f32959b;
            if (c1289wd == null) {
                objInvoke = uy3Var.invoke(jx4.m7330a(jM7331b), of4Var);
                if (objInvoke == ap0.f14763a) {
                    return objInvoke;
                }
            } else {
                objInvoke = uy3Var.invoke(jx4.m7330a(jM7331b), of4Var);
                if (objInvoke == ap0.f14763a) {
                    return objInvoke;
                }
            }
        }
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: d */
    public final long m12031d(tx3 tx3Var, long j, int i) {
        k03 k03Var = this.f32963f.f19466a;
        k03 k03VarM7353P0 = k03Var != null ? k03Var.m7353P0() : null;
        long jMo4260p0 = k03VarM7353P0 != null ? k03VarM7353P0.mo4260p0(i, j) : 0L;
        long jM3429g = b33.m3429g(j, jMo4260p0);
        long jM12033f = m12033f(m12036i(tx3Var.mo3369a(m12035h(m12033f(this.f32961d == d63.f16815b ? b33.m3424b(jM3429g, 0.0f, 1) : b33.m3424b(jM3429g, 0.0f, 2))))));
        iy3 iy3Var = this.f32964g;
        if (iy3Var.f25208n) {
            ViewTreeObserver viewTreeObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(iy3Var)).getViewTreeObserver();
            try {
                Method declaredMethod = ViewTreeObserverOnGlobalLayoutListenerC1140sc.f30074L0;
                if (declaredMethod == null) {
                    declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    ViewTreeObserverOnGlobalLayoutListenerC1140sc.f30074L0 = declaredMethod;
                }
                declaredMethod.invoke(viewTreeObserver, null);
            } catch (Exception unused) {
            }
        }
        long jM3429g2 = b33.m3429g(jM3429g, jM12033f);
        k03 k03Var2 = this.f32963f.f19466a;
        k03 k03VarM7353P1 = k03Var2 != null ? k03Var2.m7353P0() : null;
        return b33.m3430h(b33.m3430h(jMo4260p0, jM12033f), k03VarM7353P1 != null ? k03VarM7353P1.mo4257Q(jM12033f, i, jM3429g2) : 0L);
    }

    /* JADX INFO: renamed from: e */
    public final float m12032e(float f) {
        return this.f32962e ? f * (-1.0f) : f;
    }

    /* JADX INFO: renamed from: f */
    public final long m12033f(long j) {
        return this.f32962e ? b33.m3431i(j, -1.0f) : j;
    }

    /* JADX INFO: renamed from: g */
    public final Object m12034g(xw2 xw2Var, mq1 mq1Var, ym0 ym0Var) {
        Object objMo6021d = this.f32958a.mo6021d(xw2Var, new er2((Object) this, (Object) mq1Var, (wm0) null, (byte) 12), ym0Var);
        return objMo6021d == ap0.f14763a ? objMo6021d : ju4.f22634a;
    }

    /* JADX INFO: renamed from: h */
    public final float m12035h(long j) {
        return Float.intBitsToFloat((int) (this.f32961d == d63.f16815b ? j >> 32 : j & 4294967295L));
    }

    /* JADX INFO: renamed from: i */
    public final long m12036i(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.f32961d == d63.f16815b) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX INFO: renamed from: j */
    public final float m12037j(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        d63 d63Var = this.f32961d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (d63Var == d63.f16814a) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (d63Var == d63.f16815b) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
