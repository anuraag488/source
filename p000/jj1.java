package p000;

/* JADX INFO: loaded from: classes.dex */
public final class jj1 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f22326t;

    /* JADX INFO: renamed from: u */
    public int f22327u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ fj1 f22328v;

    /* JADX INFO: renamed from: w */
    public Object f22329w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj1(fj1 fj1Var, wm0 wm0Var) {
        super(wm0Var);
        this.f22328v = fj1Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f22326t = obj;
        this.f22327u |= Integer.MIN_VALUE;
        return this.f22328v.collect(null, this);
    }
}
