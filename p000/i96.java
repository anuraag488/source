package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i96 extends jo6 {
    private static final i96 zzb;

    static {
        i96 i96Var = new i96();
        zzb = i96Var;
        jo6.m7197l(i96.class, i96Var);
    }

    @Override // p000.jo6
    /* JADX INFO: renamed from: g */
    public final Object mo205g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new bq6(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new i96();
        }
        if (i2 == 4) {
            return new o16(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
