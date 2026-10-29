package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sn3 {

    /* JADX INFO: renamed from: a */
    public static final sn3 f30409a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ sn3[] f30410b;

    static {
        sn3 sn3Var = new sn3("Restart", 0);
        f30409a = sn3Var;
        sn3[] sn3VarArr = {sn3Var, new sn3("Reverse", 1)};
        f30410b = sn3VarArr;
        vd6.m11859r(sn3VarArr);
    }

    public static sn3 valueOf(String str) {
        return (sn3) Enum.valueOf(sn3.class, str);
    }

    public static sn3[] values() {
        return (sn3[]) f30410b.clone();
    }
}
