package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tq3 {

    /* JADX INFO: renamed from: a */
    public static final tq3 f31335a;

    /* JADX INFO: renamed from: b */
    public static final tq3 f31336b;

    /* JADX INFO: renamed from: c */
    public static final tq3 f31337c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ tq3[] f31338d;

    static {
        tq3 tq3Var = new tq3("AUTOMATIC", 0);
        f31335a = tq3Var;
        tq3 tq3Var2 = new tq3("TRUNCATE", 1);
        f31336b = tq3Var2;
        tq3 tq3Var3 = new tq3("WRITE_AHEAD_LOGGING", 2);
        f31337c = tq3Var3;
        tq3[] tq3VarArr = {tq3Var, tq3Var2, tq3Var3};
        f31338d = tq3VarArr;
        vd6.m11859r(tq3VarArr);
    }

    public static tq3 valueOf(String str) {
        return (tq3) Enum.valueOf(tq3.class, str);
    }

    public static tq3[] values() {
        return (tq3[]) f31338d.clone();
    }
}
