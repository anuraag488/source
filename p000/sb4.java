package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sb4 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f30067t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ fa1 f30068u;

    /* JADX INFO: renamed from: v */
    public int f30069v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb4(fa1 fa1Var, wm0 wm0Var) {
        super(wm0Var);
        this.f30068u = fa1Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f30067t = obj;
        this.f30069v |= Integer.MIN_VALUE;
        return this.f30068u.m5622a(0, this);
    }
}
