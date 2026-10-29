package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t42 extends ym0 {

    /* JADX INFO: renamed from: t */
    public Object f30774t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f30775u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ i50 f30776v;

    /* JADX INFO: renamed from: w */
    public int f30777w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t42(i50 i50Var, ym0 ym0Var) {
        super(ym0Var);
        this.f30776v = i50Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f30775u = obj;
        this.f30777w |= Integer.MIN_VALUE;
        return this.f30776v.m6671f(null, this);
    }
}
