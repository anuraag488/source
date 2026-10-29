package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ph6 extends jo6 {
    private static final ph6 zzb;
    private int zzd;
    private nh6 zze;
    private s16 zzf;
    private String zzg = "";

    static {
        ph6 ph6Var = new ph6();
        zzb = ph6Var;
        jo6.m7197l(ph6.class, ph6Var);
    }

    @Override // p000.jo6
    /* JADX INFO: renamed from: g */
    public final Object mo205g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new bq6(zzb, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0005ለ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new ph6();
        }
        if (i2 == 4) {
            return new dg6(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
