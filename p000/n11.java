package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n11 {

    /* JADX INFO: renamed from: a */
    public static final n11 f25377a;

    /* JADX INFO: renamed from: b */
    public static final n11 f25378b;

    /* JADX INFO: renamed from: c */
    public static final n11 f25379c;

    /* JADX INFO: renamed from: d */
    public static final n11 f25380d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ n11[] f25381e;

    static {
        n11 n11Var = new n11("Up", 0);
        f25377a = n11Var;
        n11 n11Var2 = new n11("Drag", 1);
        f25378b = n11Var2;
        n11 n11Var3 = new n11("Timeout", 2);
        f25379c = n11Var3;
        n11 n11Var4 = new n11("Cancel", 3);
        f25380d = n11Var4;
        n11[] n11VarArr = {n11Var, n11Var2, n11Var3, n11Var4};
        f25381e = n11VarArr;
        vd6.m11859r(n11VarArr);
    }

    public static n11 valueOf(String str) {
        return (n11) Enum.valueOf(n11.class, str);
    }

    public static n11[] values() {
        return (n11[]) f25381e.clone();
    }
}
