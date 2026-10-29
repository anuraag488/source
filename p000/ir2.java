package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ir2 {

    /* JADX INFO: renamed from: a */
    public static final ir2 f21711a;

    /* JADX INFO: renamed from: b */
    public static final ir2 f21712b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ir2[] f21713c;

    static {
        ir2 ir2Var = new ir2("Min", 0);
        f21711a = ir2Var;
        ir2 ir2Var2 = new ir2("Max", 1);
        f21712b = ir2Var2;
        ir2[] ir2VarArr = {ir2Var, ir2Var2};
        f21713c = ir2VarArr;
        vd6.m11859r(ir2VarArr);
    }

    public static ir2 valueOf(String str) {
        return (ir2) Enum.valueOf(ir2.class, str);
    }

    public static ir2[] values() {
        return (ir2[]) f21713c.clone();
    }
}
