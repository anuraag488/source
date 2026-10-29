package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o46 extends zh6 {
    private static final o46 zzi;
    private int zzb;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        o46 o46Var = new o46();
        zzi = o46Var;
        zh6.m13562k(o46.class, o46Var);
    }

    /* JADX INFO: renamed from: x */
    public static o46 m8943x() {
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
            return zh6.m13563l(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", m46.f24648b, "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new o46();
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
    public final boolean m8944o() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m8945p() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m8946q() {
        return this.zze;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m8947r() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final String m8948s() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m8949t() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final String m8950u() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m8951v() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final String m8952w() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: y */
    public final int m8953y() {
        int i;
        int i2 = this.zzd;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
