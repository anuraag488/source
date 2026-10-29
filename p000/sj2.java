package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sj2 extends t73 {

    /* JADX INFO: renamed from: a */
    public nh3 f30330a;

    @Override // p000.t73
    /* JADX INFO: renamed from: a */
    public final boolean mo5593a() {
        return ((jd2) this.f30330a.f25811c).m7075y() != j63.f22047e;
    }

    public final boolean equals(Object obj) {
        jd2 jd2Var = (jd2) this.f30330a.f25811c;
        if (!(obj instanceof sj2)) {
            return false;
        }
        nh3 nh3Var = ((sj2) obj).f30330a;
        j63 j63VarM7075y = jd2Var.m7075y();
        jd2 jd2Var2 = (jd2) nh3Var.f25811c;
        return j63VarM7075y.equals(jd2Var2.m7075y()) && jd2Var.m7076z().equals(jd2Var2.m7076z()) && jd2Var.m7071A().equals(jd2Var2.m7071A());
    }

    public final int hashCode() {
        nh3 nh3Var = this.f30330a;
        return Objects.hash((jd2) nh3Var.f25811c, (u50) nh3Var.f25810b);
    }

    public final String toString() {
        String str;
        jd2 jd2Var = (jd2) this.f30330a.f25811c;
        String strM7076z = jd2Var.m7076z();
        int iOrdinal = jd2Var.m7075y().ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return zi4.m13622v("(typeUrl=", strM7076z, ", outputPrefixType=", str, ")");
    }
}
