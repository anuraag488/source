package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class c86 extends zh6 {
    private static final c86 zzn;
    private int zzb;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private long zzk;
    private kj6 zzl;
    private kj6 zzm;

    static {
        c86 c86Var = new c86();
        zzn = c86Var;
        zh6.m13562k(c86.class, c86Var);
    }

    public c86() {
        kj6 kj6Var = kj6.f23184b;
        this.zzl = kj6Var;
        this.zzm = kj6Var;
        this.zzd = "";
        this.zze = "";
        this.zzf = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
    }

    /* JADX INFO: renamed from: N */
    public static n76 m3893N() {
        return (n76) zzn.m13568f();
    }

    /* JADX INFO: renamed from: O */
    public static c86 m3894O() {
        return zzn;
    }

    /* JADX INFO: renamed from: A */
    public final String m3895A() {
        return this.zze;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m3896B() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final String m3897C() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m3898D() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final long m3899E() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m3900F() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final String m3901G() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m3902H() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: I */
    public final String m3903I() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m3904J() {
        return (this.zzb & 64) != 0;
    }

    /* JADX INFO: renamed from: K */
    public final String m3905K() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m3906L() {
        return (this.zzb & 128) != 0;
    }

    /* JADX INFO: renamed from: M */
    public final long m3907M() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m3908P(String str) {
        this.zzb |= 1;
        this.zzd = str;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m3909Q() {
        this.zzb &= -2;
        this.zzd = zzn.zzd;
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m3910R(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m3911S() {
        this.zzb &= -3;
        this.zze = zzn.zze;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m3912T(String str) {
        this.zzb |= 4;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m3913U() {
        this.zzb &= -5;
        this.zzf = zzn.zzf;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m3914V(long j) {
        this.zzb |= 8;
        this.zzg = j;
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzn, "\u0004\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", p76.f27416a, "zzm", s76.f29955a});
        }
        if (i2 == 3) {
            return new c86();
        }
        if (i2 == 4) {
            return new n76(zzn);
        }
        if (i2 == 5) {
            return zzn;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m3915o(String str) {
        this.zzb |= 16;
        this.zzh = str;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m3916p() {
        this.zzb &= -17;
        this.zzh = zzn.zzh;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m3917q(String str) {
        this.zzb |= 32;
        this.zzi = str;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m3918r() {
        this.zzb &= -33;
        this.zzi = zzn.zzi;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m3919s(String str) {
        this.zzb |= 64;
        this.zzj = str;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m3920t() {
        this.zzb &= -65;
        this.zzj = zzn.zzj;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m3921u(long j) {
        this.zzb |= 128;
        this.zzk = j;
    }

    /* JADX INFO: renamed from: v */
    public final kj6 m3922v() {
        kj6 kj6Var = this.zzl;
        if (kj6Var.f23185a) {
            return kj6Var;
        }
        kj6 kj6VarM7528a = kj6Var.m7528a();
        this.zzl = kj6VarM7528a;
        return kj6VarM7528a;
    }

    /* JADX INFO: renamed from: w */
    public final kj6 m3923w() {
        kj6 kj6Var = this.zzm;
        if (kj6Var.f23185a) {
            return kj6Var;
        }
        kj6 kj6VarM7528a = kj6Var.m7528a();
        this.zzm = kj6VarM7528a;
        return kj6VarM7528a;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m3924x() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final String m3925y() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m3926z() {
        return (this.zzb & 2) != 0;
    }
}
