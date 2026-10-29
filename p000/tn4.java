package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tn4 {

    /* JADX INFO: renamed from: a */
    public static final tn4 f31269a;

    /* JADX INFO: renamed from: b */
    public static final tn4 f31270b;

    /* JADX INFO: renamed from: c */
    public static final tn4 f31271c;

    /* JADX INFO: renamed from: d */
    public static final tn4 f31272d;

    /* JADX INFO: renamed from: e */
    public static final tn4 f31273e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ tn4[] f31274f;

    static {
        tn4 tn4Var = new tn4("DARKER", 0);
        f31269a = tn4Var;
        tn4 tn4Var2 = new tn4("LIGHTER", 1);
        f31270b = tn4Var2;
        tn4 tn4Var3 = new tn4("RELATIVE_DARKER", 2);
        f31271c = tn4Var3;
        tn4 tn4Var4 = new tn4("RELATIVE_LIGHTER", 3);
        f31272d = tn4Var4;
        tn4 tn4Var5 = new tn4("NEARER", 4);
        f31273e = tn4Var5;
        tn4[] tn4VarArr = {tn4Var, tn4Var2, tn4Var3, tn4Var4, tn4Var5, new tn4("FARTHER", 5)};
        f31274f = tn4VarArr;
        vd6.m11859r(tn4VarArr);
    }

    public static tn4 valueOf(String str) {
        return (tn4) Enum.valueOf(tn4.class, str);
    }

    public static tn4[] values() {
        return (tn4[]) f31274f.clone();
    }
}
