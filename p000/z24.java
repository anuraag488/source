package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z24 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f35723t;

    /* JADX INFO: renamed from: u */
    public int f35724u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C0806jp f35725v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z24(C0806jp c0806jp, wm0 wm0Var) {
        super(wm0Var);
        this.f35725v = c0806jp;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f35723t = obj;
        this.f35724u |= Integer.MIN_VALUE;
        return this.f35725v.emit(null, this);
    }
}
