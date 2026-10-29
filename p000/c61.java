package p000;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class c61 {

    /* JADX INFO: renamed from: a */
    public static final long[] f15834a;

    /* JADX INFO: renamed from: b */
    public static final long[] f15835b;

    /* JADX INFO: renamed from: c */
    public static final long[] f15836c;

    /* JADX INFO: renamed from: d */
    public static final z51[][] f15837d;

    /* JADX INFO: renamed from: e */
    public static final z51[] f15838e;

    /* JADX INFO: renamed from: f */
    public static final BigInteger f15839f;

    /* JADX INFO: renamed from: g */
    public static final BigInteger f15840g;

    /* JADX INFO: renamed from: h */
    public static final BigInteger f15841h;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f15839f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        f15840g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        f15841h = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        z32 z32Var = new z32((byte) 14);
        BigInteger bigIntegerMod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        z32Var.f35739c = bigIntegerMod3;
        BigInteger bigIntegerMultiply = bigIntegerMod3.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerMod3.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        z32Var.f35738b = bigIntegerModPow2;
        f15834a = kx5.m7684O(m3855c(bigIntegerMod));
        f15835b = kx5.m7684O(m3855c(bigIntegerMod2));
        f15836c = kx5.m7684O(m3855c(bigIntegerModPow));
        f15837d = (z51[][]) Array.newInstance((Class<?>) z51.class, 32, 8);
        z32 z32VarM3853a = z32Var;
        for (int i = 0; i < 32; i++) {
            z32 z32VarM3853a2 = z32VarM3853a;
            for (int i2 = 0; i2 < 8; i2++) {
                f15837d[i][i2] = m3854b(z32VarM3853a2);
                z32VarM3853a2 = m3853a(z32VarM3853a2, z32VarM3853a);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                z32VarM3853a = m3853a(z32VarM3853a, z32VarM3853a);
            }
        }
        z32 z32VarM3853a3 = m3853a(z32Var, z32Var);
        f15838e = new z51[8];
        for (int i4 = 0; i4 < 8; i4++) {
            f15838e[i4] = m3854b(z32Var);
            z32Var = m3853a(z32Var, z32VarM3853a3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static z32 m3853a(z32 z32Var, z32 z32Var2) {
        z32 z32Var3 = new z32((byte) 14);
        BigInteger bigIntegerMultiply = f15840g.multiply(((BigInteger) z32Var.f35738b).multiply((BigInteger) z32Var2.f35738b).multiply((BigInteger) z32Var.f35739c).multiply((BigInteger) z32Var2.f35739c));
        BigInteger bigInteger = f15839f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = ((BigInteger) z32Var.f35738b).multiply((BigInteger) z32Var2.f35739c).add(((BigInteger) z32Var2.f35738b).multiply((BigInteger) z32Var.f35739c));
        BigInteger bigInteger2 = BigInteger.ONE;
        z32Var3.f35738b = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        z32Var3.f35739c = ((BigInteger) z32Var.f35739c).multiply((BigInteger) z32Var2.f35739c).add(((BigInteger) z32Var.f35738b).multiply((BigInteger) z32Var2.f35738b)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return z32Var3;
    }

    /* JADX INFO: renamed from: b */
    public static z51 m3854b(z32 z32Var) {
        BigInteger bigIntegerAdd = ((BigInteger) z32Var.f35739c).add((BigInteger) z32Var.f35738b);
        BigInteger bigInteger = f15839f;
        return new z51(kx5.m7684O(m3855c(bigIntegerAdd.mod(bigInteger))), kx5.m7684O(m3855c(((BigInteger) z32Var.f35739c).subtract((BigInteger) z32Var.f35738b).mod(bigInteger))), kx5.m7684O(m3855c(f15841h.multiply((BigInteger) z32Var.f35738b).multiply((BigInteger) z32Var.f35739c).mod(bigInteger))));
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m3855c(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = 31 - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }
}
