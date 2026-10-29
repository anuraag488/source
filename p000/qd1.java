package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qd1 {

    /* JADX INFO: renamed from: a */
    public static final qd1 f28394a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ qd1[] f28395b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ v91 f28396c;

    /* JADX INFO: Fake field, exist only in values array */
    qd1 EF0;

    static {
        qd1 qd1Var = new qd1("TonalSpot", 0);
        qd1 qd1Var2 = new qd1("Neutral", 1);
        qd1 qd1Var3 = new qd1("Vibrant", 2);
        qd1 qd1Var4 = new qd1("Expressive", 3);
        f28394a = qd1Var4;
        qd1[] qd1VarArr = {qd1Var, qd1Var2, qd1Var3, qd1Var4};
        f28395b = qd1VarArr;
        f28396c = vd6.m11859r(qd1VarArr);
    }

    public static qd1 valueOf(String str) {
        return (qd1) Enum.valueOf(qd1.class, str);
    }

    public static qd1[] values() {
        return (qd1[]) f28395b.clone();
    }
}
