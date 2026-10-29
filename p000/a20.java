package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a20 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f58t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ b20 f59u;

    /* JADX INFO: renamed from: v */
    public int f60v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a20(b20 b20Var, ym0 ym0Var) {
        super(ym0Var);
        this.f59u = b20Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f58t = obj;
        this.f60v |= Integer.MIN_VALUE;
        return this.f59u.m3409a(this);
    }
}
