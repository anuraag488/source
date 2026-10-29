package p000;

/* JADX INFO: renamed from: za */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1398za extends ym0 {

    /* JADX INFO: renamed from: t */
    public Object f35901t;

    /* JADX INFO: renamed from: u */
    public t82 f35902u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f35903v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C0012ab f35904w;

    /* JADX INFO: renamed from: x */
    public int f35905x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1398za(C0012ab c0012ab, wm0 wm0Var) {
        super(wm0Var);
        this.f35904w = c0012ab;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f35903v = obj;
        this.f35905x |= Integer.MIN_VALUE;
        return this.f35904w.emit(null, this);
    }
}
