package p000;

/* JADX INFO: loaded from: classes.dex */
public final class zi1 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f36134t;

    /* JADX INFO: renamed from: u */
    public int f36135u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ aj1 f36136v;

    /* JADX INFO: renamed from: w */
    public ti1 f36137w;

    /* JADX INFO: renamed from: x */
    public rt3 f36138x;

    /* JADX INFO: renamed from: y */
    public int f36139y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi1(aj1 aj1Var, wm0 wm0Var) {
        super(wm0Var);
        this.f36136v = aj1Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f36134t = obj;
        this.f36135u |= Integer.MIN_VALUE;
        return this.f36136v.collect(null, this);
    }
}
