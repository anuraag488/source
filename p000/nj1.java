package p000;

/* JADX INFO: loaded from: classes.dex */
public final class nj1 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f25880t;

    /* JADX INFO: renamed from: u */
    public int f25881u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ fa1 f25882v;

    /* JADX INFO: renamed from: w */
    public Object f25883w;

    /* JADX INFO: renamed from: x */
    public int f25884x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj1(fa1 fa1Var, wm0 wm0Var) {
        super(wm0Var);
        this.f25882v = fa1Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f25880t = obj;
        this.f25881u |= Integer.MIN_VALUE;
        return this.f25882v.emit(null, this);
    }
}
