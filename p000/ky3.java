package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ky3 {

    /* JADX INFO: renamed from: a */
    public static final ky3 f23619a;

    /* JADX INFO: renamed from: b */
    public static final ky3 f23620b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ky3[] f23621c;

    static {
        ky3 ky3Var = new ky3("BACKWARD", 0);
        f23619a = ky3Var;
        ky3 ky3Var2 = new ky3("FORWARD", 1);
        f23620b = ky3Var2;
        ky3[] ky3VarArr = {ky3Var, ky3Var2};
        f23621c = ky3VarArr;
        vd6.m11859r(ky3VarArr);
    }

    public static ky3 valueOf(String str) {
        return (ky3) Enum.valueOf(ky3.class, str);
    }

    public static ky3[] values() {
        return (ky3[]) f23621c.clone();
    }
}
