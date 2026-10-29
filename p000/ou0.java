package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ou0 extends ym0 {

    /* JADX INFO: renamed from: t */
    public ol3 f27103t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f27104u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ ru0 f27105v;

    /* JADX INFO: renamed from: w */
    public int f27106w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou0(ru0 ru0Var, ym0 ym0Var) {
        super(ym0Var);
        this.f27105v = ru0Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f27104u = obj;
        this.f27106w |= Integer.MIN_VALUE;
        return this.f27105v.m10437j(null, false, this);
    }
}
