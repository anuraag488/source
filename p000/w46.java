package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w46 extends zh6 {
    private static final w46 zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private mi6 zzg = ck6.f16093e;

    static {
        w46 w46Var = new w46();
        zzh = w46Var;
        zh6.m13562k(w46.class, w46Var);
    }

    /* JADX INFO: renamed from: v */
    public static w46 m12096v() {
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
            return zh6.m13563l(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", m46.f24649c, "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new w46();
        }
        if (i2 == 4) {
            return new l46(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m12097o() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m12098p() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: q */
    public final String m12099q() {
        return this.zze;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m12100r() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m12101s() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: t */
    public final mi6 m12102t() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: u */
    public final int m12103u() {
        return this.zzg.size();
    }

    /* JADX INFO: renamed from: w */
    public final int m12104w() {
        int i;
        switch (this.zzd) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
