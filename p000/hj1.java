package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hj1 extends ym0 {

    /* JADX INFO: renamed from: t */
    public Object f20621t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f20622u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C0012ab f20623v;

    /* JADX INFO: renamed from: w */
    public int f20624w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj1(C0012ab c0012ab, wm0 wm0Var) {
        super(wm0Var);
        this.f20623v = c0012ab;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f20622u = obj;
        this.f20624w |= Integer.MIN_VALUE;
        return this.f20623v.emit(null, this);
    }
}
