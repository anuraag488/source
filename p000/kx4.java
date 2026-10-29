package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kx4 {

    /* JADX INFO: renamed from: a */
    public static final kx4 f23586a;

    /* JADX INFO: renamed from: b */
    public static final kx4 f23587b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ kx4[] f23588c;

    static {
        kx4 kx4Var = new kx4("Lsq2", 0);
        f23586a = kx4Var;
        kx4 kx4Var2 = new kx4("Impulse", 1);
        f23587b = kx4Var2;
        kx4[] kx4VarArr = {kx4Var, kx4Var2};
        f23588c = kx4VarArr;
        vd6.m11859r(kx4VarArr);
    }

    public static kx4 valueOf(String str) {
        return (kx4) Enum.valueOf(kx4.class, str);
    }

    public static kx4[] values() {
        return (kx4[]) f23588c.clone();
    }
}
