package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.invoke.VarHandle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w94 implements Parcelable, hc4, List, RandomAccess, dc2 {
    public static final Parcelable.Creator<w94> CREATOR = new v94();

    /* JADX INFO: renamed from: a */
    public dc4 f33182a;

    public w94(AbstractC0003a2 abstractC0003a2) {
        e94 e94VarM7451h = k94.m7451h();
        dc4 dc4Var = new dc4(e94VarM7451h.mo5015g(), abstractC0003a2);
        if (!(e94VarM7451h instanceof rs1)) {
            dc4Var.f22165b = new dc4(1L, abstractC0003a2);
        }
        this.f33182a = dc4Var;
    }

    @Override // p000.hc4
    /* JADX INFO: renamed from: a */
    public final jc4 mo128a() {
        return this.f33182a;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        AbstractC0003a2 abstractC0003a2;
        e94 e94VarM7451h;
        boolean zM13780k;
        do {
            synchronized (zt5.f36369e) {
                dc4 dc4Var = (dc4) k94.m7449f(this.f33182a);
                i = dc4Var.f16982d;
                abstractC0003a2 = dc4Var.f16981c;
            }
            AbstractC0003a2 abstractC0003a2Mo18c = abstractC0003a2.mo18c(obj);
            if (abstractC0003a2Mo18c.equals(abstractC0003a2)) {
                return false;
            }
            dc4 dc4Var2 = this.f33182a;
            synchronized (k94.f23012c) {
                e94VarM7451h = k94.m7451h();
                zM13780k = zt5.m13780k((dc4) k94.m7466w(dc4Var2, this, e94VarM7451h), i, abstractC0003a2Mo18c, true);
            }
            k94.m7455l(e94VarM7451h, this);
        } while (!zM13780k);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        AbstractC0003a2 abstractC0003a2;
        e94 e94VarM7451h;
        boolean zM13780k;
        do {
            synchronized (zt5.f36369e) {
                dc4 dc4Var = (dc4) k94.m7449f(this.f33182a);
                i = dc4Var.f16982d;
                abstractC0003a2 = dc4Var.f16981c;
            }
            AbstractC0003a2 abstractC0003a2Mo19d = abstractC0003a2.mo19d(collection);
            if (z62.m13387o(abstractC0003a2Mo19d, abstractC0003a2)) {
                return false;
            }
            dc4 dc4Var2 = this.f33182a;
            synchronized (k94.f23012c) {
                e94VarM7451h = k94.m7451h();
                zM13780k = zt5.m13780k((dc4) k94.m7466w(dc4Var2, this, e94VarM7451h), i, abstractC0003a2Mo19d, true);
            }
            k94.m7455l(e94VarM7451h, this);
        } while (!zM13780k);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m12170c(int i, int i2) {
        int i3;
        AbstractC0003a2 abstractC0003a2;
        e94 e94VarM7451h;
        boolean zM13780k;
        do {
            synchronized (zt5.f36369e) {
                dc4 dc4Var = (dc4) k94.m7449f(this.f33182a);
                i3 = dc4Var.f16982d;
                abstractC0003a2 = dc4Var.f16981c;
            }
            ua3 ua3VarMo20e = abstractC0003a2.mo20e();
            ua3VarMo20e.subList(i, i2).clear();
            AbstractC0003a2 abstractC0003a2M11354c = ua3VarMo20e.m11354c();
            if (z62.m13387o(abstractC0003a2M11354c, abstractC0003a2)) {
                return;
            }
            dc4 dc4Var2 = this.f33182a;
            synchronized (k94.f23012c) {
                e94VarM7451h = k94.m7451h();
                zM13780k = zt5.m13780k((dc4) k94.m7466w(dc4Var2, this, e94VarM7451h), i3, abstractC0003a2M11354c, true);
            }
            k94.m7455l(e94VarM7451h, this);
        } while (!zM13780k);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        e94 e94VarM7451h;
        dc4 dc4Var = this.f33182a;
        synchronized (k94.f23012c) {
            e94VarM7451h = k94.m7451h();
            dc4 dc4Var2 = (dc4) k94.m7466w(dc4Var, this, e94VarM7451h);
            synchronized (zt5.f36369e) {
                dc4Var2.f16981c = q84.f28304b;
                dc4Var2.f16982d++;
                dc4Var2.f16983e++;
            }
        }
        k94.m7455l(e94VarM7451h, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return ((dc4) k94.m7462s(this.f33182a, this)).f16981c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((dc4) k94.m7462s(this.f33182a, this)).f16981c.containsAll(collection);
    }

    @Override // p000.hc4
    /* JADX INFO: renamed from: d */
    public final void mo130d(jc4 jc4Var) {
        jc4Var.f22165b = this.f33182a;
        this.f33182a = (dc4) jc4Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC0003a2 m12171e() {
        return ((dc4) k94.m7462s(this.f33182a, this)).f16981c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return ((dc4) k94.m7462s(this.f33182a, this)).f16981c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return ((dc4) k94.m7462s(this.f33182a, this)).f16981c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return ((dc4) k94.m7462s(this.f33182a, this)).f16981c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return ((dc4) k94.m7462s(this.f33182a, this)).f16981c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ow1(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        AbstractC0003a2 abstractC0003a2;
        e94 e94VarM7451h;
        boolean zM13780k;
        do {
            synchronized (zt5.f36369e) {
                dc4 dc4Var = (dc4) k94.m7449f(this.f33182a);
                i = dc4Var.f16982d;
                abstractC0003a2 = dc4Var.f16981c;
            }
            int iIndexOf = abstractC0003a2.indexOf(obj);
            AbstractC0003a2 abstractC0003a2Mo22m = iIndexOf != -1 ? abstractC0003a2.mo22m(iIndexOf) : abstractC0003a2;
            if (abstractC0003a2Mo22m.equals(abstractC0003a2)) {
                return false;
            }
            dc4 dc4Var2 = this.f33182a;
            synchronized (k94.f23012c) {
                e94VarM7451h = k94.m7451h();
                zM13780k = zt5.m13780k((dc4) k94.m7466w(dc4Var2, this, e94VarM7451h), i, abstractC0003a2Mo22m, true);
            }
            k94.m7455l(e94VarM7451h, this);
        } while (!zM13780k);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        AbstractC0003a2 abstractC0003a2;
        e94 e94VarM7451h;
        boolean zM13780k;
        do {
            synchronized (zt5.f36369e) {
                dc4 dc4Var = (dc4) k94.m7449f(this.f33182a);
                i = dc4Var.f16982d;
                abstractC0003a2 = dc4Var.f16981c;
            }
            C1389z1 c1389z1 = new C1389z1((byte) 0);
            c1389z1.f35690b = collection;
            VarHandle.storeStoreFence();
            AbstractC0003a2 abstractC0003a2Mo21l = abstractC0003a2.mo21l(c1389z1);
            if (z62.m13387o(abstractC0003a2Mo21l, abstractC0003a2)) {
                return false;
            }
            dc4 dc4Var2 = this.f33182a;
            synchronized (k94.f23012c) {
                e94VarM7451h = k94.m7451h();
                zM13780k = zt5.m13780k((dc4) k94.m7466w(dc4Var2, this, e94VarM7451h), i, abstractC0003a2Mo21l, true);
            }
            k94.m7455l(e94VarM7451h, this);
        } while (!zM13780k);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1389z1 c1389z1 = new C1389z1((byte) 2);
        c1389z1.f35690b = collection;
        VarHandle.storeStoreFence();
        return zt5.m13760E(this, c1389z1);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        AbstractC0003a2 abstractC0003a2;
        e94 e94VarM7451h;
        boolean zM13780k;
        Object obj2 = get(i);
        do {
            synchronized (zt5.f36369e) {
                dc4 dc4Var = (dc4) k94.m7449f(this.f33182a);
                i2 = dc4Var.f16982d;
                abstractC0003a2 = dc4Var.f16981c;
            }
            AbstractC0003a2 abstractC0003a2Mo23q = abstractC0003a2.mo23q(i, obj);
            if (abstractC0003a2Mo23q.equals(abstractC0003a2)) {
                break;
            }
            dc4 dc4Var2 = this.f33182a;
            synchronized (k94.f23012c) {
                e94VarM7451h = k94.m7451h();
                zM13780k = zt5.m13780k((dc4) k94.m7466w(dc4Var2, this, e94VarM7451h), i2, abstractC0003a2Mo23q, false);
            }
            k94.m7455l(e94VarM7451h, this);
        } while (!zM13780k);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return ((dc4) k94.m7462s(this.f33182a, this)).f16981c.mo103a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            kd3.m7502a("fromIndex or toIndex are out of bounds");
        }
        return new xd4(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return zy5.m13859W(this);
    }

    public final String toString() {
        return "SnapshotStateList(value=" + ((dc4) k94.m7449f(this.f33182a)).f16981c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC0003a2 abstractC0003a2M12171e = m12171e();
        int iMo103a = abstractC0003a2M12171e.mo103a();
        parcel.writeInt(iMo103a);
        for (int i2 = 0; i2 < iMo103a; i2++) {
            parcel.writeValue(abstractC0003a2M12171e.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return zy5.m13860X(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new ow1(this, i);
    }

    public w94() {
        this(q84.f28304b);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        AbstractC0003a2 abstractC0003a2;
        e94 e94VarM7451h;
        boolean zM13780k;
        do {
            synchronized (zt5.f36369e) {
                dc4 dc4Var = (dc4) k94.m7449f(this.f33182a);
                i2 = dc4Var.f16982d;
                abstractC0003a2 = dc4Var.f16981c;
            }
            AbstractC0003a2 abstractC0003a2Mo17b = abstractC0003a2.mo17b(i, obj);
            if (abstractC0003a2Mo17b.equals(abstractC0003a2)) {
                return;
            }
            dc4 dc4Var2 = this.f33182a;
            synchronized (k94.f23012c) {
                e94VarM7451h = k94.m7451h();
                zM13780k = zt5.m13780k((dc4) k94.m7466w(dc4Var2, this, e94VarM7451h), i2, abstractC0003a2Mo17b, true);
            }
            k94.m7455l(e94VarM7451h, this);
        } while (!zM13780k);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        C1391z3 c1391z3 = new C1391z3((byte) 3);
        c1391z3.f35730b = i;
        c1391z3.f35731c = collection;
        VarHandle.storeStoreFence();
        return zt5.m13760E(this, c1391z3);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        AbstractC0003a2 abstractC0003a2;
        e94 e94VarM7451h;
        boolean zM13780k;
        Object obj = get(i);
        do {
            synchronized (zt5.f36369e) {
                dc4 dc4Var = (dc4) k94.m7449f(this.f33182a);
                i2 = dc4Var.f16982d;
                abstractC0003a2 = dc4Var.f16981c;
            }
            AbstractC0003a2 abstractC0003a2Mo22m = abstractC0003a2.mo22m(i);
            if (abstractC0003a2Mo22m.equals(abstractC0003a2)) {
                break;
            }
            dc4 dc4Var2 = this.f33182a;
            synchronized (k94.f23012c) {
                e94VarM7451h = k94.m7451h();
                zM13780k = zt5.m13780k((dc4) k94.m7466w(dc4Var2, this, e94VarM7451h), i2, abstractC0003a2Mo22m, true);
            }
            k94.m7455l(e94VarM7451h, this);
        } while (!zM13780k);
        return obj;
    }
}
