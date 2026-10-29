package p000;

/* JADX INFO: renamed from: td */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1178td extends ym0 {

    /* JADX INFO: renamed from: t */
    public long f31081t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f31082u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C1289wd f31083v;

    /* JADX INFO: renamed from: w */
    public int f31084w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1178td(C1289wd c1289wd, ym0 ym0Var) {
        super(ym0Var);
        this.f31083v = c1289wd;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f31082u = obj;
        this.f31084w |= Integer.MIN_VALUE;
        return this.f31083v.m12215b(0L, null, this);
    }
}
