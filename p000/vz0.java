package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vz0 {

    /* JADX INFO: renamed from: a */
    public static final vz0 f32978a;

    /* JADX INFO: renamed from: b */
    public static final vz0 f32979b;

    /* JADX INFO: renamed from: c */
    public static final vz0 f32980c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ vz0[] f32981d;

    static {
        vz0 vz0Var = new vz0("Vertical", 0);
        f32978a = vz0Var;
        vz0 vz0Var2 = new vz0("Horizontal", 1);
        f32979b = vz0Var2;
        vz0 vz0Var3 = new vz0("Both", 2);
        f32980c = vz0Var3;
        vz0[] vz0VarArr = {vz0Var, vz0Var2, vz0Var3};
        f32981d = vz0VarArr;
        vd6.m11859r(vz0VarArr);
    }

    public static vz0 valueOf(String str) {
        return (vz0) Enum.valueOf(vz0.class, str);
    }

    public static vz0[] values() {
        return (vz0[]) f32981d.clone();
    }
}
