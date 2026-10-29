package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class on0 {

    /* JADX INFO: renamed from: a */
    public static final on0 f26896a;

    /* JADX INFO: renamed from: b */
    public static final on0 f26897b;

    /* JADX INFO: renamed from: c */
    public static final on0 f26898c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ on0[] f26899d;

    static {
        on0 on0Var = new on0("Unavailable", 0);
        f26896a = on0Var;
        on0 on0Var2 = new on0("Active", 1);
        f26897b = on0Var2;
        on0 on0Var3 = new on0("Inactive", 2);
        f26898c = on0Var3;
        on0[] on0VarArr = {on0Var, on0Var2, on0Var3};
        f26899d = on0VarArr;
        vd6.m11859r(on0VarArr);
    }

    public static on0 valueOf(String str) {
        return (on0) Enum.valueOf(on0.class, str);
    }

    public static on0[] values() {
        return (on0[]) f26899d.clone();
    }
}
