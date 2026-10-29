package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sh1 {

    /* JADX INFO: renamed from: a */
    public static final sh1 f30269a;

    /* JADX INFO: renamed from: b */
    public static final sh1 f30270b;

    /* JADX INFO: renamed from: c */
    public static final sh1 f30271c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ sh1[] f30272d;

    static {
        sh1 sh1Var = new sh1("Unavailable", 0);
        f30269a = sh1Var;
        sh1 sh1Var2 = new sh1("Off", 1);
        f30270b = sh1Var2;
        sh1 sh1Var3 = new sh1("On", 2);
        f30271c = sh1Var3;
        sh1[] sh1VarArr = {sh1Var, sh1Var2, sh1Var3};
        f30272d = sh1VarArr;
        vd6.m11859r(sh1VarArr);
    }

    public static sh1 valueOf(String str) {
        return (sh1) Enum.valueOf(sh1.class, str);
    }

    public static sh1[] values() {
        return (sh1[]) f30272d.clone();
    }
}
