package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k72 {

    /* JADX INFO: renamed from: a */
    public static final k72 f22957a;

    /* JADX INFO: renamed from: b */
    public static final k72 f22958b;

    /* JADX INFO: renamed from: c */
    public static final k72 f22959c;

    /* JADX INFO: renamed from: d */
    public static final k72 f22960d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ k72[] f22961e;

    static {
        k72 k72Var = new k72("LookaheadMeasurement", 0);
        f22957a = k72Var;
        k72 k72Var2 = new k72("LookaheadPlacement", 1);
        f22958b = k72Var2;
        k72 k72Var3 = new k72("Measurement", 2);
        f22959c = k72Var3;
        k72 k72Var4 = new k72("Placement", 3);
        f22960d = k72Var4;
        k72[] k72VarArr = {k72Var, k72Var2, k72Var3, k72Var4};
        f22961e = k72VarArr;
        vd6.m11859r(k72VarArr);
    }

    public static k72 valueOf(String str) {
        return (k72) Enum.valueOf(k72.class, str);
    }

    public static k72[] values() {
        return (k72[]) f22961e.clone();
    }
}
