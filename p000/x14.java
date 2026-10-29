package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x14 extends a04 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AtomicReferenceArray f33925g;

    public x14(long j, x14 x14Var, int i) {
        super(j, x14Var, i);
        this.f33925g = new AtomicReferenceArray(w14.f33034f);
    }

    @Override // p000.a04
    /* JADX INFO: renamed from: g */
    public final int mo5g() {
        return w14.f33034f;
    }

    @Override // p000.a04
    /* JADX INFO: renamed from: h */
    public final void mo6h(int i, ro0 ro0Var) {
        this.f33925g.set(i, w14.f33033e);
        m7i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f22d + ", hashCode=" + hashCode() + ']';
    }
}
