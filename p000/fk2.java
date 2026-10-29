package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fk2 {

    /* JADX INFO: renamed from: a */
    public static final fk2 f19054a;

    /* JADX INFO: renamed from: b */
    public static final fk2 f19055b;

    /* JADX INFO: renamed from: c */
    public static final fk2 f19056c;

    /* JADX INFO: renamed from: d */
    public static final fk2 f19057d;

    /* JADX INFO: renamed from: e */
    public static final fk2 f19058e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ fk2[] f19059f;

    static {
        fk2 fk2Var = new fk2("DESTROYED", 0);
        f19054a = fk2Var;
        fk2 fk2Var2 = new fk2("INITIALIZED", 1);
        f19055b = fk2Var2;
        fk2 fk2Var3 = new fk2("CREATED", 2);
        f19056c = fk2Var3;
        fk2 fk2Var4 = new fk2("STARTED", 3);
        f19057d = fk2Var4;
        fk2 fk2Var5 = new fk2("RESUMED", 4);
        f19058e = fk2Var5;
        fk2[] fk2VarArr = {fk2Var, fk2Var2, fk2Var3, fk2Var4, fk2Var5};
        f19059f = fk2VarArr;
        vd6.m11859r(fk2VarArr);
    }

    public static fk2 valueOf(String str) {
        return (fk2) Enum.valueOf(fk2.class, str);
    }

    public static fk2[] values() {
        return (fk2[]) f19059f.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5728a(fk2 fk2Var) {
        return compareTo(fk2Var) >= 0;
    }
}
