package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tg3 {

    /* JADX INFO: renamed from: a */
    public f00 f31144a;

    /* JADX INFO: renamed from: b */
    public List f31145b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tg3) {
            tg3 tg3Var = (tg3) obj;
            if (this.f31144a == tg3Var.f31144a && z62.m13387o(this.f31145b, tg3Var.f31145b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f31144a.hashCode() * 31;
        List list = this.f31145b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "ProductDetailsResult(billingResult=" + this.f31144a + ", productDetailsList=" + this.f31145b + ")";
    }
}
