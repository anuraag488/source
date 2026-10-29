package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cl4 {

    /* JADX INFO: renamed from: a */
    public static final cl4 f16106a;

    /* JADX INFO: renamed from: b */
    public static final cl4 f16107b;

    /* JADX INFO: renamed from: c */
    public static final cl4 f16108c;

    /* JADX INFO: renamed from: d */
    public static final cl4 f16109d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ cl4[] f16110e;

    static {
        cl4 cl4Var = new cl4("StartInput", 0);
        f16106a = cl4Var;
        cl4 cl4Var2 = new cl4("StopInput", 1);
        f16107b = cl4Var2;
        cl4 cl4Var3 = new cl4("ShowKeyboard", 2);
        f16108c = cl4Var3;
        cl4 cl4Var4 = new cl4("HideKeyboard", 3);
        f16109d = cl4Var4;
        cl4[] cl4VarArr = {cl4Var, cl4Var2, cl4Var3, cl4Var4};
        f16110e = cl4VarArr;
        vd6.m11859r(cl4VarArr);
    }

    public static cl4 valueOf(String str) {
        return (cl4) Enum.valueOf(cl4.class, str);
    }

    public static cl4[] values() {
        return (cl4[]) f16110e.clone();
    }
}
