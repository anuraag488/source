package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nt0 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f26076t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C1122rv f26077u;

    /* JADX INFO: renamed from: v */
    public int f26078v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt0(C1122rv c1122rv, ym0 ym0Var) {
        super(ym0Var);
        this.f26077u = c1122rv;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f26076t = obj;
        this.f26078v |= Integer.MIN_VALUE;
        return this.f26077u.m10452k(this);
    }
}
