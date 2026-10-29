package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class r76 extends jo6 {
    private static final r76 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        r76 r76Var = new r76();
        zzb = r76Var;
        jo6.m7197l(r76.class, r76Var);
    }

    /* JADX INFO: renamed from: m */
    public static o76 m10232m() {
        return (o76) zzb.m7200h();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m10233n(r76 r76Var, String str) {
        r76Var.zzd |= 2;
        r76Var.zzf = str;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m10234o(r76 r76Var, long j) {
        r76Var.zzd |= 4;
        r76Var.zzg = j;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m10235p(r76 r76Var, int i) {
        r76Var.zze = i - 2;
        r76Var.zzd |= 1;
    }

    @Override // p000.jo6
    /* JADX INFO: renamed from: g */
    public final Object mo205g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new bq6(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ဂ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new r76();
        }
        if (i2 == 4) {
            return new o76(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
