package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q90 {

    /* JADX INFO: renamed from: a */
    public static final q90 f28306a;

    /* JADX INFO: renamed from: b */
    public static final q90 f28307b;

    /* JADX INFO: renamed from: c */
    public static final q90 f28308c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ q90[] f28309d;

    static {
        q90 q90Var = new q90("NONE", 0);
        f28306a = q90Var;
        q90 q90Var2 = new q90("ALL_JSON_OBJECTS", 1);
        f28307b = q90Var2;
        q90 q90Var3 = new q90("POLYMORPHIC", 2);
        f28308c = q90Var3;
        q90[] q90VarArr = {q90Var, q90Var2, q90Var3};
        f28309d = q90VarArr;
        vd6.m11859r(q90VarArr);
    }

    public static q90 valueOf(String str) {
        return (q90) Enum.valueOf(q90.class, str);
    }

    public static q90[] values() {
        return (q90[]) f28309d.clone();
    }
}
