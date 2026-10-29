package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: qg */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1070qg {

    /* JADX INFO: renamed from: a */
    public static final EnumC1070qg f28446a;

    /* JADX INFO: renamed from: b */
    public static final EnumC1070qg f28447b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumC1070qg[] f28448c;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1070qg EF0;

    static {
        EnumC1070qg enumC1070qg = new EnumC1070qg("Global", 0);
        EnumC1070qg enumC1070qg2 = new EnumC1070qg("Secure", 1);
        f28446a = enumC1070qg2;
        EnumC1070qg enumC1070qg3 = new EnumC1070qg("System", 2);
        f28447b = enumC1070qg3;
        EnumC1070qg[] enumC1070qgArr = {enumC1070qg, enumC1070qg2, enumC1070qg3};
        f28448c = enumC1070qgArr;
        vd6.m11859r(enumC1070qgArr);
    }

    public static EnumC1070qg valueOf(String str) {
        return (EnumC1070qg) Enum.valueOf(EnumC1070qg.class, str);
    }

    public static EnumC1070qg[] values() {
        return (EnumC1070qg[]) f28448c.clone();
    }
}
