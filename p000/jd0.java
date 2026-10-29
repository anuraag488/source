package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jd0 {

    /* JADX INFO: renamed from: a */
    public static final jd0 f22171a = new jd0();

    /* JADX INFO: renamed from: a */
    public static nt2 m7067a(nt2 nt2Var, float f) {
        if (f <= 0.0d) {
            o32.m8934a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return nt2Var.mo7630d(new lg2(f, true));
    }
}
