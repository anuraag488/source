package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q66 extends zh6 {
    private static final q66 zzd;
    private mi6 zzb = ck6.f16093e;

    static {
        q66 q66Var = new q66();
        zzd = q66Var;
        zh6.m13562k(q66.class, q66Var);
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new q66();
        }
        if (i2 == 4) {
            return new l46(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }
}
