package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class sx5 {
    /* JADX INFO: renamed from: b */
    public static final kj6 m10946b(Object obj, Object obj2) {
        kj6 kj6VarM7528a = (kj6) obj;
        kj6 kj6Var = (kj6) obj2;
        if (!kj6Var.isEmpty()) {
            if (!kj6VarM7528a.f23185a) {
                kj6VarM7528a = kj6VarM7528a.m7528a();
            }
            kj6VarM7528a.m7529c();
            if (!kj6Var.isEmpty()) {
                kj6VarM7528a.putAll(kj6Var);
            }
        }
        return kj6VarM7528a;
    }

    /* JADX INFO: renamed from: a */
    public px5 mo10947a(e06 e06Var) {
        return (px5) tx5.f31517d.getAndSet(e06Var, px5.f28071d);
    }

    /* JADX INFO: renamed from: c */
    public wx5 mo10948c(e06 e06Var) {
        return (wx5) tx5.f31516c.getAndSet(e06Var, wx5.f33841c);
    }

    /* JADX INFO: renamed from: d */
    public void mo10949d(wx5 wx5Var, wx5 wx5Var2) {
        tx5.f31515b.lazySet(wx5Var, wx5Var2);
    }

    /* JADX INFO: renamed from: e */
    public void mo10950e(wx5 wx5Var, Thread thread) {
        tx5.f31514a.lazySet(wx5Var, thread);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo10951f(e06 e06Var, px5 px5Var, px5 px5Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tx5.f31517d;
        while (!atomicReferenceFieldUpdater.compareAndSet(e06Var, px5Var, px5Var2)) {
            if (atomicReferenceFieldUpdater.get(e06Var) != px5Var) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo10952g(yx5 yx5Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tx5.f31518e;
        while (!atomicReferenceFieldUpdater.compareAndSet(yx5Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(yx5Var) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public boolean mo10953h(yx5 yx5Var, wx5 wx5Var, wx5 wx5Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tx5.f31516c;
        while (!atomicReferenceFieldUpdater.compareAndSet(yx5Var, wx5Var, wx5Var2)) {
            if (atomicReferenceFieldUpdater.get(yx5Var) != wx5Var) {
                return false;
            }
        }
        return true;
    }
}
