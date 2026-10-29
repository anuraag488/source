package p000;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: y9 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1360y9 extends kx5 {

    /* JADX INFO: renamed from: o */
    public AtomicReferenceFieldUpdater f35030o;

    /* JADX INFO: renamed from: p */
    public AtomicIntegerFieldUpdater f35031p;

    @Override // p000.kx5
    /* JADX INFO: renamed from: D */
    public final void mo7746D(AbstractC1323x9 abstractC1323x9, Set set) {
        this.f35030o.compareAndSet(abstractC1323x9, null, set);
    }

    @Override // p000.kx5
    /* JADX INFO: renamed from: J */
    public final int mo7748J(AbstractC1323x9 abstractC1323x9) {
        return this.f35031p.decrementAndGet(abstractC1323x9);
    }
}
