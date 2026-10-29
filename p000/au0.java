package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class au0 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f14875t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0906me f14876u;

    /* JADX INFO: renamed from: v */
    public int f14877v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au0(C0906me c0906me, wm0 wm0Var) {
        super(wm0Var);
        this.f14876u = c0906me;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f14875t = obj;
        this.f14877v |= Integer.MIN_VALUE;
        return this.f14876u.m8286a(this);
    }
}
