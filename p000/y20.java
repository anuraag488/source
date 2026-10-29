package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class y20 extends st2 {

    /* JADX INFO: renamed from: a */
    public C1256vh f34819a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        C1256vh c1256vh = this.f34819a;
        a30 a30Var = new a30();
        a30Var.f73o = c1256vh;
        C1127s c1127s = new C1127s((byte) 20);
        c1127s.f29778b = a30Var;
        VarHandle.storeStoreFence();
        a30Var.f74p = c1127s;
        VarHandle.storeStoreFence();
        return a30Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof y20) && this.f34819a == ((y20) obj).f34819a;
        }
        return true;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        a30 a30Var = (a30) mt2Var;
        C1256vh c1256vh = this.f34819a;
        a30Var.f73o = c1256vh;
        if (a30Var.f25208n) {
            c1256vh.invoke(a30Var.f74p);
        }
    }

    public final int hashCode() {
        return this.f34819a.hashCode();
    }
}
