package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qn4 {

    /* JADX INFO: renamed from: a */
    public static final qn4 f28624a;

    /* JADX INFO: renamed from: b */
    public static final qn4 f28625b;

    /* JADX INFO: renamed from: c */
    public static final qn4 f28626c;

    /* JADX INFO: renamed from: d */
    public static final qn4 f28627d;

    /* JADX INFO: renamed from: e */
    public static final qn4 f28628e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ qn4[] f28629f;

    static {
        qn4 qn4Var = new qn4("Negative", 0);
        f28624a = qn4Var;
        qn4 qn4Var2 = new qn4("Warning", 1);
        f28625b = qn4Var2;
        qn4 qn4Var3 = new qn4("Neutral", 2);
        f28626c = qn4Var3;
        qn4 qn4Var4 = new qn4("Positive", 3);
        f28627d = qn4Var4;
        qn4 qn4Var5 = new qn4("Info", 4);
        f28628e = qn4Var5;
        qn4[] qn4VarArr = {qn4Var, qn4Var2, qn4Var3, qn4Var4, qn4Var5};
        f28629f = qn4VarArr;
        vd6.m11859r(qn4VarArr);
    }

    public static qn4 valueOf(String str) {
        return (qn4) Enum.valueOf(qn4.class, str);
    }

    public static qn4[] values() {
        return (qn4[]) f28629f.clone();
    }
}
