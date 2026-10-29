package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class un4 {

    /* JADX INFO: renamed from: a */
    public static final un4 f32015a;

    /* JADX INFO: renamed from: b */
    public static final un4 f32016b;

    /* JADX INFO: renamed from: c */
    public static final un4 f32017c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ un4[] f32018d;

    static {
        un4 un4Var = new un4("Uninitialized", 0);
        f32015a = un4Var;
        un4 un4Var2 = new un4("Detached", 1);
        f32016b = un4Var2;
        un4 un4Var3 = new un4("Attached", 2);
        f32017c = un4Var3;
        un4[] un4VarArr = {un4Var, un4Var2, un4Var3};
        f32018d = un4VarArr;
        vd6.m11859r(un4VarArr);
    }

    public static un4 valueOf(String str) {
        return (un4) Enum.valueOf(un4.class, str);
    }

    public static un4[] values() {
        return (un4[]) f32018d.clone();
    }
}
