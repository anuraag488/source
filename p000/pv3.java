package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pv3 {

    /* JADX INFO: renamed from: a */
    public static final pv3 f28030a;

    /* JADX INFO: renamed from: b */
    public static final pv3 f28031b;

    /* JADX INFO: renamed from: c */
    public static final pv3 f28032c;

    /* JADX INFO: renamed from: d */
    public static final pv3 f28033d;

    /* JADX INFO: renamed from: e */
    public static final pv3 f28034e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ pv3[] f28035f;

    static {
        pv3 pv3Var = new pv3("TopBar", 0);
        f28030a = pv3Var;
        pv3 pv3Var2 = new pv3("MainContent", 1);
        f28031b = pv3Var2;
        pv3 pv3Var3 = new pv3("Snackbar", 2);
        f28032c = pv3Var3;
        pv3 pv3Var4 = new pv3("Fab", 3);
        f28033d = pv3Var4;
        pv3 pv3Var5 = new pv3("BottomBar", 4);
        f28034e = pv3Var5;
        pv3[] pv3VarArr = {pv3Var, pv3Var2, pv3Var3, pv3Var4, pv3Var5};
        f28035f = pv3VarArr;
        vd6.m11859r(pv3VarArr);
    }

    public static pv3 valueOf(String str) {
        return (pv3) Enum.valueOf(pv3.class, str);
    }

    public static pv3[] values() {
        return (pv3[]) f28035f.clone();
    }
}
