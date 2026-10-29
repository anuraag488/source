package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n84 implements wi0, Iterable, cc2 {

    /* JADX INFO: renamed from: a */
    public m84 f25536a;

    /* JADX INFO: renamed from: b */
    public int f25537b;

    /* JADX INFO: renamed from: c */
    public int f25538c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof n84)) {
            return false;
        }
        n84 n84Var = (n84) obj;
        return n84Var.f25537b == this.f25537b && n84Var.f25538c == this.f25538c && n84Var.f25536a == this.f25536a;
    }

    public final int hashCode() {
        return (this.f25536a.hashCode() * 31) + this.f25537b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        m84 m84Var = this.f25536a;
        if (m84Var.f24740h != this.f25538c) {
            o84.m8985f();
        }
        int i = this.f25537b;
        m84Var.m8233q(i);
        return new ku1(m84Var, i + 1, o84.m8981b(m84Var.f24733a, i) + i);
    }
}
