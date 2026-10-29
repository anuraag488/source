package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e64 {

    /* JADX INFO: renamed from: a */
    public static final e64 f17842a;

    /* JADX INFO: renamed from: b */
    public static final e64 f17843b;

    /* JADX INFO: renamed from: c */
    public static final e64 f17844c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ e64[] f17845d;

    static {
        e64 e64Var = new e64("Hidden", 0);
        f17842a = e64Var;
        e64 e64Var2 = new e64("Expanded", 1);
        f17843b = e64Var2;
        e64 e64Var3 = new e64("PartiallyExpanded", 2);
        f17844c = e64Var3;
        e64[] e64VarArr = {e64Var, e64Var2, e64Var3};
        f17845d = e64VarArr;
        vd6.m11859r(e64VarArr);
    }

    public static e64 valueOf(String str) {
        return (e64) Enum.valueOf(e64.class, str);
    }

    public static e64[] values() {
        return (e64[]) f17845d.clone();
    }
}
