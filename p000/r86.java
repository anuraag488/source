package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class r86 extends zh6 {
    private static final r86 zzh;
    private int zzb;
    private int zzd;
    private cb6 zze;
    private cb6 zzf;
    private boolean zzg;

    static {
        r86 r86Var = new r86();
        zzh = r86Var;
        zh6.m13562k(r86.class, r86Var);
    }

    /* JADX INFO: renamed from: v */
    public static q86 m10236v() {
        return (q86) zzh.m13568f();
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new r86();
        }
        if (i2 == 4) {
            return new q86(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m10237o() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: p */
    public final int m10238p() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: q */
    public final cb6 m10239q() {
        cb6 cb6Var = this.zze;
        return cb6Var == null ? cb6.m3955x() : cb6Var;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m10240r() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final cb6 m10241s() {
        cb6 cb6Var = this.zzf;
        return cb6Var == null ? cb6.m3955x() : cb6Var;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m10242t() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m10243u() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m10244w(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m10245x(cb6 cb6Var) {
        this.zze = cb6Var;
        this.zzb |= 2;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m10246y(cb6 cb6Var) {
        this.zzf = cb6Var;
        this.zzb |= 4;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m10247z(boolean z) {
        this.zzb |= 8;
        this.zzg = z;
    }
}
