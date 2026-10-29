package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f86 extends jo6 {
    private static final f86 zzb;
    private int zzd;
    private String zze = "";

    static {
        f86 f86Var = new f86();
        zzb = f86Var;
        jo6.m7197l(f86.class, f86Var);
    }

    /* JADX INFO: renamed from: m */
    public static t76 m5614m() {
        return (t76) zzb.m7200h();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m5615n(f86 f86Var) {
        f86Var.zzd |= 1;
        f86Var.zze = "4.0.0";
    }

    @Override // p000.jo6
    /* JADX INFO: renamed from: g */
    public final Object mo205g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new bq6(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new f86();
        }
        if (i2 == 4) {
            return new t76(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
