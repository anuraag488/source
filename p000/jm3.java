package p000;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jm3 implements Map, Serializable {

    /* JADX INFO: renamed from: h */
    public static final jm3 f22422h;

    /* JADX INFO: renamed from: i */
    public static final jm3 f22423i;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22424a;

    /* JADX INFO: renamed from: b */
    public final transient Object f22425b;

    /* JADX INFO: renamed from: c */
    public final transient Object[] f22426c;

    /* JADX INFO: renamed from: d */
    public final transient int f22427d;

    /* JADX INFO: renamed from: e */
    public transient AbstractCollection f22428e;

    /* JADX INFO: renamed from: f */
    public transient AbstractCollection f22429f;

    /* JADX INFO: renamed from: g */
    public transient AbstractCollection f22430g;

    static {
        int i = 0;
        Object obj = null;
        f22422h = new jm3(obj, new Object[0], i, (byte) 0);
        f22423i = new jm3(obj, new Object[0], i, (byte) 1);
    }

    public /* synthetic */ jm3(Object obj, Object[] objArr, int i, byte b) {
        this.f22424a = b;
        this.f22425b = obj;
        this.f22426c = objArr;
        this.f22427d = i;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b2 A[PHI: r5 r16 r17
  0x00b2: PHI (r5v6 ??) = (r5v2 ??), (r5v4 short[]), (r5v8 ??) binds: [B:67:0x0173, B:50:0x0112, B:32:0x00a6] A[DONT_GENERATE, DONT_INLINE]
  0x00b2: PHI (r16v1 int) = (r16v0 int), (r16v0 int), (r16v3 int) binds: [B:67:0x0173, B:50:0x0112, B:32:0x00a6] A[DONT_GENERATE, DONT_INLINE]
  0x00b2: PHI (r17v1 char) = (r17v0 char), (r17v0 char), (r17v3 char) binds: [B:67:0x0173, B:50:0x0112, B:32:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX INFO: renamed from: a */
    public static jm3 m7185a(int i, Object[] objArr, C0795je c0795je) {
        int i2;
        char c;
        short[] sArr;
        ?? r6;
        int i3;
        int i4 = i;
        Object[] objArrCopyOf = objArr;
        if (i4 == 0) {
            return f22422h;
        }
        v12 v12Var = null;
        ?? r3 = 0;
        v12 v12Var2 = null;
        v12 v12Var3 = null;
        byte b = 0;
        int i5 = 1;
        if (i4 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new jm3(v12Var, objArrCopyOf, i5, b);
        }
        dt0.m4720v(i4, objArrCopyOf.length >> 1);
        int iM12456m = x12.m12456m(i4);
        if (i4 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            i2 = 1;
            c = 2;
        } else {
            int i6 = iM12456m - 1;
            byte b2 = -1;
            if (iM12456m <= 128) {
                byte[] bArr = new byte[iM12456m];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i7 * 2;
                    int i10 = i8 * 2;
                    Object obj = objArrCopyOf[i9];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i9 ^ i5];
                    Objects.requireNonNull(obj2);
                    int iM7371E = k43.m7371E(obj.hashCode());
                    while (true) {
                        int i11 = iM7371E & i6;
                        i3 = i5;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i10;
                            if (i8 < i7) {
                                objArrCopyOf[i10] = obj;
                                objArrCopyOf[i10 ^ 1] = obj2;
                            }
                            i8++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i12 == true ? 1 : 0])) {
                            int i13 = ~i12;
                            Object obj3 = objArrCopyOf[i13 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            v12Var2 = new v12(obj, obj2, obj3);
                            objArrCopyOf[i13 == true ? 1 : 0] = obj2;
                            break;
                        }
                        iM7371E = i11 + 1;
                        i5 = i3;
                    }
                    i7++;
                    i5 = i3;
                }
                i2 = i5;
                c = 2;
                r6 = bArr;
                if (i8 == i4) {
                    r3 = r6;
                } else {
                    sArr = new Object[3];
                    sArr[0] = bArr;
                    sArr[i2] = Integer.valueOf(i8);
                    sArr[2] = v12Var2;
                    r3 = sArr;
                }
            } else {
                i2 = 1;
                c = 2;
                if (iM12456m <= 32768) {
                    sArr = new short[iM12456m];
                    Arrays.fill(sArr, (short) -1);
                    int i14 = 0;
                    for (int i15 = 0; i15 < i4; i15++) {
                        int i16 = i15 * 2;
                        int i17 = i14 * 2;
                        Object obj4 = objArrCopyOf[i16];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i16 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iM7371E2 = k43.m7371E(obj4.hashCode());
                        while (true) {
                            int i18 = iM7371E2 & i6;
                            int i19 = sArr[i18] & 65535;
                            if (i19 == 65535) {
                                sArr[i18] = (short) i17;
                                if (i14 < i15) {
                                    objArrCopyOf[i17] = obj4;
                                    objArrCopyOf[i17 ^ 1] = obj5;
                                }
                                i14++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[i19 == true ? 1 : 0])) {
                                int i20 = ~i19;
                                Object obj6 = objArrCopyOf[i20 == true ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                v12Var3 = new v12(obj4, obj5, obj6);
                                objArrCopyOf[i20 == true ? 1 : 0] = obj5;
                                break;
                            }
                            iM7371E2 = i18 + 1;
                        }
                    }
                    if (i14 == i4) {
                        r3 = sArr;
                    } else {
                        r6 = new Object[]{sArr, Integer.valueOf(i14), v12Var3};
                        r3 = r6;
                    }
                } else {
                    sArr = new int[iM12456m];
                    Arrays.fill((int[]) sArr, -1);
                    int i21 = 0;
                    int i22 = 0;
                    while (i21 < i4) {
                        int i23 = i21 * 2;
                        int i24 = i22 * 2;
                        Object obj7 = objArrCopyOf[i23];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i23 ^ 1];
                        Objects.requireNonNull(obj8);
                        int iM7371E3 = k43.m7371E(obj7.hashCode());
                        while (true) {
                            int i25 = iM7371E3 & i6;
                            ?? r15 = sArr[i25];
                            if (r15 == b2) {
                                sArr[i25] = i24;
                                if (i22 < i21) {
                                    objArrCopyOf[i24] = obj7;
                                    objArrCopyOf[i24 ^ 1] = obj8;
                                }
                                i22++;
                                break;
                            }
                            if (obj7.equals(objArrCopyOf[r15])) {
                                int i26 = r15 ^ 1;
                                Object obj9 = objArrCopyOf[i26 == true ? 1 : 0];
                                Objects.requireNonNull(obj9);
                                v12Var = new v12(obj7, obj8, obj9);
                                objArrCopyOf[i26 == true ? 1 : 0] = obj8;
                                break;
                            }
                            iM7371E3 = i25 + 1;
                            b2 = -1;
                        }
                        i21++;
                        b2 = -1;
                    }
                    if (i22 == i4) {
                        r3 = sArr;
                    } else {
                        r6 = new Object[]{sArr, Integer.valueOf(i22), v12Var};
                        r3 = r6;
                    }
                }
            }
        }
        boolean z = r3 instanceof Object[];
        ?? r4 = r3;
        if (z) {
            Object[] objArr2 = (Object[]) r3;
            v12 v12Var4 = (v12) objArr2[c];
            if (c0795je == null) {
                throw v12Var4.m11694a();
            }
            c0795je.f22195d = v12Var4;
            Object obj10 = objArr2[0];
            int iIntValue = ((Integer) objArr2[i2]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
            r4 = obj10;
            i4 = iIntValue;
        }
        return new jm3(r4, objArrCopyOf, i4, b);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b4 A[PHI: r4 r16 r17
  0x00b4: PHI (r4v6 ??) = (r4v2 ??), (r4v4 short[]), (r4v8 ??) binds: [B:67:0x0177, B:50:0x0115, B:32:0x00a8] A[DONT_GENERATE, DONT_INLINE]
  0x00b4: PHI (r16v1 boolean) = (r16v0 boolean), (r16v0 boolean), (r16v3 boolean) binds: [B:67:0x0177, B:50:0x0115, B:32:0x00a8] A[DONT_GENERATE, DONT_INLINE]
  0x00b4: PHI (r17v1 char) = (r17v0 char), (r17v0 char), (r17v3 char) binds: [B:67:0x0177, B:50:0x0115, B:32:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX INFO: renamed from: c */
    public static jm3 m7186c(int i, Object[] objArr, C0795je c0795je) {
        boolean z;
        char c;
        short[] sArr;
        boolean z2;
        ?? r6;
        boolean z3;
        ?? r16;
        int i2 = i;
        Object[] objArrCopyOf = objArr;
        if (i2 == 0) {
            return f22423i;
        }
        vv5 vv5Var = null;
        ?? r3 = 0;
        vv5 vv5Var2 = null;
        vv5 vv5Var3 = null;
        boolean z4 = false;
        byte b = 1;
        if (i2 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new jm3(vv5Var, objArrCopyOf, b, b);
        }
        nt5.m8847c(i2, objArrCopyOf.length >> 1);
        int iM3749l = bw5.m3749l(i2);
        if (i2 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            r16 = 0;
            i2 = 1;
            c = 2;
        } else {
            int i3 = iM3749l - 1;
            byte b2 = -1;
            if (iM3749l <= 128) {
                byte[] bArr = new byte[iM3749l];
                Arrays.fill(bArr, (byte) -1);
                int i4 = 0;
                int i5 = 0;
                while (i4 < i2) {
                    int i6 = i5 + i5;
                    int i7 = i4 + i4;
                    Object obj = objArrCopyOf[i7];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i7 ^ 1];
                    Objects.requireNonNull(obj2);
                    int iM8113a = lu5.m8113a(obj.hashCode());
                    while (true) {
                        int i8 = iM8113a & i3;
                        z3 = z4;
                        int i9 = bArr[i8] & 255;
                        if (i9 == 255) {
                            bArr[i8] = (byte) i6;
                            if (i5 < i4) {
                                objArrCopyOf[i6] = obj;
                                objArrCopyOf[i6 ^ 1] = obj2;
                            }
                            i5++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i9 == true ? 1 : 0])) {
                            int i10 = ~i9;
                            Object obj3 = objArrCopyOf[i10 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            vv5 vv5Var4 = new vv5(obj, obj2, obj3);
                            objArrCopyOf[i10 == true ? 1 : 0] = obj2;
                            vv5Var2 = vv5Var4;
                            break;
                        }
                        iM8113a = i8 + 1;
                        z4 = z3;
                    }
                    i4++;
                    z4 = z3;
                }
                z = z4;
                c = 2;
                r6 = bArr;
                z2 = z;
                if (i5 == i2) {
                    r3 = r6;
                    r16 = z2;
                } else {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[1] = Integer.valueOf(i5);
                    sArr[2] = vv5Var2;
                    r3 = sArr;
                    r16 = z;
                }
            } else {
                z = false;
                c = 2;
                if (iM3749l <= 32768) {
                    sArr = new short[iM3749l];
                    Arrays.fill(sArr, (short) -1);
                    int i11 = 0;
                    for (int i12 = 0; i12 < i2; i12++) {
                        int i13 = i11 + i11;
                        int i14 = i12 + i12;
                        Object obj4 = objArrCopyOf[i14];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i14 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iM8113a2 = lu5.m8113a(obj4.hashCode());
                        while (true) {
                            int i15 = iM8113a2 & i3;
                            char c2 = (char) sArr[i15];
                            if (c2 == 65535) {
                                sArr[i15] = (short) i13;
                                if (i11 < i12) {
                                    objArrCopyOf[i13] = obj4;
                                    objArrCopyOf[i13 ^ 1] = obj5;
                                }
                                i11++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[c2])) {
                                int i16 = c2 ^ 1;
                                Object obj6 = objArrCopyOf[i16 == true ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                vv5 vv5Var5 = new vv5(obj4, obj5, obj6);
                                objArrCopyOf[i16 == true ? 1 : 0] = obj5;
                                vv5Var3 = vv5Var5;
                                break;
                            }
                            iM8113a2 = i15 + 1;
                        }
                    }
                    if (i11 == i2) {
                        r3 = sArr;
                        r16 = z;
                    } else {
                        r6 = new Object[]{sArr, Integer.valueOf(i11), vv5Var3};
                        z2 = z;
                        r3 = r6;
                        r16 = z2;
                    }
                } else {
                    sArr = new int[iM3749l];
                    Arrays.fill((int[]) sArr, -1);
                    int i17 = 0;
                    int i18 = 0;
                    while (i17 < i2) {
                        int i19 = i18 + i18;
                        int i20 = i17 + i17;
                        Object obj7 = objArrCopyOf[i20];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i20 ^ 1];
                        Objects.requireNonNull(obj8);
                        int iM8113a3 = lu5.m8113a(obj7.hashCode());
                        while (true) {
                            int i21 = iM8113a3 & i3;
                            ?? r15 = sArr[i21];
                            if (r15 == b2) {
                                sArr[i21] = i19;
                                if (i18 < i17) {
                                    objArrCopyOf[i19] = obj7;
                                    objArrCopyOf[i19 ^ 1] = obj8;
                                }
                                i18++;
                                break;
                            }
                            if (obj7.equals(objArrCopyOf[r15])) {
                                int i22 = r15 ^ 1;
                                Object obj9 = objArrCopyOf[i22 == true ? 1 : 0];
                                Objects.requireNonNull(obj9);
                                vv5 vv5Var6 = new vv5(obj7, obj8, obj9);
                                objArrCopyOf[i22 == true ? 1 : 0] = obj8;
                                vv5Var = vv5Var6;
                                break;
                            }
                            iM8113a3 = i21 + 1;
                            b2 = -1;
                        }
                        i17++;
                        b2 = -1;
                    }
                    if (i18 == i2) {
                        r3 = sArr;
                        r16 = z;
                    } else {
                        r6 = new Object[]{sArr, Integer.valueOf(i18), vv5Var};
                        z2 = z;
                        r3 = r6;
                        r16 = z2;
                    }
                }
            }
        }
        boolean z5 = r3 instanceof Object[];
        ?? r4 = r3;
        if (z5) {
            Object[] objArr2 = (Object[]) r3;
            vv5 vv5Var7 = (vv5) objArr2[c];
            if (c0795je == null) {
                throw vv5Var7.m11997a();
            }
            c0795je.f22195d = vv5Var7;
            Object obj10 = objArr2[r16];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r4 = obj10;
            i2 = iIntValue;
        }
        return new jm3(r4, objArrCopyOf, i2, b);
    }

    /* JADX INFO: renamed from: b */
    public x12 m7187b() {
        gm3 gm3Var = (gm3) this.f22428e;
        if (gm3Var != null) {
            return gm3Var;
        }
        gm3 gm3Var2 = new gm3(this, this.f22426c, this.f22427d);
        this.f22428e = gm3Var2;
        return gm3Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.f22424a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f22424a) {
            case 0:
                return get(obj) != null;
            default:
                return get(obj) != null;
        }
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.f22424a) {
            case 0:
                im3 im3Var = (im3) this.f22430g;
                if (im3Var == null) {
                    im3Var = new im3(this.f22426c, 1, this.f22427d);
                    this.f22430g = im3Var;
                }
                return im3Var.contains(obj);
            default:
                xw5 xw5Var = (xw5) this.f22430g;
                if (xw5Var == null) {
                    xw5Var = new xw5(this.f22426c, 1, this.f22427d);
                    this.f22430g = xw5Var;
                }
                return xw5Var.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.f22424a) {
            case 0:
                return m7187b();
            default:
                pw5 pw5Var = (pw5) this.f22428e;
                if (pw5Var != null) {
                    return pw5Var;
                }
                pw5 pw5Var2 = new pw5(this, this.f22426c, this.f22427d);
                this.f22428e = pw5Var2;
                return pw5Var2;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.f22424a) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return m7187b().equals(((Map) obj).entrySet());
                }
                return false;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:5:0x0016  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        byte b = this.f22424a;
        Object obj4 = this.f22425b;
        Object[] objArr = this.f22426c;
        int i = this.f22427d;
        switch (b) {
            case 0:
                if (obj == null) {
                    obj2 = null;
                } else if (i == 1) {
                    Object obj5 = objArr[0];
                    Objects.requireNonNull(obj5);
                    if (obj5.equals(obj)) {
                        obj2 = objArr[1];
                        Objects.requireNonNull(obj2);
                    } else {
                        obj2 = null;
                    }
                } else if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iM7371E = k43.m7371E(obj.hashCode());
                    while (true) {
                        int i2 = iM7371E & length;
                        int i3 = bArr[i2] & 255;
                        if (i3 != 255) {
                            if (obj.equals(objArr[i3])) {
                                obj2 = objArr[i3 ^ 1];
                            } else {
                                iM7371E = i2 + 1;
                            }
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iM7371E2 = k43.m7371E(obj.hashCode());
                    while (true) {
                        int i4 = iM7371E2 & length2;
                        int i5 = sArr[i4] & 65535;
                        if (i5 != 65535) {
                            if (obj.equals(objArr[i5])) {
                                obj2 = objArr[i5 ^ 1];
                            } else {
                                iM7371E2 = i4 + 1;
                            }
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iM7371E3 = k43.m7371E(obj.hashCode());
                    while (true) {
                        int i6 = iM7371E3 & length3;
                        int i7 = iArr[i6];
                        if (i7 != -1) {
                            if (obj.equals(objArr[i7])) {
                                obj2 = objArr[i7 ^ 1];
                            } else {
                                iM7371E3 = i6 + 1;
                            }
                        }
                    }
                    obj2 = null;
                }
                if (obj2 == null) {
                    return null;
                }
                return obj2;
            default:
                if (obj == null) {
                    obj3 = null;
                } else if (i == 1) {
                    Object obj6 = objArr[0];
                    Objects.requireNonNull(obj6);
                    if (obj6.equals(obj)) {
                        obj3 = objArr[1];
                        Objects.requireNonNull(obj3);
                    } else {
                        obj3 = null;
                    }
                } else if (obj4 == null) {
                    obj3 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj4;
                    int length4 = bArr2.length - 1;
                    int iM8113a = lu5.m8113a(obj.hashCode());
                    while (true) {
                        int i8 = iM8113a & length4;
                        int i9 = bArr2[i8] & 255;
                        if (i9 != 255) {
                            if (obj.equals(objArr[i9])) {
                                obj3 = objArr[i9 ^ 1];
                            } else {
                                iM8113a = i8 + 1;
                            }
                        }
                    }
                    obj3 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr2 = (short[]) obj4;
                    int length5 = sArr2.length - 1;
                    int iM8113a2 = lu5.m8113a(obj.hashCode());
                    while (true) {
                        int i10 = iM8113a2 & length5;
                        char c = (char) sArr2[i10];
                        if (c != 65535) {
                            if (obj.equals(objArr[c])) {
                                obj3 = objArr[c ^ 1];
                            } else {
                                iM8113a2 = i10 + 1;
                            }
                        }
                    }
                    obj3 = null;
                } else {
                    int[] iArr2 = (int[]) obj4;
                    int length6 = iArr2.length - 1;
                    int iM8113a3 = lu5.m8113a(obj.hashCode());
                    while (true) {
                        int i11 = iM8113a3 & length6;
                        int i12 = iArr2[i11];
                        if (i12 != -1) {
                            if (obj.equals(objArr[i12])) {
                                obj3 = objArr[i12 ^ 1];
                            } else {
                                iM8113a3 = i11 + 1;
                            }
                        }
                    }
                    obj3 = null;
                }
                if (obj3 == null) {
                    return null;
                }
                return obj3;
        }
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.f22424a) {
            case 0:
                Object obj3 = get(obj);
                return obj3 != null ? obj3 : obj2;
            default:
                Object obj4 = get(obj);
                return obj4 != null ? obj4 : obj2;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        switch (this.f22424a) {
            case 0:
                Iterator it = m7187b().iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    i = ~(~(i + (next != null ? next.hashCode() : 0)));
                }
                return i;
            default:
                pw5 pw5Var = (pw5) this.f22428e;
                if (pw5Var == null) {
                    pw5Var = new pw5(this, this.f22426c, this.f22427d);
                    this.f22428e = pw5Var;
                }
                Iterator it2 = pw5Var.iterator();
                int iHashCode = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    iHashCode += next2 != null ? next2.hashCode() : 0;
                }
                return iHashCode;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.f22424a) {
            case 0:
                return size() == 0;
            default:
                return size() == 0;
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.f22424a) {
            case 0:
                hm3 hm3Var = (hm3) this.f22429f;
                if (hm3Var != null) {
                    return hm3Var;
                }
                hm3 hm3Var2 = new hm3(this, new im3(this.f22426c, 0, this.f22427d));
                this.f22429f = hm3Var2;
                return hm3Var2;
            default:
                sw5 sw5Var = (sw5) this.f22429f;
                if (sw5Var != null) {
                    return sw5Var;
                }
                sw5 sw5Var2 = new sw5(this, new xw5(this.f22426c, 0, this.f22427d));
                this.f22429f = sw5Var2;
                return sw5Var2;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.f22424a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.f22424a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.f22424a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final int size() {
        switch (this.f22424a) {
            case 0:
                break;
        }
        return this.f22427d;
    }

    public final String toString() {
        boolean z = true;
        switch (this.f22424a) {
            case 0:
                int i = this.f22427d;
                y70.m13035o(i, "size");
                StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
                sb.append('{');
                ru4 ru4VarMo6038l = ((gm3) m7187b()).iterator();
                while (true) {
                    AbstractC0819k1 abstractC0819k1 = (AbstractC0819k1) ru4VarMo6038l;
                    if (!abstractC0819k1.hasNext()) {
                        sb.append('}');
                        return sb.toString();
                    }
                    Map.Entry entry = (Map.Entry) abstractC0819k1.next();
                    if (!z) {
                        sb.append(", ");
                    }
                    sb.append(entry.getKey());
                    sb.append('=');
                    sb.append(entry.getValue());
                    z = false;
                }
                break;
            default:
                int i2 = this.f22427d;
                if (i2 < 0) {
                    C1077qn.m9987m(c75.m3877i(i2, "size cannot be negative but was: "));
                    return null;
                }
                StringBuilder sb2 = new StringBuilder((int) Math.min(((long) i2) * 8, 1073741824L));
                sb2.append('{');
                for (Map.Entry entry2 : (pw5) entrySet()) {
                    if (!z) {
                        sb2.append(", ");
                    }
                    sb2.append(entry2.getKey());
                    sb2.append('=');
                    sb2.append(entry2.getValue());
                    z = false;
                }
                sb2.append('}');
                return sb2.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.f22424a) {
            case 0:
                im3 im3Var = (im3) this.f22430g;
                if (im3Var != null) {
                    return im3Var;
                }
                im3 im3Var2 = new im3(this.f22426c, 1, this.f22427d);
                this.f22430g = im3Var2;
                return im3Var2;
            default:
                xw5 xw5Var = (xw5) this.f22430g;
                if (xw5Var != null) {
                    return xw5Var;
                }
                xw5 xw5Var2 = new xw5(this.f22426c, 1, this.f22427d);
                this.f22430g = xw5Var2;
                return xw5Var2;
        }
    }
}
