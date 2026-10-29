package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qv3 {

    /* JADX INFO: renamed from: a */
    public static final qv3 f28832a;

    /* JADX INFO: renamed from: b */
    public static final qv3 f28833b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ qv3[] f28834c;

    static {
        qv3 qv3Var = new qv3("FILL", 0);
        f28832a = qv3Var;
        qv3 qv3Var2 = new qv3("FIT", 1);
        f28833b = qv3Var2;
        qv3[] qv3VarArr = {qv3Var, qv3Var2};
        f28834c = qv3VarArr;
        vd6.m11859r(qv3VarArr);
    }

    public static qv3 valueOf(String str) {
        return (qv3) Enum.valueOf(qv3.class, str);
    }

    public static qv3[] values() {
        return (qv3[]) f28834c.clone();
    }
}
