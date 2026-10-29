package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kg6 extends s66 {
    private static final kg6 zzb;
    private int zzd;
    private od6 zze;
    private long zzf;

    static {
        kg6 kg6Var = new kg6();
        zzb = kg6Var;
        s66.m10531f(kg6.class, kg6Var);
    }

    /* JADX INFO: renamed from: q */
    public static gg6 m7516q() {
        return (gg6) zzb.m10542k();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m7517r(kg6 kg6Var, od6 od6Var) {
        kg6Var.zze = od6Var;
        kg6Var.zzd |= 1;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m7518s(kg6 kg6Var, long j) {
        kg6Var.zzd |= 2;
        kg6Var.zzf = j;
    }

    @Override // p000.s66
    /* JADX INFO: renamed from: j */
    public final Object mo3836j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s66.m10535p(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new kg6();
        }
        if (i2 == 4) {
            return new gg6(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
