package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b72 extends ym0 {

    /* JADX INFO: renamed from: t */
    public byte f15142t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ mq1 f15143u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ wm0 f15144v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b72(wm0 wm0Var, ro0 ro0Var, mq1 mq1Var, wm0 wm0Var2) {
        super(wm0Var, ro0Var);
        this.f15143u = mq1Var;
        this.f15144v = wm0Var2;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f15142t;
        if (b == 0) {
            this.f15142t = (byte) 1;
            k43.m7376J(obj);
            mq1 mq1Var = this.f15143u;
            as4.m3259r(2, mq1Var);
            return mq1Var.invoke(this.f15144v, this);
        }
        if (b != 1) {
            C1077qn.m9989o("This coroutine had already completed");
            return null;
        }
        this.f15142t = (byte) 2;
        k43.m7376J(obj);
        return obj;
    }
}
