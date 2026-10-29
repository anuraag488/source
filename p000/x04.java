package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x04 {

    /* JADX INFO: renamed from: a */
    public static final x04 f33900a;

    /* JADX INFO: renamed from: b */
    public static final x04 f33901b;

    /* JADX INFO: renamed from: c */
    public static final x04 f33902c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ x04[] f33903d;

    static {
        x04 x04Var = new x04("Left", 0);
        f33900a = x04Var;
        x04 x04Var2 = new x04("Middle", 1);
        f33901b = x04Var2;
        x04 x04Var3 = new x04("Right", 2);
        f33902c = x04Var3;
        x04[] x04VarArr = {x04Var, x04Var2, x04Var3};
        f33903d = x04VarArr;
        vd6.m11859r(x04VarArr);
    }

    public static x04 valueOf(String str) {
        return (x04) Enum.valueOf(x04.class, str);
    }

    public static x04[] values() {
        return (x04[]) f33903d.clone();
    }
}
