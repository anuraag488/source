package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t12 extends AbstractC1129s1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0003a2 f30720a;

    /* JADX INFO: renamed from: b */
    public final int f30721b;

    /* JADX INFO: renamed from: c */
    public final int f30722c;

    public t12(AbstractC0003a2 abstractC0003a2, int i, int i2) {
        this.f30720a = abstractC0003a2;
        this.f30721b = i;
        gq6.m6089n(i, i2, abstractC0003a2.size());
        this.f30722c = i2 - i;
    }

    @Override // p000.AbstractC0929n0
    /* JADX INFO: renamed from: a */
    public final int mo103a() {
        return this.f30722c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        gq6.m6087l(i, this.f30722c);
        return this.f30720a.get(this.f30721b + i);
    }

    @Override // p000.AbstractC1129s1, java.util.List
    public final List subList(int i, int i2) {
        gq6.m6089n(i, i2, this.f30722c);
        int i3 = this.f30721b;
        return new t12(this.f30720a, i + i3, i3 + i2);
    }
}
