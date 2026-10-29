package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i71 {

    /* JADX INFO: renamed from: a */
    public static final i71 f21150a;

    /* JADX INFO: renamed from: b */
    public static final i71 f21151b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ i71[] f21152c;

    static {
        i71 i71Var = new i71("IEEE_P1363", 0);
        f21150a = i71Var;
        i71 i71Var2 = new i71("DER", 1);
        f21151b = i71Var2;
        f21152c = new i71[]{i71Var, i71Var2};
    }

    public static i71 valueOf(String str) {
        return (i71) Enum.valueOf(i71.class, str);
    }

    public static i71[] values() {
        return (i71[]) f21152c.clone();
    }
}
