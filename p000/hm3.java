package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hm3 extends x12 {

    /* JADX INFO: renamed from: d */
    public final transient jm3 f20699d;

    /* JADX INFO: renamed from: e */
    public final transient im3 f20700e;

    public hm3(jm3 jm3Var, im3 im3Var) {
        this.f20699d = jm3Var;
        this.f20700e = im3Var;
    }

    @Override // p000.x12, p000.o12
    /* JADX INFO: renamed from: a */
    public final u12 mo6445a() {
        return this.f20700e;
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: b */
    public final int mo5199b(Object[] objArr) {
        return this.f20700e.mo5199b(objArr);
    }

    @Override // p000.o12, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f20699d.get(obj) != null;
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: g */
    public final boolean mo5203g() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: l */
    public final ru4 iterator() {
        return this.f20700e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20699d.f22427d;
    }
}
