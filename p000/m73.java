package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m73 {

    /* JADX INFO: renamed from: a */
    public static final m73 f24710a;

    /* JADX INFO: renamed from: b */
    public static final m73 f24711b;

    /* JADX INFO: renamed from: c */
    public static final m73 f24712c;

    /* JADX INFO: renamed from: d */
    public static final m73 f24713d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ m73[] f24714e;

    static {
        m73 m73Var = new m73("TonalSpot", 0);
        f24710a = m73Var;
        m73 m73Var2 = new m73("Neutral", 1);
        f24711b = m73Var2;
        m73 m73Var3 = new m73("Vibrant", 2);
        f24712c = m73Var3;
        m73 m73Var4 = new m73("Expressive", 3);
        f24713d = m73Var4;
        m73[] m73VarArr = {m73Var, m73Var2, m73Var3, m73Var4, new m73("Rainbow", 4), new m73("FruitSalad", 5), new m73("Monochrome", 6), new m73("Fidelity", 7), new m73("Content", 8)};
        f24714e = m73VarArr;
        vd6.m11859r(m73VarArr);
    }

    public static m73 valueOf(String str) {
        return (m73) Enum.valueOf(m73.class, str);
    }

    public static m73[] values() {
        return (m73[]) f24714e.clone();
    }
}
