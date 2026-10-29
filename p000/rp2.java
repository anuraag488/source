package p000;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rp2 implements Map.Entry, ec2 {

    /* JADX INFO: renamed from: a */
    public sp2 f29511a;

    /* JADX INFO: renamed from: b */
    public int f29512b;

    /* JADX INFO: renamed from: c */
    public int f29513c;

    /* JADX INFO: renamed from: a */
    public final void m10389a() {
        if (this.f29511a.f30467h != this.f29513c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return z62.m13387o(entry.getKey(), getKey()) && z62.m13387o(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        m10389a();
        return this.f29511a.f30460a[this.f29512b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        m10389a();
        return this.f29511a.f30461b[this.f29512b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        m10389a();
        sp2 sp2Var = this.f29511a;
        sp2Var.m10894c();
        Object[] objArr = sp2Var.f30461b;
        if (objArr == null) {
            int length = sp2Var.f30460a.length;
            if (length < 0) {
                C1077qn.m9987m("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            sp2Var.f30461b = objArr;
        }
        int i = this.f29512b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
