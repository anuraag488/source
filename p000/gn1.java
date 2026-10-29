package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gn1 {

    /* JADX INFO: renamed from: d */
    public static final gn1 f19970d = new gn1("", "", false);

    /* JADX INFO: renamed from: e */
    public static final gn1 f19971e = new gn1("\n", "  ", true);

    /* JADX INFO: renamed from: a */
    public final String f19972a;

    /* JADX INFO: renamed from: b */
    public final String f19973b;

    /* JADX INFO: renamed from: c */
    public final boolean f19974c;

    public gn1(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            C1077qn.m9987m("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            C1077qn.m9987m("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.f19972a = str;
        this.f19973b = str2;
        this.f19974c = z;
    }
}
