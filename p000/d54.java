package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d54 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f16789t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ e54 f16790u;

    /* JADX INFO: renamed from: v */
    public int f16791v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d54(e54 e54Var, ym0 ym0Var) {
        super(ym0Var);
        this.f16790u = e54Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f16789t = obj;
        this.f16791v |= Integer.MIN_VALUE;
        return this.f16790u.m4934a(null, this);
    }
}
