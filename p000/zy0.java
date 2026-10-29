package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zy0 extends ym0 {

    /* JADX INFO: renamed from: t */
    public boolean f36458t;

    /* JADX INFO: renamed from: u */
    public Object f36459u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f36460v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ dz0 f36461w;

    /* JADX INFO: renamed from: x */
    public int f36462x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy0(dz0 dz0Var, ym0 ym0Var) {
        super(ym0Var);
        this.f36461w = dz0Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f36460v = obj;
        this.f36462x |= Integer.MIN_VALUE;
        return this.f36461w.m4803b(false, this);
    }
}
