package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xt0 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f34612t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ ru0 f34613u;

    /* JADX INFO: renamed from: v */
    public int f34614v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt0(ru0 ru0Var, ym0 ym0Var) {
        super(ym0Var);
        this.f34613u = ru0Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f34612t = obj;
        this.f34614v |= Integer.MIN_VALUE;
        return this.f34613u.m10431d(null, this);
    }
}
