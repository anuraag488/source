package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b91 {

    /* JADX INFO: renamed from: a */
    public static final b91 f15168a;

    /* JADX INFO: renamed from: b */
    public static final b91 f15169b;

    /* JADX INFO: renamed from: c */
    public static final b91 f15170c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ b91[] f15171d;

    static {
        b91 b91Var = new b91("PreEnter", 0);
        f15168a = b91Var;
        b91 b91Var2 = new b91("Visible", 1);
        f15169b = b91Var2;
        b91 b91Var3 = new b91("PostExit", 2);
        f15170c = b91Var3;
        b91[] b91VarArr = {b91Var, b91Var2, b91Var3};
        f15171d = b91VarArr;
        vd6.m11859r(b91VarArr);
    }

    public static b91 valueOf(String str) {
        return (b91) Enum.valueOf(b91.class, str);
    }

    public static b91[] values() {
        return (b91[]) f15171d.clone();
    }
}
