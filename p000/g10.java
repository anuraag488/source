package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g10 extends st2 {

    /* JADX INFO: renamed from: a */
    public float f19482a;

    /* JADX INFO: renamed from: b */
    public ga4 f19483b;

    /* JADX INFO: renamed from: c */
    public p44 f19484c;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        float f = this.f19482a;
        ga4 ga4Var = this.f19483b;
        p44 p44Var = this.f19484c;
        f10 f10Var = new f10();
        f10Var.f18644r = f;
        f10Var.f18645s = ga4Var;
        f10Var.f18646t = p44Var;
        C1127s c1127s = new C1127s((byte) 19);
        c1127s.f29778b = f10Var;
        VarHandle.storeStoreFence();
        y50 y50Var = new y50(new z50(), c1127s);
        f10Var.m10154O0(y50Var);
        f10Var.f18647u = y50Var;
        VarHandle.storeStoreFence();
        return f10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g10)) {
            return false;
        }
        g10 g10Var = (g10) obj;
        return p11.m9352c(this.f19482a, g10Var.f19482a) && z62.m13387o(this.f19483b, g10Var.f19483b) && z62.m13387o(this.f19484c, g10Var.f19484c);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        f10 f10Var = (f10) mt2Var;
        float f = this.f19482a;
        float f2 = f10Var.f18644r;
        y50 y50Var = f10Var.f18647u;
        if (!p11.m9352c(f2, f)) {
            f10Var.f18644r = f;
            y50Var.m12933O0();
        }
        ga4 ga4Var = this.f19483b;
        if (!z62.m13387o(f10Var.f18645s, ga4Var)) {
            f10Var.f18645s = ga4Var;
            y50Var.m12933O0();
        }
        p44 p44Var = this.f19484c;
        if (z62.m13387o(f10Var.f18646t, p44Var)) {
            return;
        }
        f10Var.f18646t = p44Var;
        y50Var.m12933O0();
        y70.m13004E(f10Var);
    }

    public final int hashCode() {
        return this.f19484c.hashCode() + ((this.f19483b.hashCode() + (Float.hashCode(this.f19482a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + p11.m9353d(this.f19482a) + ", brush=" + this.f19483b + ", shape=" + this.f19484c + ")";
    }
}
