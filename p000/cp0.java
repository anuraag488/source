package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cp0 {

    /* JADX INFO: renamed from: a */
    public static final cp0 f16325a;

    /* JADX INFO: renamed from: b */
    public static final cp0 f16326b;

    /* JADX INFO: renamed from: c */
    public static final cp0 f16327c;

    /* JADX INFO: renamed from: d */
    public static final cp0 f16328d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ cp0[] f16329e;

    static {
        cp0 cp0Var = new cp0("DEFAULT", 0);
        f16325a = cp0Var;
        cp0 cp0Var2 = new cp0("LAZY", 1);
        f16326b = cp0Var2;
        cp0 cp0Var3 = new cp0("ATOMIC", 2);
        f16327c = cp0Var3;
        cp0 cp0Var4 = new cp0("UNDISPATCHED", 3);
        f16328d = cp0Var4;
        cp0[] cp0VarArr = {cp0Var, cp0Var2, cp0Var3, cp0Var4};
        f16329e = cp0VarArr;
        vd6.m11859r(cp0VarArr);
    }

    public static cp0 valueOf(String str) {
        return (cp0) Enum.valueOf(cp0.class, str);
    }

    public static cp0[] values() {
        return (cp0[]) f16329e.clone();
    }
}
