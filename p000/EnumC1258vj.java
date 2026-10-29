package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: vj */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1258vj {

    /* JADX INFO: renamed from: a */
    public static final EnumC1258vj f32656a;

    /* JADX INFO: renamed from: b */
    public static final EnumC1258vj f32657b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumC1258vj[] f32658c;

    static {
        EnumC1258vj enumC1258vj = new EnumC1258vj("BoundReached", 0);
        f32656a = enumC1258vj;
        EnumC1258vj enumC1258vj2 = new EnumC1258vj("Finished", 1);
        f32657b = enumC1258vj2;
        EnumC1258vj[] enumC1258vjArr = {enumC1258vj, enumC1258vj2};
        f32658c = enumC1258vjArr;
        vd6.m11859r(enumC1258vjArr);
    }

    public static EnumC1258vj valueOf(String str) {
        return (EnumC1258vj) Enum.valueOf(EnumC1258vj.class, str);
    }

    public static EnumC1258vj[] values() {
        return (EnumC1258vj[]) f32658c.clone();
    }
}
