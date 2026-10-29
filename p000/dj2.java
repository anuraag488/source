package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class dj2 extends st2 {

    /* JADX INFO: renamed from: a */
    public C1068qe f17101a;

    /* JADX INFO: renamed from: b */
    public uj2 f17102b;

    /* JADX INFO: renamed from: c */
    public pk4 f17103c;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        C1068qe c1068qe = this.f17101a;
        uj2 uj2Var = this.f17102b;
        pk4 pk4Var = this.f17103c;
        ej2 ej2Var = new ej2();
        ej2Var.f18139o = c1068qe;
        ej2Var.f18140p = uj2Var;
        ej2Var.f18141q = pk4Var;
        ej2Var.f18142r = k43.m7398w(null);
        VarHandle.storeStoreFence();
        return ej2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj2)) {
            return false;
        }
        dj2 dj2Var = (dj2) obj;
        return z62.m13387o(this.f17101a, dj2Var.f17101a) && z62.m13387o(this.f17102b, dj2Var.f17102b) && z62.m13387o(this.f17103c, dj2Var.f17103c);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) throws Throwable {
        ej2 ej2Var = (ej2) mt2Var;
        C1068qe c1068qe = this.f17101a;
        if (ej2Var.f25208n) {
            ej2Var.f18139o.mo4551g();
            ej2Var.f18139o.m9865k(ej2Var);
        }
        ej2Var.f18139o = c1068qe;
        if (ej2Var.f25208n) {
            if (c1068qe.f28401a != null) {
                t32.m10970c("Expected textInputModifierNode to be null");
            }
            c1068qe.f28401a = ej2Var;
        }
        ej2Var.f18140p = this.f17102b;
        ej2Var.f18141q = this.f17103c;
    }

    public final int hashCode() {
        return this.f17103c.hashCode() + ((this.f17102b.hashCode() + (this.f17101a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f17101a + ", legacyTextFieldState=" + this.f17102b + ", textFieldSelectionManager=" + this.f17103c + ")";
    }
}
