package p000;

/* JADX INFO: renamed from: vz */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1274vz extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f32975t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C1349xz f32976u;

    /* JADX INFO: renamed from: v */
    public int f32977v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1274vz(C1349xz c1349xz, ym0 ym0Var) {
        super(ym0Var);
        this.f32976u = c1349xz;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f32975t = obj;
        this.f32977v |= Integer.MIN_VALUE;
        return this.f32976u.m12796a(null, this);
    }
}
