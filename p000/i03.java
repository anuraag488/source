package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i03 extends ym0 {

    /* JADX INFO: renamed from: t */
    public long f20981t;

    /* JADX INFO: renamed from: u */
    public long f20982u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f20983v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ k03 f20984w;

    /* JADX INFO: renamed from: x */
    public int f20985x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i03(k03 k03Var, ym0 ym0Var) {
        super(ym0Var);
        this.f20984w = k03Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f20983v = obj;
        this.f20985x |= Integer.MIN_VALUE;
        return this.f20984w.mo4258R(0L, 0L, this);
    }
}
