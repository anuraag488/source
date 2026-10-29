package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h66 extends zh6 {
    private static final h66 zzh;
    private int zzb;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        h66 h66Var = new h66();
        zzh = h66Var;
        zh6.m13562k(h66.class, h66Var);
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new h66();
        }
        if (i2 == 4) {
            return new g66(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final String m6236o() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m6237p() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m6238q() {
        return this.zze;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m6239r() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m6240s() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m6241t() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final int m6242u() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m6243v(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
