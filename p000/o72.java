package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o72 extends w82 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ long f26409f = AbstractC1078qo.f28633a.objectFieldOffset(o72.class.getDeclaredField("_invoked$volatile"));
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: e */
    public C0633f0 f26410e;

    @Override // p000.w82
    /* JADX INFO: renamed from: n */
    public final boolean mo3514n() {
        return true;
    }

    @Override // p000.w82
    /* JADX INFO: renamed from: o */
    public final void mo3515o(Throwable th) {
        if (AbstractC1078qo.f28633a.compareAndSwapInt(this, f26409f, 0, 1)) {
            this.f26410e.invoke(th);
        }
    }
}
