package p000;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qh4 {

    /* JADX INFO: renamed from: a */
    public final String f28476a;

    /* JADX INFO: renamed from: b */
    public final String f28477b;

    /* JADX INFO: renamed from: c */
    public final boolean f28478c;

    /* JADX INFO: renamed from: d */
    public final int f28479d;

    /* JADX INFO: renamed from: e */
    public final String f28480e;

    /* JADX INFO: renamed from: f */
    public final byte f28481f;

    /* JADX INFO: renamed from: g */
    public final int f28482g;

    /* JADX WARN: Multi-variable type inference failed */
    public qh4(String str, String str2, boolean z, int i, String str3, int i2) {
        this.f28476a = str;
        this.f28477b = str2;
        this.f28478c = z;
        this.f28479d = i;
        this.f28480e = str3;
        this.f28481f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        this.f28482g = hd4.m6335a0(upperCase, "INT", false) ? 3 : (hd4.m6335a0(upperCase, "CHAR", false) || hd4.m6335a0(upperCase, "CLOB", false) || hd4.m6335a0(upperCase, "TEXT", false)) ? 2 : hd4.m6335a0(upperCase, "BLOB", false) ? 5 : (hd4.m6335a0(upperCase, "REAL", false) || hd4.m6335a0(upperCase, "FLOA", false) || hd4.m6335a0(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qh4) {
                boolean z = this.f28479d > 0;
                qh4 qh4Var = (qh4) obj;
                byte b = qh4Var.f28481f;
                if (z == (qh4Var.f28479d > 0) && z62.m13387o(this.f28476a, qh4Var.f28476a) && this.f28478c == qh4Var.f28478c) {
                    String str = qh4Var.f28480e;
                    byte b2 = this.f28481f;
                    String str2 = this.f28480e;
                    if ((b2 != 1 || b != 2 || str2 == null || zp0.m13689u(str2, str)) && ((b2 != 2 || b != 1 || str == null || zp0.m13689u(str, str2)) && ((b2 == 0 || b2 != b || (str2 == null ? str == null : zp0.m13689u(str2, str))) && this.f28482g == qh4Var.f28482g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f28476a.hashCode() * 31) + this.f28482g) * 31) + (this.f28478c ? 1231 : 1237)) * 31) + this.f28479d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.f28476a);
        sb.append("',\n            |   type = '");
        sb.append(this.f28477b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.f28482g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.f28478c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.f28479d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.f28480e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return id4.m6766M(id4.m6768O(sb.toString()));
    }
}
