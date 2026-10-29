package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v74 {

    /* JADX INFO: renamed from: a */
    public static final v74 f32448a;

    /* JADX INFO: renamed from: b */
    public static final v74 f32449b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ v74[] f32450c;

    static {
        v74 v74Var = new v74("THUMB", 0);
        f32448a = v74Var;
        v74 v74Var2 = new v74("TRACK", 1);
        f32449b = v74Var2;
        v74[] v74VarArr = {v74Var, v74Var2};
        f32450c = v74VarArr;
        vd6.m11859r(v74VarArr);
    }

    public static v74 valueOf(String str) {
        return (v74) Enum.valueOf(v74.class, str);
    }

    public static v74[] values() {
        return (v74[]) f32450c.clone();
    }
}
