package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ki3 {

    /* JADX INFO: renamed from: a */
    public f00 f23153a;

    /* JADX INFO: renamed from: b */
    public List f23154b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki3)) {
            return false;
        }
        ki3 ki3Var = (ki3) obj;
        return z62.m13387o(this.f23153a, ki3Var.f23153a) && z62.m13387o(this.f23154b, ki3Var.f23154b);
    }

    public final int hashCode() {
        return this.f23154b.hashCode() + (this.f23153a.hashCode() * 31);
    }

    public final String toString() {
        return "PurchasesResult(billingResult=" + this.f23153a + ", purchasesList=" + this.f23154b + ")";
    }
}
