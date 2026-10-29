package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ag3 {

    /* JADX INFO: renamed from: a */
    public static final ag3 f14485a;

    /* JADX INFO: renamed from: b */
    public static final ag3 f14486b;

    /* JADX INFO: renamed from: c */
    public static final ag3 f14487c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ag3[] f14488d;

    static {
        ag3 ag3Var = new ag3("DEFAULT", 0);
        f14485a = ag3Var;
        ag3 ag3Var2 = new ag3("VERY_LOW", 1);
        f14486b = ag3Var2;
        ag3 ag3Var3 = new ag3("HIGHEST", 2);
        f14487c = ag3Var3;
        f14488d = new ag3[]{ag3Var, ag3Var2, ag3Var3};
    }

    public static ag3 valueOf(String str) {
        return (ag3) Enum.valueOf(ag3.class, str);
    }

    public static ag3[] values() {
        return (ag3[]) f14488d.clone();
    }
}
