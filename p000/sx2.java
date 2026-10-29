package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sx2 {

    /* JADX INFO: renamed from: a */
    public static final sx2 f30630a;

    /* JADX INFO: renamed from: b */
    public static final sx2 f30631b;

    /* JADX INFO: renamed from: c */
    public static final sx2 f30632c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ sx2[] f30633d;

    static {
        sx2 sx2Var = new sx2("Left", 0);
        f30630a = sx2Var;
        sx2 sx2Var2 = new sx2("Right", 1);
        f30631b = sx2Var2;
        sx2 sx2Var3 = new sx2("Center", 2);
        f30632c = sx2Var3;
        sx2[] sx2VarArr = {sx2Var, sx2Var2, sx2Var3};
        f30633d = sx2VarArr;
        vd6.m11859r(sx2VarArr);
    }

    public static sx2 valueOf(String str) {
        return (sx2) Enum.valueOf(sx2.class, str);
    }

    public static sx2[] values() {
        return (sx2[]) f30633d.clone();
    }
}
