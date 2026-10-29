package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nl1 {

    /* JADX INFO: renamed from: a */
    public static final nl1 f25927a;

    /* JADX INFO: renamed from: b */
    public static final nl1 f25928b;

    /* JADX INFO: renamed from: c */
    public static final nl1 f25929c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nl1[] f25930d;

    static {
        nl1 nl1Var = new nl1("Active", 0);
        f25927a = nl1Var;
        nl1 nl1Var2 = new nl1("ActiveParent", 1);
        f25928b = nl1Var2;
        nl1 nl1Var3 = new nl1("Captured", 2);
        nl1 nl1Var4 = new nl1("Inactive", 3);
        f25929c = nl1Var4;
        nl1[] nl1VarArr = {nl1Var, nl1Var2, nl1Var3, nl1Var4};
        f25930d = nl1VarArr;
        vd6.m11859r(nl1VarArr);
    }

    public static nl1 valueOf(String str) {
        return (nl1) Enum.valueOf(nl1.class, str);
    }

    public static nl1[] values() {
        return (nl1[]) f25930d.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8794a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                C0670g.m5864c();
                return false;
            }
        }
        return true;
    }
}
