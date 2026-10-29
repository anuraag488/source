package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mw5 extends sv5 {

    /* JADX INFO: renamed from: e */
    public static final mw5 f25264e = new mw5(0, new Object[0]);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f25265c;

    /* JADX INFO: renamed from: d */
    public final transient int f25266d;

    public mw5(int i, Object[] objArr) {
        this.f25265c = objArr;
        this.f25266d = i;
    }

    @Override // p000.sv5, p000.su5
    /* JADX INFO: renamed from: a */
    public final int mo4228a(Object[] objArr) {
        Object[] objArr2 = this.f25265c;
        int i = this.f25266d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // p000.su5
    /* JADX INFO: renamed from: b */
    public final int mo4229b() {
        return this.f25266d;
    }

    @Override // p000.su5
    /* JADX INFO: renamed from: c */
    public final int mo4230c() {
        return 0;
    }

    @Override // p000.su5
    /* JADX INFO: renamed from: e */
    public final boolean mo8424e() {
        return false;
    }

    @Override // p000.su5
    /* JADX INFO: renamed from: g */
    public final Object[] mo4231g() {
        return this.f25265c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        nt5.m8846b(i, this.f25266d);
        Object obj = this.f25265c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25266d;
    }
}
