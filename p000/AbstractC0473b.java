package p000;

import java.io.EOFException;

/* JADX INFO: renamed from: b */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0473b {

    /* JADX INFO: renamed from: a */
    public static final byte[] f14970a = "0123456789abcdef".getBytes(z80.f35863a);

    /* JADX INFO: renamed from: b */
    public static final long[] f14971b = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    /* JADX INFO: renamed from: a */
    public static final boolean m3377a(zz3 zz3Var, int i, byte[] bArr, int i2, int i3) {
        int i4 = zz3Var.f36506c;
        byte[] bArr2 = zz3Var.f36504a;
        while (i2 < i3) {
            if (i == i4) {
                zz3Var = zz3Var.f36509f;
                byte[] bArr3 = zz3Var.f36504a;
                bArr2 = bArr3;
                i = zz3Var.f36505b;
                i4 = zz3Var.f36506c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final String m3378b(w30 w30Var, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (w30Var.m12063g(j2) == 13) {
                String strM12047C = w30Var.m12047C(j2, z80.f35863a);
                w30Var.m12048D(2L);
                return strM12047C;
            }
        }
        String strM12047C2 = w30Var.m12047C(j, z80.f35863a);
        w30Var.m12048D(1L);
        return strM12047C2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0095 A[LOOP:0: B:8:0x0019->B:49:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0094 A[SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final int m3379c(w30 w30Var, a63 a63Var, boolean z) {
        int i;
        int i2;
        int i3;
        zz3 zz3Var;
        int i4;
        zz3 zz3Var2 = w30Var.f33055a;
        if (zz3Var2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = zz3Var2.f36504a;
        int i5 = zz3Var2.f36505b;
        int i6 = zz3Var2.f36506c;
        int[] iArr = a63Var.f142b;
        zz3 zz3Var3 = zz3Var2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (zz3Var3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            zz3Var3 = zz3Var3.f36509f;
                            int i16 = zz3Var3.f36505b;
                            byte[] bArr2 = zz3Var3.f36504a;
                            i2 = zz3Var3.f36506c;
                            if (zz3Var3 == zz3Var2) {
                                i3 = i16;
                                bArr = bArr2;
                                zz3Var3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & 255) == iArr[i11]) {
                    boolean z2 = i20 == i18;
                    if (i19 == i6) {
                        zz3 zz3Var4 = zz3Var3.f36509f;
                        i3 = zz3Var4.f36505b;
                        byte[] bArr3 = zz3Var4.f36504a;
                        i4 = zz3Var4.f36506c;
                        if (zz3Var4 != zz3Var2) {
                            zz3Var = zz3Var4;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            zz3Var = null;
                        }
                    } else {
                        zz3Var = zz3Var3;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        zz3Var3 = zz3Var;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    zz3Var3 = zz3Var;
                    i11 = i20;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            int i110 = i2;
            i8 = -i;
            i5 = i3;
            i6 = i110;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
