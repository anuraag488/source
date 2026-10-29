package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m72 {

    /* JADX INFO: renamed from: a */
    public static final m72 f24705a;

    /* JADX INFO: renamed from: b */
    public static final m72 f24706b;

    /* JADX INFO: renamed from: c */
    public static final m72 f24707c;

    /* JADX INFO: renamed from: d */
    public static final m72 f24708d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ m72[] f24709e;

    static {
        m72 m72Var = new m72("IGNORED", 0);
        f24705a = m72Var;
        m72 m72Var2 = new m72("SCHEDULED", 1);
        f24706b = m72Var2;
        m72 m72Var3 = new m72("DEFERRED", 2);
        f24707c = m72Var3;
        m72 m72Var4 = new m72("IMMINENT", 3);
        f24708d = m72Var4;
        m72[] m72VarArr = {m72Var, m72Var2, m72Var3, m72Var4};
        f24709e = m72VarArr;
        vd6.m11859r(m72VarArr);
    }

    public static m72 valueOf(String str) {
        return (m72) Enum.valueOf(m72.class, str);
    }

    public static m72[] values() {
        return (m72[]) f24709e.clone();
    }
}
