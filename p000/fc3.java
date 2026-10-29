package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fc3 {

    /* JADX INFO: renamed from: a */
    public static final fc3 f18903a;

    /* JADX INFO: renamed from: b */
    public static final fc3 f18904b;

    /* JADX INFO: renamed from: c */
    public static final fc3 f18905c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ fc3[] f18906d;

    static {
        fc3 fc3Var = new fc3("Initial", 0);
        f18903a = fc3Var;
        fc3 fc3Var2 = new fc3("Main", 1);
        f18904b = fc3Var2;
        fc3 fc3Var3 = new fc3("Final", 2);
        f18905c = fc3Var3;
        fc3[] fc3VarArr = {fc3Var, fc3Var2, fc3Var3};
        f18906d = fc3VarArr;
        vd6.m11859r(fc3VarArr);
    }

    public static fc3 valueOf(String str) {
        return (fc3) Enum.valueOf(fc3.class, str);
    }

    public static fc3[] values() {
        return (fc3[]) f18906d.clone();
    }
}
