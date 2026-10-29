package p000;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class qn5 extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final Object[] f28630b = new Object[0];

    /* JADX INFO: renamed from: c */
    public static final Object[] f28631c = new Object[0];

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28632a;

    /* JADX INFO: renamed from: a */
    public abstract int mo5884a(Object[] objArr);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f28632a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f28632a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: b */
    public int mo7790b() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: c */
    public Object[] mo5775c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f28632a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: d */
    public int mo5776d() {
        switch (this.f28632a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: e */
    public int mo5777e() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: g */
    public Object[] mo7791g() {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public abstract int mo5778l(Object[] objArr);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f28632a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f28632a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f28632a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        switch (this.f28632a) {
            case 0:
                break;
        }
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f28632a) {
            case 0:
                objArr.getClass();
                int size = size();
                int length = objArr.length;
                if (length < size) {
                    Object[] objArrMo5775c = mo5775c();
                    if (objArrMo5775c != null) {
                        return Arrays.copyOfRange(objArrMo5775c, mo5776d(), mo5777e(), objArr.getClass());
                    }
                    if (length != 0) {
                        objArr = Arrays.copyOf(objArr, 0);
                    }
                    objArr = Arrays.copyOf(objArr, size);
                } else if (length > size) {
                    objArr[size] = null;
                }
                mo5778l(objArr);
                return objArr;
            default:
                objArr.getClass();
                int size2 = size();
                int length2 = objArr.length;
                if (length2 < size2) {
                    Object[] objArrMo7791g = mo7791g();
                    if (objArrMo7791g != null) {
                        return Arrays.copyOfRange(objArrMo7791g, mo5776d(), mo7790b(), objArr.getClass());
                    }
                    if (length2 != 0) {
                        objArr = Arrays.copyOf(objArr, 0);
                    }
                    objArr = Arrays.copyOf(objArr, size2);
                } else if (length2 > size2) {
                    objArr[size2] = null;
                }
                mo5884a(objArr);
                return objArr;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        switch (this.f28632a) {
            case 0:
                return toArray(f28630b);
            default:
                return toArray(f28631c);
        }
    }
}
