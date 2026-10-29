package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s06 extends n06 {

    /* JADX INFO: renamed from: g */
    public static final s06 f29800g = new s06(0, new Object[0]);

    /* JADX INFO: renamed from: e */
    public final transient Object[] f29801e;

    /* JADX INFO: renamed from: f */
    public final transient int f29802f;

    public s06(int i, Object[] objArr) {
        super((byte) 1);
        this.f29801e = objArr;
        this.f29802f = i;
    }

    @Override // p000.n06, p000.qn5
    /* JADX INFO: renamed from: a */
    public final int mo5884a(Object[] objArr) {
        Object[] objArr2 = this.f29801e;
        int i = this.f29802f;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // p000.qn5
    /* JADX INFO: renamed from: b */
    public final int mo7790b() {
        return this.f29802f;
    }

    @Override // p000.qn5
    /* JADX INFO: renamed from: d */
    public final int mo5776d() {
        return 0;
    }

    @Override // p000.qn5
    /* JADX INFO: renamed from: g */
    public final Object[] mo7791g() {
        return this.f29801e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        xz5.m12800a(i, this.f29802f);
        Object obj = this.f29801e[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29802f;
    }
}
