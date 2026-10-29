package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pl5 {

    /* JADX INFO: renamed from: a */
    public C0458al f27738a;

    /* JADX INFO: renamed from: b */
    public ed1 f27739b;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof pl5)) {
            return false;
        }
        pl5 pl5Var = (pl5) obj;
        return AbstractC1356y5.m12927u(this.f27738a, pl5Var.f27738a) && AbstractC1356y5.m12927u(this.f27739b, pl5Var.f27739b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f27738a, this.f27739b});
    }

    public final String toString() {
        z32 z32VarM12903L = AbstractC1356y5.m12903L(this);
        z32VarM12903L.m13323p(this.f27738a, "key");
        z32VarM12903L.m13323p(this.f27739b, "feature");
        return z32VarM12903L.toString();
    }
}
