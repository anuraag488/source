package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class oo3 {

    /* JADX INFO: renamed from: a */
    public static final oo3 f26925a;

    /* JADX INFO: renamed from: b */
    public static final oo3 f26926b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ oo3[] f26927c;

    static {
        oo3 oo3Var = new oo3("Ltr", 0);
        f26925a = oo3Var;
        oo3 oo3Var2 = new oo3("Rtl", 1);
        f26926b = oo3Var2;
        oo3[] oo3VarArr = {oo3Var, oo3Var2};
        f26927c = oo3VarArr;
        vd6.m11859r(oo3VarArr);
    }

    public static oo3 valueOf(String str) {
        return (oo3) Enum.valueOf(oo3.class, str);
    }

    public static oo3[] values() {
        return (oo3[]) f26927c.clone();
    }
}
