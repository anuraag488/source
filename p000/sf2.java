package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sf2 {

    /* JADX INFO: renamed from: a */
    public static final sf2 f30226a;

    /* JADX INFO: renamed from: b */
    public static final sf2 f30227b;

    /* JADX INFO: renamed from: c */
    public static final sf2 f30228c;

    /* JADX INFO: renamed from: d */
    public static final sf2 f30229d;

    /* JADX INFO: renamed from: e */
    public static final sf2 f30230e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ sf2[] f30231f;

    static {
        sf2 sf2Var = new sf2("Measuring", 0);
        f30226a = sf2Var;
        sf2 sf2Var2 = new sf2("LookaheadMeasuring", 1);
        f30227b = sf2Var2;
        sf2 sf2Var3 = new sf2("LayingOut", 2);
        f30228c = sf2Var3;
        sf2 sf2Var4 = new sf2("LookaheadLayingOut", 3);
        f30229d = sf2Var4;
        sf2 sf2Var5 = new sf2("Idle", 4);
        f30230e = sf2Var5;
        sf2[] sf2VarArr = {sf2Var, sf2Var2, sf2Var3, sf2Var4, sf2Var5};
        f30231f = sf2VarArr;
        vd6.m11859r(sf2VarArr);
    }

    public static sf2 valueOf(String str) {
        return (sf2) Enum.valueOf(sf2.class, str);
    }

    public static sf2[] values() {
        return (sf2[]) f30231f.clone();
    }
}
