package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cz1 {

    /* JADX INFO: renamed from: a */
    public String f16629a;

    /* JADX INFO: renamed from: d */
    public String f16632d;

    /* JADX INFO: renamed from: f */
    public final ArrayList f16634f;

    /* JADX INFO: renamed from: g */
    public ArrayList f16635g;

    /* JADX INFO: renamed from: h */
    public String f16636h;

    /* JADX INFO: renamed from: b */
    public String f16630b = "";

    /* JADX INFO: renamed from: c */
    public String f16631c = "";

    /* JADX INFO: renamed from: e */
    public int f16633e = -1;

    public cz1() {
        ArrayList arrayList = new ArrayList();
        this.f16634f = arrayList;
        arrayList.add("");
    }

    /* JADX INFO: renamed from: a */
    public final dz1 m4238a() {
        ArrayList arrayList;
        String str = this.f16629a;
        if (str == null) {
            C1077qn.m9989o("scheme == null");
            return null;
        }
        String strM9728k = q50.m9728k(0, 0, 7, this.f16630b);
        String strM9728k2 = q50.m9728k(0, 0, 7, this.f16631c);
        String str2 = this.f16632d;
        if (str2 == null) {
            C1077qn.m9989o("host == null");
            return null;
        }
        int iM4239b = m4239b();
        ArrayList arrayList2 = this.f16634f;
        ArrayList arrayList3 = new ArrayList(ib0.m6717y0(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(q50.m9728k(0, 0, 7, (String) obj));
        }
        ArrayList arrayList4 = this.f16635g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(ib0.m6717y0(arrayList4, 10));
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                String str3 = (String) obj2;
                arrayList.add(str3 != null ? q50.m9728k(0, 0, 3, str3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f16636h;
        String strM9728k3 = str4 != null ? q50.m9728k(0, 0, 7, str4) : null;
        String string = toString();
        dz1 dz1Var = new dz1();
        dz1Var.f17518a = str;
        dz1Var.f17519b = strM9728k;
        dz1Var.f17520c = strM9728k2;
        dz1Var.f17521d = str2;
        dz1Var.f17522e = iM4239b;
        dz1Var.f17523f = arrayList;
        dz1Var.f17524g = strM9728k3;
        dz1Var.f17525h = string;
        dz1Var.f17526i = str.equals("https");
        VarHandle.storeStoreFence();
        return dz1Var;
    }

    /* JADX INFO: renamed from: b */
    public final int m4239b() {
        int i = this.f16633e;
        if (i != -1) {
            return i;
        }
        String str = this.f16629a;
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0023  */
    /* JADX INFO: renamed from: c */
    public final void m4240c(dz1 dz1Var, String str) {
        int i;
        String str2;
        int i2;
        int iM13810e;
        int i3;
        int i4;
        char cCharAt;
        String str3 = str;
        byte[] bArr = zv4.f36415a;
        int iM13817l = zv4.m13817l(0, str3, str3.length());
        int iM13818m = zv4.m13818m(iM13817l, str3, str3.length());
        byte b = -1;
        if (iM13818m - iM13817l >= 2) {
            char cCharAt2 = str3.charAt(iM13817l);
            if ((z62.m13393u(cCharAt2, 97) >= 0 && z62.m13393u(cCharAt2, 122) <= 0) || (z62.m13393u(cCharAt2, 65) >= 0 && z62.m13393u(cCharAt2, 90) <= 0)) {
                int i5 = iM13817l + 1;
                while (true) {
                    if (i5 < iM13818m) {
                        char cCharAt3 = str3.charAt(i5);
                        if (('a' <= cCharAt3 && cCharAt3 < '{') || (('A' <= cCharAt3 && cCharAt3 < '[') || (('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                            i5++;
                        } else if (cCharAt3 == ':') {
                            i = i5;
                            break;
                        }
                    }
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
        } else {
            i = -1;
            break;
        }
        int i6 = 1;
        if (i != -1) {
            str2 = "https";
            if (str3.regionMatches(true, iM13817l, "https:", 0, 6)) {
                this.f16629a = str2;
                iM13817l += 6;
                str3 = str;
            } else {
                str3 = str;
                if (!str3.regionMatches(true, iM13817l, "http:", 0, 5)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str3.substring(0, i) + '\'');
                }
                this.f16629a = "http";
                iM13817l += 5;
            }
        } else {
            str2 = "https";
            if (dz1Var == null) {
                C1077qn.m9987m("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str3.length() > 6 ? hd4.m6358x0(6, str3).concat("...") : str3));
                return;
            }
            this.f16629a = dz1Var.f17518a;
        }
        int i7 = iM13817l;
        int i8 = 0;
        while (true) {
            i2 = i6;
            if (i7 >= iM13818m || !((cCharAt = str3.charAt(i7)) == '\\' || cCharAt == '/')) {
                break;
            }
            i8++;
            i7++;
            i6 = i2;
        }
        ArrayList arrayList = this.f16634f;
        byte b2 = 35;
        if (i8 >= 2 || dz1Var == null || !z62.m13387o(dz1Var.f17518a, this.f16629a)) {
            int i9 = iM13817l + i8;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                iM13810e = zv4.m13810e(i9, iM13818m, str3, "@/\\?#");
                byte bCharAt = iM13810e != iM13818m ? str3.charAt(iM13810e) : b;
                if (bCharAt == b || bCharAt == b2 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (i10 == 0) {
                        int iM13811f = zv4.m13811f(str3, ':', i9, iM13810e);
                        String strM9725g = q50.m9725g(str3, i9, iM13811f, " \"':;<=>@[]^`{}|/\\?#", 240);
                        if (i11 != 0) {
                            strM9725g = zi4.m13623w(new StringBuilder(this.f16630b), "%40", strM9725g);
                        }
                        this.f16630b = strM9725g;
                        if (iM13811f != iM13810e) {
                            this.f16631c = q50.m9725g(str3, iM13811f + 1, iM13810e, " \"':;<=>@[]^`{}|/\\?#", 240);
                            i10 = i2;
                        }
                        i11 = i2;
                    } else {
                        this.f16631c += "%40" + q50.m9725g(str3, i9, iM13810e, " \"':;<=>@[]^`{}|/\\?#", 240);
                    }
                    i9 = iM13810e + 1;
                    b = -1;
                    b2 = 35;
                }
            }
            int i12 = i9;
            while (true) {
                if (i12 >= iM13810e) {
                    i12 = iM13810e;
                    break;
                }
                char cCharAt4 = str3.charAt(i12);
                if (cCharAt4 == '[') {
                    do {
                        i12++;
                        if (i12 >= iM13810e) {
                            break;
                        }
                    } while (str3.charAt(i12) != ']');
                } else if (cCharAt4 == ':') {
                    break;
                }
                i12++;
            }
            int i13 = i12 + 1;
            if (i13 < iM13810e) {
                this.f16632d = lb5.m7916Y(q50.m9728k(i9, i12, 4, str3));
                try {
                    i4 = Integer.parseInt(q50.m9725g(str3, i13, iM13810e, "", 248));
                    if (i2 > i4 || i4 >= 65536) {
                        i4 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.f16633e = i4;
                if (i4 == -1) {
                    throw new IllegalArgumentException(("Invalid URL port: \"" + str3.substring(i13, iM13810e) + '\"').toString());
                }
            } else {
                this.f16632d = lb5.m7916Y(q50.m9728k(i9, i12, 4, str3));
                String str4 = this.f16629a;
                if (str4.equals("http")) {
                    i3 = 80;
                } else {
                    i3 = str4.equals(str2) ? 443 : -1;
                }
                this.f16633e = i3;
            }
            if (this.f16632d == null) {
                throw new IllegalArgumentException(("Invalid URL host: \"" + str3.substring(i9, i12) + '\"').toString());
            }
            iM13817l = iM13810e;
        } else {
            this.f16630b = dz1Var.m4809e();
            this.f16631c = dz1Var.m4805a();
            this.f16632d = dz1Var.f17521d;
            this.f16633e = dz1Var.f17522e;
            arrayList.clear();
            arrayList.addAll(dz1Var.m4807c());
            if (iM13817l == iM13818m || str3.charAt(iM13817l) == '#') {
                String strM4808d = dz1Var.m4808d();
                this.f16635g = strM4808d != null ? q50.m9729m(q50.m9725g(strM4808d, 0, 0, " \"'<>#", 211)) : null;
            }
        }
        int iM13810e2 = zv4.m13810e(iM13817l, iM13818m, str3, "?#");
        if (iM13817l != iM13810e2) {
            char cCharAt5 = str3.charAt(iM13817l);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add("");
                iM13817l++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (iM13817l < iM13810e2) {
                int iM13810e3 = zv4.m13810e(iM13817l, iM13810e2, str3, "/\\");
                boolean z = iM13810e3 < iM13810e2;
                String strM9725g2 = q50.m9725g(str3, iM13817l, iM13810e3, " \"<>^`{}|/\\?#", 240);
                if (!strM9725g2.equals(".") && !strM9725g2.equalsIgnoreCase("%2e")) {
                    if (!strM9725g2.equals("..") && !strM9725g2.equalsIgnoreCase("%2e.") && !strM9725g2.equalsIgnoreCase(".%2e") && !strM9725g2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strM9725g2);
                        } else {
                            arrayList.add(strM9725g2);
                        }
                        if (z) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                iM13817l = z ? iM13810e3 + 1 : iM13810e3;
            }
        }
        if (iM13810e2 < iM13818m && str3.charAt(iM13810e2) == '?') {
            int iM13811f2 = zv4.m13811f(str3, '#', iM13810e2, iM13818m);
            this.f16635g = q50.m9729m(q50.m9725g(str3, iM13810e2 + 1, iM13811f2, " \"'<>#", 208));
            iM13810e2 = iM13811f2;
        }
        if (iM13810e2 >= iM13818m || str3.charAt(iM13810e2) != '#') {
            return;
        }
        this.f16636h = q50.m9725g(str3, iM13810e2 + 1, iM13818m, "", 176);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f16629a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f16630b.length() > 0 || this.f16631c.length() > 0) {
            sb.append(this.f16630b);
            if (this.f16631c.length() > 0) {
                sb.append(':');
                sb.append(this.f16631c);
            }
            sb.append('@');
        }
        String str2 = this.f16632d;
        if (str2 != null) {
            if (hd4.m6336b0(str2, ':')) {
                sb.append('[');
                sb.append(this.f16632d);
                sb.append(']');
            } else {
                sb.append(this.f16632d);
            }
        }
        int i = -1;
        if (this.f16633e != -1 || this.f16629a != null) {
            int iM4239b = m4239b();
            String str3 = this.f16629a;
            if (str3 == null) {
                sb.append(':');
                sb.append(iM4239b);
            } else {
                if (str3.equals("http")) {
                    i = 80;
                } else if (str3.equals("https")) {
                    i = 443;
                }
                if (iM4239b != i) {
                    sb.append(':');
                    sb.append(iM4239b);
                }
            }
        }
        ArrayList arrayList = this.f16634f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) arrayList.get(i2));
        }
        if (this.f16635g != null) {
            sb.append('?');
            q50.m9730n(this.f16635g, sb);
        }
        if (this.f16636h != null) {
            sb.append('#');
            sb.append(this.f16636h);
        }
        return sb.toString();
    }
}
