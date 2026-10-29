package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class od6 extends s66 {
    private static final od6 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        od6 od6Var = new od6();
        zzb = od6Var;
        s66.m10531f(od6.class, od6Var);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m9047q(od6 od6Var, int i) {
        od6Var.zzd |= 1;
        od6Var.zze = i;
    }

    /* JADX INFO: renamed from: r */
    public static id6 m9048r() {
        return (id6) zzb.m10542k();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m9049s(od6 od6Var, String str) {
        od6Var.zzd |= 8;
        od6Var.zzh = str;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m9050t(od6 od6Var, String str) {
        str.getClass();
        od6Var.zzd |= 2;
        od6Var.zzf = str;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m9051u(od6 od6Var, int i) {
        od6Var.zzd |= 32;
        od6Var.zzj = i;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m9052v(od6 od6Var, int i) {
        od6Var.zzd |= 16;
        od6Var.zzi = i;
    }

    /* JADX INFO: renamed from: w */
    public static void m9053w(od6 od6Var, int i) {
        od6Var.zzg = sk5.m10839e(i);
        od6Var.zzd |= 4;
    }

    @Override // p000.s66
    /* JADX INFO: renamed from: j */
    public final Object mo3836j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s66.m10535p(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", e36.f17669d, "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new od6();
        }
        if (i2 == 4) {
            return new id6(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
