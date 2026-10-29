package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ub4 implements q54 {
    @Override // p000.q54
    /* JADX INFO: renamed from: a */
    public final si1 mo5606a(je4 je4Var) {
        tb4 tb4Var = new tb4(this, null);
        int i = pj1.f27653a;
        l80 l80Var = new l80(tb4Var, je4Var, r71.f29063a, -2, y30.f34832a);
        C1108rh c1108rh = new C1108rh(2, null, (byte) 6);
        aj1 aj1Var = new aj1((byte) 2);
        aj1Var.f14535c = l80Var;
        aj1Var.f14534b = c1108rh;
        VarHandle.storeStoreFence();
        return zy5.m13840D(aj1Var);
    }

    public final boolean equals(Object obj) {
        return obj instanceof ub4;
    }

    public final int hashCode() {
        return Long.hashCode(Long.MAX_VALUE) + (Long.hashCode(0L) * 31);
    }

    public final String toString() {
        return "SharingStarted.WhileSubscribed(" + hb0.m6305Q0(kx5.m7740w(new sl2(2)), null, null, null, 0, null, 63) + ')';
    }
}
