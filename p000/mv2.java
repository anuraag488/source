package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mv2 {

    /* JADX INFO: renamed from: a */
    public long[] f25231a;

    /* JADX INFO: renamed from: b */
    public int[] f25232b;

    /* JADX INFO: renamed from: c */
    public int f25233c;

    /* JADX INFO: renamed from: d */
    public int f25234d;

    /* JADX INFO: renamed from: e */
    public int f25235e;

    public mv2(int i) {
        this.f25231a = tv3.f31472a;
        this.f25232b = v52.f32420a;
        if (i >= 0) {
            m8406d(tv3.m11187d(i));
        } else {
            kx5.m7731r0("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: a */
    public final boolean m8403a(int i) {
        long j;
        boolean z;
        long j2;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int[] iArr;
        int i2;
        int i3 = this.f25234d;
        int i4 = -862048943;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.f25233c;
        int i9 = i6 & i8;
        int i10 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f25231a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            boolean z2 = true;
            int i13 = i10;
            long j3 = (((-i12) >> 63) & (jArr2[i11 + 1] << (64 - i12))) | (jArr2[i11] >>> i12);
            long j4 = i7;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
            while (j6 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i9) & i8;
                int i14 = i4;
                if (this.f25232b[iNumberOfTrailingZeros] == i) {
                    z = true;
                    break loop0;
                }
                j6 &= j6 - 1;
                i4 = i14;
            }
            int i15 = i4;
            long j7 = j3 & ((~j3) << 6) & (-9187201950435737472L);
            char c = '\b';
            if (j7 != 0) {
                int iM8405c = m8405c(i6);
                long j8 = 255;
                if (this.f25235e != 0 || ((this.f25231a[iM8405c >> 3] >> ((iM8405c & 7) << 3)) & 255) == 254) {
                    j = 255;
                    z = true;
                    j2 = 128;
                } else {
                    int i16 = this.f25233c;
                    if (i16 > 8) {
                        j2 = 128;
                        if (Long.compareUnsigned(((long) this.f25234d) * 32, ((long) i16) * 25) <= 0) {
                            long[] jArr3 = this.f25231a;
                            int i17 = this.f25233c;
                            int[] iArr2 = this.f25232b;
                            int i18 = (i17 + 7) >> 3;
                            int i19 = 0;
                            while (i19 < i18) {
                                char c2 = c;
                                long j9 = jArr3[i19] & (-9187201950435737472L);
                                jArr3[i19] = (-72340172838076674L) & ((~j9) + (j9 >>> 7));
                                i19++;
                                j8 = j8;
                                c = c2;
                            }
                            j = j8;
                            int length = jArr3.length;
                            int i20 = length - 1;
                            int i21 = length - 2;
                            jArr3[i21] = (jArr3[i21] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[i20] = jArr3[0];
                            int i22 = 0;
                            while (i22 != i17) {
                                int i23 = i22 >> 3;
                                int i24 = (i22 & 7) << 3;
                                long j10 = (jArr3[i23] >> i24) & j;
                                if (j10 != 128 && j10 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i22]) * i15;
                                    int i25 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i26 = i25 >>> 7;
                                    int iM8405c2 = m8405c(i26);
                                    int i27 = i26 & i17;
                                    boolean z3 = z2;
                                    if (((iM8405c2 - i27) & i17) / 8 == ((i22 - i27) & i17) / 8) {
                                        iArr = iArr2;
                                        jArr3[i23] = ((~(j << i24)) & jArr3[i23]) | (((long) (i25 & 127)) << i24);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i22++;
                                    } else {
                                        iArr = iArr2;
                                        int i28 = i22;
                                        int i29 = iM8405c2 >> 3;
                                        long j11 = jArr3[i29];
                                        int i30 = (iM8405c2 & 7) << 3;
                                        if (((j11 >> i30) & j) == 128) {
                                            jArr3[i29] = (j11 & (~(j << i30))) | (((long) (i25 & 127)) << i30);
                                            jArr3[i23] = (jArr3[i23] & (~(j << i24))) | (128 << i24);
                                            iArr[iM8405c2] = iArr[i28];
                                            iArr[i28] = 0;
                                            i2 = i28;
                                        } else {
                                            jArr3[i29] = (((long) (i25 & 127)) << i30) | (j11 & (~(j << i30)));
                                            int i31 = iArr[iM8405c2];
                                            iArr[iM8405c2] = iArr[i28];
                                            iArr[i28] = i31;
                                            i2 = i28 - 1;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i22 = i2 + 1;
                                    }
                                    iArr2 = iArr;
                                    z2 = z3;
                                } else {
                                    i22++;
                                }
                            }
                            z = z2;
                            this.f25235e = tv3.m11184a(this.f25233c) - this.f25234d;
                        }
                        iM8405c = m8405c(i6);
                    } else {
                        j2 = 128;
                    }
                    j = 255;
                    z = true;
                    int iM11185b = tv3.m11185b(this.f25233c);
                    long[] jArr4 = this.f25231a;
                    int[] iArr3 = this.f25232b;
                    int i32 = this.f25233c;
                    m8406d(iM11185b);
                    long[] jArr5 = this.f25231a;
                    int[] iArr4 = this.f25232b;
                    int i33 = this.f25233c;
                    int i34 = 0;
                    while (i34 < i32) {
                        if (((jArr4[i34 >> 3] >> ((i34 & 7) << 3)) & 255) < j2) {
                            int i35 = iArr3[i34];
                            int iHashCode3 = Integer.hashCode(i35) * i15;
                            int i36 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM8405c3 = m8405c(i36 >>> 7);
                            jArr = jArr5;
                            long j12 = i36 & 127;
                            int i37 = iM8405c3 >> 3;
                            int i38 = (iM8405c3 & 7) << 3;
                            long j13 = (jArr[i37] & (~(255 << i38))) | (j12 << i38);
                            jArr[i37] = j13;
                            jArr[(((iM8405c3 - 7) & i33) + (i33 & 7)) >> 3] = j13;
                            iArr4[iM8405c3] = i35;
                        } else {
                            jArr = jArr5;
                        }
                        i34++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iM8405c = m8405c(i6);
                }
                iNumberOfTrailingZeros = iM8405c;
                this.f25234d++;
                int i39 = this.f25235e;
                long[] jArr6 = this.f25231a;
                int i40 = iNumberOfTrailingZeros >> 3;
                long j14 = jArr6[i40];
                int i41 = (iNumberOfTrailingZeros & 7) << 3;
                this.f25235e = i39 - (((j14 >> i41) & j) == j2 ? z : 0);
                int i42 = this.f25233c;
                long j15 = (j14 & (~(j << i41))) | (j4 << i41);
                jArr6[i40] = j15;
                jArr6[(((iNumberOfTrailingZeros - 7) & i42) + (i42 & 7)) >> 3] = j15;
                break;
            }
            i10 = i13 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i15;
        }
        this.f25232b[iNumberOfTrailingZeros] = i;
        if (this.f25234d != i3) {
            return z;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8404b(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f25233c;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f25231a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.f25232b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m8405c(int i) {
        int i2 = this.f25233c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f25231a;
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

    /* JADX INFO: renamed from: d */
    public final void m8406d(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, tv3.m11186c(i)) : 0;
        this.f25233c = iMax;
        if (iMax == 0) {
            jArr = tv3.f31472a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f25231a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f25235e = tv3.m11184a(this.f25233c) - this.f25234d;
        this.f25232b = new int[iMax];
    }

    /* JADX INFO: renamed from: e */
    public final boolean m8407e(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f25233c;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f25231a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.f25232b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            m8408f(iNumberOfTrailingZeros);
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[LOOP:0: B:14:0x001d->B:26:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mv2)) {
            return false;
        }
        mv2 mv2Var = (mv2) obj;
        if (mv2Var.f25234d != this.f25234d) {
            return false;
        }
        int[] iArr = this.f25232b;
        long[] jArr = this.f25231a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !mv2Var.m8404b(iArr[(i << 3) + i3])) {
                            return false;
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
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m8408f(int i) {
        this.f25234d--;
        long[] jArr = this.f25231a;
        int i2 = this.f25233c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    public final int hashCode() {
        int[] iArr = this.f25232b;
        long[] jArr = this.f25231a;
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
                        iHashCode = Integer.hashCode(iArr[(i << 3) + i3]) + iHashCode;
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

    /* JADX WARN: Code duplicated, block: B:20:0x0058 A[DONT_INVERT, PHI: r5
  0x0058: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:6:0x0021, B:19:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x005a A[LOOP:0: B:5:0x0013->B:21:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005d A[EDGE_INSN: B:26:0x005d->B:22:0x005d BREAK  A[LOOP:0: B:5:0x0013->B:21:0x005a], SYNTHETIC] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int[] iArr = this.f25232b;
        long[] jArr = this.f25231a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
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
                            int i5 = iArr[(i << 3) + i4];
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            sb.append(i5);
                            i2++;
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
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ mv2() {
        this(6);
    }
}
