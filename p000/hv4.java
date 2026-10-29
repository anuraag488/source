package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hv4 extends ym0 {

    /* JADX INFO: renamed from: t */
    public iq1 f20894t;

    /* JADX INFO: renamed from: u */
    public wp1 f20895u;

    /* JADX INFO: renamed from: v */
    public float f20896v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f20897w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ iv4 f20898x;

    /* JADX INFO: renamed from: y */
    public int f20899y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv4(iv4 iv4Var, ym0 ym0Var) {
        super(ym0Var);
        this.f20898x = iv4Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f20897w = obj;
        this.f20899y |= Integer.MIN_VALUE;
        return this.f20898x.m6946a(null, null, this);
    }
}
