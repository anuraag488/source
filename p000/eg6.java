package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class eg6 extends s66 {
    private static final eg6 zzb;
    private int zzd;
    private int zze;

    static {
        eg6 eg6Var = new eg6();
        zzb = eg6Var;
        s66.m10531f(eg6.class, eg6Var);
    }

    /* JADX INFO: renamed from: q */
    public static zf6 m5125q() {
        return (zf6) zzb.m10542k();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m5126r(eg6 eg6Var, int i) {
        eg6Var.zze = i - 1;
        eg6Var.zzd |= 1;
    }

    @Override // p000.s66
    /* JADX INFO: renamed from: j */
    public final Object mo3836j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s66.m10535p(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", e36.f17674i});
        }
        if (i2 == 3) {
            return new eg6();
        }
        if (i2 == 4) {
            return new zf6(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
