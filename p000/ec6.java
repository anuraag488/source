package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ec6 extends yy5 {

    /* JADX INFO: renamed from: a */
    public AtomicReferenceFieldUpdater f18006a;

    /* JADX INFO: renamed from: b */
    public AtomicReferenceFieldUpdater f18007b;

    /* JADX INFO: renamed from: c */
    public AtomicReferenceFieldUpdater f18008c;

    /* JADX INFO: renamed from: d */
    public AtomicReferenceFieldUpdater f18009d;

    /* JADX INFO: renamed from: e */
    public AtomicReferenceFieldUpdater f18010e;

    @Override // p000.yy5
    /* JADX INFO: renamed from: a */
    public final void mo5083a(sh6 sh6Var, sh6 sh6Var2) {
        this.f18007b.lazySet(sh6Var, sh6Var2);
    }

    @Override // p000.yy5
    /* JADX INFO: renamed from: b */
    public final void mo5084b(sh6 sh6Var, Thread thread) {
        this.f18006a.lazySet(sh6Var, thread);
    }

    @Override // p000.yy5
    /* JADX INFO: renamed from: c */
    public final boolean mo5085c(ok6 ok6Var, x76 x76Var, x76 x76Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f18009d;
        while (!atomicReferenceFieldUpdater.compareAndSet(ok6Var, x76Var, x76Var2)) {
            if (atomicReferenceFieldUpdater.get(ok6Var) != x76Var) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.yy5
    /* JADX INFO: renamed from: d */
    public final boolean mo5086d(ok6 ok6Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f18010e;
        while (!atomicReferenceFieldUpdater.compareAndSet(ok6Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(ok6Var) != obj) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.yy5
    /* JADX INFO: renamed from: e */
    public final boolean mo5087e(ok6 ok6Var, sh6 sh6Var, sh6 sh6Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f18008c;
        while (!atomicReferenceFieldUpdater.compareAndSet(ok6Var, sh6Var, sh6Var2)) {
            if (atomicReferenceFieldUpdater.get(ok6Var) != sh6Var) {
                return false;
            }
        }
        return true;
    }
}
