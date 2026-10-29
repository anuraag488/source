package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t81 extends ym0 {

    /* JADX INFO: renamed from: t */
    public v81 f30986t;

    /* JADX INFO: renamed from: u */
    public ok3 f30987u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f30988v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ v81 f30989w;

    /* JADX INFO: renamed from: x */
    public int f30990x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t81(v81 v81Var, ym0 ym0Var) {
        super(ym0Var);
        this.f30989w = v81Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f30988v = obj;
        this.f30990x |= Integer.MIN_VALUE;
        return this.f30989w.m11766d(null, this);
    }
}
