package p000;

/* JADX INFO: renamed from: xo */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1338xo extends ym0 {

    /* JADX INFO: renamed from: t */
    public vt1 f34474t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f34475u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C1375yo f34476v;

    /* JADX INFO: renamed from: w */
    public int f34477w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1338xo(C1375yo c1375yo, ym0 ym0Var) {
        super(ym0Var);
        this.f34476v = c1375yo;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f34475u = obj;
        this.f34477w |= Integer.MIN_VALUE;
        return this.f34476v.m13187b(null, this);
    }
}
