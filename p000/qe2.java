package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qe2 implements ob0 {

    /* JADX INFO: renamed from: a */
    public float f28415a;

    /* JADX INFO: renamed from: b */
    public float f28416b;

    /* JADX INFO: renamed from: c */
    public float f28417c;

    /* JADX INFO: renamed from: d */
    public float f28418d;

    /* JADX INFO: renamed from: e */
    public re2 f28419e;

    static {
        re2 re2Var = se2.f30213a;
    }

    @Override // p000.ob0
    /* JADX INFO: renamed from: a */
    public final tu1 mo5727a() {
        k45 k45VarM7833a;
        fj3 fj3VarM7400b;
        if (this.f28415a == 0.0f) {
            fj3VarM7400b = fj3.f19041f.f18143a.mo5129e(0.0f, 0.0f, 0.0f, this.f28418d);
        } else {
            Double dValueOf = Double.valueOf(0.0d);
            tz4 tz4Var = this.f28419e.f29209a;
            l45 l45VarM7606g = ks5.m7606g(tz4Var);
            float f = this.f28415a;
            if (f == 0.0f) {
                l45VarM7606g.getClass();
                k45VarM7833a = l45VarM7606g.m7833a(dValueOf.floatValue(), dValueOf.floatValue(), dValueOf.floatValue(), 1.0f);
            } else {
                double d = ((double) (16.0f + f)) / 116.0d;
                double d2 = d - (((double) this.f28417c) / 200.0d);
                double d3 = (((double) this.f28416b) / 500.0d) + d;
                double d4 = f;
                double dPow = d4 > 8.0d ? Math.pow(d, 3.0d) : d4 / 903.2962962962963d;
                double dPow2 = Math.pow(d2, 3.0d);
                if (dPow2 <= 0.008856451679035631d) {
                    dPow2 = ((d2 * 116.0d) - 16.0d) / 903.2962962962963d;
                }
                double dPow3 = Math.pow(d3, 3.0d);
                if (dPow3 <= 0.008856451679035631d) {
                    dPow3 = ((116.0d * d3) - 16.0d) / 903.2962962962963d;
                }
                qk5 qk5Var = tz4Var.f31569b;
                float f2 = qk5Var.f28549c;
                Double dValueOf2 = Double.valueOf(dPow3 * ((double) ((qk5Var.f28547a * f2) / qk5Var.f28548b)));
                Double dValueOf3 = Double.valueOf(dPow * ((double) f2));
                Double dValueOf4 = Double.valueOf(dPow2 * ((double) qk5Var.m9896a()));
                float f3 = this.f28418d;
                l45VarM7606g.getClass();
                k45VarM7833a = l45VarM7606g.m7833a(dValueOf2.floatValue(), dValueOf3.floatValue(), dValueOf4.floatValue(), f3);
            }
            fj3VarM7400b = k45VarM7833a.m7400b(kj3.f23170a);
        }
        return fj3VarM7400b.mo5727a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe2)) {
            return false;
        }
        qe2 qe2Var = (qe2) obj;
        return Float.compare(this.f28415a, qe2Var.f28415a) == 0 && Float.compare(this.f28416b, qe2Var.f28416b) == 0 && Float.compare(this.f28417c, qe2Var.f28417c) == 0 && Float.compare(this.f28418d, qe2Var.f28418d) == 0 && this.f28419e.equals(qe2Var.f28419e);
    }

    public final int hashCode() {
        return this.f28419e.f29209a.hashCode() + c75.m3874f(this.f28418d, c75.m3874f(this.f28417c, c75.m3874f(this.f28416b, Float.hashCode(this.f28415a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "LAB(l=" + this.f28415a + ", a=" + this.f28416b + ", b=" + this.f28417c + ", alpha=" + this.f28418d + ", space=" + this.f28419e + ')';
    }
}
