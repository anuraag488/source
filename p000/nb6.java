package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nb6 extends zh6 {
    private static final nb6 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        nb6 nb6Var = new nb6();
        zzg = nb6Var;
        zh6.m13562k(nb6.class, nb6Var);
    }

    /* JADX INFO: renamed from: p */
    public static hb6 m8681p() {
        return (hb6) zzg.m13568f();
    }

    /* JADX INFO: renamed from: q */
    public static nb6 m8682q() {
        return zzg;
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", m46.f24660n, "zze", m46.f24658l, "zzf", m46.f24659m});
        }
        if (i2 == 3) {
            return new nb6();
        }
        if (i2 == 4) {
            return new hb6(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final int m8683o() {
        int iM10835a = sk5.m10835a(this.zze);
        if (iM10835a == 0) {
            return 1;
        }
        return iM10835a;
    }

    /* JADX INFO: renamed from: r */
    public final void m8684r(int i) {
        this.zze = sk5.m10841g(i);
        this.zzb |= 2;
    }

    /* JADX INFO: renamed from: s */
    public final int m8685s() {
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

    /* JADX WARN: Code duplicated, block: B:15:0x0017 A[PHI: r2
  0x0017: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:7:0x0009, B:11:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: t */
    public final int m8686t() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                int i3 = 3;
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i3 = 5;
                        if (i2 != 4) {
                            i = i2 != 5 ? 0 : 6;
                        } else {
                            i = i3;
                        }
                    }
                } else {
                    i = i3;
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

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m8687u(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m8688v(int i) {
        this.zzf = i - 1;
        this.zzb |= 4;
    }
}
