package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y30 {

    /* JADX INFO: renamed from: a */
    public static final y30 f34832a;

    /* JADX INFO: renamed from: b */
    public static final y30 f34833b;

    /* JADX INFO: renamed from: c */
    public static final y30 f34834c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ y30[] f34835d;

    static {
        y30 y30Var = new y30("SUSPEND", 0);
        f34832a = y30Var;
        y30 y30Var2 = new y30("DROP_OLDEST", 1);
        f34833b = y30Var2;
        y30 y30Var3 = new y30("DROP_LATEST", 2);
        f34834c = y30Var3;
        y30[] y30VarArr = {y30Var, y30Var2, y30Var3};
        f34835d = y30VarArr;
        vd6.m11859r(y30VarArr);
    }

    public static y30 valueOf(String str) {
        return (y30) Enum.valueOf(y30.class, str);
    }

    public static y30[] values() {
        return (y30[]) f34835d.clone();
    }
}
