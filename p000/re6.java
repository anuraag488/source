package p000;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class re6 extends s66 {
    private static final re6 zzb;
    private int zzd;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzs;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        re6 re6Var = new re6();
        zzb = re6Var;
        s66.m10531f(re6.class, re6Var);
    }

    /* JADX INFO: renamed from: A */
    public static pe6 m10310A() {
        return (pe6) zzb.m10542k();
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m10311B(re6 re6Var, int i) {
        re6Var.zzd |= 128;
        re6Var.zzl = i;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m10312C(re6 re6Var, int i) {
        re6Var.zzd |= 256;
        re6Var.zzm = i;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m10313D(re6 re6Var, int i) {
        re6Var.zzd |= 8;
        re6Var.zzh = i;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m10314E(re6 re6Var, long j) {
        re6Var.zzd |= 16;
        re6Var.zzi = j;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m10315F(re6 re6Var, long j) {
        re6Var.zzd |= 32;
        re6Var.zzj = j;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m10316q(re6 re6Var) {
        re6Var.zzd |= 512;
        re6Var.zzn = 926300087L;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m10317r(re6 re6Var, String str) {
        str.getClass();
        re6Var.zzd |= 4;
        re6Var.zzg = str;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m10318s(re6 re6Var) {
        String str = Build.BRAND;
        str.getClass();
        re6Var.zzd |= 1024;
        re6Var.zzo = str;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m10319t(re6 re6Var) {
        String str = Build.FINGERPRINT;
        str.getClass();
        re6Var.zzd |= 8192;
        re6Var.zzr = str;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m10320u(re6 re6Var) {
        String str = Build.MANUFACTURER;
        str.getClass();
        re6Var.zzd |= 4096;
        re6Var.zzq = str;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m10321v(re6 re6Var) {
        String str = Build.MODEL;
        str.getClass();
        re6Var.zzd |= 2048;
        re6Var.zzp = str;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m10322w(re6 re6Var, int i) {
        re6Var.zzd |= 16384;
        re6Var.zzs = i;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m10323x(re6 re6Var, boolean z) {
        re6Var.zzd |= 64;
        re6Var.zzk = z;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m10324y(re6 re6Var) {
        re6Var.zzd |= 1;
        re6Var.zze = "9.1.0";
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m10325z(re6 re6Var, String str) {
        re6Var.zzd |= 2;
        re6Var.zzf = str;
    }

    @Override // p000.s66
    /* JADX INFO: renamed from: j */
    public final Object mo3836j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s66.m10535p(zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i2 == 3) {
            return new re6();
        }
        if (i2 == 4) {
            return new pe6(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
