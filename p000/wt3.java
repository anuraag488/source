package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wt3 implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public Object f33719a;

    /* JADX INFO: renamed from: b */
    public im2 f33720b;

    /* JADX INFO: renamed from: c */
    public wt3 f33721c;

    /* JADX INFO: renamed from: d */
    public wt3 f33722d;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wt3) {
            wt3 wt3Var = (wt3) obj;
            return this.f33719a.equals(wt3Var.f33719a) && this.f33720b == wt3Var.f33720b;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f33719a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f33720b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f33720b.hashCode() ^ this.f33719a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f33719a + "=" + this.f33720b;
    }
}
