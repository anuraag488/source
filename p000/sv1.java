package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sv1 {

    /* JADX INFO: renamed from: d */
    public static final s50 f30580d = sc6.m10629A(":");

    /* JADX INFO: renamed from: e */
    public static final s50 f30581e = sc6.m10629A(":status");

    /* JADX INFO: renamed from: f */
    public static final s50 f30582f = sc6.m10629A(":method");

    /* JADX INFO: renamed from: g */
    public static final s50 f30583g = sc6.m10629A(":path");

    /* JADX INFO: renamed from: h */
    public static final s50 f30584h = sc6.m10629A(":scheme");

    /* JADX INFO: renamed from: i */
    public static final s50 f30585i = sc6.m10629A(":authority");

    /* JADX INFO: renamed from: a */
    public final s50 f30586a;

    /* JADX INFO: renamed from: b */
    public final s50 f30587b;

    /* JADX INFO: renamed from: c */
    public final int f30588c;

    public sv1(String str, String str2) {
        s50 s50Var = new s50(str.getBytes(z80.f35863a));
        s50Var.f29914c = str;
        s50 s50Var2 = new s50(str2.getBytes(z80.f35863a));
        s50Var2.f29914c = str2;
        this(s50Var, s50Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv1)) {
            return false;
        }
        sv1 sv1Var = (sv1) obj;
        return z62.m13387o(this.f30586a, sv1Var.f30586a) && z62.m13387o(this.f30587b, sv1Var.f30587b);
    }

    public final int hashCode() {
        return this.f30587b.hashCode() + (this.f30586a.hashCode() * 31);
    }

    public final String toString() {
        return this.f30586a.m10524o() + ": " + this.f30587b.m10524o();
    }

    public sv1(s50 s50Var, String str) {
        s50 s50Var2 = new s50(str.getBytes(z80.f35863a));
        s50Var2.f29914c = str;
        this(s50Var, s50Var2);
    }

    public sv1(s50 s50Var, s50 s50Var2) {
        this.f30586a = s50Var;
        this.f30587b = s50Var2;
        this.f30588c = s50Var2.mo4261b() + s50Var.mo4261b() + 32;
    }
}
