package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class an0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ an0[] f14634a;

    /* JADX INFO: Fake field, exist only in values array */
    an0 EF5;

    static {
        an0[] an0VarArr = {new an0("Default", 0), new an0("Medium", 1), new an0("High", 2), new an0("Reduced", 3)};
        f14634a = an0VarArr;
        vd6.m11859r(an0VarArr);
    }

    public static an0 valueOf(String str) {
        return (an0) Enum.valueOf(an0.class, str);
    }

    public static an0[] values() {
        return (an0[]) f14634a.clone();
    }
}
