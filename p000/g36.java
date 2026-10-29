package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g36 extends d36 {

    /* JADX INFO: renamed from: e */
    public static final g36 f19596e = new g36(0, new Object[0]);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f19597c;

    /* JADX INFO: renamed from: d */
    public final transient int f19598d;

    public g36(int i, Object[] objArr) {
        this.f19597c = objArr;
        this.f19598d = i;
    }

    @Override // p000.s26
    /* JADX INFO: renamed from: a */
    public final Object[] mo31a() {
        return this.f19597c;
    }

    @Override // p000.s26
    /* JADX INFO: renamed from: c */
    public final int mo33c() {
        return this.f19598d;
    }

    @Override // p000.s26
    /* JADX INFO: renamed from: d */
    public final boolean mo5897d() {
        return false;
    }

    @Override // p000.d36, p000.s26
    /* JADX INFO: renamed from: e */
    public final int mo4337e(Object[] objArr) {
        Object[] objArr2 = this.f19597c;
        int i = this.f19598d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        k26.m7362d(i, this.f19598d);
        Object obj = this.f19597c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19598d;
    }
}
