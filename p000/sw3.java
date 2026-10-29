package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sw3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ sw3[] f30611a;

    /* JADX INFO: Fake field, exist only in values array */
    sw3 EF0;

    static {
        sw3 sw3Var = new sw3("Left", 0);
        sw3 sw3Var2 = new sw3("Top", 1);
        sw3 sw3Var3 = new sw3("Right", 2);
        sw3[] sw3VarArr = {sw3Var, sw3Var2, sw3Var3, new sw3("Bottom", 3)};
        f30611a = sw3VarArr;
        vd6.m11859r(sw3VarArr);
    }

    public static sw3 valueOf(String str) {
        return (sw3) Enum.valueOf(sw3.class, str);
    }

    public static sw3[] values() {
        return (sw3[]) f30611a.clone();
    }
}
