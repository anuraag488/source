package p000;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class o12 extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final Object[] f26283a = new Object[0];

    /* JADX INFO: renamed from: a */
    public abstract u12 mo6445a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: b */
    public int mo5199b(Object[] objArr) {
        ru4 ru4VarMo6038l = mo6038l();
        int i = 0;
        while (ru4VarMo6038l.hasNext()) {
            objArr[i] = ru4VarMo6038l.next();
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public Object[] mo5200c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    /* JADX INFO: renamed from: d */
    public int mo5201d() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: e */
    public int mo5202e() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: g */
    public boolean mo5203g() {
        return true;
    }

    /* JADX INFO: renamed from: l */
    public abstract ru4 mo6038l();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] objArrMo5200c = mo5200c();
            if (objArrMo5200c != null) {
                return Arrays.copyOfRange(objArrMo5200c, mo5202e(), mo5201d(), objArr.getClass());
            }
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        mo5199b(objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f26283a);
    }
}
