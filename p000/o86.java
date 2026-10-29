package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o86 extends zh6 {
    private static final o86 zzk;
    private int zzb;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        o86 o86Var = new o86();
        zzk = o86Var;
        zh6.m13562k(o86.class, o86Var);
    }

    /* JADX INFO: renamed from: v */
    public static l86 m8989v() {
        return (l86) zzk.m13568f();
    }

    /* JADX INFO: renamed from: w */
    public static o86 m8990w() {
        return zzk;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m8991A(boolean z) {
        this.zzb |= 8;
        this.zzg = z;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m8992B(boolean z) {
        this.zzb |= 16;
        this.zzh = z;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m8993C(boolean z) {
        this.zzb |= 32;
        this.zzi = z;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m8994D(boolean z) {
        this.zzb |= 64;
        this.zzj = z;
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new o86();
        }
        if (i2 == 4) {
            return new l86(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m8995o() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m8996p() {
        return this.zze;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m8997q() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m8998r() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m8999s() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m9000t() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m9001u() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m9002x(boolean z) {
        this.zzb |= 1;
        this.zzd = z;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m9003y(boolean z) {
        this.zzb |= 2;
        this.zze = z;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m9004z(boolean z) {
        this.zzb |= 4;
        this.zzf = z;
    }
}
