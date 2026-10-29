package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class if6 extends s66 {
    private static final if6 zzb;
    private int zzd;
    private f76 zze = ga6.f19693e;
    private String zzf = "";
    private boolean zzg;

    static {
        if6 if6Var = new if6();
        zzb = if6Var;
        s66.m10531f(if6.class, if6Var);
    }

    /* JADX INFO: renamed from: q */
    public static if6 m6792q() {
        return zzb;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m6793r(if6 if6Var, boolean z) {
        if6Var.zzd |= 2;
        if6Var.zzg = z;
    }

    @Override // p000.s66
    /* JADX INFO: renamed from: j */
    public final Object mo3836j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s66.m10535p(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", ff6.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new if6();
        }
        if (i2 == 4) {
            return new af6(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
