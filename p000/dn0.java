package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dn0 {

    /* JADX INFO: renamed from: a */
    public static final dn0 f17203a;

    /* JADX INFO: renamed from: b */
    public static final dn0 f17204b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ dn0[] f17205c;

    static {
        dn0 dn0Var = new dn0("State", 0);
        f17203a = dn0Var;
        dn0 dn0Var2 = new dn0("Action", 1);
        f17204b = dn0Var2;
        dn0[] dn0VarArr = {dn0Var, dn0Var2};
        f17205c = dn0VarArr;
        vd6.m11859r(dn0VarArr);
    }

    public static dn0 valueOf(String str) {
        return (dn0) Enum.valueOf(dn0.class, str);
    }

    public static dn0[] values() {
        return (dn0[]) f17205c.clone();
    }
}
