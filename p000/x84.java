package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x84 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f34066t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ z84 f34067u;

    /* JADX INFO: renamed from: v */
    public int f34068v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x84(z84 z84Var, ym0 ym0Var) {
        super(ym0Var);
        this.f34067u = z84Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f34066t = obj;
        this.f34068v |= Integer.MIN_VALUE;
        return this.f34067u.m13451c(null, 0.0f, null, this);
    }
}
