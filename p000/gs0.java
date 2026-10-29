package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gs0 {

    /* JADX INFO: renamed from: a */
    public static final gs0 f20085a;

    /* JADX INFO: renamed from: b */
    public static final gs0 f20086b;

    /* JADX INFO: renamed from: c */
    public static final gs0 f20087c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ gs0[] f20088d;

    static {
        gs0 gs0Var = new gs0("None", 0);
        f20085a = gs0Var;
        gs0 gs0Var2 = new gs0("Cancelled", 1);
        f20086b = gs0Var2;
        gs0 gs0Var3 = new gs0("Redirected", 2);
        f20087c = gs0Var3;
        gs0[] gs0VarArr = {gs0Var, gs0Var2, gs0Var3, new gs0("RedirectCancelled", 3)};
        f20088d = gs0VarArr;
        vd6.m11859r(gs0VarArr);
    }

    public static gs0 valueOf(String str) {
        return (gs0) Enum.valueOf(gs0.class, str);
    }

    public static gs0[] values() {
        return (gs0[]) f20088d.clone();
    }
}
