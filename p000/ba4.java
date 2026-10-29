package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.invoke.VarHandle;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ba4 implements Parcelable, hc4, Set, RandomAccess, gc2 {
    public static final Parcelable.Creator<ba4> CREATOR = new c83(1);

    /* JADX INFO: renamed from: a */
    public lc4 f15190a;

    public ba4() {
        qa3 qa3Var = qa3.f28341d;
        lc4 lc4Var = new lc4(k94.m7451h().mo5015g(), qa3Var);
        if (k94.f23011b.get() != null) {
            lc4Var.f22165b = new lc4(1L, qa3Var);
        }
        this.f15190a = lc4Var;
    }

    @Override // p000.hc4
    /* JADX INFO: renamed from: a */
    public final jc4 mo128a() {
        return this.f15190a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        qa3 qa3Var;
        e94 e94VarM7451h;
        boolean zM13891z;
        do {
            synchronized (zy5.f36486o) {
                lc4 lc4Var = (lc4) k94.m7449f(this.f15190a);
                i = lc4Var.f23953d;
                qa3Var = lc4Var.f23952c;
            }
            qa3 qa3VarM9808b = qa3Var.m9808b(obj);
            if (qa3VarM9808b.equals(qa3Var)) {
                return false;
            }
            lc4 lc4Var2 = this.f15190a;
            synchronized (k94.f23012c) {
                e94VarM7451h = k94.m7451h();
                zM13891z = zy5.m13891z((lc4) k94.m7466w(lc4Var2, this, e94VarM7451h), i, qa3VarM9808b);
            }
            k94.m7455l(e94VarM7451h, this);
        } while (!zM13891z);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        qa3 qa3Var;
        e94 e94VarM7451h;
        boolean zM13891z;
        do {
            synchronized (zy5.f36486o) {
                lc4 lc4Var = (lc4) k94.m7449f(this.f15190a);
                i = lc4Var.f23953d;
                qa3Var = lc4Var.f23952c;
            }
            ra3 ra3Var = new ra3(qa3Var);
            ra3Var.addAll(collection);
            qa3 qa3VarM10253b = ra3Var.m10253b();
            if (qa3VarM10253b.equals(qa3Var)) {
                return false;
            }
            lc4 lc4Var2 = this.f15190a;
            synchronized (k94.f23012c) {
                e94VarM7451h = k94.m7451h();
                zM13891z = zy5.m13891z((lc4) k94.m7466w(lc4Var2, this, e94VarM7451h), i, qa3VarM10253b);
            }
            k94.m7455l(e94VarM7451h, this);
        } while (!zM13891z);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        e94 e94VarM7451h;
        lc4 lc4Var = this.f15190a;
        synchronized (k94.f23012c) {
            e94VarM7451h = k94.m7451h();
            lc4 lc4Var2 = (lc4) k94.m7466w(lc4Var, this, e94VarM7451h);
            synchronized (zy5.f36486o) {
                lc4Var2.f23952c = qa3.f28341d;
                lc4Var2.f23953d++;
            }
        }
        k94.m7455l(e94VarM7451h, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return ((lc4) k94.m7462s(this.f15190a, this)).f23952c.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((lc4) k94.m7462s(this.f15190a, this)).f23952c.containsAll(collection);
    }

    @Override // p000.hc4
    /* JADX INFO: renamed from: d */
    public final void mo130d(jc4 jc4Var) {
        jc4Var.f22165b = this.f15190a;
        this.f15190a = (lc4) jc4Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return ((lc4) k94.m7462s(this.f15190a, this)).f23952c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = ((lc4) k94.m7462s(this.f15190a, this)).f23952c.iterator();
        kc4 kc4Var = new kc4();
        kc4Var.f23064a = this;
        kc4Var.f23065b = it;
        kc4Var.f23068e = ((lc4) k94.m7449f(this.f15190a)).f23953d;
        kc4Var.f23066c = kc4Var.f23067d;
        kc4Var.f23067d = it.hasNext() ? it.next() : null;
        VarHandle.storeStoreFence();
        return kc4Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        qa3 qa3Var;
        e94 e94VarM7451h;
        boolean zM13891z;
        do {
            synchronized (zy5.f36486o) {
                lc4 lc4Var = (lc4) k94.m7449f(this.f15190a);
                i = lc4Var.f23953d;
                qa3Var = lc4Var.f23952c;
            }
            qa3 qa3VarM9809c = qa3Var.m9809c(obj);
            if (qa3VarM9809c.equals(qa3Var)) {
                return false;
            }
            lc4 lc4Var2 = this.f15190a;
            synchronized (k94.f23012c) {
                e94VarM7451h = k94.m7451h();
                zM13891z = zy5.m13891z((lc4) k94.m7466w(lc4Var2, this, e94VarM7451h), i, qa3VarM9809c);
            }
            k94.m7455l(e94VarM7451h, this);
        } while (!zM13891z);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        qa3 qa3Var;
        e94 e94VarM7451h;
        boolean zM13891z;
        do {
            synchronized (zy5.f36486o) {
                lc4 lc4Var = (lc4) k94.m7449f(this.f15190a);
                i = lc4Var.f23953d;
                qa3Var = lc4Var.f23952c;
            }
            ra3 ra3Var = new ra3(qa3Var);
            ra3Var.removeAll(collection);
            qa3 qa3VarM10253b = ra3Var.m10253b();
            if (qa3VarM10253b.equals(qa3Var)) {
                return false;
            }
            lc4 lc4Var2 = this.f15190a;
            synchronized (k94.f23012c) {
                e94VarM7451h = k94.m7451h();
                zM13891z = zy5.m13891z((lc4) k94.m7466w(lc4Var2, this, e94VarM7451h), i, qa3VarM10253b);
            }
            k94.m7455l(e94VarM7451h, this);
        } while (!zM13891z);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        qa3 qa3Var;
        boolean zRetainAll;
        e94 e94VarM7451h;
        boolean zM13891z;
        do {
            synchronized (zy5.f36486o) {
                lc4 lc4Var = (lc4) k94.m7449f(this.f15190a);
                i = lc4Var.f23953d;
                qa3Var = lc4Var.f23952c;
            }
            if (qa3Var == null) {
                C1077qn.m9989o("No set to mutate");
                return false;
            }
            ra3 ra3Var = new ra3(qa3Var);
            zRetainAll = ra3Var.retainAll(hb0.m6322h1(collection));
            qa3 qa3VarM10253b = ra3Var.m10253b();
            if (qa3VarM10253b.equals(qa3Var)) {
                break;
            }
            lc4 lc4Var2 = this.f15190a;
            synchronized (k94.f23012c) {
                e94VarM7451h = k94.m7451h();
                zM13891z = zy5.m13891z((lc4) k94.m7466w(lc4Var2, this, e94VarM7451h), i, qa3VarM10253b);
            }
            k94.m7455l(e94VarM7451h, this);
        } while (!zM13891z);
        return zRetainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return ((lc4) k94.m7462s(this.f15190a, this)).f23952c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return zy5.m13859W(this);
    }

    public final String toString() {
        return "SnapshotStateSet(value=" + ((lc4) k94.m7449f(this.f15190a)).f23952c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        qa3 qa3Var = ((lc4) k94.m7462s(this.f15190a, this)).f23952c;
        parcel.writeInt(size());
        Iterator it = qa3Var.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return zy5.m13860X(this, objArr);
    }
}
