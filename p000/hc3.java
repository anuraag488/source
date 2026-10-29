package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hc3 extends st2 {

    /* JADX INFO: renamed from: a */
    public C0796jf f20477a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        ic3 ic3Var = new ic3(this.f20477a, null);
        VarHandle.storeStoreFence();
        return ic3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hc3) && z62.m13387o(this.f20477a, ((hc3) obj).f20477a);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ic3 ic3Var = (ic3) mt2Var;
        C0796jf c0796jf = this.f20477a;
        if (z62.m13387o(ic3Var.f24433p, c0796jf)) {
            return;
        }
        ic3Var.f24433p = c0796jf;
        if (ic3Var.f24434q) {
            ic3Var.m8140Q0();
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f20477a.hashCode() * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f20477a + ", overrideDescendants=false)";
    }
}
