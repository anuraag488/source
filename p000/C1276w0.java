package p000;

/* JADX INFO: renamed from: w0 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1276w0 extends ym0 {

    /* JADX INFO: renamed from: t */
    public rt3 f32998t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f32999u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ vt0 f33000v;

    /* JADX INFO: renamed from: w */
    public int f33001w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1276w0(vt0 vt0Var, wm0 wm0Var) {
        super(wm0Var);
        this.f33000v = vt0Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f32999u = obj;
        this.f33001w |= Integer.MIN_VALUE;
        return this.f33000v.collect(null, this);
    }
}
