package p000;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dz1 {

    /* JADX INFO: renamed from: j */
    public static final char[] f17517j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public String f17518a;

    /* JADX INFO: renamed from: b */
    public String f17519b;

    /* JADX INFO: renamed from: c */
    public String f17520c;

    /* JADX INFO: renamed from: d */
    public String f17521d;

    /* JADX INFO: renamed from: e */
    public int f17522e;

    /* JADX INFO: renamed from: f */
    public ArrayList f17523f;

    /* JADX INFO: renamed from: g */
    public String f17524g;

    /* JADX INFO: renamed from: h */
    public String f17525h;

    /* JADX INFO: renamed from: i */
    public boolean f17526i;

    /* JADX INFO: renamed from: a */
    public final String m4805a() {
        String str = this.f17525h;
        return this.f17520c.length() == 0 ? "" : str.substring(hd4.m6342h0(str, ':', this.f17518a.length() + 3, 4) + 1, hd4.m6342h0(str, '@', 0, 6));
    }

    /* JADX INFO: renamed from: b */
    public final String m4806b() {
        String str = this.f17525h;
        int iM6342h0 = hd4.m6342h0(str, '/', this.f17518a.length() + 3, 4);
        return str.substring(iM6342h0, zv4.m13810e(iM6342h0, str.length(), str, "?#"));
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m4807c() {
        String str = this.f17525h;
        int iM6342h0 = hd4.m6342h0(str, '/', this.f17518a.length() + 3, 4);
        int iM13810e = zv4.m13810e(iM6342h0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iM6342h0 < iM13810e) {
            int i = iM6342h0 + 1;
            int iM13811f = zv4.m13811f(str, '/', i, iM13810e);
            arrayList.add(str.substring(i, iM13811f));
            iM6342h0 = iM13811f;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final String m4808d() {
        String str = this.f17525h;
        if (this.f17523f == null) {
            return null;
        }
        int iM6342h0 = hd4.m6342h0(str, '?', 0, 6) + 1;
        return str.substring(iM6342h0, zv4.m13811f(str, '#', iM6342h0, str.length()));
    }

    /* JADX INFO: renamed from: e */
    public final String m4809e() {
        String str = this.f17525h;
        if (this.f17519b.length() == 0) {
            return "";
        }
        int length = this.f17518a.length() + 3;
        return str.substring(length, zv4.m13810e(length, str.length(), str, ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dz1) && ((dz1) obj).f17525h.equals(this.f17525h);
    }

    /* JADX INFO: renamed from: f */
    public final String m4810f() {
        cz1 cz1Var;
        try {
            cz1Var = new cz1();
            cz1Var.m4240c(this, "/...");
        } catch (IllegalArgumentException unused) {
            cz1Var = null;
        }
        cz1Var.f16630b = q50.m9725g("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        cz1Var.f16631c = q50.m9725g("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return cz1Var.m4238a().f17525h;
    }

    /* JADX INFO: renamed from: g */
    public final URI m4811g() {
        String str = this.f17525h;
        cz1 cz1Var = new cz1();
        String str2 = this.f17518a;
        cz1Var.f16629a = str2;
        cz1Var.f16630b = m4809e();
        cz1Var.f16631c = m4805a();
        cz1Var.f16632d = this.f17521d;
        int i = this.f17522e;
        if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
            i = -1;
        }
        cz1Var.f16633e = i;
        ArrayList arrayList = cz1Var.f16634f;
        arrayList.clear();
        arrayList.addAll(m4807c());
        String strM4808d = m4808d();
        cz1Var.f16635g = strM4808d != null ? q50.m9729m(q50.m9725g(strM4808d, 0, 0, " \"'<>#", 211)) : null;
        cz1Var.f16636h = this.f17524g == null ? null : str.substring(hd4.m6342h0(str, '#', 0, 6) + 1);
        String str3 = cz1Var.f16632d;
        cz1Var.f16632d = str3 != null ? Pattern.compile("[\"<>^`{|}]").matcher(str3).replaceAll("") : null;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.set(i2, q50.m9725g((String) arrayList.get(i2), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = cz1Var.f16635g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str4 = (String) arrayList2.get(i3);
                arrayList2.set(i3, str4 != null ? q50.m9725g(str4, 0, 0, "\\^`{|}", 195) : null);
            }
        }
        String str5 = cz1Var.f16636h;
        cz1Var.f16636h = str5 != null ? q50.m9725g(str5, 0, 0, " \"#<>\\^`{|}", 163) : null;
        String string = cz1Var.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").matcher(string).replaceAll(""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final int hashCode() {
        return this.f17525h.hashCode();
    }

    public final String toString() {
        return this.f17525h;
    }
}
