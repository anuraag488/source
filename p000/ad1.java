package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ad1 implements Map.Entry, cc2 {

    /* JADX INFO: renamed from: a */
    public Object f254a;

    /* JADX INFO: renamed from: b */
    public nk2 f255b;

    /* JADX INFO: renamed from: c */
    public ad1 f256c;

    /* JADX INFO: renamed from: d */
    public ad1 f257d;

    /* JADX INFO: renamed from: e */
    public boolean f258e;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ad1) {
            ad1 ad1Var = (ad1) obj;
            return this.f254a.equals(ad1Var.f254a) && this.f255b == ad1Var.f255b;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f254a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f255b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f255b.hashCode() + (this.f254a.hashCode() * 31);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.f254a + ", value=" + this.f255b + ")";
    }
}
