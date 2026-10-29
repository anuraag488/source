package p000;

import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class b61 {

    /* JADX INFO: renamed from: a */
    public static final z51 f15102a = new z51(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* JADX INFO: renamed from: b */
    public static final z32 f15103b = new z32(new jp0(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 18), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 13);

    /* JADX INFO: renamed from: c */
    public static final byte[] f15104c = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    /* JADX INFO: renamed from: a */
    public static void m3460a(z32 z32Var, nh3 nh3Var, z51 z51Var) {
        long[] jArr = new long[10];
        jp0 jp0Var = (jp0) z32Var.f35738b;
        long[] jArr2 = (long[]) jp0Var.f22481b;
        jp0 jp0Var2 = (jp0) nh3Var.f25810b;
        kx5.m7729q0(jArr2, (long[]) jp0Var2.f22482c, (long[]) jp0Var2.f22481b);
        kx5.m7727p0((long[]) jp0Var.f22482c, (long[]) jp0Var2.f22482c, (long[]) jp0Var2.f22481b);
        long[] jArr3 = (long[]) jp0Var.f22482c;
        kx5.m7697a0(jArr3, jArr3, z51Var.f35753b);
        long[] jArr4 = (long[]) jp0Var.f22483d;
        long[] jArr5 = (long[]) jp0Var.f22481b;
        kx5.m7697a0(jArr4, jArr5, z51Var.f35752a);
        long[] jArr6 = (long[]) z32Var.f35739c;
        kx5.m7697a0(jArr6, (long[]) nh3Var.f25811c, z51Var.f35754c);
        z51Var.mo102b(jArr5, (long[]) jp0Var2.f22483d);
        kx5.m7729q0(jArr, jArr5, jArr5);
        kx5.m7727p0(jArr5, jArr4, jArr3);
        kx5.m7729q0(jArr3, jArr4, jArr3);
        kx5.m7729q0(jArr4, jArr, jArr6);
        kx5.m7727p0(jArr6, jArr, jArr6);
    }

    /* JADX INFO: renamed from: b */
    public static void m3461b(jp0 jp0Var, z32 z32Var) {
        long[] jArr = new long[10];
        jp0 jp0Var2 = (jp0) z32Var.f35738b;
        kx5.m7725o0((long[]) jp0Var2.f22481b, (long[]) jp0Var.f22481b);
        long[] jArr2 = (long[]) jp0Var2.f22483d;
        long[] jArr3 = (long[]) jp0Var.f22482c;
        kx5.m7725o0(jArr2, jArr3);
        long[] jArr4 = (long[]) z32Var.f35739c;
        kx5.m7725o0(jArr4, (long[]) jp0Var.f22483d);
        kx5.m7729q0(jArr4, jArr4, jArr4);
        long[] jArr5 = (long[]) jp0Var2.f22482c;
        kx5.m7729q0(jArr5, (long[]) jp0Var.f22481b, jArr3);
        kx5.m7725o0(jArr, jArr5);
        long[] jArr6 = (long[]) jp0Var2.f22483d;
        long[] jArr7 = (long[]) jp0Var2.f22481b;
        kx5.m7729q0(jArr5, jArr6, jArr7);
        kx5.m7727p0(jArr6, jArr6, jArr7);
        kx5.m7727p0(jArr7, jArr, jArr5);
        kx5.m7727p0(jArr4, jArr4, jArr6);
    }

    /* JADX INFO: renamed from: c */
    public static int m3462c(int i, int i2) {
        int i3 = (~(i ^ i2)) & 255;
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return ((i5 & (i5 << 1)) >> 7) & 1;
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m3463d(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) n81.f25516e.f25518a.mo3139g("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        byte b = (byte) (bArrDigest[31] & 127);
        bArrDigest[31] = b;
        bArrDigest[31] = (byte) (b | 64);
        return bArrDigest;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3464e(long[] jArr) {
        long[] jArr2 = new long[jArr.length + 1];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        kx5.m7719l0(jArr2);
        byte[] bArrM7679F = kx5.m7679F(jArr2);
        for (int i = 0; i < 32; i++) {
            if (bArrM7679F[i] != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static long m3465f(int i, byte[] bArr) {
        return (((long) (bArr[i + 2] & 255)) << 16) | (((long) bArr[i]) & 255) | (((long) (bArr[i + 1] & 255)) << 8);
    }

    /* JADX INFO: renamed from: g */
    public static long m3466g(int i, byte[] bArr) {
        return (((long) (bArr[i + 3] & 255)) << 24) | m3465f(i, bArr);
    }

    /* JADX INFO: renamed from: h */
    public static jp0 m3467h(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 * 2;
            bArr2[i3] = (byte) (bArr[i2] & 15);
            bArr2[i3 + 1] = (byte) (((bArr[i2] & 255) >> 4) & 15);
            i2++;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < 63) {
            byte b = (byte) (bArr2[i4] + i5);
            bArr2[i4] = b;
            int i6 = (b + 8) >> 4;
            bArr2[i4] = (byte) (b - (i6 << 4));
            i4++;
            i5 = i6;
        }
        bArr2[63] = (byte) (bArr2[63] + i5);
        z32 z32Var = new z32();
        nh3 nh3Var = new nh3((byte) 13);
        for (i = 1; i < 64; i += 2) {
            z51 z51Var = new z51();
            m3468i(z51Var, i / 2, bArr2[i]);
            nh3.m8731C(nh3Var, z32Var);
            m3460a(z32Var, nh3Var, z51Var);
        }
        jp0 jp0Var = new jp0((byte) 18);
        jp0.m7214u(jp0Var, z32Var);
        m3461b(jp0Var, z32Var);
        jp0.m7214u(jp0Var, z32Var);
        m3461b(jp0Var, z32Var);
        jp0.m7214u(jp0Var, z32Var);
        m3461b(jp0Var, z32Var);
        jp0.m7214u(jp0Var, z32Var);
        m3461b(jp0Var, z32Var);
        for (int i7 = 0; i7 < 64; i7 += 2) {
            z51 z51Var2 = new z51();
            m3468i(z51Var2, i7 / 2, bArr2[i7]);
            nh3.m8731C(nh3Var, z32Var);
            m3460a(z32Var, nh3Var, z51Var2);
        }
        jp0 jp0Var2 = new jp0(z32Var);
        long[] jArr = new long[10];
        kx5.m7725o0(jArr, (long[]) jp0Var2.f22481b);
        long[] jArr2 = new long[10];
        kx5.m7725o0(jArr2, (long[]) jp0Var2.f22482c);
        long[] jArr3 = new long[10];
        kx5.m7725o0(jArr3, (long[]) jp0Var2.f22483d);
        long[] jArr4 = new long[10];
        kx5.m7725o0(jArr4, jArr3);
        long[] jArr5 = new long[10];
        kx5.m7727p0(jArr5, jArr2, jArr);
        kx5.m7697a0(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        kx5.m7697a0(jArr6, jArr, jArr2);
        kx5.m7697a0(jArr6, jArr6, c61.f15834a);
        kx5.m7729q0(jArr6, jArr6, jArr4);
        kx5.m7717k0(jArr6, jArr6);
        if (MessageDigest.isEqual(kx5.m7679F(jArr5), kx5.m7679F(jArr6))) {
            return jp0Var2;
        }
        C1077qn.m9989o("arithmetic error in scalar multiplication");
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static void m3468i(z51 z51Var, int i, byte b) {
        int i2 = (b & 255) >> 7;
        int i3 = b - (((-i2) & b) << 1);
        z51[][] z51VarArr = c61.f15837d;
        z51Var.m13339a(z51VarArr[i][0], m3462c(i3, 1));
        z51Var.m13339a(z51VarArr[i][1], m3462c(i3, 2));
        z51Var.m13339a(z51VarArr[i][2], m3462c(i3, 3));
        z51Var.m13339a(z51VarArr[i][3], m3462c(i3, 4));
        z51Var.m13339a(z51VarArr[i][4], m3462c(i3, 5));
        z51Var.m13339a(z51VarArr[i][5], m3462c(i3, 6));
        z51Var.m13339a(z51VarArr[i][6], m3462c(i3, 7));
        z51Var.m13339a(z51VarArr[i][7], m3462c(i3, 8));
        long[] jArr = z51Var.f35753b;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        long[] jArr2 = z51Var.f35752a;
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArr3 = z51Var.f35754c;
        long[] jArrCopyOf3 = Arrays.copyOf(jArr3, 10);
        for (int i4 = 0; i4 < jArrCopyOf3.length; i4++) {
            jArrCopyOf3[i4] = -jArrCopyOf3[i4];
        }
        qq2.m10030n(jArr2, jArrCopyOf, i2);
        qq2.m10030n(jArr, jArrCopyOf2, i2);
        qq2.m10030n(jArr3, jArrCopyOf3, i2);
    }

    /* JADX INFO: renamed from: j */
    public static byte[] m3469j(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (1 & ((bArr[i2 >> 3] & 255) >> (i2 & 7)));
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr2[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    byte b = bArr2[i];
                    if (b != 0) {
                        byte b2 = bArr2[i3];
                        if ((b << i4) + b2 > 15) {
                            if (b2 - (b << i4) < -15) {
                                break;
                            }
                            bArr2[i3] = (byte) (b2 - (b << i4));
                            while (i < 256) {
                                if (bArr2[i] == 0) {
                                    bArr2[i] = 1;
                                    break;
                                }
                                bArr2[i] = 0;
                                i++;
                            }
                        } else {
                            bArr2[i3] = (byte) (b2 + (b << i4));
                            bArr2[i] = 0;
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: k */
    public static void m3470k(z32 z32Var, nh3 nh3Var, z51 z51Var) {
        long[] jArr = new long[10];
        jp0 jp0Var = (jp0) z32Var.f35738b;
        long[] jArr2 = (long[]) jp0Var.f22481b;
        jp0 jp0Var2 = (jp0) nh3Var.f25810b;
        kx5.m7729q0(jArr2, (long[]) jp0Var2.f22482c, (long[]) jp0Var2.f22481b);
        kx5.m7727p0((long[]) jp0Var.f22482c, (long[]) jp0Var2.f22482c, (long[]) jp0Var2.f22481b);
        long[] jArr3 = (long[]) jp0Var.f22482c;
        kx5.m7697a0(jArr3, jArr3, z51Var.f35752a);
        long[] jArr4 = (long[]) jp0Var.f22483d;
        long[] jArr5 = (long[]) jp0Var.f22481b;
        kx5.m7697a0(jArr4, jArr5, z51Var.f35753b);
        long[] jArr6 = (long[]) z32Var.f35739c;
        kx5.m7697a0(jArr6, (long[]) nh3Var.f25811c, z51Var.f35754c);
        z51Var.mo102b(jArr5, (long[]) jp0Var2.f22483d);
        kx5.m7729q0(jArr, jArr5, jArr5);
        kx5.m7727p0(jArr5, jArr4, jArr3);
        kx5.m7729q0(jArr3, jArr4, jArr3);
        kx5.m7727p0(jArr4, jArr, jArr6);
        kx5.m7729q0(jArr6, jArr, jArr6);
    }
}
