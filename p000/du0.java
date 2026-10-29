package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class du0 extends ym0 {

    /* JADX INFO: renamed from: t */
    public boolean f17385t;

    /* JADX INFO: renamed from: u */
    public wb4 f17386u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f17387v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ ru0 f17388w;

    /* JADX INFO: renamed from: x */
    public int f17389x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du0(ru0 ru0Var, ym0 ym0Var) {
        super(ym0Var);
        this.f17388w = ru0Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f17387v = obj;
        this.f17389x |= Integer.MIN_VALUE;
        return this.f17388w.m10433f(false, this);
    }
}
