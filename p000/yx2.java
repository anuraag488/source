package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yx2 {

    /* JADX INFO: renamed from: a */
    public static final yx2 f35584a;

    /* JADX INFO: renamed from: b */
    public static final yx2 f35585b;

    /* JADX INFO: renamed from: c */
    public static final yx2 f35586c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ yx2[] f35587d;

    static {
        yx2 yx2Var = new yx2("Left", 0);
        f35584a = yx2Var;
        yx2 yx2Var2 = new yx2("Right", 1);
        f35585b = yx2Var2;
        yx2 yx2Var3 = new yx2("Bottom", 2);
        f35586c = yx2Var3;
        yx2[] yx2VarArr = {yx2Var, yx2Var2, yx2Var3};
        f35587d = yx2VarArr;
        vd6.m11859r(yx2VarArr);
    }

    public static yx2 valueOf(String str) {
        return (yx2) Enum.valueOf(yx2.class, str);
    }

    public static yx2[] values() {
        return (yx2[]) f35587d.clone();
    }
}
