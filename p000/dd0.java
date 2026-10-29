package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dd0 extends wc0 {
    @Override // p000.wc0
    /* JADX INFO: renamed from: A */
    public final o41 mo4445A() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "tertiary_fixed";
        mq4Var.f25142c = new ad0((byte) 12);
        yc0 yc0Var = new yc0((byte) 28);
        yc0Var.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25143d = yc0Var;
        mq4Var.f25140a = true;
        yc0 yc0Var2 = new yc0((byte) 29);
        yc0Var2.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25145f = yc0Var2;
        mq4Var.f25147h = new ad0((byte) 14);
        o41 o41VarM8369a = mq4Var.m8369a();
        mq4 mq4VarM8942b = super.mo4445A().m8942b();
        r50 r50Var = pc0.f27516a;
        return mq4VarM8942b.m8371c(o41VarM8369a).m8369a();
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: B */
    public final o41 mo4446B() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "tertiary_fixed_dim";
        byte b = 1;
        mq4Var.f25142c = new xc0(b);
        yc0 yc0Var = new yc0((byte) 0);
        yc0Var.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25143d = yc0Var;
        mq4Var.f25140a = true;
        yc0 yc0Var2 = new yc0(b);
        yc0Var2.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = yc0Var2;
        o41 o41VarM8369a = mq4Var.m8369a();
        mq4 mq4VarM8942b = super.mo4446B().m8942b();
        r50 r50Var = pc0.f27516a;
        return mq4VarM8942b.m8371c(o41VarM8369a).m8369a();
    }

    /* JADX INFO: renamed from: C */
    public final o41 m4447C() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "error_dim";
        mq4Var.f25142c = new zc0((byte) 13);
        mq4Var.f25143d = new zc0((byte) 14);
        mq4Var.f25140a = true;
        byte b = 16;
        yc0 yc0Var = new yc0(b);
        yc0Var.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25145f = yc0Var;
        mq4Var.f25147h = new zc0(b);
        yc0 yc0Var2 = new yc0((byte) 17);
        yc0Var2.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = yc0Var2;
        return mq4Var.m8369a();
    }

    /* JADX INFO: renamed from: D */
    public final o41 m4448D() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "on_surface";
        mq4Var.f25142c = new ad0((byte) 1);
        yc0 yc0Var = new yc0((byte) 25);
        yc0Var.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25143d = yc0Var;
        mq4Var.f25144e = new ad0((byte) 2);
        yc0 yc0Var2 = new yc0((byte) 26);
        yc0Var2.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25145f = yc0Var2;
        mq4Var.f25147h = new ad0((byte) 3);
        o41 o41VarM8369a = mq4Var.m8369a();
        mq4 mq4Var2 = new mq4();
        mq4Var2.f25141b = "on_surface";
        byte b = 13;
        mq4Var2.f25142c = new vc0(b);
        mq4Var2.f25143d = new C0499bp((byte) 12);
        mq4Var2.f25145f = new C0633f0(1, this, wc0.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 5);
        mq4Var2.f25147h = new C0499bp(b);
        mq4 mq4VarM8942b = mq4Var2.m8369a().m8942b();
        r50 r50Var = pc0.f27516a;
        return mq4VarM8942b.m8371c(o41VarM8369a).m8369a();
    }

    /* JADX INFO: renamed from: E */
    public final o41 m4449E() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "primary_dim";
        mq4Var.f25142c = new zc0((byte) 10);
        mq4Var.f25143d = new zc0((byte) 11);
        mq4Var.f25140a = true;
        yc0 yc0Var = new yc0((byte) 14);
        yc0Var.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25145f = yc0Var;
        mq4Var.f25147h = new zc0((byte) 12);
        yc0 yc0Var2 = new yc0((byte) 15);
        yc0Var2.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = yc0Var2;
        return mq4Var.m8369a();
    }

    /* JADX INFO: renamed from: F */
    public final o41 m4450F() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "secondary_dim";
        mq4Var.f25142c = new zc0((byte) 3);
        mq4Var.f25143d = new zc0((byte) 4);
        mq4Var.f25140a = true;
        yc0 yc0Var = new yc0((byte) 10);
        yc0Var.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25145f = yc0Var;
        mq4Var.f25147h = new zc0((byte) 5);
        yc0 yc0Var2 = new yc0((byte) 11);
        yc0Var2.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = yc0Var2;
        return mq4Var.m8369a();
    }

    /* JADX INFO: renamed from: G */
    public final o41 m4451G() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "surface";
        mq4Var.f25142c = new zc0((byte) 20);
        mq4Var.f25143d = new zc0((byte) 21);
        mq4Var.f25140a = true;
        o41 o41VarM8369a = mq4Var.m8369a();
        mq4 mq4Var2 = new mq4();
        mq4Var2.f25141b = "surface";
        mq4Var2.f25142c = new rc0((byte) 7);
        mq4Var2.f25143d = new rc0((byte) 8);
        mq4Var2.f25140a = true;
        mq4 mq4VarM8942b = mq4Var2.m8369a().m8942b();
        r50 r50Var = pc0.f27516a;
        return mq4VarM8942b.m8371c(o41VarM8369a).m8369a();
    }

    /* JADX INFO: renamed from: H */
    public final o41 m4452H() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "surface_container_high";
        mq4Var.f25142c = new cd0((byte) 10);
        mq4Var.f25143d = new cd0((byte) 11);
        mq4Var.f25140a = true;
        mq4Var.f25144e = new cd0((byte) 12);
        o41 o41VarM8369a = mq4Var.m8369a();
        mq4 mq4Var2 = new mq4();
        mq4Var2.f25141b = "surface_container_high";
        mq4Var2.f25142c = new tc0((byte) 28);
        mq4Var2.f25143d = new tc0((byte) 29);
        mq4Var2.f25140a = true;
        mq4 mq4VarM8942b = mq4Var2.m8369a().m8942b();
        r50 r50Var = pc0.f27516a;
        return mq4VarM8942b.m8371c(o41VarM8369a).m8369a();
    }

    /* JADX INFO: renamed from: I */
    public final o41 m4453I() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "surface_container_highest";
        mq4Var.f25142c = new ad0((byte) 28);
        mq4Var.f25143d = new ad0((byte) 29);
        mq4Var.f25140a = true;
        mq4Var.f25144e = new cd0((byte) 0);
        o41 o41VarM8369a = mq4Var.m8369a();
        mq4 mq4Var2 = new mq4();
        mq4Var2.f25141b = "surface_container_highest";
        mq4Var2.f25142c = new vc0((byte) 8);
        mq4Var2.f25143d = new vc0((byte) 9);
        mq4Var2.f25140a = true;
        mq4 mq4VarM8942b = mq4Var2.m8369a().m8942b();
        r50 r50Var = pc0.f27516a;
        return mq4VarM8942b.m8371c(o41VarM8369a).m8369a();
    }

    /* JADX INFO: renamed from: J */
    public final o41 m4454J() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "tertiary_dim";
        mq4Var.f25142c = new zc0((byte) 6);
        mq4Var.f25143d = new zc0((byte) 7);
        mq4Var.f25140a = true;
        yc0 yc0Var = new yc0((byte) 12);
        yc0Var.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25145f = yc0Var;
        mq4Var.f25147h = new zc0((byte) 9);
        yc0 yc0Var2 = new yc0((byte) 13);
        yc0Var2.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = yc0Var2;
        return mq4Var.m8369a();
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: a */
    public final o41 mo4455a() {
        mq4 mq4VarM8942b = m4451G().m8942b();
        mq4VarM8942b.f25141b = "background";
        o41 o41VarM8369a = mq4VarM8942b.m8369a();
        mq4 mq4VarM8942b2 = super.mo4455a().m8942b();
        r50 r50Var = pc0.f27516a;
        return mq4VarM8942b2.m8371c(o41VarM8369a).m8369a();
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: b */
    public final o41 mo4456b() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "error";
        mq4Var.f25142c = new zc0((byte) 22);
        mq4Var.f25143d = new zc0((byte) 23);
        mq4Var.f25140a = true;
        yc0 yc0Var = new yc0((byte) 20);
        yc0Var.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25145f = yc0Var;
        mq4Var.f25147h = new zc0((byte) 24);
        yc0 yc0Var2 = new yc0((byte) 21);
        yc0Var2.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = yc0Var2;
        o41 o41VarM8369a = mq4Var.m8369a();
        mq4 mq4VarM8942b = super.mo4456b().m8942b();
        r50 r50Var = pc0.f27516a;
        return mq4VarM8942b.m8371c(o41VarM8369a).m8369a();
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: c */
    public final o41 mo4457c() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "error_container";
        mq4Var.f25142c = new vc0((byte) 15);
        mq4Var.f25143d = new zc0((byte) 19);
        mq4Var.f25140a = true;
        yc0 yc0Var = new yc0((byte) 22);
        yc0Var.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25145f = yc0Var;
        yc0 yc0Var2 = new yc0((byte) 27);
        yc0Var2.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = yc0Var2;
        mq4Var.f25147h = new ad0((byte) 13);
        o41 o41VarM8369a = mq4Var.m8369a();
        mq4 mq4VarM8942b = super.mo4457c().m8942b();
        r50 r50Var = pc0.f27516a;
        return mq4VarM8942b.m8371c(o41VarM8369a).m8369a();
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: d */
    public final on4 mo4458d(pw4 pw4Var, rv1 rv1Var, boolean z, x41 x41Var, double d) {
        double[] dArr = {0.0d, 3.0d, 13.0d, 23.0d, 33.0d, 43.0d, 153.0d, 273.0d, 360.0d};
        double[] dArr2 = {12.0d, 22.0d, 32.0d, 12.0d, 22.0d, 32.0d, 22.0d, 12.0d};
        int iMin = Math.min(8, 8);
        double d2 = rv1Var.f29661b;
        for (int i = 0; i < iMin; i++) {
            if (d2 >= dArr[i] && d2 < dArr[i + 1]) {
                double d3 = dArr2[i] % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                d2 = d3;
                break;
            }
        }
        int iOrdinal = pw4Var.ordinal();
        if (iOrdinal == 1) {
            return mn4.m8363a(d2, x41Var == x41.f33974c ? 50.0d : 40.0d);
        }
        if (iOrdinal == 2) {
            return mn4.m8363a(d2, x41Var == x41.f33974c ? 60.0d : 48.0d);
        }
        if (iOrdinal == 3) {
            return mn4.m8363a(d2, x41Var == x41.f33974c ? 80.0d : 60.0d);
        }
        if (iOrdinal == 4) {
            return mn4.m8363a(d2, x41Var == x41.f33974c ? 64.0d : 48.0d);
        }
        super.mo4458d(pw4Var, rv1Var, z, x41Var, d);
        return null;
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: e */
    public final rv1 mo4459e(o41 o41Var, y41 y41Var) {
        Double d;
        on4 on4Var = (on4) o41Var.f26321b.invoke(y41Var);
        double dMo4465k = mo4465k(o41Var, y41Var);
        yp1 yp1Var = o41Var.f26324e;
        double dDoubleValue = (yp1Var == null || (d = (Double) yp1Var.invoke(y41Var)) == null) ? 1.0d : d.doubleValue();
        if (dDoubleValue == 1.0d) {
            return on4Var.m9191a(dMo4465k);
        }
        double d2 = on4Var.f26916b;
        double d3 = on4Var.f26915a;
        double d4 = d2 * dDoubleValue;
        return (dMo4465k != 99.0d || d3 < 105.0d || d3 >= 125.0d) ? new rv1(AbstractC1356y5.m12899H(d3, d4, dMo4465k)) : mn4.m8363a(d3, d4).m9191a(dMo4465k);
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: f */
    public final on4 mo4460f(pw4 pw4Var, rv1 rv1Var, boolean z, x41 x41Var, double d) {
        double d2 = rv1Var.f29661b;
        int iOrdinal = pw4Var.ordinal();
        if (iOrdinal == 1) {
            return mn4.m8363a(d2, x41Var == x41.f33974c ? 1.4d : 6.0d);
        }
        if (iOrdinal == 2) {
            return mn4.m8363a(d2, x41Var == x41.f33974c ? 5.0d : 10.0d);
        }
        if (iOrdinal != 3) {
            return iOrdinal != 4 ? super.mo4460f(pw4Var, rv1Var, z, x41Var, d) : mn4.m8363a(f70.m5601w(rv1Var), f70.m5600v(rv1Var, z, x41Var));
        }
        return mn4.m8363a(f70.m5603y(rv1Var), f70.m5602x(rv1Var, x41Var));
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: g */
    public final on4 mo4461g(pw4 pw4Var, rv1 rv1Var, boolean z, x41 x41Var, double d) {
        double d2 = rv1Var.f29661b;
        int iOrdinal = pw4Var.ordinal();
        if (iOrdinal == 1) {
            return mn4.m8363a(d2, (x41Var == x41.f33974c ? 1.4d : 6.0d) * 2.2d);
        }
        if (iOrdinal == 2) {
            return mn4.m8363a(d2, (x41Var == x41.f33974c ? 5.0d : 10.0d) * 1.7d);
        }
        if (iOrdinal == 3) {
            return mn4.m8363a(f70.m5603y(rv1Var), f70.m5602x(rv1Var, x41Var) * 1.29d);
        }
        if (iOrdinal != 4) {
            return super.mo4461g(pw4Var, rv1Var, z, x41Var, d);
        }
        double dM5601w = f70.m5601w(rv1Var);
        return mn4.m8363a(dM5601w, f70.m5600v(rv1Var, z, x41Var) * ((dM5601w < 105.0d || dM5601w >= 125.0d) ? 2.3d : 1.6d));
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: h */
    public final on4 mo4462h(pw4 pw4Var, rv1 rv1Var, boolean z, x41 x41Var, double d) {
        double d2;
        double d3 = rv1Var.f29661b;
        int iOrdinal = pw4Var.ordinal();
        if (iOrdinal == 1) {
            double d4 = 12.0d;
            if (x41Var == x41.f33974c) {
                if (d3 < 250.0d || d3 >= 270.0d) {
                    d4 = 8.0d;
                }
            } else if (d3 >= 250.0d && d3 < 270.0d) {
                d4 = 16.0d;
            }
            return mn4.m8363a(d3, d4);
        }
        if (iOrdinal == 2) {
            return mn4.m8363a(d3, (x41Var == x41.f33974c && z) ? 26.0d : 32.0d);
        }
        if (iOrdinal == 3) {
            return mn4.m8363a(d3, x41Var == x41.f33974c ? 74.0d : 56.0d);
        }
        if (iOrdinal != 4) {
            return super.mo4462h(pw4Var, rv1Var, z, x41Var, d);
        }
        if (x41Var == x41.f33974c) {
            d2 = z ? 36.0d : 48.0d;
        } else {
            d2 = 40.0d;
        }
        return mn4.m8363a(d3, d2);
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: i */
    public final on4 mo4463i(pw4 pw4Var, rv1 rv1Var, boolean z, x41 x41Var, double d) {
        double d2 = rv1Var.f29661b;
        int iOrdinal = pw4Var.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return mn4.m8363a(d2, 16.0d);
            }
            if (iOrdinal == 3) {
                return mn4.m8363a(C0638f5.m5552w(rv1Var, new double[]{0.0d, 38.0d, 105.0d, 140.0d, 333.0d, 360.0d}, new double[]{-14.0d, 10.0d, -14.0d, 10.0d, -14.0d}), x41Var == x41.f33974c ? 56.0d : 36.0d);
            }
            if (iOrdinal != 4) {
                return super.mo4463i(pw4Var, rv1Var, z, x41Var, d);
            }
            return mn4.m8363a(C0638f5.m5552w(rv1Var, new double[]{0.0d, 105.0d, 140.0d, 204.0d, 253.0d, 278.0d, 300.0d, 333.0d, 360.0d}, new double[]{-160.0d, 155.0d, -100.0d, 96.0d, -96.0d, -156.0d, -165.0d, -160.0d}), (x41Var == x41.f33974c && z) ? 16.0d : 24.0d);
        }
        double d3 = 6.0d;
        if (x41Var == x41.f33974c) {
            if (d2 < 250.0d || d2 >= 270.0d) {
                d3 = 4.0d;
            }
        } else if (d2 >= 250.0d && d2 < 270.0d) {
            d3 = 10.0d;
        }
        return mn4.m8363a(d2, d3);
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: j */
    public final on4 mo4464j(pw4 pw4Var, rv1 rv1Var, boolean z, x41 x41Var, double d) {
        int iOrdinal = pw4Var.ordinal();
        if (iOrdinal == 1) {
            return mn4.m8363a(C0638f5.m5552w(rv1Var, new double[]{0.0d, 38.0d, 105.0d, 161.0d, 204.0d, 278.0d, 333.0d, 360.0d}, new double[]{-32.0d, 26.0d, 10.0d, -39.0d, 24.0d, -15.0d, -32.0d}), x41Var == x41.f33974c ? 20.0d : 36.0d);
        }
        if (iOrdinal == 2) {
            return mn4.m8363a(C0638f5.m5552w(rv1Var, new double[]{0.0d, 20.0d, 71.0d, 161.0d, 333.0d, 360.0d}, new double[]{-40.0d, 48.0d, -32.0d, 40.0d, -32.0d}), x41Var == x41.f33974c ? 28.0d : 32.0d);
        }
        if (iOrdinal != 3) {
            return iOrdinal != 4 ? super.mo4464j(pw4Var, rv1Var, z, x41Var, d) : mn4.m8363a(C0638f5.m5552w(rv1Var, new double[]{0.0d, 105.0d, 140.0d, 204.0d, 253.0d, 278.0d, 300.0d, 333.0d, 360.0d}, new double[]{-165.0d, 160.0d, -105.0d, 101.0d, -101.0d, -160.0d, -170.0d, -165.0d}), 48.0d);
        }
        return mn4.m8363a(C0638f5.m5552w(rv1Var, new double[]{0.0d, 38.0d, 71.0d, 105.0d, 140.0d, 161.0d, 253.0d, 333.0d, 360.0d}, new double[]{-72.0d, 35.0d, 24.0d, -24.0d, 62.0d, 50.0d, 62.0d, -72.0d}), 56.0d);
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: k */
    public final double mo4465k(o41 o41Var, y41 y41Var) {
        o41 o41Var2;
        bn0 bn0Var;
        o41 o41Var3;
        double dM10673n;
        boolean z = y41Var.f34848c;
        double d = y41Var.f34849d;
        boolean z2 = o41Var.f26323d;
        yp1 yp1Var = o41Var.f26325f;
        yp1 yp1Var2 = o41Var.f26327h;
        String str = o41Var.f26320a;
        yp1 yp1Var3 = o41Var.f26328i;
        Double dValueOf = null;
        sn4 sn4Var = yp1Var3 != null ? (sn4) yp1Var3.invoke(y41Var) : null;
        if (sn4Var == null) {
            double dDoubleValue = ((Number) o41Var.f26322c.invoke(y41Var)).doubleValue();
            Double dValueOf2 = (yp1Var == null || (o41Var3 = (o41) yp1Var.invoke(y41Var)) == null) ? null : Double.valueOf(o41Var3.m8941a(y41Var));
            if (yp1Var2 != null && (bn0Var = (bn0) yp1Var2.invoke(y41Var)) != null) {
                dValueOf = Double.valueOf(bn0Var.m3637a(d));
            }
            if (dValueOf2 == null || dValueOf == null) {
                return dDoubleValue;
            }
            if (sc6.m10646R(dValueOf2.doubleValue(), dDoubleValue) < dValueOf.doubleValue() || d < 0.0d) {
                dDoubleValue = C0006a5.m76n(dValueOf2.doubleValue(), dValueOf.doubleValue());
            }
            double dM10673n2 = dDoubleValue;
            if (z2 && !od4.m9038S(str, "_fixed_dim", false)) {
                dM10673n2 = dM10673n2 >= 57.0d ? sc6.m10673n(dM10673n2, 65.0d, 100.0d) : sc6.m10673n(dM10673n2, 0.0d, 49.0d);
            }
            double d2 = dM10673n2;
            yp1 yp1Var4 = o41Var.f26326g;
            if (yp1Var4 != null && (o41Var2 = (o41) yp1Var4.invoke(y41Var)) != null) {
                double dM8941a = o41Var2.m8941a(y41Var);
                double dMax = Math.max(dValueOf2.doubleValue(), dM8941a);
                double dMin = Math.min(dValueOf2.doubleValue(), dM8941a);
                if (sc6.m10646R(dMax, d2) < dValueOf.doubleValue() || sc6.m10646R(dMin, d2) < dValueOf.doubleValue()) {
                    double dM10640L = sc6.m10640L(dMax, dValueOf.doubleValue());
                    double dM10682w = sc6.m10682w(dMin, dValueOf.doubleValue());
                    ArrayList arrayList = new ArrayList();
                    if (dM10640L != -1.0d) {
                        arrayList.add(Double.valueOf(dM10640L));
                    }
                    if (dM10682w != -1.0d) {
                        arrayList.add(Double.valueOf(dM10682w));
                    }
                    if (Math.rint(dValueOf2.doubleValue()) < 60.0d || Math.rint(dM8941a) < 60.0d) {
                        if (dM10640L < 0.0d) {
                            return 100.0d;
                        }
                        return dM10640L;
                    }
                    if (arrayList.size() == 1) {
                        return ((Number) hb0.m6299K0(arrayList)).doubleValue();
                    }
                    if (dM10682w < 0.0d) {
                        return 0.0d;
                    }
                    return dM10682w;
                }
            }
            return d2;
        }
        double d3 = sn4Var.f30413c;
        o41 o41Var4 = sn4Var.f30411a;
        o41 o41Var5 = sn4Var.f30412b;
        tn4 tn4Var = sn4Var.f30414d;
        rn4 rn4Var = sn4Var.f30416f;
        if (tn4Var == tn4.f31269a || ((tn4Var == tn4.f31272d && z) || (tn4Var == tn4.f31271c && !z))) {
            d3 = -d3;
        }
        boolean zM13387o = z62.m13387o(str, o41Var4.f26320a);
        o41 o41Var6 = zM13387o ? o41Var4 : o41Var5;
        if (zM13387o) {
            o41Var4 = o41Var5;
        }
        double dDoubleValue2 = ((Number) o41Var6.f26322c.invoke(y41Var)).doubleValue();
        double dM8941a2 = o41Var4.m8941a(y41Var);
        double d4 = d3 * ((double) (zM13387o ? 1 : -1));
        int iOrdinal = rn4Var.ordinal();
        if (iOrdinal == 0) {
            dM10673n = sc6.m10673n(dM8941a2 + d4, 0.0d, 100.0d);
        } else if (iOrdinal == 1) {
            dM10673n = d4 > 0.0d ? sc6.m10673n(sc6.m10673n(dDoubleValue2, dM8941a2, dM8941a2 + d4), 0.0d, 100.0d) : sc6.m10673n(sc6.m10673n(dDoubleValue2, dM8941a2 + d4, dM8941a2), 0.0d, 100.0d);
        } else {
            if (iOrdinal != 2) {
                C0670g.m5864c();
                return 0.0d;
            }
            dM10673n = d4 > 0.0d ? sc6.m10673n(dDoubleValue2, dM8941a2 + d4, 100.0d) : sc6.m10673n(dDoubleValue2, 0.0d, dM8941a2 + d4);
        }
        if (yp1Var != null && yp1Var2 != null) {
            o41 o41Var7 = (o41) yp1Var.invoke(y41Var);
            bn0 bn0Var2 = (bn0) yp1Var2.invoke(y41Var);
            if (o41Var7 != null && bn0Var2 != null) {
                double dM8941a3 = o41Var7.m8941a(y41Var);
                double dM3637a = bn0Var2.m3637a(d);
                double dM10664e0 = sc6.m10664e0(dM8941a3);
                double d5 = dM10673n;
                double dM10664e1 = sc6.m10664e0(d5);
                double dMax2 = Math.max(dM10664e0, dM10664e1);
                if (dMax2 != dM10664e1) {
                    dM10664e0 = dM10664e1;
                }
                dM10673n = ((dMax2 + 5.0d) / (dM10664e0 + 5.0d) < dM3637a || d < 0.0d) ? C0006a5.m76n(dM8941a3, dM3637a) : d5;
            }
        }
        double d6 = dM10673n;
        if (!z2 || od4.m9038S(str, "_fixed_dim", false)) {
            return d6;
        }
        return d6 >= 57.0d ? sc6.m10673n(d6, 65.0d, 100.0d) : sc6.m10673n(d6, 0.0d, 49.0d);
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: m */
    public final o41 mo4466m() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "inverse_surface";
        mq4Var.f25142c = new cd0((byte) 8);
        mq4Var.f25143d = new cd0((byte) 9);
        mq4Var.f25140a = true;
        o41 o41VarM8369a = mq4Var.m8369a();
        mq4 mq4VarM8942b = super.mo4466m().m8942b();
        r50 r50Var = pc0.f27516a;
        return mq4VarM8942b.m8371c(o41VarM8369a).m8369a();
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: o */
    public final o41 mo4467o() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "primary";
        mq4Var.f25142c = new zc0((byte) 15);
        mq4Var.f25143d = new zc0((byte) 17);
        mq4Var.f25140a = true;
        byte b = 18;
        yc0 yc0Var = new yc0(b);
        yc0Var.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25145f = yc0Var;
        mq4Var.f25147h = new zc0(b);
        yc0 yc0Var2 = new yc0((byte) 19);
        yc0Var2.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = yc0Var2;
        o41 o41VarM8369a = mq4Var.m8369a();
        mq4 mq4VarM8942b = super.mo4467o().m8942b();
        r50 r50Var = pc0.f27516a;
        return mq4VarM8942b.m8371c(o41VarM8369a).m8369a();
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: p */
    public final o41 mo4468p() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "primary_container";
        mq4Var.f25142c = new ad0((byte) 18);
        mq4Var.f25143d = new ad0((byte) 19);
        mq4Var.f25140a = true;
        bd0 bd0Var = new bd0((byte) 0);
        bd0Var.f15213b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25145f = bd0Var;
        bd0 bd0Var2 = new bd0((byte) 1);
        bd0Var2.f15213b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = bd0Var2;
        mq4Var.f25147h = new ad0((byte) 21);
        o41 o41VarM8369a = mq4Var.m8369a();
        mq4 mq4VarM8942b = super.mo4468p().m8942b();
        r50 r50Var = pc0.f27516a;
        return mq4VarM8942b.m8371c(o41VarM8369a).m8369a();
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: q */
    public final o41 mo4469q() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "primary_fixed";
        mq4Var.f25142c = new zc0((byte) 29);
        yc0 yc0Var = new yc0((byte) 23);
        yc0Var.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25143d = yc0Var;
        mq4Var.f25140a = true;
        yc0 yc0Var2 = new yc0((byte) 24);
        yc0Var2.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25145f = yc0Var2;
        mq4Var.f25147h = new ad0((byte) 0);
        o41 o41VarM8369a = mq4Var.m8369a();
        mq4 mq4VarM8942b = super.mo4469q().m8942b();
        r50 r50Var = pc0.f27516a;
        return mq4VarM8942b.m8371c(o41VarM8369a).m8369a();
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: r */
    public final o41 mo4470r() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "primary_fixed_dim";
        mq4Var.f25142c = new xc0((byte) 11);
        yc0 yc0Var = new yc0((byte) 6);
        yc0Var.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25143d = yc0Var;
        mq4Var.f25140a = true;
        yc0 yc0Var2 = new yc0((byte) 7);
        yc0Var2.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = yc0Var2;
        o41 o41VarM8369a = mq4Var.m8369a();
        mq4 mq4VarM8942b = super.mo4470r().m8942b();
        r50 r50Var = pc0.f27516a;
        return mq4VarM8942b.m8371c(o41VarM8369a).m8369a();
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: s */
    public final o41 mo4471s() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "secondary";
        mq4Var.f25142c = new ad0((byte) 20);
        mq4Var.f25143d = new cd0((byte) 1);
        mq4Var.f25140a = true;
        bd0 bd0Var = new bd0((byte) 2);
        bd0Var.f15213b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25145f = bd0Var;
        mq4Var.f25147h = new cd0((byte) 21);
        bd0 bd0Var2 = new bd0((byte) 7);
        bd0Var2.f15213b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = bd0Var2;
        o41 o41VarM8369a = mq4Var.m8369a();
        mq4 mq4VarM8942b = super.mo4471s().m8942b();
        r50 r50Var = pc0.f27516a;
        return mq4VarM8942b.m8371c(o41VarM8369a).m8369a();
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: t */
    public final o41 mo4472t() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "secondary_container";
        mq4Var.f25142c = new cd0((byte) 19);
        mq4Var.f25143d = new cd0((byte) 20);
        mq4Var.f25140a = true;
        bd0 bd0Var = new bd0((byte) 3);
        bd0Var.f15213b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25145f = bd0Var;
        bd0 bd0Var2 = new bd0((byte) 4);
        bd0Var2.f15213b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = bd0Var2;
        mq4Var.f25147h = new cd0((byte) 22);
        o41 o41VarM8369a = mq4Var.m8369a();
        mq4 mq4VarM8942b = super.mo4472t().m8942b();
        r50 r50Var = pc0.f27516a;
        return mq4VarM8942b.m8371c(o41VarM8369a).m8369a();
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: u */
    public final o41 mo4473u() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "secondary_fixed";
        mq4Var.f25142c = new xc0((byte) 13);
        yc0 yc0Var = new yc0((byte) 8);
        yc0Var.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25143d = yc0Var;
        mq4Var.f25140a = true;
        yc0 yc0Var2 = new yc0((byte) 9);
        yc0Var2.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25145f = yc0Var2;
        mq4Var.f25147h = new xc0((byte) 14);
        o41 o41VarM8369a = mq4Var.m8369a();
        mq4 mq4VarM8942b = super.mo4473u().m8942b();
        r50 r50Var = pc0.f27516a;
        return mq4VarM8942b.m8371c(o41VarM8369a).m8369a();
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: v */
    public final o41 mo4474v() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "secondary_fixed_dim";
        mq4Var.f25142c = new xc0((byte) 10);
        yc0 yc0Var = new yc0((byte) 4);
        yc0Var.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25143d = yc0Var;
        mq4Var.f25140a = true;
        yc0 yc0Var2 = new yc0((byte) 5);
        yc0Var2.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = yc0Var2;
        o41 o41VarM8369a = mq4Var.m8369a();
        mq4 mq4VarM8942b = super.mo4474v().m8942b();
        r50 r50Var = pc0.f27516a;
        return mq4VarM8942b.m8371c(o41VarM8369a).m8369a();
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: w */
    public final o41 mo4475w() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "surface_bright";
        mq4Var.f25142c = new xc0((byte) 23);
        mq4Var.f25143d = new xc0((byte) 24);
        mq4Var.f25140a = true;
        mq4Var.f25144e = new xc0((byte) 25);
        o41 o41VarM8369a = mq4Var.m8369a();
        mq4 mq4VarM8942b = super.mo4475w().m8942b();
        r50 r50Var = pc0.f27516a;
        return mq4VarM8942b.m8371c(o41VarM8369a).m8369a();
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: x */
    public final o41 mo4476x() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "surface_dim";
        mq4Var.f25142c = new ad0((byte) 22);
        mq4Var.f25143d = new ad0((byte) 23);
        mq4Var.f25140a = true;
        mq4Var.f25144e = new ad0((byte) 24);
        o41 o41VarM8369a = mq4Var.m8369a();
        mq4 mq4VarM8942b = super.mo4476x().m8942b();
        r50 r50Var = pc0.f27516a;
        return mq4VarM8942b.m8371c(o41VarM8369a).m8369a();
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: y */
    public final o41 mo4477y() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "tertiary";
        mq4Var.f25142c = new xc0((byte) 7);
        mq4Var.f25143d = new xc0((byte) 8);
        mq4Var.f25140a = true;
        yc0 yc0Var = new yc0((byte) 2);
        yc0Var.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25145f = yc0Var;
        mq4Var.f25147h = new xc0((byte) 9);
        yc0 yc0Var2 = new yc0((byte) 3);
        yc0Var2.f35111b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = yc0Var2;
        o41 o41VarM8369a = mq4Var.m8369a();
        mq4 mq4VarM8942b = super.mo4477y().m8942b();
        r50 r50Var = pc0.f27516a;
        return mq4VarM8942b.m8371c(o41VarM8369a).m8369a();
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: z */
    public final o41 mo4478z() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "tertiary_container";
        mq4Var.f25142c = new cd0((byte) 27);
        mq4Var.f25143d = new cd0((byte) 28);
        mq4Var.f25140a = true;
        bd0 bd0Var = new bd0((byte) 5);
        bd0Var.f15213b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25145f = bd0Var;
        bd0 bd0Var2 = new bd0((byte) 6);
        bd0Var2.f15213b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = bd0Var2;
        mq4Var.f25147h = new vc0((byte) 16);
        o41 o41VarM8369a = mq4Var.m8369a();
        mq4 mq4VarM8942b = super.mo4478z().m8942b();
        r50 r50Var = pc0.f27516a;
        return mq4VarM8942b.m8371c(o41VarM8369a).m8369a();
    }
}
