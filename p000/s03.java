package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s03 {

    /* JADX INFO: renamed from: a */
    public static final s03 f29788a;

    /* JADX INFO: renamed from: b */
    public static final s03 f29789b;

    /* JADX INFO: renamed from: c */
    public static final s03 f29790c;

    /* JADX INFO: renamed from: d */
    public static final s03 f29791d;

    /* JADX INFO: renamed from: e */
    public static final s03 f29792e;

    /* JADX INFO: renamed from: f */
    public static final s03 f29793f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ s03[] f29794g;

    static {
        s03 s03Var = new s03("NOT_REQUIRED", 0);
        f29788a = s03Var;
        s03 s03Var2 = new s03("CONNECTED", 1);
        f29789b = s03Var2;
        s03 s03Var3 = new s03("UNMETERED", 2);
        f29790c = s03Var3;
        s03 s03Var4 = new s03("NOT_ROAMING", 3);
        f29791d = s03Var4;
        s03 s03Var5 = new s03("METERED", 4);
        f29792e = s03Var5;
        s03 s03Var6 = new s03("TEMPORARILY_UNMETERED", 5);
        f29793f = s03Var6;
        s03[] s03VarArr = {s03Var, s03Var2, s03Var3, s03Var4, s03Var5, s03Var6};
        f29794g = s03VarArr;
        vd6.m11859r(s03VarArr);
    }

    public static s03 valueOf(String str) {
        return (s03) Enum.valueOf(s03.class, str);
    }

    public static s03[] values() {
        return (s03[]) f29794g.clone();
    }
}
