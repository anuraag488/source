package p000;

/* JADX INFO: loaded from: classes.dex */
public final class mj1 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f24963t;

    /* JADX INFO: renamed from: u */
    public int f24964u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ aj1 f24965v;

    /* JADX INFO: renamed from: w */
    public fa1 f24966w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj1(aj1 aj1Var, wm0 wm0Var) {
        super(wm0Var);
        this.f24965v = aj1Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f24963t = obj;
        this.f24964u |= Integer.MIN_VALUE;
        return this.f24965v.collect(null, this);
    }
}
