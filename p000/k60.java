package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k60 extends ym0 {

    /* JADX INFO: renamed from: t */
    public mg3 f22928t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f22929u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ l60 f22930v;

    /* JADX INFO: renamed from: w */
    public int f22931w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k60(l60 l60Var, ym0 ym0Var) {
        super(ym0Var);
        this.f22930v = l60Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f22929u = obj;
        this.f22931w |= Integer.MIN_VALUE;
        return this.f22930v.mo3886c(null, this);
    }
}
