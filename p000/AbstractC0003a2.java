package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: a2 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0003a2 extends AbstractC1129s1 {
    /* JADX INFO: renamed from: b */
    public abstract AbstractC0003a2 mo17b(int i, Object obj);

    /* JADX INFO: renamed from: c */
    public abstract AbstractC0003a2 mo18c(Object obj);

    @Override // p000.AbstractC0929n0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.AbstractC0929n0, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC0003a2 mo19d(Collection collection) {
        ua3 ua3VarMo20e = mo20e();
        ua3VarMo20e.addAll(collection);
        return ua3VarMo20e.m11354c();
    }

    /* JADX INFO: renamed from: e */
    public abstract ua3 mo20e();

    @Override // p000.AbstractC1129s1, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: l */
    public abstract AbstractC0003a2 mo21l(C1389z1 c1389z1);

    @Override // p000.AbstractC1129s1, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: m */
    public abstract AbstractC0003a2 mo22m(int i);

    /* JADX INFO: renamed from: q */
    public abstract AbstractC0003a2 mo23q(int i, Object obj);

    @Override // p000.AbstractC1129s1, java.util.List
    public final List subList(int i, int i2) {
        return new t12(this, i, i2);
    }
}
