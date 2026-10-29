package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: b1 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0475b1 extends y62 {

    /* JADX INFO: renamed from: C */
    public AtomicReferenceFieldUpdater f14984C;

    /* JADX INFO: renamed from: D */
    public AtomicReferenceFieldUpdater f14985D;

    /* JADX INFO: renamed from: E */
    public AtomicReferenceFieldUpdater f14986E;

    /* JADX INFO: renamed from: F */
    public AtomicReferenceFieldUpdater f14987F;

    /* JADX INFO: renamed from: G */
    public AtomicReferenceFieldUpdater f14988G;

    @Override // p000.y62
    /* JADX INFO: renamed from: D */
    public final C0002a1 mo3394D(AbstractC0782j1 abstractC0782j1) {
        return (C0002a1) this.f14987F.getAndSet(abstractC0782j1, C0002a1.f28d);
    }

    @Override // p000.y62
    /* JADX INFO: renamed from: E */
    public final C0746i1 mo3395E(AbstractC0782j1 abstractC0782j1) {
        return (C0746i1) this.f14986E.getAndSet(abstractC0782j1, C0746i1.f20994c);
    }

    @Override // p000.y62
    /* JADX INFO: renamed from: T */
    public final void mo3396T(C0746i1 c0746i1, C0746i1 c0746i2) {
        this.f14985D.lazySet(c0746i1, c0746i2);
    }

    @Override // p000.y62
    /* JADX INFO: renamed from: U */
    public final void mo3397U(C0746i1 c0746i1, Thread thread) {
        this.f14984C.lazySet(c0746i1, thread);
    }

    @Override // p000.y62
    /* JADX INFO: renamed from: s */
    public final boolean mo3398s(AbstractC0782j1 abstractC0782j1, C0002a1 c0002a1, C0002a1 c0002a2) {
        return this.f14987F.compareAndSet(abstractC0782j1, c0002a1, c0002a2);
    }

    @Override // p000.y62
    /* JADX INFO: renamed from: t */
    public final boolean mo3399t(AbstractC0782j1 abstractC0782j1, Object obj, Object obj2) {
        return this.f14988G.compareAndSet(abstractC0782j1, obj, obj2);
    }

    @Override // p000.y62
    /* JADX INFO: renamed from: u */
    public final boolean mo3400u(AbstractC0782j1 abstractC0782j1, C0746i1 c0746i1, C0746i1 c0746i2) {
        return this.f14986E.compareAndSet(abstractC0782j1, c0746i1, c0746i2);
    }
}
