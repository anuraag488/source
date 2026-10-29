package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u62 {

    /* JADX INFO: renamed from: a */
    public static final u62 f31672a;

    /* JADX INFO: renamed from: b */
    public static final u62 f31673b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ u62[] f31674c;

    static {
        u62 u62Var = new u62("Min", 0);
        f31672a = u62Var;
        u62 u62Var2 = new u62("Max", 1);
        f31673b = u62Var2;
        u62[] u62VarArr = {u62Var, u62Var2};
        f31674c = u62VarArr;
        vd6.m11859r(u62VarArr);
    }

    public static u62 valueOf(String str) {
        return (u62) Enum.valueOf(u62.class, str);
    }

    public static u62[] values() {
        return (u62[]) f31674c.clone();
    }
}
