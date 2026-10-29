package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ap0 {

    /* JADX INFO: renamed from: a */
    public static final ap0 f14763a;

    /* JADX INFO: renamed from: b */
    public static final ap0 f14764b;

    /* JADX INFO: renamed from: c */
    public static final ap0 f14765c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ap0[] f14766d;

    static {
        ap0 ap0Var = new ap0("COROUTINE_SUSPENDED", 0);
        f14763a = ap0Var;
        ap0 ap0Var2 = new ap0("UNDECIDED", 1);
        f14764b = ap0Var2;
        ap0 ap0Var3 = new ap0("RESUMED", 2);
        f14765c = ap0Var3;
        ap0[] ap0VarArr = {ap0Var, ap0Var2, ap0Var3};
        f14766d = ap0VarArr;
        vd6.m11859r(ap0VarArr);
    }

    public static ap0 valueOf(String str) {
        return (ap0) Enum.valueOf(ap0.class, str);
    }

    public static ap0[] values() {
        return (ap0[]) f14766d.clone();
    }
}
