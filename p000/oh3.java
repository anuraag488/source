package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class oh3 {

    /* JADX INFO: renamed from: a */
    public static final oh3 f26699a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ oh3[] f26700b;

    static {
        oh3 oh3Var = new oh3("DEFAULT", 0);
        f26699a = oh3Var;
        f26700b = new oh3[]{oh3Var, new oh3("SIGNED", 1), new oh3("FIXED", 2)};
    }

    public static oh3 valueOf(String str) {
        return (oh3) Enum.valueOf(oh3.class, str);
    }

    public static oh3[] values() {
        return (oh3[]) f26700b.clone();
    }
}
