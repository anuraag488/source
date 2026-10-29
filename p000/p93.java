package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p93 {

    /* JADX INFO: renamed from: a */
    public static final p93 f27468a;

    /* JADX INFO: renamed from: b */
    public static final p93 f27469b;

    /* JADX INFO: renamed from: c */
    public static final p93 f27470c;

    /* JADX INFO: renamed from: d */
    public static final p93 f27471d;

    /* JADX INFO: renamed from: e */
    public static final p93 f27472e;

    /* JADX INFO: renamed from: f */
    public static final p93 f27473f;

    /* JADX INFO: renamed from: g */
    public static final p93 f27474g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ p93[] f27475h;

    static {
        p93 p93Var = new p93("Invalid", 0);
        f27468a = p93Var;
        p93 p93Var2 = new p93("Cancelled", 1);
        f27469b = p93Var2;
        p93 p93Var3 = new p93("InitialPending", 2);
        f27470c = p93Var3;
        p93 p93Var4 = new p93("RecomposePending", 3);
        f27471d = p93Var4;
        p93 p93Var5 = new p93("Recomposing", 4);
        f27472e = p93Var5;
        p93 p93Var6 = new p93("ApplyPending", 5);
        f27473f = p93Var6;
        p93 p93Var7 = new p93("Applied", 6);
        f27474g = p93Var7;
        p93[] p93VarArr = {p93Var, p93Var2, p93Var3, p93Var4, p93Var5, p93Var6, p93Var7};
        f27475h = p93VarArr;
        vd6.m11859r(p93VarArr);
    }

    public static p93 valueOf(String str) {
        return (p93) Enum.valueOf(p93.class, str);
    }

    public static p93[] values() {
        return (p93[]) f27475h.clone();
    }
}
