package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d40 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f16770t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ f40 f16771u;

    /* JADX INFO: renamed from: v */
    public int f16772v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d40(f40 f40Var, ym0 ym0Var) {
        super(ym0Var);
        this.f16771u = f40Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f16770t = obj;
        this.f16772v |= Integer.MIN_VALUE;
        Object objM5468F = f40.m5468F(this.f16771u, this);
        return objM5468F == ap0.f14763a ? objM5468F : o80.m8978a(objM5468F);
    }
}
