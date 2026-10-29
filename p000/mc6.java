package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mc6 extends zh6 {
    private static final mc6 zzj;
    private int zzb;
    private int zzd;
    private mi6 zze = ck6.f16093e;
    private String zzf = "";
    private String zzg = "";
    private boolean zzh;
    private double zzi;

    static {
        mc6 mc6Var = new mc6();
        zzj = mc6Var;
        zh6.m13562k(mc6.class, mc6Var);
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zzd", m46.f24661o, "zze", mc6.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new mc6();
        }
        if (i2 == 4) {
            return new l46(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final List m8275o() {
        return this.zze;
    }

    /* JADX INFO: renamed from: p */
    public final String m8276p() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m8277q() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final String m8278r() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m8279s() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m8280t() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m8281u() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final double m8282v() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: w */
    public final int m8283w() {
        int i;
        int i2 = this.zzd;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
