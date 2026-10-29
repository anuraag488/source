package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j54 {

    /* JADX INFO: renamed from: a */
    public static final j54 f22029a;

    /* JADX INFO: renamed from: b */
    public static final j54 f22030b;

    /* JADX INFO: renamed from: c */
    public static final j54 f22031c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ j54[] f22032d;

    static {
        j54 j54Var = new j54("START", 0);
        f22029a = j54Var;
        j54 j54Var2 = new j54("STOP", 1);
        f22030b = j54Var2;
        j54 j54Var3 = new j54("STOP_AND_RESET_REPLAY_CACHE", 2);
        f22031c = j54Var3;
        j54[] j54VarArr = {j54Var, j54Var2, j54Var3};
        f22032d = j54VarArr;
        vd6.m11859r(j54VarArr);
    }

    public static j54 valueOf(String str) {
        return (j54) Enum.valueOf(j54.class, str);
    }

    public static j54[] values() {
        return (j54[]) f22032d.clone();
    }
}
