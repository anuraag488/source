package p000;

import java.lang.invoke.VarHandle;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fw2 implements gc2, Set, cc2 {

    /* JADX INFO: renamed from: a */
    public dw2 f19354a;

    /* JADX INFO: renamed from: b */
    public dw2 f19355b;

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f19355b.m4773a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        dw2 dw2Var = this.f19355b;
        int i = dw2Var.f17461g;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            dw2Var.m4779g(it.next());
        }
        return i != dw2Var.f17461g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f19355b.m4774b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f19354a.m4775c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f19354a.m4775c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fw2.class != obj.getClass()) {
            return false;
        }
        return this.f19354a.equals(((fw2) obj).f19354a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f19354a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f19354a.f17461g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        xf1 xf1Var = new xf1((byte) 2);
        xf1Var.f34222b = this;
        xf1Var.f34223c = -1;
        xf1Var.f34224d = d24.m4325z(new ew2(this, xf1Var, null));
        VarHandle.storeStoreFence();
        return xf1Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f19355b.m4780h(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int iNumberOfTrailingZeros;
        dw2 dw2Var = this.f19355b;
        int i = dw2Var.f17461g;
        Iterator it = collection.iterator();
        while (true) {
            int i2 = 1;
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i4 = iHashCode ^ (iHashCode << 16);
            int i5 = i4 & 127;
            int i6 = dw2Var.f17460f;
            int i7 = (i4 >>> 7) & i6;
            while (true) {
                long[] jArr = dw2Var.f17455a;
                int i8 = i7 >> 3;
                int i9 = (i7 & 7) << 3;
                long j = ((jArr[i8 + i2] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
                long j2 = (((long) i5) * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (j3 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i6;
                    int i10 = i2;
                    if (z62.m13387o(dw2Var.f17456b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i2 = i10;
                }
                int i11 = i2;
                if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i3 += 8;
                i7 = (i7 + i3) & i6;
                i2 = i11;
            }
            if (iNumberOfTrailingZeros >= 0) {
                dw2Var.m4781i(iNumberOfTrailingZeros);
            }
        }
        return i != dw2Var.f17461g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f19355b.m4782j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f19354a.f17461g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return zy5.m13859W(this);
    }

    public final String toString() {
        return this.f19354a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return zy5.m13860X(this, objArr);
    }
}
