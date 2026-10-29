package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ca6 extends zh6 {
    private static final ca6 zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private i86 zzf;

    static {
        ca6 ca6Var = new ca6();
        zzg = ca6Var;
        zh6.m13562k(ca6.class, ca6Var);
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new ca6();
        }
        if (i2 == 4) {
            return new l46(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
