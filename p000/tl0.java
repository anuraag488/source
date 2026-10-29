package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tl0 {

    /* JADX INFO: renamed from: a */
    public f00 f31219a;

    /* JADX INFO: renamed from: b */
    public String f31220b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl0)) {
            return false;
        }
        tl0 tl0Var = (tl0) obj;
        return z62.m13387o(this.f31219a, tl0Var.f31219a) && z62.m13387o(this.f31220b, tl0Var.f31220b);
    }

    public final int hashCode() {
        int iHashCode = this.f31219a.hashCode() * 31;
        String str = this.f31220b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsumeResult(billingResult=");
        sb.append(this.f31219a);
        sb.append(", purchaseToken=");
        return zi4.m13623w(sb, this.f31220b, ")");
    }
}
