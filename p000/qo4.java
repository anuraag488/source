package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qo4 {

    /* JADX INFO: renamed from: a */
    public static final qo4 f28644a;

    /* JADX INFO: renamed from: b */
    public static final qo4 f28645b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ qo4[] f28646c;

    static {
        qo4 qo4Var = new qo4("DEFERRED", 0);
        f28644a = qo4Var;
        qo4 qo4Var2 = new qo4("IMMEDIATE", 1);
        f28645b = qo4Var2;
        qo4[] qo4VarArr = {qo4Var, qo4Var2, new qo4("EXCLUSIVE", 2)};
        f28646c = qo4VarArr;
        vd6.m11859r(qo4VarArr);
    }

    public static qo4 valueOf(String str) {
        return (qo4) Enum.valueOf(qo4.class, str);
    }

    public static qo4[] values() {
        return (qo4[]) f28646c.clone();
    }
}
