package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xu5 extends sv5 {

    /* JADX INFO: renamed from: c */
    public final transient int f34632c;

    /* JADX INFO: renamed from: d */
    public final transient int f34633d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ sv5 f34634e;

    public xu5(sv5 sv5Var, int i, int i2) {
        this.f34634e = sv5Var;
        this.f34632c = i;
        this.f34633d = i2;
    }

    @Override // p000.su5
    /* JADX INFO: renamed from: b */
    public final int mo4229b() {
        return this.f34634e.mo4230c() + this.f34632c + this.f34633d;
    }

    @Override // p000.su5
    /* JADX INFO: renamed from: c */
    public final int mo4230c() {
        return this.f34634e.mo4230c() + this.f34632c;
    }

    @Override // p000.su5
    /* JADX INFO: renamed from: e */
    public final boolean mo8424e() {
        return true;
    }

    @Override // p000.su5
    /* JADX INFO: renamed from: g */
    public final Object[] mo4231g() {
        return this.f34634e.mo4231g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        nt5.m8846b(i, this.f34633d);
        return this.f34634e.get(i + this.f34632c);
    }

    @Override // p000.sv5, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final sv5 subList(int i, int i2) {
        nt5.m8848d(i, i2, this.f34633d);
        int i3 = this.f34632c;
        return this.f34634e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34633d;
    }
}
