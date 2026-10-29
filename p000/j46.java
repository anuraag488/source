package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j46 extends zh6 {
    private static final j46 zzh;
    private int zzb;
    private w46 zzd;
    private o46 zze;
    private boolean zzf;
    private String zzg = "";

    static {
        j46 j46Var = new j46();
        zzh = j46Var;
        zh6.m13562k(j46.class, j46Var);
    }

    /* JADX INFO: renamed from: w */
    public static j46 m7003w() {
        return zzh;
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new j46();
        }
        if (i2 == 4) {
            return new i46(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m7004o() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: p */
    public final w46 m7005p() {
        w46 w46Var = this.zzd;
        return w46Var == null ? w46.m12096v() : w46Var;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m7006q() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final o46 m7007r() {
        o46 o46Var = this.zze;
        return o46Var == null ? o46.m8943x() : o46Var;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m7008s() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m7009t() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m7010u() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final String m7011v() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m7012x(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }
}
