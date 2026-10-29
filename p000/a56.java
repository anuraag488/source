package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a56 extends zh6 {
    private static final a56 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        a56 a56Var = new a56();
        zzg = a56Var;
        zh6.m13562k(a56.class, a56Var);
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", m46.f24651e, "zze", m46.f24650d, "zzf", m46.f24652f});
        }
        if (i2 == 3) {
            return new a56();
        }
        if (i2 == 4) {
            return new l46(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final int m98o() {
        int iM10216a = r56.m10216a(this.zzd);
        if (iM10216a == 0) {
            return 1;
        }
        return iM10216a;
    }

    /* JADX INFO: renamed from: p */
    public final int m99p() {
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

    /* JADX INFO: renamed from: q */
    public final int m100q() {
        int i;
        int i2 = this.zzf;
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
}
