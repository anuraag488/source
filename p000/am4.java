package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class am4 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ am4[] f14631a;

    /* JADX INFO: Fake field, exist only in values array */
    am4 EF5;

    static {
        am4[] am4VarArr = {new am4("Shown", 0), new am4("Hidden", 1)};
        f14631a = am4VarArr;
        vd6.m11859r(am4VarArr);
    }

    public static am4 valueOf(String str) {
        return (am4) Enum.valueOf(am4.class, str);
    }

    public static am4[] values() {
        return (am4[]) f14631a.clone();
    }
}
