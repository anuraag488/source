package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hx5 extends bw5 {

    /* JADX INFO: renamed from: d */
    public final transient Object f20916d;

    public hx5(Object obj) {
        this.f20916d = obj;
    }

    @Override // p000.su5
    /* JADX INFO: renamed from: a */
    public final int mo4228a(Object[] objArr) {
        objArr[0] = this.f20916d;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f20916d.equals(obj);
    }

    @Override // p000.bw5, p000.su5
    /* JADX INFO: renamed from: d */
    public final sv5 mo3751d() {
        Object[] objArr = {this.f20916d};
        for (int i = 0; i < 1; i++) {
            uu5 uu5Var = sv5.f30597b;
            if (objArr[i] == null) {
                xy4.m12782k(c75.m3877i(i, "at index "));
                return null;
            }
        }
        return sv5.m10928m(1, objArr);
    }

    @Override // p000.bw5, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f20916d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        hw5 hw5Var = new hw5((byte) 3);
        hw5Var.f20905e = this.f20916d;
        VarHandle.storeStoreFence();
        return hw5Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return zi4.m13621u("[", this.f20916d.toString(), "]");
    }
}
