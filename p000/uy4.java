package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uy4 extends ym0 {

    /* JADX INFO: renamed from: t */
    public ro0 f32259t;

    /* JADX INFO: renamed from: u */
    public z30 f32260u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f32261v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ vy4 f32262w;

    /* JADX INFO: renamed from: x */
    public int f32263x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy4(vy4 vy4Var, ym0 ym0Var) {
        super(ym0Var);
        this.f32262w = vy4Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f32261v = obj;
        this.f32263x |= Integer.MIN_VALUE;
        return this.f32262w.m12038c(null, this);
    }
}
