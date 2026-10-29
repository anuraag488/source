package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class oc4 implements nw4 {

    /* JADX INFO: renamed from: a */
    public final Object f26623a;

    public oc4(Object obj) {
        this.f26623a = obj;
    }

    @Override // p000.nw4
    /* JADX INFO: renamed from: a */
    public final zh3 mo3606a(xh3 xh3Var) {
        Object obj = this.f26623a;
        return new zh3(xh3Var, obj, obj == null, null, null, null, false);
    }

    @Override // p000.nw4
    /* JADX INFO: renamed from: b */
    public final Object mo3607b(ga3 ga3Var) {
        return this.f26623a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oc4) && z62.m13387o(this.f26623a, ((oc4) obj).f26623a);
    }

    public final int hashCode() {
        Object obj = this.f26623a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f26623a + ")";
    }
}
