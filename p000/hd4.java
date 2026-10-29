package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class hd4 extends od4 {
    /* JADX INFO: renamed from: a0 */
    public static boolean m6335a0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence2 instanceof String) {
            if (m6343i0(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (m6341g0(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m6336b0(CharSequence charSequence, char c) {
        return m6342h0(charSequence, c, 0, 2) >= 0;
    }

    /* JADX INFO: renamed from: c0 */
    public static String m6337c0(int i, String str) {
        if (i < 0) {
            C1077qn.m9988n(c75.m3878j("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m6338d0(CharSequence charSequence, String str) {
        return charSequence instanceof String ? od4.m9038S((String) charSequence, str, false) : m6348n0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    /* JADX INFO: renamed from: e0 */
    public static int m6339e0(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: f0 */
    public static final int m6340f0(CharSequence charSequence, String str, int i, boolean z) {
        return (z || !(charSequence instanceof String)) ? m6341g0(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX INFO: renamed from: g0 */
    public static final int m6341g0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        p52 p52Var;
        CharSequence charSequence3 = charSequence2;
        int i3 = i;
        int i4 = i2;
        if (z2) {
            int iM6339e0 = m6339e0(charSequence);
            if (i3 > iM6339e0) {
                i3 = iM6339e0;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            p52Var = new p52(i3, i4, -1);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            p52Var = new r52(i3, i4, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i5 = p52Var.f27384c;
        int i6 = p52Var.f27383b;
        int i7 = p52Var.f27382a;
        if (z3 && (charSequence3 instanceof String)) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                int i8 = i7;
                while (true) {
                    String str = (String) charSequence3;
                    String str2 = (String) charSequence;
                    int length2 = str.length();
                    if (!(!z ? str.regionMatches(0, str2, i8, length2) : str.regionMatches(z, 0, str2, i8, length2))) {
                        if (i8 == i6) {
                            break;
                        }
                        i8 += i5;
                    } else {
                        return i8;
                    }
                }
            }
        } else if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            int i9 = i7;
            while (!m6348n0(charSequence3, 0, charSequence, i9, charSequence3.length(), z)) {
                if (i9 != i6) {
                    i9 += i5;
                    charSequence3 = charSequence2;
                }
            }
            return i9;
        }
        return -1;
    }

    /* JADX INFO: renamed from: h0 */
    public static int m6342h0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return !(charSequence instanceof String) ? m6344j0(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ int m6343i0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m6340f0(charSequence, str, i, z);
    }

    /* JADX INFO: renamed from: j0 */
    public static final int m6344j0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                ds3.m4667k("Array is empty.");
                return 0;
            }
            if (length == 1) {
                return ((String) charSequence).indexOf(cArr[0], i);
            }
            C1077qn.m9987m("Array has more than one element.");
            return 0;
        }
        if (i < 0) {
            i = 0;
        }
        int iM6339e0 = m6339e0(charSequence);
        if (i > iM6339e0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (y62.m12994x(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iM6339e0) {
                return -1;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static boolean m6345k0(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (!y62.m12944L(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l0 */
    public static int m6346l0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = m6339e0(charSequence);
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(cArr[0], i);
        }
        int iM6339e0 = m6339e0(charSequence);
        if (i > iM6339e0) {
            i = iM6339e0;
        }
        while (-1 < i) {
            if (y62.m12994x(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: m0 */
    public static String m6347m0(int i, String str) {
        CharSequence charSequenceSubSequence;
        if (i < 0) {
            C1077qn.m9987m(c75.m3878j("Desired length ", i, " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: n0 */
    public static final boolean m6348n0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!y62.m12994x(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o0 */
    public static String m6349o0(String str, String str2) {
        return od4.m9043X(str, str2, false) ? str.substring(str2.length()) : str;
    }

    /* JADX INFO: renamed from: p0 */
    public static StringBuilder m6350p0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        if (i2 < i) {
            xy4.m12792u(d55.m4367l("End index (", i2, ") is less than start index (", i, ")."));
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    /* JADX INFO: renamed from: q0 */
    public static final void m6351q0(int i) {
        if (i >= 0) {
            return;
        }
        C1077qn.m9988n(c75.m3877i(i, "Limit must be non-negative, but was "));
    }

    /* JADX INFO: renamed from: r0 */
    public static final List m6352r0(CharSequence charSequence, String str, int i) {
        m6351q0(i);
        int iM6340f0 = m6340f0(charSequence, str, 0, false);
        if (iM6340f0 == -1 || i == 1) {
            return Collections.singletonList(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iM6340f0).toString());
            length = str.length() + iM6340f0;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iM6340f0 = m6340f0(charSequence, str, length, false);
        } while (iM6340f0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: s0 */
    public static List m6353s0(CharSequence charSequence, String[] strArr, int i) {
        byte b = 2;
        int i2 = (i & 4) != 0 ? 0 : 2;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() > 0) {
                return m6352r0(charSequence, str, i2);
            }
        }
        m6351q0(i2);
        List listAsList = Arrays.asList(strArr);
        de0 de0Var = new de0(b);
        de0Var.f16999b = listAsList;
        VarHandle.storeStoreFence();
        iy0 iy0Var = new iy0(charSequence, i2, de0Var);
        C1041po c1041po = new C1041po(b);
        c1041po.f27850b = iy0Var;
        VarHandle.storeStoreFence();
        ArrayList arrayList = new ArrayList(ib0.m6717y0(c1041po, 10));
        Iterator it = iy0Var.iterator();
        while (true) {
            hy0 hy0Var = (hy0) it;
            if (!hy0Var.hasNext()) {
                return arrayList;
            }
            r52 r52Var = (r52) hy0Var.next();
            arrayList.add(charSequence.subSequence(r52Var.f27382a, r52Var.f27383b + 1).toString());
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static List m6354t0(String str, char[] cArr) {
        if (cArr.length == 1) {
            return m6352r0(str, String.valueOf(cArr[0]), 0);
        }
        m6351q0(0);
        u04 u04Var = new u04((byte) 6);
        u04Var.f31581b = cArr;
        VarHandle.storeStoreFence();
        iy0 iy0Var = new iy0(str, 0, u04Var);
        C1041po c1041po = new C1041po((byte) 2);
        c1041po.f27850b = iy0Var;
        VarHandle.storeStoreFence();
        ArrayList arrayList = new ArrayList(ib0.m6717y0(c1041po, 10));
        Iterator it = iy0Var.iterator();
        while (true) {
            hy0 hy0Var = (hy0) it;
            if (!hy0Var.hasNext()) {
                return arrayList;
            }
            r52 r52Var = (r52) hy0Var.next();
            arrayList.add(str.subSequence(r52Var.f27382a, r52Var.f27383b + 1).toString());
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static String m6355u0(char c, String str, String str2) {
        int iM6346l0 = m6346l0(str, c, 0, 6);
        return iM6346l0 == -1 ? str2 : str.substring(iM6346l0 + 1, str.length());
    }

    /* JADX INFO: renamed from: v0 */
    public static String m6356v0(String str, char c) {
        int iM6346l0 = m6346l0(str, c, 0, 6);
        return iM6346l0 == -1 ? str : str.substring(0, iM6346l0);
    }

    /* JADX INFO: renamed from: w0 */
    public static CharSequence m6357w0(CharSequence charSequence, int i) {
        if (i < 0) {
            C1077qn.m9988n(c75.m3878j("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = charSequence.length();
        if (i > length) {
            i = length;
        }
        return charSequence.subSequence(0, i);
    }

    /* JADX INFO: renamed from: x0 */
    public static String m6358x0(int i, String str) {
        if (i < 0) {
            C1077qn.m9988n(c75.m3878j("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    /* JADX INFO: renamed from: y0 */
    public static Boolean m6359y0(String str) {
        if (str.equals("true")) {
            return Boolean.TRUE;
        }
        if (str.equals("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX INFO: renamed from: z0 */
    public static CharSequence m6360z0(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM12944L = y62.m12944L(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zM12944L) {
                    break;
                }
                length--;
            } else if (zM12944L) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }
}
