package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: i2 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0747i2 extends k43 {

    /* JADX INFO: renamed from: E */
    public AtomicReferenceFieldUpdater f21042E;

    /* JADX INFO: renamed from: F */
    public AtomicReferenceFieldUpdater f21043F;

    /* JADX INFO: renamed from: G */
    public AtomicReferenceFieldUpdater f21044G;

    /* JADX INFO: renamed from: H */
    public AtomicReferenceFieldUpdater f21045H;

    /* JADX INFO: renamed from: I */
    public AtomicReferenceFieldUpdater f21046I;

    @Override // p000.k43
    /* JADX INFO: renamed from: i */
    public final boolean mo6561i(AbstractC0857l2 abstractC0857l2, C0710h2 c0710h2, C0710h2 c0710h3) {
        return this.f21045H.compareAndSet(abstractC0857l2, c0710h2, c0710h3);
    }

    @Override // p000.k43
    /* JADX INFO: renamed from: j */
    public final boolean mo6562j(AbstractC0857l2 abstractC0857l2, Object obj, Object obj2) {
        return this.f21046I.compareAndSet(abstractC0857l2, obj, obj2);
    }

    @Override // p000.k43
    /* JADX INFO: renamed from: k */
    public final boolean mo6563k(AbstractC0857l2 abstractC0857l2, C0820k2 c0820k2, C0820k2 c0820k3) {
        return this.f21044G.compareAndSet(abstractC0857l2, c0820k2, c0820k3);
    }

    @Override // p000.k43
    /* JADX INFO: renamed from: y */
    public final void mo6564y(C0820k2 c0820k2, C0820k2 c0820k3) {
        this.f21043F.lazySet(c0820k2, c0820k3);
    }

    @Override // p000.k43
    /* JADX INFO: renamed from: z */
    public final void mo6565z(C0820k2 c0820k2, Thread thread) {
        this.f21042E.lazySet(c0820k2, thread);
    }
}
