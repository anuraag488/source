package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ln4 {

    /* JADX INFO: renamed from: a */
    public static final ln4 f24214a;

    /* JADX INFO: renamed from: b */
    public static final ln4 f24215b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ln4[] f24216c;

    static {
        ln4 ln4Var = new ln4("On", 0);
        f24214a = ln4Var;
        ln4 ln4Var2 = new ln4("Off", 1);
        f24215b = ln4Var2;
        ln4[] ln4VarArr = {ln4Var, ln4Var2, new ln4("Indeterminate", 2)};
        f24216c = ln4VarArr;
        vd6.m11859r(ln4VarArr);
    }

    public static ln4 valueOf(String str) {
        return (ln4) Enum.valueOf(ln4.class, str);
    }

    public static ln4[] values() {
        return (ln4[]) f24216c.clone();
    }
}
