package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ar2 {

    /* JADX INFO: renamed from: a */
    public final as0 f14800a;

    /* JADX INFO: renamed from: b */
    public final float f14801b;

    /* JADX INFO: renamed from: c */
    public float f14802c;

    /* JADX INFO: renamed from: d */
    public float f14803d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ br2 f14804e;

    public ar2(br2 br2Var, as0 as0Var, float f, float f2) {
        this.f14804e = br2Var;
        this.f14800a = as0Var;
        if (f2 < f) {
            C1077qn.m9987m("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
            throw null;
        }
        br2Var.f15521a.getClass();
        this.f14801b = Float.intBitsToFloat((int) (i50.m6665e(as0Var, Float.POSITIVE_INFINITY) & 4294967295L));
        this.f14802c = f;
        this.f14803d = f2;
    }

    /* JADX INFO: renamed from: a */
    public final l73 m3126a(float f) {
        float fM10674o = sc6.m10674o(f, this.f14802c, this.f14803d);
        float f2 = this.f14803d;
        float f3 = this.f14802c;
        float f4 = (fM10674o - f3) / (f2 - f3);
        br2 br2Var = this.f14804e;
        i50 i50Var = br2Var.f15521a;
        float f5 = f4 * this.f14801b;
        i50Var.getClass();
        as0 as0Var = this.f14800a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (i50.m6665e(as0Var, f5) >> 32));
        if (0.0f > fIntBitsToFloat || fIntBitsToFloat > 1.0f) {
            C1077qn.m9987m("Cubic cut point is expected to be between 0 and 1");
            return null;
        }
        l73 l73VarM3218d = as0Var.m3218d(fIntBitsToFloat);
        return new l73(new ar2(br2Var, (as0) l73VarM3218d.f23833a, this.f14802c, fM10674o), new ar2(br2Var, (as0) l73VarM3218d.f23834b, fM10674o, this.f14803d));
    }

    public final String toString() {
        return "MeasuredCubic(outlineProgress=[" + this.f14802c + " .. " + this.f14803d + "], size=" + this.f14801b + ", cubic=" + this.f14800a + ')';
    }
}
