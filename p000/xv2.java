package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xv2 {

    /* JADX INFO: renamed from: a */
    public long[] f34639a = tv3.f31472a;

    /* JADX INFO: renamed from: b */
    public Object[] f34640b = qq2.f28687f;

    /* JADX INFO: renamed from: c */
    public float[] f34641c = li1.f24045a;

    /* JADX INFO: renamed from: d */
    public int f34642d;

    /* JADX INFO: renamed from: e */
    public int f34643e;

    /* JADX INFO: renamed from: f */
    public int f34644f;

    public xv2(int i) {
        if (i >= 0) {
            m12765d(tv3.m11187d(i));
        } else {
            kx5.m7731r0("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m12762a(int i) {
        int i2 = this.f34642d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f34639a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m12763b(Object obj) {
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f34642d;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.f34639a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (z62.m13387o(this.f34640b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    /* JADX INFO: renamed from: c */
    public final float m12764c(Object obj) {
        int iM12763b = m12763b(obj);
        if (iM12763b >= 0) {
            return this.f34641c[iM12763b];
        }
        kx5.m7737u0("There is no key " + obj + " in the map");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final void m12765d(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, tv3.m11186c(i)) : 0;
        this.f34642d = iMax;
        if (iMax == 0) {
            jArr = tv3.f31472a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f34639a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f34644f = tv3.m11184a(this.f34642d) - this.f34643e;
        this.f34640b = new Object[iMax];
        this.f34641c = new float[iMax];
    }

    /* JADX INFO: renamed from: e */
    public final void m12766e(C0874lj c0874lj, float f) {
        long j;
        long j2;
        int i;
        int i2;
        long j3;
        int iNumberOfTrailingZeros;
        long[] jArr;
        Object[] objArr;
        float[] fArr;
        C0874lj c0874lj2 = c0874lj;
        int i3 = -862048943;
        int iHashCode = c0874lj2.hashCode() * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.f34642d;
        int i8 = i5 & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f34639a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = 1;
            int i13 = i9;
            int i14 = 0;
            long j4 = (((-i11) >> 63) & (jArr2[i10 + 1] << (64 - i11))) | (jArr2[i10] >>> i11);
            long j5 = i6;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (j6 - 72340172838076673L) & (~j6) & (-9187201950435737472L);
            while (j7 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i8) & i7;
                int i15 = i3;
                if (z62.m13387o(this.f34640b[iNumberOfTrailingZeros], c0874lj2)) {
                    break loop0;
                }
                j7 &= j7 - 1;
                i3 = i15;
            }
            int i16 = i3;
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                int iM12762a = m12762a(i5);
                long j8 = 255;
                if (this.f34644f != 0 || ((this.f34639a[iM12762a >> 3] >> ((iM12762a & 7) << 3)) & 255) == 254) {
                    j = j5;
                    j2 = 255;
                    i = 1;
                    i2 = 0;
                    j3 = 128;
                } else {
                    int i17 = this.f34642d;
                    if (i17 > 8) {
                        j3 = 128;
                        if (Long.compareUnsigned(((long) this.f34643e) * 32, ((long) i17) * 25) <= 0) {
                            long[] jArr3 = this.f34639a;
                            int i18 = this.f34642d;
                            Object[] objArr2 = this.f34640b;
                            float[] fArr2 = this.f34641c;
                            int i19 = (i18 + 7) >> 3;
                            int i20 = 0;
                            while (i20 < i19) {
                                long j9 = jArr3[i20] & (-9187201950435737472L);
                                jArr3[i20] = (-72340172838076674L) & ((~j9) + (j9 >>> 7));
                                i20++;
                                j8 = j8;
                                j5 = j5;
                            }
                            j = j5;
                            j2 = j8;
                            char c = 7;
                            int length = jArr3.length;
                            int i21 = length - 1;
                            int i22 = length - 2;
                            jArr3[i22] = (jArr3[i22] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[i21] = jArr3[0];
                            int i23 = 0;
                            while (i23 != i18) {
                                int i24 = i23 >> 3;
                                int i25 = (i23 & 7) << 3;
                                long j10 = (jArr3[i24] >> i25) & j2;
                                if (j10 != 128 && j10 == 254) {
                                    Object obj = objArr2[i23];
                                    int iHashCode2 = (obj != null ? obj.hashCode() : i14) * i16;
                                    int i26 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i27 = i26 >>> 7;
                                    int iM12762a2 = m12762a(i27);
                                    int i28 = i27 & i18;
                                    char c2 = c;
                                    if (((iM12762a2 - i28) & i18) / 8 == ((i23 - i28) & i18) / 8) {
                                        int i29 = i14;
                                        jArr3[i24] = (((long) (i26 & 127)) << i25) | (jArr3[i24] & (~(j2 << i25)));
                                        jArr3[jArr3.length - 1] = (jArr3[i29] & 72057594037927935L) | Long.MIN_VALUE;
                                        i23++;
                                        i12 = i12;
                                        c = c2;
                                        i14 = i29;
                                    } else {
                                        int i30 = i12;
                                        int i31 = i14;
                                        int i32 = iM12762a2 >> 3;
                                        long j11 = jArr3[i32];
                                        int i33 = (iM12762a2 & 7) << 3;
                                        if (((j11 >> i33) & j2) == 128) {
                                            objArr = objArr2;
                                            fArr = fArr2;
                                            jArr3[i32] = ((~(j2 << i33)) & j11) | (((long) (i26 & 127)) << i33);
                                            jArr3[i24] = (jArr3[i24] & (~(j2 << i25))) | (128 << i25);
                                            objArr[iM12762a2] = objArr[i23];
                                            objArr[i23] = null;
                                            fArr[iM12762a2] = fArr[i23];
                                            fArr[i23] = 0.0f;
                                        } else {
                                            objArr = objArr2;
                                            fArr = fArr2;
                                            jArr3[i32] = (((long) (i26 & 127)) << i33) | ((~(j2 << i33)) & j11);
                                            Object obj2 = objArr[iM12762a2];
                                            objArr[iM12762a2] = objArr[i23];
                                            objArr[i23] = obj2;
                                            float f2 = fArr[iM12762a2];
                                            fArr[iM12762a2] = fArr[i23];
                                            fArr[i23] = f2;
                                            i23--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i31] & 72057594037927935L) | Long.MIN_VALUE;
                                        i23++;
                                        i12 = i30;
                                        c = c2;
                                        i14 = i31;
                                        objArr2 = objArr;
                                        fArr2 = fArr;
                                    }
                                } else {
                                    i23++;
                                }
                            }
                            i = i12;
                            i2 = i14;
                            this.f34644f = tv3.m11184a(this.f34642d) - this.f34643e;
                        }
                        iM12762a = m12762a(i5);
                    } else {
                        j3 = 128;
                    }
                    j = j5;
                    j2 = 255;
                    i = 1;
                    i2 = 0;
                    int iM11185b = tv3.m11185b(this.f34642d);
                    long[] jArr4 = this.f34639a;
                    Object[] objArr3 = this.f34640b;
                    float[] fArr3 = this.f34641c;
                    int i34 = this.f34642d;
                    m12765d(iM11185b);
                    long[] jArr5 = this.f34639a;
                    Object[] objArr4 = this.f34640b;
                    float[] fArr4 = this.f34641c;
                    int i35 = this.f34642d;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr4[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j3) {
                            Object obj3 = objArr3[i36];
                            int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i16;
                            int i37 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM12762a3 = m12762a(i37 >>> 7);
                            jArr = jArr5;
                            long j12 = i37 & 127;
                            int i38 = iM12762a3 >> 3;
                            int i39 = (iM12762a3 & 7) << 3;
                            long j13 = (jArr[i38] & (~(255 << i39))) | (j12 << i39);
                            jArr[i38] = j13;
                            jArr[(((iM12762a3 - 7) & i35) + (i35 & 7)) >> 3] = j13;
                            objArr4[iM12762a3] = obj3;
                            fArr4[iM12762a3] = fArr3[i36];
                        } else {
                            jArr = jArr5;
                        }
                        i36++;
                        jArr5 = jArr;
                    }
                    iM12762a = m12762a(i5);
                }
                this.f34643e++;
                int i40 = this.f34644f;
                long[] jArr6 = this.f34639a;
                int i41 = iM12762a >> 3;
                long j14 = jArr6[i41];
                int i42 = (iM12762a & 7) << 3;
                if (((j14 >> i42) & j2) == j3) {
                    i2 = i;
                }
                this.f34644f = i40 - i2;
                int i43 = this.f34642d;
                long j15 = (j14 & (~(j2 << i42))) | (j << i42);
                jArr6[i41] = j15;
                jArr6[(((iM12762a - 7) & i43) + (i43 & 7)) >> 3] = j15;
                iNumberOfTrailingZeros = ~iM12762a;
                break;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
            c0874lj2 = c0874lj;
            i3 = i16;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.f34640b[iNumberOfTrailingZeros] = c0874lj;
        this.f34641c[iNumberOfTrailingZeros] = f;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0067 A[LOOP:0: B:14:0x0023->B:29:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x006a A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xv2)) {
            return false;
        }
        xv2 xv2Var = (xv2) obj;
        if (xv2Var.f34643e != this.f34643e) {
            return false;
        }
        Object[] objArr = this.f34640b;
        float[] fArr = this.f34641c;
        long[] jArr = this.f34639a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            float f = fArr[i4];
                            int iM12763b = xv2Var.m12763b(obj2);
                            if (iM12763b < 0 || f != xv2Var.f34641c[iM12763b]) {
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = this.f34640b;
        float[] fArr = this.f34641c;
        long[] jArr = this.f34639a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        iHashCode += Float.hashCode(fArr[i4]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.f34643e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f34640b;
        float[] fArr = this.f34641c;
        long[] jArr = this.f34639a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            float f = fArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(f);
                            i2++;
                            if (i2 < this.f34643e) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
