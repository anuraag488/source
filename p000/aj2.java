package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class aj2 {

    /* JADX INFO: renamed from: a */
    public static final aj2 f14536a;

    /* JADX INFO: renamed from: b */
    public static final aj2 f14537b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ aj2[] f14538c;

    /* JADX INFO: Fake field, exist only in values array */
    aj2 EF0;

    static {
        aj2 aj2Var = new aj2("SYNCHRONIZED", 0);
        aj2 aj2Var2 = new aj2("PUBLICATION", 1);
        f14536a = aj2Var2;
        aj2 aj2Var3 = new aj2("NONE", 2);
        f14537b = aj2Var3;
        aj2[] aj2VarArr = {aj2Var, aj2Var2, aj2Var3};
        f14538c = aj2VarArr;
        vd6.m11859r(aj2VarArr);
    }

    public static aj2 valueOf(String str) {
        return (aj2) Enum.valueOf(aj2.class, str);
    }

    public static aj2[] values() {
        return (aj2[]) f14538c.clone();
    }
}
