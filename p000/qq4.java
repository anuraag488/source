package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qq4 {

    /* JADX INFO: renamed from: a */
    public static final qq4 f28694a;

    /* JADX INFO: renamed from: b */
    public static final qq4 f28695b;

    /* JADX INFO: renamed from: c */
    public static final qq4 f28696c;

    /* JADX INFO: renamed from: d */
    public static final qq4 f28697d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ qq4[] f28698e;

    static {
        qq4 qq4Var = new qq4("SUCCESSFUL", 0);
        f28694a = qq4Var;
        qq4 qq4Var2 = new qq4("REREGISTER", 1);
        f28695b = qq4Var2;
        qq4 qq4Var3 = new qq4("CANCELLED", 2);
        f28696c = qq4Var3;
        qq4 qq4Var4 = new qq4("ALREADY_SELECTED", 3);
        f28697d = qq4Var4;
        qq4[] qq4VarArr = {qq4Var, qq4Var2, qq4Var3, qq4Var4};
        f28698e = qq4VarArr;
        vd6.m11859r(qq4VarArr);
    }

    public static qq4 valueOf(String str) {
        return (qq4) Enum.valueOf(qq4.class, str);
    }

    public static qq4[] values() {
        return (qq4[]) f28698e.clone();
    }
}
