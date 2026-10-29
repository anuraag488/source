package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class io5 extends vo5 {

    /* JADX INFO: renamed from: e */
    public transient vo5 f21609e;

    @Override // p000.vo5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f21609e.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        vo5 vo5Var = this.f21609e;
        xz5.m12802c(i, vo5Var.size());
        return vo5Var.get((vo5Var.size() - 1) - i);
    }

    @Override // p000.vo5, java.util.List
    public final int indexOf(Object obj) {
        vo5 vo5Var = this.f21609e;
        int iLastIndexOf = vo5Var.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (vo5Var.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // p000.vo5, java.util.List
    public final int lastIndexOf(Object obj) {
        vo5 vo5Var = this.f21609e;
        int iIndexOf = vo5Var.indexOf(obj);
        if (iIndexOf >= 0) {
            return (vo5Var.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // p000.vo5
    /* JADX INFO: renamed from: m */
    public final vo5 mo6848m() {
        return this.f21609e;
    }

    @Override // p000.vo5, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final vo5 subList(int i, int i2) {
        vo5 vo5Var = this.f21609e;
        xz5.m12805f(i, i2, vo5Var.size());
        return vo5Var.subList(vo5Var.size() - i2, vo5Var.size() - i).mo6848m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21609e.size();
    }
}
