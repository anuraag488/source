package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pc4 implements k30 {

    /* JADX INFO: renamed from: b */
    public wp1 f27522b;

    /* JADX INFO: renamed from: c */
    public df2 f27523c;

    /* JADX INFO: renamed from: d */
    public boolean f27524d;

    /* JADX INFO: renamed from: e */
    public k30 f27525e;

    @Override // p000.k30
    /* JADX INFO: renamed from: a */
    public final float mo7365a(float f, float f2, float f3) {
        float fIntValue = ((Number) this.f27522b.invoke()).intValue();
        boolean z = this.f27523c == df2.f17012b;
        if (this.f27524d || !z) {
            f -= fIntValue;
        }
        return this.f27525e.mo7365a(f, f2, f3 - fIntValue);
    }
}
