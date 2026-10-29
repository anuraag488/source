package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class px3 {

    /* JADX INFO: renamed from: a */
    public static final px3 f28068a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ px3[] f28069b;

    static {
        px3 px3Var = new px3("SWAP", 0);
        f28068a = px3Var;
        px3[] px3VarArr = {px3Var, new px3("INSERT", 1)};
        f28069b = px3VarArr;
        vd6.m11859r(px3VarArr);
    }

    public static px3 valueOf(String str) {
        return (px3) Enum.valueOf(px3.class, str);
    }

    public static px3[] values() {
        return (px3[]) f28069b.clone();
    }
}
