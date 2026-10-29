package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x41 {

    /* JADX INFO: renamed from: a */
    public static final f70 f33972a;

    /* JADX INFO: renamed from: b */
    public static final x41 f33973b;

    /* JADX INFO: renamed from: c */
    public static final x41 f33974c;

    /* JADX INFO: renamed from: d */
    public static final x41 f33975d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ x41[] f33976e;

    static {
        x41 x41Var = new x41("PHONE", 0);
        f33974c = x41Var;
        x41 x41Var2 = new x41("WATCH", 1);
        f33975d = x41Var2;
        x41[] x41VarArr = {x41Var, x41Var2};
        f33976e = x41VarArr;
        vd6.m11859r(x41VarArr);
        f33972a = new f70((byte) 5);
        f33973b = x41Var;
    }

    public static x41 valueOf(String str) {
        return (x41) Enum.valueOf(x41.class, str);
    }

    public static x41[] values() {
        return (x41[]) f33976e.clone();
    }
}
