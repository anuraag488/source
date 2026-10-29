package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vr0 {

    /* JADX INFO: renamed from: a */
    public static final vr0 f32805a;

    /* JADX INFO: renamed from: b */
    public static final vr0 f32806b;

    /* JADX INFO: renamed from: c */
    public static final vr0 f32807c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ vr0[] f32808d;

    static {
        vr0 vr0Var = new vr0("CROSSED", 0);
        f32805a = vr0Var;
        vr0 vr0Var2 = new vr0("NOT_CROSSED", 1);
        f32806b = vr0Var2;
        vr0 vr0Var3 = new vr0("COLLAPSED", 2);
        f32807c = vr0Var3;
        vr0[] vr0VarArr = {vr0Var, vr0Var2, vr0Var3};
        f32808d = vr0VarArr;
        vd6.m11859r(vr0VarArr);
    }

    public static vr0 valueOf(String str) {
        return (vr0) Enum.valueOf(vr0.class, str);
    }

    public static vr0[] values() {
        return (vr0[]) f32808d.clone();
    }
}
