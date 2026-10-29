package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d63 {

    /* JADX INFO: renamed from: a */
    public static final d63 f16814a;

    /* JADX INFO: renamed from: b */
    public static final d63 f16815b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ d63[] f16816c;

    static {
        d63 d63Var = new d63("Vertical", 0);
        f16814a = d63Var;
        d63 d63Var2 = new d63("Horizontal", 1);
        f16815b = d63Var2;
        d63[] d63VarArr = {d63Var, d63Var2};
        f16816c = d63VarArr;
        vd6.m11859r(d63VarArr);
    }

    public static d63 valueOf(String str) {
        return (d63) Enum.valueOf(d63.class, str);
    }

    public static d63[] values() {
        return (d63[]) f16816c.clone();
    }
}
