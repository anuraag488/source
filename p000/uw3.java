package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uw3 {

    /* JADX INFO: renamed from: a */
    public static final uw3 f32214a;

    /* JADX INFO: renamed from: b */
    public static final uw3 f32215b;

    /* JADX INFO: renamed from: c */
    public static final uw3 f32216c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ uw3[] f32217d;

    static {
        uw3 uw3Var = new uw3("Off", 0);
        f32214a = uw3Var;
        uw3 uw3Var2 = new uw3("Locked", 1);
        f32215b = uw3Var2;
        uw3 uw3Var3 = new uw3("Unlocked", 2);
        f32216c = uw3Var3;
        uw3[] uw3VarArr = {uw3Var, uw3Var2, uw3Var3};
        f32217d = uw3VarArr;
        vd6.m11859r(uw3VarArr);
    }

    public static uw3 valueOf(String str) {
        return (uw3) Enum.valueOf(uw3.class, str);
    }

    public static uw3[] values() {
        return (uw3[]) f32217d.clone();
    }
}
