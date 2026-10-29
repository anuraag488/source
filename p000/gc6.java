package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gc6 extends zh6 {
    private static final gc6 zzf;
    private int zzb;
    private mi6 zzd = ck6.f16093e;
    private tb6 zze;

    static {
        gc6 gc6Var = new gc6();
        zzf = gc6Var;
        zh6.m13562k(gc6.class, gc6Var);
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", mc6.class, "zze"});
        }
        if (i2 == 3) {
            return new gc6();
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
    public final List m5969o() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: p */
    public final tb6 m5970p() {
        tb6 tb6Var = this.zze;
        return tb6Var == null ? tb6.m11027q() : tb6Var;
    }
}
