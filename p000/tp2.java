package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tp2 extends AbstractC1352y1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31305a;

    /* JADX INFO: renamed from: b */
    public final sp2 f31306b;

    public /* synthetic */ tp2(sp2 sp2Var, byte b) {
        this.f31305a = b;
        this.f31306b = sp2Var;
    }

    @Override // p000.AbstractC1352y1
    /* JADX INFO: renamed from: a */
    public final int mo7889a() {
        byte b = this.f31305a;
        sp2 sp2Var = this.f31306b;
        switch (b) {
            case 0:
                break;
        }
        return sp2Var.f30468i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f31305a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f31305a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.f31305a;
        sp2 sp2Var = this.f31306b;
        switch (b) {
            case 0:
                sp2Var.clear();
                break;
            default:
                sp2Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.f31305a;
        sp2 sp2Var = this.f31306b;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int iM10897f = sp2Var.m10897f(entry.getKey());
                if (iM10897f < 0) {
                    return false;
                }
                return z62.m13387o(sp2Var.f30461b[iM10897f], entry.getValue());
            default:
                return sp2Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f31305a) {
            case 0:
                sp2 sp2Var = this.f31306b;
                for (Object obj : collection) {
                    if (obj == null) {
                        return false;
                    }
                    try {
                        Map.Entry entry = (Map.Entry) obj;
                        int iM10897f = sp2Var.m10897f(entry.getKey());
                        if (!(iM10897f < 0 ? false : z62.m13387o(sp2Var.f30461b[iM10897f], entry.getValue()))) {
                            return false;
                        }
                    } catch (ClassCastException unused) {
                        return false;
                    }
                }
                return true;
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        byte b = this.f31305a;
        sp2 sp2Var = this.f31306b;
        switch (b) {
            case 0:
                break;
        }
        return sp2Var.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.f31305a;
        sp2 sp2Var = this.f31306b;
        switch (b) {
            case 0:
                return new qp2(sp2Var, (byte) 0);
            default:
                return new qp2(sp2Var, (byte) 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.f31305a;
        sp2 sp2Var = this.f31306b;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    sp2Var.m10894c();
                    int iM10897f = sp2Var.m10897f(entry.getKey());
                    if (iM10897f >= 0 && z62.m13387o(sp2Var.f30461b[iM10897f], entry.getValue())) {
                        sp2Var.m10900j(iM10897f);
                        return true;
                    }
                }
                return false;
            default:
                sp2Var.m10894c();
                int iM10897f2 = sp2Var.m10897f(obj);
                if (iM10897f2 < 0) {
                    return false;
                }
                sp2Var.m10900j(iM10897f2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        byte b = this.f31305a;
        sp2 sp2Var = this.f31306b;
        switch (b) {
            case 0:
                sp2Var.m10894c();
                break;
            default:
                sp2Var.m10894c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        byte b = this.f31305a;
        sp2 sp2Var = this.f31306b;
        switch (b) {
            case 0:
                sp2Var.m10894c();
                break;
            default:
                sp2Var.m10894c();
                break;
        }
        return super.retainAll(collection);
    }
}
