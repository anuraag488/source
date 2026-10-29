package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yl0 {

    /* JADX INFO: renamed from: a */
    public static final yl0 f35312a;

    /* JADX INFO: renamed from: b */
    public static final yl0 f35313b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ yl0[] f35314c;

    static {
        yl0 yl0Var = new yl0("VIEW_APPEAR", 0);
        f35312a = yl0Var;
        yl0 yl0Var2 = new yl0("VIEW_DISAPPEAR", 1);
        f35313b = yl0Var2;
        yl0[] yl0VarArr = {yl0Var, yl0Var2};
        f35314c = yl0VarArr;
        vd6.m11859r(yl0VarArr);
    }

    public static yl0 valueOf(String str) {
        return (yl0) Enum.valueOf(yl0.class, str);
    }

    public static yl0[] values() {
        return (yl0[]) f35314c.clone();
    }
}
