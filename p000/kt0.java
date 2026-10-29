package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kt0 {

    /* JADX INFO: renamed from: a */
    public static final kt0 f23413a;

    /* JADX INFO: renamed from: b */
    public static final kt0 f23414b;

    /* JADX INFO: renamed from: c */
    public static final kt0 f23415c;

    /* JADX INFO: renamed from: d */
    public static final kt0 f23416d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ kt0[] f23417e;

    static {
        kt0 kt0Var = new kt0("MEMORY_CACHE", 0);
        f23413a = kt0Var;
        kt0 kt0Var2 = new kt0("MEMORY", 1);
        f23414b = kt0Var2;
        kt0 kt0Var3 = new kt0("DISK", 2);
        f23415c = kt0Var3;
        kt0 kt0Var4 = new kt0("NETWORK", 3);
        f23416d = kt0Var4;
        kt0[] kt0VarArr = {kt0Var, kt0Var2, kt0Var3, kt0Var4};
        f23417e = kt0VarArr;
        vd6.m11859r(kt0VarArr);
    }

    public static kt0 valueOf(String str) {
        return (kt0) Enum.valueOf(kt0.class, str);
    }

    public static kt0[] values() {
        return (kt0[]) f23417e.clone();
    }
}
