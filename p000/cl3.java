package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cl3 {

    /* JADX INFO: renamed from: a */
    public static final cl3 f16099a;

    /* JADX INFO: renamed from: b */
    public static final cl3 f16100b;

    /* JADX INFO: renamed from: c */
    public static final cl3 f16101c;

    /* JADX INFO: renamed from: d */
    public static final cl3 f16102d;

    /* JADX INFO: renamed from: e */
    public static final cl3 f16103e;

    /* JADX INFO: renamed from: f */
    public static final cl3 f16104f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ cl3[] f16105g;

    static {
        cl3 cl3Var = new cl3("ShutDown", 0);
        f16099a = cl3Var;
        cl3 cl3Var2 = new cl3("ShuttingDown", 1);
        f16100b = cl3Var2;
        cl3 cl3Var3 = new cl3("Inactive", 2);
        f16101c = cl3Var3;
        cl3 cl3Var4 = new cl3("InactivePendingWork", 3);
        f16102d = cl3Var4;
        cl3 cl3Var5 = new cl3("Idle", 4);
        f16103e = cl3Var5;
        cl3 cl3Var6 = new cl3("PendingWork", 5);
        f16104f = cl3Var6;
        cl3[] cl3VarArr = {cl3Var, cl3Var2, cl3Var3, cl3Var4, cl3Var5, cl3Var6};
        f16105g = cl3VarArr;
        vd6.m11859r(cl3VarArr);
    }

    public static cl3 valueOf(String str) {
        return (cl3) Enum.valueOf(cl3.class, str);
    }

    public static cl3[] values() {
        return (cl3[]) f16105g.clone();
    }
}
