package p000;

import p000.l22;

/* JADX INFO: renamed from: hx */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0741hx<N extends l22> extends st2 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0741hx)) {
            return false;
        }
        g22 g22Var = (g22) this;
        long j = g22Var.f19501a;
        g22 g22Var2 = (g22) ((AbstractC0741hx) obj);
        long j2 = g22Var2.f19501a;
        int i = pb0.f27502i;
        return ws4.m12408a(j, j2) && ws4.m12408a(g22Var.f19502b, g22Var2.f19502b) && z62.m13387o(g22Var.f19503c, g22Var2.f19503c) && z62.m13387o(g22Var.f19504d, g22Var2.f19504d) && p11.m9352c(g22Var.f19505e, g22Var2.f19505e) && p11.m9352c(g22Var.f19507g, g22Var2.f19507g) && p11.m9352c(g22Var.f19508h, g22Var2.f19508h);
    }

    public int hashCode() {
        g22 g22Var = (g22) this;
        long j = g22Var.f19501a;
        int i = pb0.f27502i;
        return Float.hashCode(g22Var.f19508h) + c75.m3874f(g22Var.f19507g, c75.m3874f(g22Var.f19505e, (g22Var.f19504d.hashCode() + ((g22Var.f19503c.hashCode() + zi4.m13612l(Long.hashCode(j) * 31, g22Var.f19502b, 31)) * 31)) * 31, 31), 31);
    }
}
