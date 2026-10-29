package p000;

import ads_mobile_sdk.C0033as;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: oo */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0990oo extends zt5 {
    /* JADX INFO: renamed from: P */
    public static boolean m9195P(Object obj, Object[] objArr) {
        return m9210e0(obj, objArr) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0012 A[RETURN] */
    /* JADX INFO: renamed from: Q */
    public static boolean m9196Q(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (i == iArr[i2]) {
                if (i2 >= 0) {
                    return true;
                }
                return false;
            }
            i2++;
        }
        i2 = -1;
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: R */
    public static boolean m9197R(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!m9197R((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof ns4) && (obj2 instanceof ns4)) {
                            if (!Arrays.equals(((ns4) obj).f26071a, ((ns4) obj2).f26071a)) {
                            }
                        } else if ((obj instanceof ct4) && (obj2 instanceof ct4)) {
                            if (!Arrays.equals(((ct4) obj).f16465a, ((ct4) obj2).f16465a)) {
                            }
                        } else if ((obj instanceof ss4) && (obj2 instanceof ss4)) {
                            if (!Arrays.equals(((ss4) obj).f30546a, ((ss4) obj2).f30546a)) {
                            }
                        } else if ((obj instanceof xs4) && (obj2 instanceof xs4)) {
                            if (!Arrays.equals(((xs4) obj).f34598a, ((xs4) obj2).f34598a)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public static void m9198S(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: T */
    public static void m9199T(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: U */
    public static void m9200U(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: V */
    public static void m9201V(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        System.arraycopy(objArr, i, objArr2, 0, i2 - i);
    }

    /* JADX INFO: renamed from: W */
    public static void m9202W(byte[] bArr, byte[] bArr2, int i, int i2) {
        System.arraycopy(bArr, i, bArr2, 0, i2 - i);
    }

    /* JADX INFO: renamed from: X */
    public static void m9203X(float[] fArr, float[] fArr2, int i) {
        System.arraycopy(fArr, 0, fArr2, 0, (i & 8) != 0 ? fArr.length : 6);
    }

    /* JADX INFO: renamed from: Y */
    public static void m9204Y(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        System.arraycopy(iArr, 0, iArr2, i, i2);
    }

    /* JADX INFO: renamed from: Z */
    public static Object[] m9205Z(Object[] objArr, int i, int i2) {
        zt5.m13785p(i2, objArr.length);
        return Arrays.copyOfRange(objArr, i, i2);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m9206a0(Object obj, Object[] objArr) {
        Arrays.fill(objArr, 0, objArr.length, obj);
    }

    /* JADX INFO: renamed from: b0 */
    public static void m9207b0(int[] iArr, int i) {
        Arrays.fill(iArr, 0, iArr.length, i);
    }

    /* JADX INFO: renamed from: c0 */
    public static void m9208c0(long[] jArr, long j) {
        Arrays.fill(jArr, 0, jArr.length, j);
    }

    /* JADX INFO: renamed from: d0 */
    public static ArrayList m9209d0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e0 */
    public static int m9210e0(Object obj, Object[] objArr) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f0 */
    public static String m9211f0(byte[] bArr, String str, int i) {
        C0033as c0033as = C0033as.a$26;
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        if ((i & 32) != 0) {
            c0033as = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (byte b : bArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (c0033as != null) {
                sb.append((CharSequence) c0033as.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: g0 */
    public static String m9212g0(Object[] objArr, String str, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = (i & 2) != 0 ? "" : "innermostOf(";
        String str3 = (i & 4) == 0 ? ")" : "";
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            zc6.m13531p(sb, obj, null);
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: h0 */
    public static byte[] m9213h0(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m9214i0(Object[] objArr) {
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static List m9215j0(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? Arrays.asList(Arrays.copyOf(objArr, objArr.length)) : Collections.singletonList(objArr[0]);
        }
        return v71.f32439a;
    }

    /* JADX INFO: renamed from: k0 */
    public static Set m9216k0(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return b81.f15153a;
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(fq2.m5779K(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }
}
