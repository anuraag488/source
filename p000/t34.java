package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t34 extends AbstractC1352y1 implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final t34 f30743b;

    /* JADX INFO: renamed from: a */
    public final sp2 f30744a;

    static {
        sp2 sp2Var = sp2.f30459n;
        f30743b = new t34(sp2.f30459n);
    }

    public t34() {
        this(new sp2());
    }

    @Override // p000.AbstractC1352y1
    /* JADX INFO: renamed from: a */
    public final int mo7889a() {
        return this.f30744a.f30468i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f30744a.m10892a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        this.f30744a.m10894c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f30744a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f30744a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f30744a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        sp2 sp2Var = this.f30744a;
        sp2Var.getClass();
        return new qp2(sp2Var, (byte) 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        sp2 sp2Var = this.f30744a;
        sp2Var.m10894c();
        int iM10897f = sp2Var.m10897f(obj);
        if (iM10897f < 0) {
            return false;
        }
        sp2Var.m10900j(iM10897f);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        this.f30744a.m10894c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        this.f30744a.m10894c();
        return super.retainAll(collection);
    }

    public t34(sp2 sp2Var) {
        this.f30744a = sp2Var;
    }
}
