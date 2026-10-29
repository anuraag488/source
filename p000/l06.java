package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l06 extends n06 {

    /* JADX INFO: renamed from: e */
    public final transient int f23682e;

    /* JADX INFO: renamed from: f */
    public final transient int f23683f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ n06 f23684g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l06(n06 n06Var, int i, int i2) {
        super((byte) 1);
        this.f23684g = n06Var;
        this.f23682e = i;
        this.f23683f = i2;
    }

    @Override // p000.qn5
    /* JADX INFO: renamed from: b */
    public final int mo7790b() {
        return this.f23684g.mo5776d() + this.f23682e + this.f23683f;
    }

    @Override // p000.qn5
    /* JADX INFO: renamed from: d */
    public final int mo5776d() {
        return this.f23684g.mo5776d() + this.f23682e;
    }

    @Override // p000.qn5
    /* JADX INFO: renamed from: g */
    public final Object[] mo7791g() {
        return this.f23684g.mo7791g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        xz5.m12800a(i, this.f23683f);
        return this.f23684g.get(i + this.f23682e);
    }

    @Override // p000.n06, java.util.List
    /* JADX INFO: renamed from: m */
    public final n06 subList(int i, int i2) {
        xz5.m12803d(i, i2, this.f23683f);
        int i3 = this.f23682e;
        return this.f23684g.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23683f;
    }
}
