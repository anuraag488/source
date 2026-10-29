package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: x6 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class C1320x6 extends st2 {

    /* JADX INFO: renamed from: a */
    public er1 f34023a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        er1 er1Var = this.f34023a;
        C1357y6 c1357y6 = new C1357y6();
        c1357y6.f34918q = er1Var;
        C1127s c1127s = new C1127s((byte) 4);
        c1127s.f29778b = c1357y6;
        VarHandle.storeStoreFence();
        C1282w6 c1282w6 = new C1282w6();
        c1282w6.f33117o = c1127s;
        c1357y6.m10154O0(c1282w6);
        return c1357y6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1320x6) && this.f34023a == ((C1320x6) obj).f34023a;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ((C1357y6) mt2Var).f34918q = this.f34023a;
    }

    public final int hashCode() {
        return this.f34023a.hashCode();
    }
}
