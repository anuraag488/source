package p000;

/* JADX INFO: loaded from: classes.dex */
public final class bj1 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f15325t;

    /* JADX INFO: renamed from: u */
    public int f15326u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ yi1 f15327v;

    /* JADX INFO: renamed from: w */
    public ti1 f15328w;

    /* JADX INFO: renamed from: x */
    public int f15329x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj1(yi1 yi1Var, wm0 wm0Var) {
        super(wm0Var);
        this.f15327v = yi1Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f15325t = obj;
        this.f15326u |= Integer.MIN_VALUE;
        return this.f15327v.collect(null, this);
    }
}
