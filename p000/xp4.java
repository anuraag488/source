package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xp4 {

    /* JADX INFO: renamed from: a */
    public static final xp4 f34520a;

    /* JADX INFO: renamed from: b */
    public static final xp4 f34521b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ xp4[] f34522c;

    static {
        xp4 xp4Var = new xp4("Rewarded", 0);
        f34520a = xp4Var;
        xp4 xp4Var2 = new xp4("InForeground", 1);
        f34521b = xp4Var2;
        xp4[] xp4VarArr = {xp4Var, xp4Var2};
        f34522c = xp4VarArr;
        vd6.m11859r(xp4VarArr);
    }

    public static xp4 valueOf(String str) {
        return (xp4) Enum.valueOf(xp4.class, str);
    }

    public static xp4[] values() {
        return (xp4[]) f34522c.clone();
    }
}
