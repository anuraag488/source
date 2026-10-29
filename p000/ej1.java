package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ej1 extends ym0 {

    /* JADX INFO: renamed from: A */
    public long f18131A;

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f18132t;

    /* JADX INFO: renamed from: u */
    public int f18133u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ aj1 f18134v;

    /* JADX INFO: renamed from: w */
    public ti1 f18135w;

    /* JADX INFO: renamed from: x */
    public Throwable f18136x;

    /* JADX INFO: renamed from: y */
    public int f18137y;

    /* JADX INFO: renamed from: z */
    public int f18138z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej1(aj1 aj1Var, wm0 wm0Var) {
        super(wm0Var);
        this.f18134v = aj1Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f18132t = obj;
        this.f18133u |= Integer.MIN_VALUE;
        return this.f18134v.collect(null, this);
    }
}
