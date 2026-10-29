package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t62 {

    /* JADX INFO: renamed from: a */
    public static final t62 f30797a;

    /* JADX INFO: renamed from: b */
    public static final t62 f30798b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ t62[] f30799c;

    static {
        t62 t62Var = new t62("Min", 0);
        f30797a = t62Var;
        t62 t62Var2 = new t62("Max", 1);
        f30798b = t62Var2;
        t62[] t62VarArr = {t62Var, t62Var2};
        f30799c = t62VarArr;
        vd6.m11859r(t62VarArr);
    }

    public static t62 valueOf(String str) {
        return (t62) Enum.valueOf(t62.class, str);
    }

    public static t62[] values() {
        return (t62[]) f30799c.clone();
    }
}
