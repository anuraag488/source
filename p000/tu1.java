package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tu1 implements ob0 {

    /* JADX INFO: renamed from: e */
    public static final h50 f31450e = new h50(10);

    /* JADX INFO: renamed from: a */
    public final float f31451a;

    /* JADX INFO: renamed from: b */
    public final float f31452b;

    /* JADX INFO: renamed from: c */
    public final float f31453c;

    /* JADX INFO: renamed from: d */
    public final float f31454d;

    static {
        q50 q50Var = mc0.f24810a;
        sl2 sl2VarM7680G = kx5.m7680G();
        for (int i = 0; i < 3; i++) {
            char cCharAt = "HSL".charAt(i);
            String.valueOf(cCharAt);
            sl2VarM7680G.add(new q50(0.0f, cCharAt == 'H' ? 360.0f : 1.0f));
        }
        sl2VarM7680G.add(mc0.f24810a);
        kx5.m7740w(sl2VarM7680G);
    }

    public tu1(float f, float f2, float f3, float f4) {
        this.f31451a = f;
        this.f31452b = f2;
        this.f31453c = f3;
        this.f31454d = f4;
    }

    /* JADX INFO: renamed from: b */
    public static final float m11160b(double d, double d2, double d3, int i) {
        double d4 = (((double) i) + d) % 12.0d;
        double dMin = Math.min(d3, 1.0d - d3) * d2;
        double dMin2 = Math.min(d4 - 3.0d, Math.min(9.0d - d4, 1.0d));
        if (dMin2 < -1.0d) {
            dMin2 = -1.0d;
        }
        return (float) (d3 - (dMin * dMin2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu1)) {
            return false;
        }
        tu1 tu1Var = (tu1) obj;
        return Float.compare(this.f31451a, tu1Var.f31451a) == 0 && Float.compare(this.f31452b, tu1Var.f31452b) == 0 && Float.compare(this.f31453c, tu1Var.f31453c) == 0 && Float.compare(this.f31454d, tu1Var.f31454d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f31454d) + c75.m3874f(this.f31453c, c75.m3874f(this.f31452b, Float.hashCode(this.f31451a) * 31, 31), 31);
    }

    public final String toString() {
        return "HSL(h=" + this.f31451a + ", s=" + this.f31452b + ", l=" + this.f31453c + ", alpha=" + this.f31454d + ')';
    }

    @Override // p000.ob0
    /* JADX INFO: renamed from: a */
    public final tu1 mo5727a() {
        return this;
    }
}
