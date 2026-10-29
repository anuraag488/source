package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x26 extends s66 {
    private static final x26 zzb;
    private int zzd;
    private String zze = "";

    static {
        x26 x26Var = new x26();
        zzb = x26Var;
        s66.m10531f(x26.class, x26Var);
    }

    @Override // p000.s66
    /* JADX INFO: renamed from: j */
    public final Object mo3836j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s66.m10535p(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new x26();
        }
        if (i2 == 4) {
            return new w16(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
