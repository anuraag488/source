package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xw2 {

    /* JADX INFO: renamed from: a */
    public static final xw2 f34665a;

    /* JADX INFO: renamed from: b */
    public static final xw2 f34666b;

    /* JADX INFO: renamed from: c */
    public static final xw2 f34667c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ xw2[] f34668d;

    static {
        xw2 xw2Var = new xw2("Default", 0);
        f34665a = xw2Var;
        xw2 xw2Var2 = new xw2("UserInput", 1);
        f34666b = xw2Var2;
        xw2 xw2Var3 = new xw2("PreventUserInput", 2);
        f34667c = xw2Var3;
        xw2[] xw2VarArr = {xw2Var, xw2Var2, xw2Var3};
        f34668d = xw2VarArr;
        vd6.m11859r(xw2VarArr);
    }

    public static xw2 valueOf(String str) {
        return (xw2) Enum.valueOf(xw2.class, str);
    }

    public static xw2[] values() {
        return (xw2[]) f34668d.clone();
    }
}
