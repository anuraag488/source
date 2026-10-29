package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kg2 {

    /* JADX INFO: renamed from: a */
    public static final kg2 f23106a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ kg2[] f23107b;

    static {
        kg2 kg2Var = new kg2("Horizontal", 0);
        f23106a = kg2Var;
        kg2[] kg2VarArr = {kg2Var, new kg2("Vertical", 1)};
        f23107b = kg2VarArr;
        vd6.m11859r(kg2VarArr);
    }

    public static kg2 valueOf(String str) {
        return (kg2) Enum.valueOf(kg2.class, str);
    }

    public static kg2[] values() {
        return (kg2[]) f23107b.clone();
    }
}
