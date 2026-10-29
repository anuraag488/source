package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jr2 {

    /* JADX INFO: renamed from: a */
    public static final jr2 f22540a;

    /* JADX INFO: renamed from: b */
    public static final jr2 f22541b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ jr2[] f22542c;

    static {
        jr2 jr2Var = new jr2("Width", 0);
        f22540a = jr2Var;
        jr2 jr2Var2 = new jr2("Height", 1);
        f22541b = jr2Var2;
        jr2[] jr2VarArr = {jr2Var, jr2Var2};
        f22542c = jr2VarArr;
        vd6.m11859r(jr2VarArr);
    }

    public static jr2 valueOf(String str) {
        return (jr2) Enum.valueOf(jr2.class, str);
    }

    public static jr2[] values() {
        return (jr2[]) f22542c.clone();
    }
}
