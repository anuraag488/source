package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e40 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f17679t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ f40 f17680u;

    /* JADX INFO: renamed from: v */
    public int f17681v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e40(f40 f40Var, ym0 ym0Var) {
        super(ym0Var);
        this.f17680u = f40Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f17679t = obj;
        this.f17681v |= Integer.MIN_VALUE;
        Object objM5475G = this.f17680u.m5475G(null, 0, 0L, this);
        return objM5475G == ap0.f14763a ? objM5475G : o80.m8978a(objM5475G);
    }
}
