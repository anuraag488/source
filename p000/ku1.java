package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ku1 implements Iterator, cc2 {

    /* JADX INFO: renamed from: a */
    public final m84 f23514a;

    /* JADX INFO: renamed from: b */
    public final int f23515b;

    /* JADX INFO: renamed from: c */
    public int f23516c;

    /* JADX INFO: renamed from: d */
    public final int f23517d;

    public ku1(m84 m84Var, int i, int i2) {
        this.f23514a = m84Var;
        this.f23515b = i2;
        this.f23516c = i;
        this.f23517d = m84Var.f24740h;
        if (m84Var.f24739g) {
            o84.m8985f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23516c < this.f23515b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m84 m84Var = this.f23514a;
        int i = m84Var.f24740h;
        int i2 = this.f23517d;
        if (i != i2) {
            o84.m8985f();
        }
        int i3 = this.f23516c;
        this.f23516c = o84.m8981b(m84Var.f24733a, i3) + i3;
        n84 n84Var = new n84();
        n84Var.f25536a = m84Var;
        n84Var.f25537b = i3;
        n84Var.f25538c = i2;
        VarHandle.storeStoreFence();
        return n84Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
