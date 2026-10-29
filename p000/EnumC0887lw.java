package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lw */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0887lw {

    /* JADX INFO: renamed from: a */
    public static final EnumC0887lw f24406a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0887lw f24407b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumC0887lw[] f24408c;

    static {
        EnumC0887lw enumC0887lw = new EnumC0887lw("EXPONENTIAL", 0);
        f24406a = enumC0887lw;
        EnumC0887lw enumC0887lw2 = new EnumC0887lw("LINEAR", 1);
        f24407b = enumC0887lw2;
        EnumC0887lw[] enumC0887lwArr = {enumC0887lw, enumC0887lw2};
        f24408c = enumC0887lwArr;
        vd6.m11859r(enumC0887lwArr);
    }

    public static EnumC0887lw valueOf(String str) {
        return (EnumC0887lw) Enum.valueOf(EnumC0887lw.class, str);
    }

    public static EnumC0887lw[] values() {
        return (EnumC0887lw[]) f24408c.clone();
    }
}
