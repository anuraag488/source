package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cc4 extends AbstractC1093r2 {

    /* JADX INFO: renamed from: a */
    public AtomicReference f15926a;

    @Override // p000.AbstractC1093r2
    /* JADX INFO: renamed from: a */
    public final boolean mo92a(AbstractC1056q2 abstractC1056q2) {
        AtomicReference atomicReference = this.f15926a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(bc4.f15207a);
        return true;
    }

    @Override // p000.AbstractC1093r2
    /* JADX INFO: renamed from: b */
    public final wm0[] mo93b(AbstractC1056q2 abstractC1056q2) {
        this.f15926a.set(null);
        return AbstractC1356y5.f34878a;
    }
}
