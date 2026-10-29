package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u46 extends zh6 {
    private static final u46 zzj;
    private int zzb;
    private int zzd;
    private String zze = "";
    private j46 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        u46 u46Var = new u46();
        zzj = u46Var;
        zh6.m13562k(u46.class, u46Var);
    }

    /* JADX INFO: renamed from: w */
    public static q46 m11238w() {
        return (q46) zzj.m13568f();
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new u46();
        }
        if (i2 == 4) {
            return new q46(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m11239o() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: p */
    public final int m11240p() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: q */
    public final String m11241q() {
        return this.zze;
    }

    /* JADX INFO: renamed from: r */
    public final j46 m11242r() {
        j46 j46Var = this.zzf;
        return j46Var == null ? j46.m7003w() : j46Var;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m11243s() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m11244t() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m11245u() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m11246v() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m11247x(String str) {
        this.zzb |= 2;
        this.zze = str;
    }
}
