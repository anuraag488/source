package p000;

import java.lang.invoke.VarHandle;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class os3 {

    /* JADX INFO: renamed from: g */
    public static final BigInteger f27055g;

    /* JADX INFO: renamed from: h */
    public static final BigInteger f27056h;

    /* JADX INFO: renamed from: a */
    public Integer f27057a;

    /* JADX INFO: renamed from: b */
    public BigInteger f27058b;

    /* JADX INFO: renamed from: c */
    public ps3 f27059c;

    /* JADX INFO: renamed from: d */
    public ps3 f27060d;

    /* JADX INFO: renamed from: e */
    public Integer f27061e;

    /* JADX INFO: renamed from: f */
    public qs3 f27062f;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        f27055g = bigIntegerValueOf;
        f27056h = bigIntegerValueOf.pow(256);
    }

    /* JADX INFO: renamed from: a */
    public final rs3 m9256a() {
        Integer num = this.f27057a;
        if (num == null) {
            xy4.m12788q("key size is not set");
            return null;
        }
        if (this.f27058b == null) {
            xy4.m12788q("publicExponent is not set");
            return null;
        }
        if (this.f27059c == null) {
            xy4.m12788q("signature hash type is not set");
            return null;
        }
        if (this.f27060d == null) {
            xy4.m12788q("mgf1 hash type is not set");
            return null;
        }
        if (this.f27062f == null) {
            xy4.m12788q("variant is not set");
            return null;
        }
        if (this.f27061e == null) {
            xy4.m12788q("salt length is not set");
            return null;
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.f27057a, 2048));
        }
        if (this.f27059c != this.f27060d) {
            xy4.m12788q("MGF1 hash is different from signature hash");
            return null;
        }
        BigInteger bigInteger = this.f27058b;
        int iCompareTo = bigInteger.compareTo(rs3.f29581g);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f27055g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f27056h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        int iIntValue = this.f27057a.intValue();
        BigInteger bigInteger2 = this.f27058b;
        qs3 qs3Var = this.f27062f;
        ps3 ps3Var = this.f27059c;
        ps3 ps3Var2 = this.f27060d;
        int iIntValue2 = this.f27061e.intValue();
        rs3 rs3Var = new rs3();
        rs3Var.f29582a = iIntValue;
        rs3Var.f29583b = bigInteger2;
        rs3Var.f29584c = qs3Var;
        rs3Var.f29585d = ps3Var;
        rs3Var.f29586e = ps3Var2;
        rs3Var.f29587f = iIntValue2;
        VarHandle.storeStoreFence();
        return rs3Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m9257b(int i) {
        if (i < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i)));
        }
        this.f27061e = Integer.valueOf(i);
    }
}
