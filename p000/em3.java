package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class em3 extends u12 {

    /* JADX INFO: renamed from: e */
    public static final em3 f18259e = new em3(0, new Object[0]);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f18260c;

    /* JADX INFO: renamed from: d */
    public final transient int f18261d;

    public em3(int i, Object[] objArr) {
        this.f18260c = objArr;
        this.f18261d = i;
    }

    @Override // p000.u12, p000.o12
    /* JADX INFO: renamed from: b */
    public final int mo5199b(Object[] objArr) {
        Object[] objArr2 = this.f18260c;
        int i = this.f18261d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: c */
    public final Object[] mo5200c() {
        return this.f18260c;
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: d */
    public final int mo5201d() {
        return this.f18261d;
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: e */
    public final int mo5202e() {
        return 0;
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: g */
    public final boolean mo5203g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        dt0.m4717s(i, this.f18261d);
        Object obj = this.f18260c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18261d;
    }
}
