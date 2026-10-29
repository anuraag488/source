package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ua4 {

    /* JADX INFO: renamed from: a */
    public static final ua4 f31759a;

    /* JADX INFO: renamed from: b */
    public static final ua4 f31760b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ua4[] f31761c;

    /* JADX INFO: Fake field, exist only in values array */
    ua4 EF0;

    static {
        ua4 ua4Var = new ua4("REMOVED", 0);
        ua4 ua4Var2 = new ua4("VISIBLE", 1);
        f31759a = ua4Var2;
        ua4 ua4Var3 = new ua4("GONE", 2);
        f31760b = ua4Var3;
        ua4[] ua4VarArr = {ua4Var, ua4Var2, ua4Var3, new ua4("INVISIBLE", 3)};
        f31761c = ua4VarArr;
        vd6.m11859r(ua4VarArr);
    }

    public static ua4 valueOf(String str) {
        return (ua4) Enum.valueOf(ua4.class, str);
    }

    public static ua4[] values() {
        return (ua4[]) f31761c.clone();
    }
}
