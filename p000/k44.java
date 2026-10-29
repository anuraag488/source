package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k44 {

    /* JADX INFO: renamed from: a */
    public static final k44 f22882a;

    /* JADX INFO: renamed from: b */
    public static final k44 f22883b;

    /* JADX INFO: renamed from: c */
    public static final k44 f22884c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ k44[] f22885d;

    static {
        k44 k44Var = new k44("Verbose", 0);
        f22882a = k44Var;
        k44 k44Var2 = new k44("Debug", 1);
        f22883b = k44Var2;
        k44 k44Var3 = new k44("Info", 2);
        k44 k44Var4 = new k44("Warn", 3);
        k44 k44Var5 = new k44("Error", 4);
        f22884c = k44Var5;
        k44[] k44VarArr = {k44Var, k44Var2, k44Var3, k44Var4, k44Var5, new k44("Assert", 5)};
        f22885d = k44VarArr;
        vd6.m11859r(k44VarArr);
    }

    public static k44 valueOf(String str) {
        return (k44) Enum.valueOf(k44.class, str);
    }

    public static k44[] values() {
        return (k44[]) f22885d.clone();
    }
}
