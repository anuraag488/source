package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xw5 extends sv5 {

    /* JADX INFO: renamed from: c */
    public final transient Object[] f34686c;

    /* JADX INFO: renamed from: d */
    public final transient boolean f34687d;

    /* JADX INFO: renamed from: e */
    public final transient int f34688e;

    /* JADX WARN: Multi-variable type inference failed */
    public xw5(Object[] objArr, int i, int i2) {
        this.f34686c = objArr;
        this.f34687d = i;
        this.f34688e = i2;
    }

    @Override // p000.su5
    /* JADX INFO: renamed from: e */
    public final boolean mo8424e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        nt5.m8846b(i, this.f34688e);
        Object obj = this.f34686c[i + i + (this.f34687d ? 1 : 0)];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34688e;
    }
}
