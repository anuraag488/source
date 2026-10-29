package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m22 {

    /* JADX INFO: renamed from: a */
    public final int f24597a;

    /* JADX INFO: renamed from: b */
    public final Object f24598b;

    public m22(int i, Object obj) {
        this.f24597a = i;
        this.f24598b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m22)) {
            return false;
        }
        m22 m22Var = (m22) obj;
        return this.f24597a == m22Var.f24597a && z62.m13387o(this.f24598b, m22Var.f24598b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f24597a) * 31;
        Object obj = this.f24598b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f24597a + ", value=" + this.f24598b + ')';
    }
}
