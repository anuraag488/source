package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j96 extends zh6 {
    private static final j96 zzf;
    private int zzb;
    private int zzd;
    private long zze;

    static {
        j96 j96Var = new j96();
        zzf = j96Var;
        zh6.m13562k(j96.class, j96Var);
    }

    /* JADX INFO: renamed from: s */
    public static h96 m7055s() {
        return (h96) zzf.m13568f();
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new j96();
        }
        if (i2 == 4) {
            return new h96(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m7056o() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: p */
    public final int m7057p() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m7058q() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final long m7059r() {
        return this.zze;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m7060t(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m7061u(long j) {
        this.zzb |= 2;
        this.zze = j;
    }
}
