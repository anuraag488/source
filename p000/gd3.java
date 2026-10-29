package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gd3 {

    /* JADX INFO: renamed from: a */
    public static final gd3 f19745a;

    /* JADX INFO: renamed from: b */
    public static final gd3 f19746b;

    /* JADX INFO: renamed from: c */
    public static final gd3 f19747c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ gd3[] f19748d;

    static {
        gd3 gd3Var = new gd3("EXACT", 0);
        f19745a = gd3Var;
        gd3 gd3Var2 = new gd3("INEXACT", 1);
        f19746b = gd3Var2;
        gd3 gd3Var3 = new gd3("AUTOMATIC", 2);
        f19747c = gd3Var3;
        gd3[] gd3VarArr = {gd3Var, gd3Var2, gd3Var3};
        f19748d = gd3VarArr;
        vd6.m11859r(gd3VarArr);
    }

    public static gd3 valueOf(String str) {
        return (gd3) Enum.valueOf(gd3.class, str);
    }

    public static gd3[] values() {
        return (gd3[]) f19748d.clone();
    }
}
