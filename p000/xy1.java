package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class xy1 {
    static {
        new s50("\"\\".getBytes(z80.f35863a)).f29914c = "\"\\";
        new s50("\t ,=".getBytes(z80.f35863a)).f29914c = "\t ,=";
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m12774a(xo3 xo3Var) {
        if (z62.m13387o(xo3Var.f34494a.f15463b, "HEAD")) {
            return false;
        }
        int i = xo3Var.f34497d;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || zv4.m13814i(xo3Var) != -1) {
            return true;
        }
        String strM11657a = xo3Var.f34499f.m11657a("Transfer-Encoding");
        if (strM11657a == null) {
            strM11657a = null;
        }
        return "chunked".equalsIgnoreCase(strM11657a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m12775b(ig1 ig1Var, dz1 dz1Var, uv1 uv1Var) {
        int i;
        tn0 tn0Var;
        long j;
        String strSubstring;
        if (ig1Var == ig1.f21394r) {
            return;
        }
        Pattern pattern = tn0.f31243j;
        int size = uv1Var.size();
        int i2 = 0;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < size; i3++) {
            if ("Set-Cookie".equalsIgnoreCase(uv1Var.m11658b(i3))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(uv1Var.m11660d(i3));
            }
        }
        List listUnmodifiableList = v71.f32439a;
        List listUnmodifiableList2 = arrayList != null ? Collections.unmodifiableList(arrayList) : listUnmodifiableList;
        int size2 = listUnmodifiableList2.size();
        int i4 = 0;
        ArrayList arrayList2 = null;
        while (i4 < size2) {
            String str = (String) listUnmodifiableList2.get(i4);
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = zv4.f36415a;
            char c = ';';
            int iM13811f = zv4.m13811f(str, ';', i2, str.length());
            char c2 = '=';
            int iM13811f2 = zv4.m13811f(str, '=', i2, iM13811f);
            if (iM13811f2 == iM13811f) {
                i = i2;
                tn0Var = null;
                break;
            }
            int iM13817l = zv4.m13817l(i2, str, iM13811f2);
            String strSubstring2 = str.substring(iM13817l, zv4.m13818m(iM13817l, str, iM13811f2));
            if (strSubstring2.length() == 0 || zv4.m13816k(strSubstring2) != -1) {
                i = i2;
                tn0Var = null;
                break;
            }
            int iM13817l2 = zv4.m13817l(iM13811f2 + 1, str, iM13811f);
            String strSubstring3 = str.substring(iM13817l2, zv4.m13818m(iM13817l2, str, iM13811f));
            if (zv4.m13816k(strSubstring3) == -1) {
                int i5 = iM13811f + 1;
                int length = str.length();
                int i6 = i2;
                int i7 = i6;
                int i8 = i7;
                long j2 = -1;
                long jM11827K = 253402300799999L;
                String str2 = null;
                String str3 = null;
                boolean z = true;
                while (true) {
                    if (i5 >= length) {
                        if (j2 == Long.MIN_VALUE) {
                            j = Long.MIN_VALUE;
                        } else if (j2 != -1) {
                            long j3 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * 1000 : Long.MAX_VALUE);
                            j = (j3 < jCurrentTimeMillis || j3 > 253402300799999L) ? 253402300799999L : j3;
                        } else {
                            j = jM11827K;
                        }
                        String str4 = dz1Var.f17521d;
                        if (str2 == null) {
                            str2 = str4;
                        } else if (!z62.m13387o(str4, str2) && (!od4.m9038S(str4, str2, false) || str4.charAt((str4.length() - str2.length()) - 1) != '.' || zv4.f36420f.m4046b(str4))) {
                            i = 0;
                        }
                        if (str4.length() != str2.length() && PublicSuffixDatabase.f26833g.m9166a(str2) == null) {
                            tn0Var = null;
                            i = 0;
                            break;
                        }
                        String strSubstring4 = str3;
                        i = 0;
                        if (strSubstring4 == null || !od4.m9043X(strSubstring4, "/", false)) {
                            String strM4806b = dz1Var.m4806b();
                            int iM6346l0 = hd4.m6346l0(strM4806b, '/', 0, 6);
                            strSubstring4 = iM6346l0 != 0 ? strM4806b.substring(0, iM6346l0) : "/";
                        }
                        tn0Var = new tn0();
                        tn0Var.f31247a = strSubstring2;
                        tn0Var.f31248b = strSubstring3;
                        tn0Var.f31249c = j;
                        tn0Var.f31250d = str2;
                        tn0Var.f31251e = strSubstring4;
                        tn0Var.f31252f = i8;
                        tn0Var.f31253g = i6;
                        tn0Var.f31254h = i7;
                        tn0Var.f31255i = z;
                        VarHandle.storeStoreFence();
                        break;
                    }
                    int iM13811f3 = zv4.m13811f(str, c, i5, length);
                    int iM13811f4 = zv4.m13811f(str, c2, i5, iM13811f3);
                    int iM13817l3 = zv4.m13817l(i5, str, iM13811f4);
                    String strSubstring5 = str.substring(iM13817l3, zv4.m13818m(iM13817l3, str, iM13811f4));
                    if (iM13811f4 < iM13811f3) {
                        int iM13817l4 = zv4.m13817l(iM13811f4 + 1, str, iM13811f3);
                        strSubstring = str.substring(iM13817l4, zv4.m13818m(iM13817l4, str, iM13811f3));
                    } else {
                        strSubstring = "";
                    }
                    if (strSubstring5.equalsIgnoreCase("expires")) {
                        try {
                            jM11827K = vd6.m11827K(strSubstring.length(), strSubstring);
                            i7 = 1;
                        } catch (NumberFormatException | IllegalArgumentException unused) {
                        }
                    } else if (strSubstring5.equalsIgnoreCase("max-age")) {
                        try {
                            long j4 = Long.parseLong(strSubstring);
                            j2 = j4 <= 0 ? Long.MIN_VALUE : j4;
                        } catch (NumberFormatException e) {
                            if (!Pattern.compile("-?\\d+").matcher(strSubstring).matches()) {
                                throw e;
                            }
                            j2 = od4.m9043X(strSubstring, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                        }
                        i7 = 1;
                    } else if (strSubstring5.equalsIgnoreCase("domain")) {
                        if (od4.m9038S(strSubstring, ".", false)) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                        String strM7916Y = lb5.m7916Y(hd4.m6349o0(strSubstring, "."));
                        if (strM7916Y == null) {
                            throw new IllegalArgumentException();
                        }
                        str2 = strM7916Y;
                        z = false;
                    } else if (strSubstring5.equalsIgnoreCase("path")) {
                        str3 = strSubstring;
                    } else if (strSubstring5.equalsIgnoreCase("secure")) {
                        i8 = 1;
                    } else if (strSubstring5.equalsIgnoreCase("httponly")) {
                        i6 = 1;
                    }
                    i5 = iM13811f3 + 1;
                    c = ';';
                    c2 = '=';
                }
            } else {
                i = i2;
            }
            tn0Var = null;
            break;
            if (tn0Var != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(tn0Var);
            }
            i4++;
            i2 = i;
        }
        if (arrayList2 != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        }
        listUnmodifiableList.isEmpty();
    }
}
