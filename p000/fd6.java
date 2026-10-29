package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fd6 extends s66 {
    private static final fd6 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        fd6 fd6Var = new fd6();
        zzb = fd6Var;
        s66.m10531f(fd6.class, fd6Var);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m5693q(fd6 fd6Var, int i) {
        fd6Var.zzg = i - 1;
        fd6Var.zzd |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static bd6 m5694r() {
        return (bd6) zzb.m10542k();
    }

    /* JADX INFO: renamed from: t */
    public static void m5695t(fd6 fd6Var, xd6 xd6Var) {
        fd6Var.zzh = xd6Var.f34182a;
        fd6Var.zzd |= 2;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m5696u(fd6 fd6Var, if6 if6Var) {
        fd6Var.zzf = if6Var;
        fd6Var.zze = 4;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m5697v(fd6 fd6Var, vg6 vg6Var) {
        fd6Var.zzf = vg6Var;
        fd6Var.zze = 3;
    }

    @Override // p000.s66
    /* JADX INFO: renamed from: j */
    public final Object mo3836j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s66.m10535p(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", e36.f17668c, ye6.class, vg6.class, if6.class, "zzh", e36.f17670e});
        }
        if (i2 == 3) {
            return new fd6();
        }
        if (i2 == 4) {
            return new bd6(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    /* JADX INFO: renamed from: s */
    public final if6 m5698s() {
        return this.zze == 4 ? (if6) this.zzf : if6.m6792q();
    }
}
