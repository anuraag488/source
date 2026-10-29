package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ve3 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f32557t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ ye3 f32558u;

    /* JADX INFO: renamed from: v */
    public int f32559v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve3(ye3 ye3Var, ym0 ym0Var) {
        super(ym0Var);
        this.f32558u = ye3Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f32557t = obj;
        this.f32559v |= Integer.MIN_VALUE;
        return this.f32558u.mo9869b(this);
    }
}
