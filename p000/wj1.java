package p000;

/* JADX INFO: loaded from: classes.dex */
public final class wj1 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f33423t;

    /* JADX INFO: renamed from: u */
    public int f33424u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ fa1 f33425v;

    /* JADX INFO: renamed from: w */
    public Object f33426w;

    /* JADX INFO: renamed from: x */
    public ti1 f33427x;

    /* JADX INFO: renamed from: y */
    public int f33428y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj1(fa1 fa1Var, wm0 wm0Var) {
        super(wm0Var);
        this.f33425v = fa1Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f33423t = obj;
        this.f33424u |= Integer.MIN_VALUE;
        return this.f33425v.emit(null, this);
    }
}
