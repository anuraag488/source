package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qk5 {

    /* JADX INFO: renamed from: a */
    public final float f28547a;

    /* JADX INFO: renamed from: b */
    public final float f28548b;

    /* JADX INFO: renamed from: c */
    public final float f28549c;

    public qk5(Double d, Double d2) {
        Double dValueOf = Double.valueOf(1.0d);
        float fFloatValue = d.floatValue();
        float fFloatValue2 = d2.floatValue();
        float fFloatValue3 = dValueOf.floatValue();
        this.f28547a = fFloatValue;
        this.f28548b = fFloatValue2;
        this.f28549c = fFloatValue3;
    }

    /* JADX INFO: renamed from: a */
    public final float m9896a() {
        float f = 1.0f - this.f28547a;
        float f2 = this.f28548b;
        return ((f - f2) * this.f28549c) / f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk5)) {
            return false;
        }
        qk5 qk5Var = (qk5) obj;
        return Float.compare(this.f28547a, qk5Var.f28547a) == 0 && Float.compare(this.f28548b, qk5Var.f28548b) == 0 && Float.compare(this.f28549c, qk5Var.f28549c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f28549c) + c75.m3874f(this.f28548b, Float.hashCode(this.f28547a) * 31, 31);
    }

    public final String toString() {
        return "xyY(x=" + this.f28547a + ", y=" + this.f28548b + ", Y=" + this.f28549c + ')';
    }
}
