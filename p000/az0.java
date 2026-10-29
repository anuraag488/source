package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class az0 extends ym0 {

    /* JADX INFO: renamed from: t */
    public Object f14947t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f14948u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ dz0 f14949v;

    /* JADX INFO: renamed from: w */
    public int f14950w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az0(dz0 dz0Var, ym0 ym0Var) {
        super(ym0Var);
        this.f14949v = dz0Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f14948u = obj;
        this.f14950w |= Integer.MIN_VALUE;
        return this.f14949v.m4804c(this);
    }
}
