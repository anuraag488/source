package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ex3 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f18559t;

    /* JADX INFO: renamed from: u */
    public int f18560u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ hx3 f18561v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex3(hx3 hx3Var, wm0 wm0Var) {
        super(wm0Var);
        this.f18561v = hx3Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f18559t = obj;
        this.f18560u |= Integer.MIN_VALUE;
        return this.f18561v.collect(null, this);
    }
}
