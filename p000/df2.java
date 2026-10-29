package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class df2 {

    /* JADX INFO: renamed from: a */
    public static final df2 f17011a;

    /* JADX INFO: renamed from: b */
    public static final df2 f17012b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ df2[] f17013c;

    static {
        df2 df2Var = new df2("Ltr", 0);
        f17011a = df2Var;
        df2 df2Var2 = new df2("Rtl", 1);
        f17012b = df2Var2;
        df2[] df2VarArr = {df2Var, df2Var2};
        f17013c = df2VarArr;
        vd6.m11859r(df2VarArr);
    }

    public static df2 valueOf(String str) {
        return (df2) Enum.valueOf(df2.class, str);
    }

    public static df2[] values() {
        return (df2[]) f17013c.clone();
    }
}
