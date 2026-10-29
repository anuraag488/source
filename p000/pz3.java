package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pz3 {

    /* JADX INFO: renamed from: a */
    public static final pz3 f28106a;

    /* JADX INFO: renamed from: b */
    public static final pz3 f28107b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ pz3[] f28108c;

    static {
        pz3 pz3Var = new pz3("Inherit", 0);
        f28106a = pz3Var;
        pz3 pz3Var2 = new pz3("SecureOn", 1);
        f28107b = pz3Var2;
        pz3[] pz3VarArr = {pz3Var, pz3Var2, new pz3("SecureOff", 2)};
        f28108c = pz3VarArr;
        vd6.m11859r(pz3VarArr);
    }

    public static pz3 valueOf(String str) {
        return (pz3) Enum.valueOf(pz3.class, str);
    }

    public static pz3[] values() {
        return (pz3[]) f28108c.clone();
    }
}
