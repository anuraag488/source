package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i13 {

    /* JADX INFO: renamed from: a */
    public static final i13 f21006a;

    /* JADX INFO: renamed from: b */
    public static final i13 f21007b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ i13[] f21008c;

    static {
        i13 i13Var = new i13("Width", 0);
        f21006a = i13Var;
        i13 i13Var2 = new i13("Height", 1);
        f21007b = i13Var2;
        i13[] i13VarArr = {i13Var, i13Var2};
        f21008c = i13VarArr;
        vd6.m11859r(i13VarArr);
    }

    public static i13 valueOf(String str) {
        return (i13) Enum.valueOf(i13.class, str);
    }

    public static i13[] values() {
        return (i13[]) f21008c.clone();
    }
}
