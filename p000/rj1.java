package p000;

/* JADX INFO: loaded from: classes.dex */
public final class rj1 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f29349t;

    /* JADX INFO: renamed from: u */
    public int f29350u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ fa1 f29351v;

    /* JADX INFO: renamed from: w */
    public Object f29352w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj1(fa1 fa1Var, wm0 wm0Var) {
        super(wm0Var);
        this.f29351v = fa1Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f29349t = obj;
        this.f29350u |= Integer.MIN_VALUE;
        return this.f29351v.emit(null, this);
    }
}
