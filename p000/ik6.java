package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ik6 extends jo6 {
    private static final ik6 zzb;
    private int zzd;
    private String zze = "";

    static {
        ik6 ik6Var = new ik6();
        zzb = ik6Var;
        jo6.m7197l(ik6.class, ik6Var);
    }

    @Override // p000.jo6
    /* JADX INFO: renamed from: g */
    public final Object mo205g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new bq6(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new ik6();
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
