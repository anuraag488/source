package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: q5 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1059q5 {

    /* JADX INFO: renamed from: a */
    public static final EnumC1059q5 f28220a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC1059q5[] f28221b;

    static {
        EnumC1059q5 enumC1059q5 = new EnumC1059q5("LargeAdaptive", 0);
        f28220a = enumC1059q5;
        EnumC1059q5[] enumC1059q5Arr = {enumC1059q5, new EnumC1059q5("Banner", 1), new EnumC1059q5("LargeBanner", 2)};
        f28221b = enumC1059q5Arr;
        vd6.m11859r(enumC1059q5Arr);
    }

    public static EnumC1059q5 valueOf(String str) {
        return (EnumC1059q5) Enum.valueOf(EnumC1059q5.class, str);
    }

    public static EnumC1059q5[] values() {
        return (EnumC1059q5[]) f28221b.clone();
    }
}
