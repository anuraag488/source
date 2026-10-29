package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tc2 {

    /* JADX INFO: renamed from: a */
    public static final tc2 f31070a;

    /* JADX INFO: renamed from: b */
    public static final tc2 f31071b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ tc2[] f31072c;

    static {
        tc2 tc2Var = new tc2("Down", 0);
        f31070a = tc2Var;
        tc2 tc2Var2 = new tc2("Up", 1);
        f31071b = tc2Var2;
        tc2[] tc2VarArr = {tc2Var, tc2Var2};
        f31072c = tc2VarArr;
        vd6.m11859r(tc2VarArr);
    }

    public static tc2 valueOf(String str) {
        return (tc2) Enum.valueOf(tc2.class, str);
    }

    public static tc2[] values() {
        return (tc2[]) f31072c.clone();
    }
}
