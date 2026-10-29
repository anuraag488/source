package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y11 {

    /* JADX INFO: renamed from: a */
    public static final y11 f34810a;

    /* JADX INFO: renamed from: b */
    public static final y11 f34811b;

    /* JADX INFO: renamed from: c */
    public static final y11 f34812c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ y11[] f34813d;

    static {
        y11 y11Var = new y11("Yes", 0);
        f34810a = y11Var;
        y11 y11Var2 = new y11("No", 1);
        f34811b = y11Var2;
        y11 y11Var3 = new y11("NotInitialized", 2);
        f34812c = y11Var3;
        y11[] y11VarArr = {y11Var, y11Var2, y11Var3};
        f34813d = y11VarArr;
        vd6.m11859r(y11VarArr);
    }

    public static y11 valueOf(String str) {
        return (y11) Enum.valueOf(y11.class, str);
    }

    public static y11[] values() {
        return (y11[]) f34813d.clone();
    }
}
