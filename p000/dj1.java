package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dj1 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f17098t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ c11 f17099u;

    /* JADX INFO: renamed from: v */
    public int f17100v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj1(c11 c11Var, wm0 wm0Var) {
        super(wm0Var);
        this.f17099u = c11Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f17098t = obj;
        this.f17100v |= Integer.MIN_VALUE;
        return this.f17099u.emit(null, this);
    }
}
