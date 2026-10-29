package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g16 extends p06 {

    /* JADX INFO: renamed from: f */
    public final transient Object f19497f;

    public g16(Object obj) {
        super((byte) 1);
        this.f19497f = obj;
    }

    @Override // p000.qn5
    /* JADX INFO: renamed from: a */
    public final int mo5884a(Object[] objArr) {
        objArr[0] = this.f19497f;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f19497f.equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f19497f.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        q06 q06Var = new q06((byte) 4);
        q06Var.f28133e = this.f19497f;
        VarHandle.storeStoreFence();
        return q06Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return zi4.m13621u("[", this.f19497f.toString(), "]");
    }
}
