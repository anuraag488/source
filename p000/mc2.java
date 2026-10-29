package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mc2 {

    /* JADX INFO: renamed from: a */
    public static final mc2 f24814a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ mc2[] f24815b;

    static {
        mc2 mc2Var = new mc2("INVARIANT", 0);
        f24814a = mc2Var;
        mc2[] mc2VarArr = {mc2Var, new mc2("IN", 1), new mc2("OUT", 2)};
        f24815b = mc2VarArr;
        vd6.m11859r(mc2VarArr);
    }

    public static mc2 valueOf(String str) {
        return (mc2) Enum.valueOf(mc2.class, str);
    }

    public static mc2[] values() {
        return (mc2[]) f24815b.clone();
    }
}
