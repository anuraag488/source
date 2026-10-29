package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class c56 extends zh6 {
    private static final c56 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        c56 c56Var = new c56();
        zzf = c56Var;
        zh6.m13562k(c56.class, c56Var);
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            m46 m46Var = m46.f24651e;
            return zh6.m13563l(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", m46Var, "zze", m46Var});
        }
        if (i2 == 3) {
            return new c56();
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
    public final int m3848o() {
        int iM10216a = r56.m10216a(this.zzd);
        if (iM10216a == 0) {
            return 1;
        }
        return iM10216a;
    }

    /* JADX INFO: renamed from: p */
    public final int m3849p() {
        int iM10216a = r56.m10216a(this.zze);
        if (iM10216a == 0) {
            return 1;
        }
        return iM10216a;
    }
}
