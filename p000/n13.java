package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n13 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f25385t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ o13 f25386u;

    /* JADX INFO: renamed from: v */
    public int f25387v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n13(o13 o13Var, ym0 ym0Var) {
        super(ym0Var);
        this.f25386u = o13Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f25385t = obj;
        this.f25387v |= Integer.MIN_VALUE;
        return this.f25386u.m8919b(null, this);
    }
}
