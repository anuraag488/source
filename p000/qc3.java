package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qc3 {

    /* JADX INFO: renamed from: a */
    public static final qc3 f28383a;

    /* JADX INFO: renamed from: b */
    public static final qc3 f28384b;

    /* JADX INFO: renamed from: c */
    public static final qc3 f28385c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ qc3[] f28386d;

    static {
        qc3 qc3Var = new qc3("Unknown", 0);
        f28383a = qc3Var;
        qc3 qc3Var2 = new qc3("Dispatching", 1);
        f28384b = qc3Var2;
        qc3 qc3Var3 = new qc3("NotDispatching", 2);
        f28385c = qc3Var3;
        qc3[] qc3VarArr = {qc3Var, qc3Var2, qc3Var3};
        f28386d = qc3VarArr;
        vd6.m11859r(qc3VarArr);
    }

    public static qc3 valueOf(String str) {
        return (qc3) Enum.valueOf(qc3.class, str);
    }

    public static qc3[] values() {
        return (qc3[]) f28386d.clone();
    }
}
