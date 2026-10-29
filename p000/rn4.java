package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rn4 {

    /* JADX INFO: renamed from: a */
    public static final rn4 f29461a;

    /* JADX INFO: renamed from: b */
    public static final rn4 f29462b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ rn4[] f29463c;

    static {
        rn4 rn4Var = new rn4("EXACT", 0);
        f29461a = rn4Var;
        rn4 rn4Var2 = new rn4("NEARER", 1);
        rn4 rn4Var3 = new rn4("FARTHER", 2);
        f29462b = rn4Var3;
        rn4[] rn4VarArr = {rn4Var, rn4Var2, rn4Var3};
        f29463c = rn4VarArr;
        vd6.m11859r(rn4VarArr);
    }

    public static rn4 valueOf(String str) {
        return (rn4) Enum.valueOf(rn4.class, str);
    }

    public static rn4[] values() {
        return (rn4[]) f29463c.clone();
    }
}
