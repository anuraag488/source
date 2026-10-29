package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qf1 {

    /* JADX INFO: renamed from: a */
    public static final qf1 f28435a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ qf1[] f28436b;

    static {
        qf1 qf1Var = new qf1("TOP_DOWN", 0);
        f28435a = qf1Var;
        qf1[] qf1VarArr = {qf1Var, new qf1("BOTTOM_UP", 1)};
        f28436b = qf1VarArr;
        vd6.m11859r(qf1VarArr);
    }

    public static qf1 valueOf(String str) {
        return (qf1) Enum.valueOf(qf1.class, str);
    }

    public static qf1[] values() {
        return (qf1[]) f28436b.clone();
    }
}
