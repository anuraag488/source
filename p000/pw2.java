package p000;

import java.lang.invoke.VarHandle;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pw2 implements gc2, Set, cc2 {

    /* JADX INFO: renamed from: a */
    public mw2 f28048a;

    /* JADX INFO: renamed from: b */
    public mw2 f28049b;

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f28049b.m8409a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        mw2 mw2Var = this.f28049b;
        int i = mw2Var.f25260d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            mw2Var.m8419k(it.next());
        }
        return i != mw2Var.f25260d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f28049b.m8410b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f28048a.m8411c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f28048a.m8411c(it.next())) {
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
        if (obj == null || pw2.class != obj.getClass()) {
            return false;
        }
        return this.f28048a.equals(((pw2) obj).f28048a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f28048a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f28048a.m8415g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        xf1 xf1Var = new xf1((byte) 3);
        xf1Var.f34222b = this;
        xf1Var.f34223c = -1;
        xf1Var.f34224d = d24.m4325z(new ow2(this, xf1Var, null));
        VarHandle.storeStoreFence();
        return xf1Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f28049b.m8420l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        mw2 mw2Var = this.f28049b;
        int i = mw2Var.f25260d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            mw2Var.m8417i(it.next());
        }
        return i != mw2Var.f25260d;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0050 A[LOOP:0: B:5:0x0011->B:17:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0053 A[EDGE_INSN: B:24:0x0053->B:18:0x0053 BREAK  A[LOOP:0: B:5:0x0011->B:17:0x0050], SYNTHETIC] */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        mw2 mw2Var = this.f28049b;
        Object[] objArr = mw2Var.f25258b;
        int i = mw2Var.f25260d;
        long[] jArr = mw2Var.f25257a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!hb0.m6294F0(collection, objArr[i5])) {
                                mw2Var.m8421m(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != mw2Var.f25260d;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f28048a.f25260d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return zy5.m13859W(this);
    }

    public final String toString() {
        return this.f28048a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return zy5.m13860X(this, objArr);
    }
}
