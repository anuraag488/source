package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yf4 {

    /* JADX INFO: renamed from: a */
    public static final yf4 f35196a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ yf4[] f35197b;

    /* JADX INFO: Fake field, exist only in values array */
    yf4 EF0;

    static {
        yf4 yf4Var = new yf4("High", 0);
        yf4 yf4Var2 = new yf4("Normal", 1);
        f35196a = yf4Var2;
        yf4[] yf4VarArr = {yf4Var, yf4Var2};
        f35197b = yf4VarArr;
        vd6.m11859r(yf4VarArr);
    }

    public static yf4 valueOf(String str) {
        return (yf4) Enum.valueOf(yf4.class, str);
    }

    public static yf4[] values() {
        return (yf4[]) f35197b.clone();
    }
}
