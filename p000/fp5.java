package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fp5 extends vo5 {

    /* JADX INFO: renamed from: g */
    public static final fp5 f19216g = new fp5(0, new Object[0]);

    /* JADX INFO: renamed from: e */
    public final transient Object[] f19217e;

    /* JADX INFO: renamed from: f */
    public final transient int f19218f;

    public fp5(int i, Object[] objArr) {
        super((byte) 0);
        this.f19217e = objArr;
        this.f19218f = i;
    }

    @Override // p000.qn5
    /* JADX INFO: renamed from: c */
    public final Object[] mo5775c() {
        return this.f19217e;
    }

    @Override // p000.qn5
    /* JADX INFO: renamed from: d */
    public final int mo5776d() {
        return 0;
    }

    @Override // p000.qn5
    /* JADX INFO: renamed from: e */
    public final int mo5777e() {
        return this.f19218f;
    }

    @Override // java.util.List
    public final Object get(int i) {
        xz5.m12802c(i, this.f19218f);
        Object obj = this.f19217e[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p000.vo5, p000.qn5
    /* JADX INFO: renamed from: l */
    public final int mo5778l(Object[] objArr) {
        Object[] objArr2 = this.f19217e;
        int i = this.f19218f;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19218f;
    }
}
