package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h13 {

    /* JADX INFO: renamed from: a */
    public static final h13 f20264a;

    /* JADX INFO: renamed from: b */
    public static final h13 f20265b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ h13[] f20266c;

    static {
        h13 h13Var = new h13("Min", 0);
        f20264a = h13Var;
        h13 h13Var2 = new h13("Max", 1);
        f20265b = h13Var2;
        h13[] h13VarArr = {h13Var, h13Var2};
        f20266c = h13VarArr;
        vd6.m11859r(h13VarArr);
    }

    public static h13 valueOf(String str) {
        return (h13) Enum.valueOf(h13.class, str);
    }

    public static h13[] values() {
        return (h13[]) f20266c.clone();
    }
}
