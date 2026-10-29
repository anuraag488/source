package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vg6 extends s66 {
    private static final vg6 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        vg6 vg6Var = new vg6();
        zzb = vg6Var;
        s66.m10531f(vg6.class, vg6Var);
    }

    /* JADX INFO: renamed from: q */
    public static sg6 m11892q() {
        return (sg6) zzb.m10542k();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m11893r(vg6 vg6Var, boolean z) {
        vg6Var.zzd |= 8;
        vg6Var.zzh = z;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m11894s(vg6 vg6Var, int i) {
        vg6Var.zzd |= 16;
        vg6Var.zzi = i;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m11895t(vg6 vg6Var, long j) {
        vg6Var.zzd |= 4;
        vg6Var.zzg = j;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m11896u(vg6 vg6Var, int i) {
        vg6Var.zzd |= 32;
        vg6Var.zzj = i;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m11897v(vg6 vg6Var) {
        vg6Var.zzd |= 2;
        vg6Var.zzf = true;
    }

    @Override // p000.s66
    /* JADX INFO: renamed from: j */
    public final Object mo3836j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s66.m10535p(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new vg6();
        }
        if (i2 == 4) {
            return new sg6(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
