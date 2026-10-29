package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class md6 extends jo6 {
    private static final md6 zzb;

    static {
        md6 md6Var = new md6();
        zzb = md6Var;
        jo6.m7197l(md6.class, md6Var);
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
            return new md6();
        }
        if (i2 == 4) {
            return new k96(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
