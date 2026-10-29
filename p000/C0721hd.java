package p000;

/* JADX INFO: renamed from: hd */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0721hd extends ym0 {

    /* JADX INFO: renamed from: t */
    public z30 f20478t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f20479u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC0758id f20480v;

    /* JADX INFO: renamed from: w */
    public int f20481w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0721hd(ViewOnAttachStateChangeListenerC0758id viewOnAttachStateChangeListenerC0758id, ym0 ym0Var) {
        super(ym0Var);
        this.f20480v = viewOnAttachStateChangeListenerC0758id;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f20479u = obj;
        this.f20481w |= Integer.MIN_VALUE;
        return this.f20480v.m6753a(this);
    }
}
