package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pb6 extends zh6 {
    private static final pb6 zzj;
    private int zzb;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    static {
        pb6 pb6Var = new pb6();
        zzj = pb6Var;
        zh6.m13562k(pb6.class, pb6Var);
    }

    /* JADX INFO: renamed from: z */
    public static ob6 m9471z() {
        return (ob6) zzj.m13568f();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m9472A(long j) {
        this.zzb |= 1;
        this.zzd = j;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m9473B(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m9474C(String str) {
        this.zzb |= 4;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m9475D() {
        this.zzb &= -5;
        this.zzf = zzj.zzf;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m9476E(long j) {
        this.zzb |= 8;
        this.zzg = j;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m9477F() {
        this.zzb &= -9;
        this.zzg = 0L;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m9478G(double d) {
        this.zzb |= 32;
        this.zzi = d;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m9479H() {
        this.zzb &= -33;
        this.zzi = 0.0d;
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new pb6();
        }
        if (i2 == 4) {
            return new ob6(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m9480o() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: p */
    public final long m9481p() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: q */
    public final String m9482q() {
        return this.zze;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m9483r() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final String m9484s() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m9485t() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final long m9486u() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m9487v() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final float m9488w() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m9489x() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final double m9490y() {
        return this.zzi;
    }
}
