package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t91 extends dc3 {

    /* JADX INFO: renamed from: l */
    public l24 f31008l;

    /* JADX INFO: renamed from: m */
    public dg4 f31009m;

    @Override // p000.dc3, p000.g24
    /* JADX INFO: renamed from: c */
    public final zc6 mo4431c() {
        return this.f31008l;
    }

    @Override // p000.dc3
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g24)) {
            return false;
        }
        g24 g24Var = (g24) obj;
        return g24Var.mo4431c() == l24.f23749j && this.f16970a.equals(g24Var.mo3641b()) && z62.m13387o(n40.m8500i(this), n40.m8500i(g24Var));
    }

    @Override // p000.dc3
    public final int hashCode() {
        int iHashCode = this.f16970a.hashCode();
        C1018p1 c1018p1 = new C1018p1((byte) 2);
        c1018p1.f27270c = this;
        c1018p1.f27269b = this.f16972c;
        VarHandle.storeStoreFence();
        int iHashCode2 = 1;
        while (c1018p1.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) c1018p1.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // p000.dc3, p000.g24
    /* JADX INFO: renamed from: j */
    public final g24 mo4436j(int i) {
        return ((g24[]) this.f31009m.getValue())[i];
    }

    @Override // p000.dc3
    public final String toString() {
        C1041po c1041po = new C1041po((byte) 3);
        c1041po.f27850b = this;
        VarHandle.storeStoreFence();
        return hb0.m6305Q0(c1041po, ", ", this.f16970a.concat("("), ")", 0, null, 56);
    }
}
