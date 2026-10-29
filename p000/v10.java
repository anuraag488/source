package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v10 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f32301t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ w10 f32302u;

    /* JADX INFO: renamed from: v */
    public int f32303v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v10(w10 w10Var, ym0 ym0Var) {
        super(ym0Var);
        this.f32302u = w10Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f32301t = obj;
        this.f32303v |= Integer.MIN_VALUE;
        return this.f32302u.mo3327a(null, 0.0f, this);
    }
}
