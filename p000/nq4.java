package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nq4 implements Serializable {

    /* JADX INFO: renamed from: a */
    public Object f26038a;

    /* JADX INFO: renamed from: b */
    public Object f26039b;

    /* JADX INFO: renamed from: c */
    public Object f26040c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq4)) {
            return false;
        }
        nq4 nq4Var = (nq4) obj;
        return z62.m13387o(this.f26038a, nq4Var.f26038a) && z62.m13387o(this.f26039b, nq4Var.f26039b) && z62.m13387o(this.f26040c, nq4Var.f26040c);
    }

    public final int hashCode() {
        Object obj = this.f26038a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f26039b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f26040c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f26038a + ", " + this.f26039b + ", " + this.f26040c + ')';
    }
}
