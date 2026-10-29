package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jr0 {

    /* JADX INFO: renamed from: a */
    public static final jr0 f22535a;

    /* JADX INFO: renamed from: b */
    public static final jr0 f22536b;

    /* JADX INFO: renamed from: c */
    public static final jr0 f22537c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ jr0[] f22538d;

    static {
        jr0 jr0Var = new jr0("CRONET_ADAPTIVE_TRAFFIC_WINNER_UNKNOWN", 0);
        f22535a = jr0Var;
        jr0 jr0Var2 = new jr0("CRONET_ADAPTIVE_TRAFFIC_WINNER_MAIN", 1);
        f22536b = jr0Var2;
        jr0 jr0Var3 = new jr0("CRONET_ADAPTIVE_TRAFFIC_WINNER_FALLBACK", 2);
        f22537c = jr0Var3;
        f22538d = new jr0[]{jr0Var, jr0Var2, jr0Var3};
    }

    public static jr0 valueOf(String str) {
        return (jr0) Enum.valueOf(jr0.class, str);
    }

    public static jr0[] values() {
        return (jr0[]) f22538d.clone();
    }
}
