package p000;

/* JADX INFO: renamed from: xc */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1326xc extends ym0 {

    /* JADX INFO: renamed from: t */
    public mv2 f34142t;

    /* JADX INFO: renamed from: u */
    public z30 f34143u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f34144v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC1400zc f34145w;

    /* JADX INFO: renamed from: x */
    public int f34146x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1326xc(ViewOnAttachStateChangeListenerC1400zc viewOnAttachStateChangeListenerC1400zc, ym0 ym0Var) {
        super(ym0Var);
        this.f34145w = viewOnAttachStateChangeListenerC1400zc;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f34144v = obj;
        this.f34146x |= Integer.MIN_VALUE;
        return this.f34145w.m13484e(this);
    }
}
