package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f63 {

    /* JADX INFO: renamed from: a */
    public static final f63 f18787a;

    /* JADX INFO: renamed from: b */
    public static final f63 f18788b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ f63[] f18789c;

    static {
        f63 f63Var = new f63("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        f18787a = f63Var;
        f63 f63Var2 = new f63("DROP_WORK_REQUEST", 1);
        f18788b = f63Var2;
        f63[] f63VarArr = {f63Var, f63Var2};
        f18789c = f63VarArr;
        vd6.m11859r(f63VarArr);
    }

    public static f63 valueOf(String str) {
        return (f63) Enum.valueOf(f63.class, str);
    }

    public static f63[] values() {
        return (f63[]) f18789c.clone();
    }
}
