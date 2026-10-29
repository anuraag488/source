package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i76 extends zh6 {
    private static final i76 zzi;
    private int zzb;
    private int zzg;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        i76 i76Var = new i76();
        zzi = i76Var;
        zh6.m13562k(i76.class, i76Var);
    }

    /* JADX INFO: renamed from: q */
    public static i76 m6689q() {
        return zzi;
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new i76();
        }
        if (i2 == 4) {
            return new l46(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final int m6690o() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: p */
    public final String m6691p() {
        return this.zzh;
    }
}
