package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w62 {

    /* JADX INFO: renamed from: a */
    public static final w62 f33120a;

    /* JADX INFO: renamed from: b */
    public static final w62 f33121b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ w62[] f33122c;

    static {
        w62 w62Var = new w62("Width", 0);
        f33120a = w62Var;
        w62 w62Var2 = new w62("Height", 1);
        f33121b = w62Var2;
        w62[] w62VarArr = {w62Var, w62Var2};
        f33122c = w62VarArr;
        vd6.m11859r(w62VarArr);
    }

    public static w62 valueOf(String str) {
        return (w62) Enum.valueOf(w62.class, str);
    }

    public static w62[] values() {
        return (w62[]) f33122c.clone();
    }
}
