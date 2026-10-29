package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ma4 implements wi0, Iterable, cc2 {

    /* JADX INFO: renamed from: a */
    public m84 f24787a;

    /* JADX INFO: renamed from: b */
    public int f24788b;

    /* JADX INFO: renamed from: c */
    public lm3 f24789c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof ma4)) {
            return false;
        }
        ma4 ma4Var = (ma4) obj;
        return ma4Var.f24788b == this.f24788b && ma4Var.f24787a == this.f24787a && ma4Var.f24789c.equals(this.f24789c);
    }

    public final int hashCode() {
        return this.f24789c.hashCode() + ((this.f24787a.hashCode() + (this.f24788b * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new la4(this.f24787a, this.f24788b, null, this.f24789c);
    }
}
