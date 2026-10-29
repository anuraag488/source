package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uu1 {

    /* JADX INFO: renamed from: a */
    public static final uu1 f32175a;

    /* JADX INFO: renamed from: b */
    public static final uu1 f32176b;

    /* JADX INFO: renamed from: c */
    public static final uu1 f32177c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ uu1[] f32178d;

    static {
        uu1 uu1Var = new uu1("Cursor", 0);
        f32175a = uu1Var;
        uu1 uu1Var2 = new uu1("SelectionStart", 1);
        f32176b = uu1Var2;
        uu1 uu1Var3 = new uu1("SelectionEnd", 2);
        f32177c = uu1Var3;
        uu1[] uu1VarArr = {uu1Var, uu1Var2, uu1Var3};
        f32178d = uu1VarArr;
        vd6.m11859r(uu1VarArr);
    }

    public static uu1 valueOf(String str) {
        return (uu1) Enum.valueOf(uu1.class, str);
    }

    public static uu1[] values() {
        return (uu1[]) f32178d.clone();
    }
}
