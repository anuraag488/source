package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xb6 extends zh6 {
    private static final xb6 zzf;
    private int zzb;
    private String zzd = "";
    private mi6 zze = ck6.f16093e;

    static {
        xb6 xb6Var = new xb6();
        zzf = xb6Var;
        zh6.m13562k(xb6.class, xb6Var);
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", mc6.class});
        }
        if (i2 == 3) {
            return new xb6();
        }
        if (i2 == 4) {
            return new l46(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final String m12648o() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: p */
    public final List m12649p() {
        return this.zze;
    }
}
