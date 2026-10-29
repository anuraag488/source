package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cm0 {

    /* JADX INFO: renamed from: a */
    public g30 f16119a;

    /* JADX INFO: renamed from: b */
    public b70 f16120b;

    public final String toString() {
        b70 b70Var = this.f16120b;
        vo0 vo0Var = (vo0) b70Var.f15139e.get(vo0.f32759c);
        String str = vo0Var != null ? vo0Var.f32760b : null;
        int iHashCode = hashCode();
        y62.m12992v(16);
        return "Request@" + Integer.toString(iHashCode, 16) + (str != null ? zi4.m13621u("[", str, "](") : "(") + "currentBounds()=" + this.f16119a.invoke() + ", continuation=" + b70Var + ")";
    }
}
