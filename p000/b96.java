package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b96 extends zh6 {
    private static final b96 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        b96 b96Var = new b96();
        zzf = b96Var;
        zh6.m13562k(b96.class, b96Var);
    }

    /* JADX INFO: renamed from: o */
    public static a96 m3516o() {
        return (a96) zzf.m13568f();
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", m46.f24654h, "zze", m46.f24655i});
        }
        if (i2 == 3) {
            return new b96();
        }
        if (i2 == 4) {
            return new a96(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: p */
    public final int m3517p() {
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

    /* JADX INFO: renamed from: q */
    public final int m3518q() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m3519r(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m3520s(int i) {
        this.zze = i - 1;
        this.zzb |= 2;
    }
}
