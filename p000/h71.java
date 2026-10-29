package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h71 {

    /* JADX INFO: renamed from: a */
    public static final h71 f20413a;

    /* JADX INFO: renamed from: b */
    public static final h71 f20414b;

    /* JADX INFO: renamed from: c */
    public static final h71 f20415c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ h71[] f20416d;

    static {
        h71 h71Var = new h71("NIST_P256", 0);
        f20413a = h71Var;
        h71 h71Var2 = new h71("NIST_P384", 1);
        f20414b = h71Var2;
        h71 h71Var3 = new h71("NIST_P521", 2);
        f20415c = h71Var3;
        f20416d = new h71[]{h71Var, h71Var2, h71Var3};
    }

    public static h71 valueOf(String str) {
        return (h71) Enum.valueOf(h71.class, str);
    }

    public static h71[] values() {
        return (h71[]) f20416d.clone();
    }
}
