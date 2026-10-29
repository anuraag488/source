package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e76 extends jo6 {
    private static final e76 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        e76 e76Var = new e76();
        zzb = e76Var;
        jo6.m7197l(e76.class, e76Var);
    }

    /* JADX INFO: renamed from: m */
    public static a76 m4942m() {
        return (a76) zzb.m7200h();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m4943n(e76 e76Var, String str) {
        str.getClass();
        e76Var.zzd |= 1;
        e76Var.zze = str;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m4944o(e76 e76Var, String str) {
        str.getClass();
        e76Var.zzd |= 2;
        e76Var.zzf = str;
    }

    @Override // p000.jo6
    /* JADX INFO: renamed from: g */
    public final Object mo205g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new bq6(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new e76();
        }
        if (i2 == 4) {
            return new a76(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
