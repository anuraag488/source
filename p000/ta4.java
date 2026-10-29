package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ta4 {

    /* JADX INFO: renamed from: a */
    public static final ta4 f31042a;

    /* JADX INFO: renamed from: b */
    public static final ta4 f31043b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ta4[] f31044c;

    /* JADX INFO: Fake field, exist only in values array */
    ta4 EF0;

    static {
        ta4 ta4Var = new ta4("NONE", 0);
        ta4 ta4Var2 = new ta4("ADDING", 1);
        f31042a = ta4Var2;
        ta4 ta4Var3 = new ta4("REMOVING", 2);
        f31043b = ta4Var3;
        ta4[] ta4VarArr = {ta4Var, ta4Var2, ta4Var3};
        f31044c = ta4VarArr;
        vd6.m11859r(ta4VarArr);
    }

    public static ta4 valueOf(String str) {
        return (ta4) Enum.valueOf(ta4.class, str);
    }

    public static ta4[] values() {
        return (ta4[]) f31044c.clone();
    }
}
