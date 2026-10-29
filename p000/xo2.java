package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xo2 {

    /* JADX INFO: renamed from: a */
    public static final xo2 f34490a;

    /* JADX INFO: renamed from: b */
    public static final xo2 f34491b;

    /* JADX INFO: renamed from: c */
    public static final xo2 f34492c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ xo2[] f34493d;

    static {
        xo2 xo2Var = new xo2("IsPlacedInLookahead", 0);
        f34490a = xo2Var;
        xo2 xo2Var2 = new xo2("IsPlacedInApproach", 1);
        f34491b = xo2Var2;
        xo2 xo2Var3 = new xo2("IsNotPlaced", 2);
        f34492c = xo2Var3;
        xo2[] xo2VarArr = {xo2Var, xo2Var2, xo2Var3};
        f34493d = xo2VarArr;
        vd6.m11859r(xo2VarArr);
    }

    public static xo2 valueOf(String str) {
        return (xo2) Enum.valueOf(xo2.class, str);
    }

    public static xo2[] values() {
        return (xo2[]) f34493d.clone();
    }
}
