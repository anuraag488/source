package p000;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xr3 extends gp2 {

    /* JADX INFO: renamed from: e */
    public static final BigInteger f34563e = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a */
    public int f34564a;

    /* JADX INFO: renamed from: b */
    public BigInteger f34565b;

    /* JADX INFO: renamed from: c */
    public wr3 f34566c;

    /* JADX INFO: renamed from: d */
    public vr3 f34567d;

    /* JADX INFO: renamed from: b */
    public static ur3 m12753b() {
        ur3 ur3Var = new ur3();
        ur3Var.f32117a = null;
        ur3Var.f32118b = f34563e;
        ur3Var.f32119c = null;
        ur3Var.f32120d = wr3.f33661e;
        return ur3Var;
    }

    @Override // p000.t73
    /* JADX INFO: renamed from: a */
    public final boolean mo5593a() {
        return this.f34566c != wr3.f33661e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xr3)) {
            return false;
        }
        xr3 xr3Var = (xr3) obj;
        return xr3Var.f34564a == this.f34564a && Objects.equals(xr3Var.f34565b, this.f34565b) && xr3Var.f34566c == this.f34566c && xr3Var.f34567d == this.f34567d;
    }

    public final int hashCode() {
        return Objects.hash(xr3.class, Integer.valueOf(this.f34564a), this.f34565b, this.f34566c, this.f34567d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RSA SSA PKCS1 Parameters (variant: ");
        sb.append(this.f34566c);
        sb.append(", hashType: ");
        sb.append(this.f34567d);
        sb.append(", publicExponent: ");
        sb.append(this.f34565b);
        sb.append(", and ");
        return c75.m3880l(sb, this.f34564a, "-bit modulus)");
    }
}
