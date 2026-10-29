package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j80 extends ym0 {

    /* JADX INFO: renamed from: t */
    public Object f22081t;

    /* JADX INFO: renamed from: u */
    public t82 f22082u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f22083v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ k80 f22084w;

    /* JADX INFO: renamed from: x */
    public int f22085x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j80(k80 k80Var, wm0 wm0Var) {
        super(wm0Var);
        this.f22084w = k80Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f22083v = obj;
        this.f22085x |= Integer.MIN_VALUE;
        return this.f22084w.emit(null, this);
    }
}
