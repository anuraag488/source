package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bh3 {

    /* JADX INFO: renamed from: c */
    public static final bh3 f15270c = new bh3(0.0f, sc6.m10645Q(0.0f, 0.0f));

    /* JADX INFO: renamed from: a */
    public final float f15271a;

    /* JADX INFO: renamed from: b */
    public final ma0 f15272b;

    public bh3(float f, ma0 ma0Var) {
        this.f15271a = f;
        this.f15272b = ma0Var;
        if (Float.isNaN(f)) {
            C1077qn.m9987m("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh3)) {
            return false;
        }
        bh3 bh3Var = (bh3) obj;
        return this.f15271a == bh3Var.f15271a && this.f15272b.equals(bh3Var.f15272b);
    }

    public final int hashCode() {
        return (this.f15272b.hashCode() + (Float.hashCode(this.f15271a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.f15271a + ", range=" + this.f15272b + ", steps=0)";
    }
}
