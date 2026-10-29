package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class op4 {

    /* JADX INFO: renamed from: a */
    public static final op4 f26938a;

    /* JADX INFO: renamed from: b */
    public static final op4 f26939b;

    /* JADX INFO: renamed from: c */
    public static final op4 f26940c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ op4[] f26941d;

    static {
        op4 op4Var = new op4("ContinueTraversal", 0);
        f26938a = op4Var;
        op4 op4Var2 = new op4("SkipSubtreeAndContinueTraversal", 1);
        f26939b = op4Var2;
        op4 op4Var3 = new op4("CancelTraversal", 2);
        f26940c = op4Var3;
        op4[] op4VarArr = {op4Var, op4Var2, op4Var3};
        f26941d = op4VarArr;
        vd6.m11859r(op4VarArr);
    }

    public static op4 valueOf(String str) {
        return (op4) Enum.valueOf(op4.class, str);
    }

    public static op4[] values() {
        return (op4[]) f26941d.clone();
    }
}
