package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class si3 {

    /* JADX INFO: renamed from: a */
    public static final si3 f30318a;

    /* JADX INFO: renamed from: b */
    public static final si3 f30319b;

    /* JADX INFO: renamed from: c */
    public static final si3 f30320c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ si3[] f30321d;

    static {
        si3 si3Var = new si3("RED", 0);
        f30318a = si3Var;
        si3 si3Var2 = new si3("GREEN", 1);
        f30319b = si3Var2;
        si3 si3Var3 = new si3("BLUE", 2);
        f30320c = si3Var3;
        si3[] si3VarArr = {si3Var, si3Var2, si3Var3};
        f30321d = si3VarArr;
        vd6.m11859r(si3VarArr);
    }

    public static si3 valueOf(String str) {
        return (si3) Enum.valueOf(si3.class, str);
    }

    public static si3[] values() {
        return (si3[]) f30321d.clone();
    }
}
