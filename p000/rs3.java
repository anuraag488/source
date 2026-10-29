package p000;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rs3 extends gp2 {

    /* JADX INFO: renamed from: g */
    public static final BigInteger f29581g = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a */
    public int f29582a;

    /* JADX INFO: renamed from: b */
    public BigInteger f29583b;

    /* JADX INFO: renamed from: c */
    public qs3 f29584c;

    /* JADX INFO: renamed from: d */
    public ps3 f29585d;

    /* JADX INFO: renamed from: e */
    public ps3 f29586e;

    /* JADX INFO: renamed from: f */
    public int f29587f;

    /* JADX INFO: renamed from: b */
    public static os3 m10422b() {
        os3 os3Var = new os3();
        os3Var.f27057a = null;
        os3Var.f27058b = f29581g;
        os3Var.f27059c = null;
        os3Var.f27060d = null;
        os3Var.f27061e = null;
        os3Var.f27062f = qs3.f28764e;
        return os3Var;
    }

    @Override // p000.t73
    /* JADX INFO: renamed from: a */
    public final boolean mo5593a() {
        return this.f29584c != qs3.f28764e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rs3)) {
            return false;
        }
        rs3 rs3Var = (rs3) obj;
        return rs3Var.f29582a == this.f29582a && Objects.equals(rs3Var.f29583b, this.f29583b) && rs3Var.f29584c == this.f29584c && rs3Var.f29585d == this.f29585d && rs3Var.f29586e == this.f29586e && rs3Var.f29587f == this.f29587f;
    }

    public final int hashCode() {
        return Objects.hash(rs3.class, Integer.valueOf(this.f29582a), this.f29583b, this.f29584c, this.f29585d, this.f29586e, Integer.valueOf(this.f29587f));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RSA SSA PSS Parameters (variant: ");
        sb.append(this.f29584c);
        sb.append(", signature hashType: ");
        sb.append(this.f29585d);
        sb.append(", mgf1 hashType: ");
        sb.append(this.f29586e);
        sb.append(", saltLengthBytes: ");
        sb.append(this.f29587f);
        sb.append(", publicExponent: ");
        sb.append(this.f29583b);
        sb.append(", and ");
        return c75.m3880l(sb, this.f29582a, "-bit modulus)");
    }
}
