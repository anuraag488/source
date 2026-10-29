package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zj1 {

    /* JADX INFO: renamed from: a */
    public static final zj1 f36146a;

    /* JADX INFO: renamed from: b */
    public static final zj1 f36147b;

    /* JADX INFO: renamed from: c */
    public static final zj1 f36148c;

    /* JADX INFO: renamed from: d */
    public static final zj1 f36149d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ zj1[] f36150e;

    static {
        zj1 zj1Var = new zj1("Visible", 0);
        f36146a = zj1Var;
        zj1 zj1Var2 = new zj1("Clip", 1);
        f36147b = zj1Var2;
        zj1 zj1Var3 = new zj1("ExpandIndicator", 2);
        f36148c = zj1Var3;
        zj1 zj1Var4 = new zj1("ExpandOrCollapseIndicator", 3);
        f36149d = zj1Var4;
        zj1[] zj1VarArr = {zj1Var, zj1Var2, zj1Var3, zj1Var4};
        f36150e = zj1VarArr;
        vd6.m11859r(zj1VarArr);
    }

    public static zj1 valueOf(String str) {
        return (zj1) Enum.valueOf(zj1.class, str);
    }

    public static zj1[] values() {
        return (zj1[]) f36150e.clone();
    }
}
