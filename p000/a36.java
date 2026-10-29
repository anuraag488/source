package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a36 extends d36 {

    /* JADX INFO: renamed from: c */
    public final transient int f83c;

    /* JADX INFO: renamed from: d */
    public final transient int f84d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ d36 f85e;

    public a36(d36 d36Var, int i, int i2) {
        this.f85e = d36Var;
        this.f83c = i;
        this.f84d = i2;
    }

    @Override // p000.s26
    /* JADX INFO: renamed from: a */
    public final Object[] mo31a() {
        return this.f85e.mo31a();
    }

    @Override // p000.s26
    /* JADX INFO: renamed from: b */
    public final int mo32b() {
        return this.f85e.mo32b() + this.f83c;
    }

    @Override // p000.s26
    /* JADX INFO: renamed from: c */
    public final int mo33c() {
        return this.f85e.mo32b() + this.f83c + this.f84d;
    }

    @Override // p000.d36, java.util.List
    /* JADX INFO: renamed from: g */
    public final d36 subList(int i, int i2) {
        k26.m7363e(i, i2, this.f84d);
        int i3 = this.f83c;
        return this.f85e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        k26.m7362d(i, this.f84d);
        return this.f85e.get(i + this.f83c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f84d;
    }
}
