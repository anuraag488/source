package p000;

/* JADX INFO: loaded from: classes.dex */
public final class gp1 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f20003t;

    /* JADX INFO: renamed from: u */
    public int f20004u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ aj1 f20005v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp1(aj1 aj1Var, wm0 wm0Var) {
        super(wm0Var);
        this.f20005v = aj1Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f20003t = obj;
        this.f20004u |= Integer.MIN_VALUE;
        return this.f20005v.collect(null, this);
    }
}
