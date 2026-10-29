package p000;

import java.lang.invoke.VarHandle;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ur3 {

    /* JADX INFO: renamed from: e */
    public static final BigInteger f32115e;

    /* JADX INFO: renamed from: f */
    public static final BigInteger f32116f;

    /* JADX INFO: renamed from: a */
    public Integer f32117a;

    /* JADX INFO: renamed from: b */
    public BigInteger f32118b;

    /* JADX INFO: renamed from: c */
    public vr3 f32119c;

    /* JADX INFO: renamed from: d */
    public wr3 f32120d;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        f32115e = bigIntegerValueOf;
        f32116f = bigIntegerValueOf.pow(256);
    }

    /* JADX INFO: renamed from: a */
    public final xr3 m11635a() {
        Integer num = this.f32117a;
        if (num == null) {
            xy4.m12788q("key size is not set");
            return null;
        }
        if (this.f32118b == null) {
            xy4.m12788q("publicExponent is not set");
            return null;
        }
        if (this.f32119c == null) {
            xy4.m12788q("hash type is not set");
            return null;
        }
        if (this.f32120d == null) {
            xy4.m12788q("variant is not set");
            return null;
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f32117a));
        }
        BigInteger bigInteger = this.f32118b;
        int iCompareTo = bigInteger.compareTo(xr3.f34563e);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f32115e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f32116f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        int iIntValue = this.f32117a.intValue();
        BigInteger bigInteger2 = this.f32118b;
        wr3 wr3Var = this.f32120d;
        vr3 vr3Var = this.f32119c;
        xr3 xr3Var = new xr3();
        xr3Var.f34564a = iIntValue;
        xr3Var.f34565b = bigInteger2;
        xr3Var.f34566c = wr3Var;
        xr3Var.f34567d = vr3Var;
        VarHandle.storeStoreFence();
        return xr3Var;
    }
}
