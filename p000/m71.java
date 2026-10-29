package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m71 {

    /* JADX INFO: renamed from: a */
    public int f24704a;

    /* JADX INFO: renamed from: a */
    public static String m8214a(int i) {
        if (i == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i == 1) {
            return "EmojiSupportMatch.None";
        }
        return i == 2 ? "EmojiSupportMatch.All" : c75.m3878j("Invalid(value=", i, ")");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m71) && this.f24704a == ((m71) obj).f24704a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24704a);
    }

    public final String toString() {
        return m8214a(this.f24704a);
    }
}
