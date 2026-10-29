package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class br6 extends jo6 {
    private static final br6 zzb;
    private String zzd = "";
    private long zze;
    private int zzf;

    static {
        br6 br6Var = new br6();
        zzb = br6Var;
        jo6.m7197l(br6.class, br6Var);
    }

    @Override // p000.jo6
    /* JADX INFO: renamed from: g */
    public final Object mo205g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new bq6(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new br6();
        }
        if (i2 == 4) {
            return new kl6(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
