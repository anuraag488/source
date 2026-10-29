package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fj3 implements ob0 {

    /* JADX INFO: renamed from: f */
    public static final ej3 f19041f;

    /* JADX INFO: renamed from: a */
    public float f19042a;

    /* JADX INFO: renamed from: b */
    public float f19043b;

    /* JADX INFO: renamed from: c */
    public float f19044c;

    /* JADX INFO: renamed from: d */
    public float f19045d;

    /* JADX INFO: renamed from: e */
    public jj3 f19046e;

    static {
        ej3 ej3Var = new ej3();
        ej3Var.f18143a = kj3.f23170a;
        VarHandle.storeStoreFence();
        f19041f = ej3Var;
    }

    @Override // p000.ob0
    /* JADX INFO: renamed from: a */
    public final tu1 mo5727a() {
        fj3 fj3VarM7400b;
        double d;
        ij3 ij3Var = qt3.f28787b;
        float f = this.f19045d;
        float f2 = this.f19044c;
        float f3 = this.f19043b;
        float f4 = this.f19042a;
        qt3 qt3Var = qt3.f28787b;
        hj3 hj3Var = qt3Var.f28788a.f22334c;
        jj3 jj3Var = this.f19046e;
        if (jj3Var.equals(ij3Var)) {
            fj3VarM7400b = this;
        } else if (jj3Var.equals(qt3Var) && ij3Var.equals(kj3.f23171b)) {
            fj3VarM7400b = ij3Var.mo5129e(hj3Var.mo6008i(f4), hj3Var.mo6008i(f3), hj3Var.mo6008i(f2), f);
        } else if (jj3Var.equals(kj3.f23171b) && ij3Var.equals(qt3Var)) {
            fj3VarM7400b = ij3Var.mo5129e(hj3Var.mo6009j(f4), hj3Var.mo6009j(f3), hj3Var.mo6009j(f2), f);
        } else {
            jj3 jj3Var2 = this.f19046e;
            hj3 hj3Var2 = jj3Var2.f22334c;
            float[] fArr = jj3Var2.f22338g;
            float fMo6008i = hj3Var2.mo6008i(this.f19042a);
            float fMo6008i2 = hj3Var2.mo6008i(this.f19043b);
            float fMo6008i3 = hj3Var2.mo6008i(this.f19044c);
            fj3VarM7400b = ks5.m7606g(jj3Var2.f22333b).m7833a((fArr[2] * fMo6008i3) + (fArr[1] * fMo6008i2) + (fArr[0] * fMo6008i), (fArr[5] * fMo6008i3) + (fArr[4] * fMo6008i2) + (fArr[3] * fMo6008i), (fArr[8] * fMo6008i3) + (fArr[7] * fMo6008i2) + (fArr[6] * fMo6008i), this.f19045d).m7400b(ij3Var);
        }
        double d2 = fj3VarM7400b.f19042a;
        double d3 = fj3VarM7400b.f19043b;
        double d4 = fj3VarM7400b.f19044c;
        double dMin = Math.min(d2, Math.min(d3, d4));
        double dMax = Math.max(d2, Math.max(d3, d4));
        double d5 = dMax - dMin;
        double d6 = 0.0d;
        if (d5 < 1.0E-7d) {
            d = Double.NaN;
        } else if (d2 == dMax) {
            d = (d3 - d4) / d5;
        } else if (d3 == dMax) {
            d = ((d4 - d2) / d5) + 2.0d;
        } else {
            d = d4 == dMax ? ((d2 - d3) / d5) + 4.0d : 0.0d;
        }
        double d7 = (((d * 60.0d) % 360.0d) + 360.0d) % 360.0d;
        double d8 = dMin + dMax;
        double d9 = d8 / 2.0d;
        if (dMax != dMin) {
            d6 = d9 <= 0.5d ? d5 / d8 : d5 / ((2.0d - dMax) - dMin);
        }
        return new tu1((float) d7, (float) d6, (float) d9, this.f19045d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj3)) {
            return false;
        }
        fj3 fj3Var = (fj3) obj;
        return Float.compare(this.f19042a, fj3Var.f19042a) == 0 && Float.compare(this.f19043b, fj3Var.f19043b) == 0 && Float.compare(this.f19044c, fj3Var.f19044c) == 0 && Float.compare(this.f19045d, fj3Var.f19045d) == 0 && this.f19046e.equals(fj3Var.f19046e);
    }

    public final int hashCode() {
        return this.f19046e.hashCode() + c75.m3874f(this.f19045d, c75.m3874f(this.f19044c, c75.m3874f(this.f19043b, Float.hashCode(this.f19042a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "RGB(r=" + this.f19042a + ", g=" + this.f19043b + ", b=" + this.f19044c + ", alpha=" + this.f19045d + ", space=" + this.f19046e + ')';
    }
}
