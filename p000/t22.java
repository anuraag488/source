package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t22 {

    /* JADX INFO: renamed from: a */
    public static final t22 f30731a;

    /* JADX INFO: renamed from: b */
    public static final t22 f30732b;

    /* JADX INFO: renamed from: c */
    public static final t22 f30733c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ t22[] f30734d;

    static {
        t22 t22Var = new t22("Yes", 0);
        f30731a = t22Var;
        t22 t22Var2 = new t22("No", 1);
        f30732b = t22Var2;
        t22 t22Var3 = new t22("NotInitialized", 2);
        f30733c = t22Var3;
        t22[] t22VarArr = {t22Var, t22Var2, t22Var3};
        f30734d = t22VarArr;
        vd6.m11859r(t22VarArr);
    }

    public static t22 valueOf(String str) {
        return (t22) Enum.valueOf(t22.class, str);
    }

    public static t22[] values() {
        return (t22[]) f30734d.clone();
    }
}
