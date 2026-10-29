package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yw2 {

    /* JADX INFO: renamed from: a */
    public static final yw2 f35566a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ yw2[] f35567b;

    static {
        yw2 yw2Var = new yw2("Default", 0);
        f35566a = yw2Var;
        yw2[] yw2VarArr = {yw2Var, new yw2("UserInput", 1), new yw2("PreventUserInput", 2)};
        f35567b = yw2VarArr;
        vd6.m11859r(yw2VarArr);
    }

    public static yw2 valueOf(String str) {
        return (yw2) Enum.valueOf(yw2.class, str);
    }

    public static yw2[] values() {
        return (yw2[]) f35567b.clone();
    }
}
