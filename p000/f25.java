package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f25 {

    /* JADX INFO: renamed from: a */
    public static final f25 f18681a;

    /* JADX INFO: renamed from: b */
    public static final f25 f18682b;

    /* JADX INFO: renamed from: c */
    public static final f25 f18683c;

    /* JADX INFO: renamed from: d */
    public static final f25 f18684d;

    /* JADX INFO: renamed from: e */
    public static final f25 f18685e;

    /* JADX INFO: renamed from: f */
    public static final f25 f18686f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ f25[] f18687g;

    static {
        f25 f25Var = new f25("ENQUEUED", 0);
        f18681a = f25Var;
        f25 f25Var2 = new f25("RUNNING", 1);
        f18682b = f25Var2;
        f25 f25Var3 = new f25("SUCCEEDED", 2);
        f18683c = f25Var3;
        f25 f25Var4 = new f25("FAILED", 3);
        f18684d = f25Var4;
        f25 f25Var5 = new f25("BLOCKED", 4);
        f18685e = f25Var5;
        f25 f25Var6 = new f25("CANCELLED", 5);
        f18686f = f25Var6;
        f25[] f25VarArr = {f25Var, f25Var2, f25Var3, f25Var4, f25Var5, f25Var6};
        f18687g = f25VarArr;
        vd6.m11859r(f25VarArr);
    }

    public static f25 valueOf(String str) {
        return (f25) Enum.valueOf(f25.class, str);
    }

    public static f25[] values() {
        return (f25[]) f18687g.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5459a() {
        return this == f18683c || this == f18684d || this == f18686f;
    }
}
