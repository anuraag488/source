package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b76 extends zh6 {
    private static final b76 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        b76 b76Var = new b76();
        zzf = b76Var;
        zh6.m13562k(b76.class, b76Var);
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new b76();
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
    public final String m3506o() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: p */
    public final String m3507p() {
        return this.zze;
    }
}
