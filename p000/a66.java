package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a66 extends zh6 {
    private static final a66 zzi;
    private int zzb;
    private mi6 zzd;
    private mi6 zze;
    private mi6 zzf;
    private boolean zzg;
    private mi6 zzh;

    static {
        a66 a66Var = new a66();
        zzi = a66Var;
        zh6.m13562k(a66.class, a66Var);
    }

    public a66() {
        ck6 ck6Var = ck6.f16093e;
        this.zzd = ck6Var;
        this.zze = ck6Var;
        this.zzf = ck6Var;
        this.zzh = ck6Var;
    }

    /* JADX INFO: renamed from: u */
    public static a66 m105u() {
        return zzi;
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", a56.class, "zze", c56.class, "zzf", v56.class, "zzg", "zzh", a56.class});
        }
        if (i2 == 3) {
            return new a66();
        }
        if (i2 == 4) {
            return new l46(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final List m106o() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: p */
    public final List m107p() {
        return this.zze;
    }

    /* JADX INFO: renamed from: q */
    public final List m108q() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m109r() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m110s() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: t */
    public final mi6 m111t() {
        return this.zzh;
    }
}
