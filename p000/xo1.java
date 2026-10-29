package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xo1 {

    /* JADX INFO: renamed from: a */
    public static final xo1 f34484a;

    /* JADX INFO: renamed from: b */
    public static final xo1 f34485b;

    /* JADX INFO: renamed from: c */
    public static final xo1 f34486c;

    /* JADX INFO: renamed from: d */
    public static final xo1 f34487d;

    /* JADX INFO: renamed from: e */
    public static final xo1 f34488e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ xo1[] f34489f;

    static {
        xo1 xo1Var = new xo1("ON_CONFIGURE", 0);
        f34484a = xo1Var;
        xo1 xo1Var2 = new xo1("ON_CREATE", 1);
        f34485b = xo1Var2;
        xo1 xo1Var3 = new xo1("ON_UPGRADE", 2);
        f34486c = xo1Var3;
        xo1 xo1Var4 = new xo1("ON_DOWNGRADE", 3);
        f34487d = xo1Var4;
        xo1 xo1Var5 = new xo1("ON_OPEN", 4);
        f34488e = xo1Var5;
        xo1[] xo1VarArr = {xo1Var, xo1Var2, xo1Var3, xo1Var4, xo1Var5};
        f34489f = xo1VarArr;
        vd6.m11859r(xo1VarArr);
    }

    public static xo1 valueOf(String str) {
        return (xo1) Enum.valueOf(xo1.class, str);
    }

    public static xo1[] values() {
        return (xo1[]) f34489f.clone();
    }
}
