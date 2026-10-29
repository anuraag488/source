package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wu1 {

    /* JADX INFO: renamed from: a */
    public static final wu1 f33741a;

    /* JADX INFO: renamed from: b */
    public static final wu1 f33742b;

    /* JADX INFO: renamed from: c */
    public static final wu1 f33743c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ wu1[] f33744d;

    static {
        wu1 wu1Var = new wu1("None", 0);
        f33741a = wu1Var;
        wu1 wu1Var2 = new wu1("Selection", 1);
        f33742b = wu1Var2;
        wu1 wu1Var3 = new wu1("Cursor", 2);
        f33743c = wu1Var3;
        wu1[] wu1VarArr = {wu1Var, wu1Var2, wu1Var3};
        f33744d = wu1VarArr;
        vd6.m11859r(wu1VarArr);
    }

    public static wu1 valueOf(String str) {
        return (wu1) Enum.valueOf(wu1.class, str);
    }

    public static wu1[] values() {
        return (wu1[]) f33744d.clone();
    }
}
