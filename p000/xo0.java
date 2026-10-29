package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xo0 {

    /* JADX INFO: renamed from: a */
    public static final xo0 f34478a;

    /* JADX INFO: renamed from: b */
    public static final xo0 f34479b;

    /* JADX INFO: renamed from: c */
    public static final xo0 f34480c;

    /* JADX INFO: renamed from: d */
    public static final xo0 f34481d;

    /* JADX INFO: renamed from: e */
    public static final xo0 f34482e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ xo0[] f34483f;

    static {
        xo0 xo0Var = new xo0("CPU_ACQUIRED", 0);
        f34478a = xo0Var;
        xo0 xo0Var2 = new xo0("BLOCKING", 1);
        f34479b = xo0Var2;
        xo0 xo0Var3 = new xo0("PARKING", 2);
        f34480c = xo0Var3;
        xo0 xo0Var4 = new xo0("DORMANT", 3);
        f34481d = xo0Var4;
        xo0 xo0Var5 = new xo0("TERMINATED", 4);
        f34482e = xo0Var5;
        xo0[] xo0VarArr = {xo0Var, xo0Var2, xo0Var3, xo0Var4, xo0Var5};
        f34483f = xo0VarArr;
        vd6.m11859r(xo0VarArr);
    }

    public static xo0 valueOf(String str) {
        return (xo0) Enum.valueOf(xo0.class, str);
    }

    public static xo0[] values() {
        return (xo0[]) f34483f.clone();
    }
}
