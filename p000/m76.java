package p000;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m76 extends jo6 {
    private static final m76 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        m76 m76Var = new m76();
        zzb = m76Var;
        jo6.m7197l(m76.class, m76Var);
    }

    /* JADX INFO: renamed from: m */
    public static l76 m8215m() {
        return (l76) zzb.m7200h();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m8216n(m76 m76Var, int i) {
        m76Var.zzd |= 8;
        m76Var.zzh = i;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m8217o(m76 m76Var) {
        String str = Build.MODEL;
        str.getClass();
        m76Var.zzd |= 4;
        m76Var.zzg = str;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m8218p(m76 m76Var) {
        String str = Build.VERSION.RELEASE;
        str.getClass();
        m76Var.zzd |= 2;
        m76Var.zzf = str;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m8219q(m76 m76Var) {
        m76Var.zze = 1;
        m76Var.zzd = 1 | m76Var.zzd;
    }

    @Override // p000.jo6
    /* JADX INFO: renamed from: g */
    public final Object mo205g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new bq6(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new m76();
        }
        if (i2 == 4) {
            return new l76(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
