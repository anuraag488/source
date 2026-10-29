package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tb6 extends zh6 {
    private static final tb6 zzd;
    private mi6 zzb = ck6.f16093e;

    static {
        tb6 tb6Var = new tb6();
        zzd = tb6Var;
        zh6.m13562k(tb6.class, tb6Var);
    }

    /* JADX INFO: renamed from: q */
    public static tb6 m11027q() {
        return zzd;
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", xb6.class});
        }
        if (i2 == 3) {
            return new tb6();
        }
        if (i2 == 4) {
            return new l46(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final List m11028o() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: p */
    public final int m11029p() {
        return this.zzb.size();
    }
}
