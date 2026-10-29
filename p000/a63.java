package p000;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a63 extends AbstractC1129s1 implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public s50[] f141a;

    /* JADX INFO: renamed from: b */
    public int[] f142b;

    @Override // p000.AbstractC0929n0
    /* JADX INFO: renamed from: a */
    public final int mo103a() {
        return this.f141a.length;
    }

    @Override // p000.AbstractC0929n0, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof s50) {
            return super.contains((s50) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f141a[i];
    }

    @Override // p000.AbstractC1129s1, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof s50) {
            return super.indexOf((s50) obj);
        }
        return -1;
    }

    @Override // p000.AbstractC1129s1, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof s50) {
            return super.lastIndexOf((s50) obj);
        }
        return -1;
    }
}
