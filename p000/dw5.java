package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dw5 {

    /* JADX INFO: renamed from: a */
    public static final dw5 f17469a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ dw5[] f17470b;

    /* JADX INFO: Fake field, exist only in values array */
    dw5 EF0;

    static {
        dw5 dw5Var = new dw5("DEBUG_PARAM_UNKNOWN", 0);
        dw5 dw5Var2 = new dw5("ALWAYS_SHOW", 1);
        dw5 dw5Var3 = new dw5("GEO_OVERRIDE_EEA", 2);
        dw5 dw5Var4 = new dw5("GEO_OVERRIDE_REGULATED_US_STATE", 3);
        dw5 dw5Var5 = new dw5("GEO_OVERRIDE_OTHER", 4);
        dw5 dw5Var6 = new dw5("GEO_OVERRIDE_NON_EEA", 5);
        dw5 dw5Var7 = new dw5("PREVIEWING_DEBUG_MESSAGES", 6);
        f17469a = dw5Var7;
        f17470b = new dw5[]{dw5Var, dw5Var2, dw5Var3, dw5Var4, dw5Var5, dw5Var6, dw5Var7, new dw5("GEO_OVERRIDE_USFL", 7)};
    }

    public static dw5[] values() {
        return (dw5[]) f17470b.clone();
    }
}
