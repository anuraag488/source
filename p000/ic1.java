package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ic1 {

    /* JADX INFO: renamed from: a */
    public static final ic1 f21255a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ic1[] f21256b;

    /* JADX INFO: Fake field, exist only in values array */
    ic1 EF0;

    static {
        ic1 ic1Var = new ic1("IGNORE", 0);
        ic1 ic1Var2 = new ic1("RESPECT_PERFORMANCE", 1);
        f21255a = ic1Var2;
        ic1[] ic1VarArr = {ic1Var, ic1Var2, new ic1("RESPECT_ALL", 2)};
        f21256b = ic1VarArr;
        vd6.m11859r(ic1VarArr);
    }

    public static ic1 valueOf(String str) {
        return (ic1) Enum.valueOf(ic1.class, str);
    }

    public static ic1[] values() {
        return (ic1[]) f21256b.clone();
    }
}
