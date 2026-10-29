package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class oo5 extends vo5 {

    /* JADX INFO: renamed from: e */
    public final transient int f26929e;

    /* JADX INFO: renamed from: f */
    public final transient int f26930f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ vo5 f26931g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo5(vo5 vo5Var, int i, int i2) {
        super((byte) 0);
        this.f26931g = vo5Var;
        this.f26929e = i;
        this.f26930f = i2;
    }

    @Override // p000.qn5
    /* JADX INFO: renamed from: c */
    public final Object[] mo5775c() {
        return this.f26931g.mo5775c();
    }

    @Override // p000.qn5
    /* JADX INFO: renamed from: d */
    public final int mo5776d() {
        return this.f26931g.mo5776d() + this.f26929e;
    }

    @Override // p000.qn5
    /* JADX INFO: renamed from: e */
    public final int mo5777e() {
        return this.f26931g.mo5776d() + this.f26929e + this.f26930f;
    }

    @Override // java.util.List
    public final Object get(int i) {
        xz5.m12802c(i, this.f26930f);
        return this.f26931g.get(i + this.f26929e);
    }

    @Override // p000.vo5, java.util.List
    /* JADX INFO: renamed from: q */
    public final vo5 subList(int i, int i2) {
        xz5.m12805f(i, i2, this.f26930f);
        int i3 = this.f26929e;
        return this.f26931g.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26930f;
    }
}
