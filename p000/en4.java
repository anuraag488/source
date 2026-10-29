package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class en4 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f18275t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ hn4 f18276u;

    /* JADX INFO: renamed from: v */
    public int f18277v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en4(hn4 hn4Var, ym0 ym0Var) {
        super(ym0Var);
        this.f18276u = hn4Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f18275t = obj;
        this.f18277v |= Integer.MIN_VALUE;
        return this.f18276u.m6455a(this);
    }
}
