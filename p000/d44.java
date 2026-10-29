package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d44 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f16779t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ e44 f16780u;

    /* JADX INFO: renamed from: v */
    public int f16781v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d44(e44 e44Var, ym0 ym0Var) {
        super(ym0Var);
        this.f16780u = e44Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f16779t = obj;
        this.f16781v |= Integer.MIN_VALUE;
        return this.f16780u.m4918b(null, null, this);
    }
}
