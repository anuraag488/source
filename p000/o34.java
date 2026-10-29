package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o34 {

    /* JADX INFO: renamed from: a */
    public static final o34 f26315a;

    /* JADX INFO: renamed from: b */
    public static final o34 f26316b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ o34[] f26317c;

    static {
        o34 o34Var = new o34("CRASHLYTICS", 0);
        f26315a = o34Var;
        o34 o34Var2 = new o34("PERFORMANCE", 1);
        f26316b = o34Var2;
        f26317c = new o34[]{o34Var, o34Var2, new o34("MATT_SAYS_HI", 2)};
    }

    public static o34 valueOf(String str) {
        return (o34) Enum.valueOf(o34.class, str);
    }

    public static o34[] values() {
        return (o34[]) f26317c.clone();
    }
}
