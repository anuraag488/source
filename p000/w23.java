package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w23 {

    /* JADX INFO: renamed from: a */
    public static final w23 f33040a;

    /* JADX INFO: renamed from: b */
    public static final w23 f33041b;

    /* JADX INFO: renamed from: c */
    public static final w23 f33042c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ w23[] f33043d;

    static {
        w23 w23Var = new w23("NO_OP", 0);
        f33040a = w23Var;
        w23 w23Var2 = new w23("ADD", 1);
        f33041b = w23Var2;
        w23 w23Var3 = new w23("REMOVE", 2);
        f33042c = w23Var3;
        w23[] w23VarArr = {w23Var, w23Var2, w23Var3};
        f33043d = w23VarArr;
        vd6.m11859r(w23VarArr);
    }

    public static w23 valueOf(String str) {
        return (w23) Enum.valueOf(w23.class, str);
    }

    public static w23[] values() {
        return (w23[]) f33043d.clone();
    }
}
