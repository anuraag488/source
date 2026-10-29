package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gd */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0684gd {

    /* JADX INFO: renamed from: a */
    public static final EnumC0684gd f19741a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0684gd f19742b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumC0684gd[] f19743c;

    static {
        EnumC0684gd enumC0684gd = new EnumC0684gd("SHOW_ORIGINAL", 0);
        f19741a = enumC0684gd;
        EnumC0684gd enumC0684gd2 = new EnumC0684gd("SHOW_TRANSLATED", 1);
        f19742b = enumC0684gd2;
        EnumC0684gd[] enumC0684gdArr = {enumC0684gd, enumC0684gd2};
        f19743c = enumC0684gdArr;
        vd6.m11859r(enumC0684gdArr);
    }

    public static EnumC0684gd valueOf(String str) {
        return (EnumC0684gd) Enum.valueOf(EnumC0684gd.class, str);
    }

    public static EnumC0684gd[] values() {
        return (EnumC0684gd[]) f19743c.clone();
    }
}
