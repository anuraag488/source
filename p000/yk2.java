package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yk2 {

    /* JADX INFO: renamed from: b */
    public static final int f35295b = 66305;

    /* JADX INFO: renamed from: a */
    public int f35296a;

    /* JADX INFO: renamed from: a */
    public static String m13151a(int i) {
        String str;
        String str2;
        int i2 = i & 255;
        String str3 = "Invalid";
        if (i2 == 1) {
            str = "Strategy.Simple";
        } else if (i2 == 2) {
            str = "Strategy.HighQuality";
        } else if (i2 == 3) {
            str = "Strategy.Balanced";
        } else {
            str = i2 == 0 ? "Strategy.Unspecified" : "Invalid";
        }
        int i3 = (i >> 8) & 255;
        if (i3 == 1) {
            str2 = "Strictness.None";
        } else if (i3 == 2) {
            str2 = "Strictness.Loose";
        } else if (i3 == 3) {
            str2 = "Strictness.Normal";
        } else if (i3 == 4) {
            str2 = "Strictness.Strict";
        } else {
            str2 = i3 == 0 ? "Strictness.Unspecified" : "Invalid";
        }
        int i4 = (i >> 16) & 255;
        if (i4 == 1) {
            str3 = "WordBreak.None";
        } else if (i4 == 2) {
            str3 = "WordBreak.Phrase";
        } else if (i4 == 0) {
            str3 = "WordBreak.Unspecified";
        }
        return zi4.m13623w(zi4.m13625y("LineBreak(strategy=", str, ", strictness=", str2, ", wordBreak="), str3, ")");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof yk2) && this.f35296a == ((yk2) obj).f35296a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35296a);
    }

    public final String toString() {
        return m13151a(this.f35296a);
    }
}
