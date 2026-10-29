package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class im3 extends u12 {

    /* JADX INFO: renamed from: c */
    public final transient Object[] f21557c;

    /* JADX INFO: renamed from: d */
    public final transient boolean f21558d;

    /* JADX INFO: renamed from: e */
    public final transient int f21559e;

    /* JADX WARN: Multi-variable type inference failed */
    public im3(Object[] objArr, int i, int i2) {
        this.f21557c = objArr;
        this.f21558d = i;
        this.f21559e = i2;
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: g */
    public final boolean mo5203g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        dt0.m4717s(i, this.f21559e);
        Object obj = this.f21557c[(i * 2) + (this.f21558d ? 1 : 0)];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21559e;
    }
}
