package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ns4 implements Collection, cc2 {

    /* JADX INFO: renamed from: a */
    public byte[] f26071a;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x001d A[RETURN] */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof ms4)) {
            return false;
        }
        byte b = ((ms4) obj).f25180a;
        byte[] bArr = this.f26071a;
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            if (b == bArr[i]) {
                if (i >= 0) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        byte[] bArr = this.f26071a;
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (obj instanceof ms4) {
                byte b = ((ms4) obj).f25180a;
                int length = bArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    }
                    if (b == bArr[i]) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return (obj instanceof ns4) && this.f26071a.equals(((ns4) obj).f26071a);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f26071a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f26071a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte[] bArr = this.f26071a;
        C1018p1 c1018p1 = new C1018p1((byte) 3);
        c1018p1.f27270c = bArr;
        VarHandle.storeStoreFence();
        return c1018p1;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f26071a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return zy5.m13859W(this);
    }

    public final String toString() {
        return "UByteArray(storage=" + Arrays.toString(this.f26071a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return zy5.m13860X(this, objArr);
    }
}
