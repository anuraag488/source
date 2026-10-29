package p000;

/* JADX INFO: loaded from: classes.dex */
public final class rb4 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f29137t;

    /* JADX INFO: renamed from: u */
    public int f29138u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ vt0 f29139v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb4(vt0 vt0Var, wm0 wm0Var) {
        super(wm0Var);
        this.f29139v = vt0Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f29137t = obj;
        this.f29138u |= Integer.MIN_VALUE;
        this.f29139v.collect(null, this);
        return ap0.f14763a;
    }
}
