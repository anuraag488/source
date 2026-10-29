package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q96 extends jo6 {
    private static final q96 zzb;

    static {
        q96 q96Var = new q96();
        zzb = q96Var;
        jo6.m7197l(q96.class, q96Var);
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
            return new q96();
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
