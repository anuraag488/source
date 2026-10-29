package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class za6 extends jo6 {
    private static final za6 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private long zzg;
    private int zzh;

    static {
        za6 za6Var = new za6();
        zzb = za6Var;
        jo6.m7197l(za6.class, za6Var);
    }

    /* JADX INFO: renamed from: m */
    public static wa6 m13462m() {
        return (wa6) zzb.m7200h();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m13463n(za6 za6Var, k86 k86Var) {
        za6Var.zzf = k86Var;
        za6Var.zze = 38;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m13464o(za6 za6Var, long j) {
        za6Var.zzd |= 1;
        za6Var.zzg = j;
    }

    @Override // p000.jo6
    /* JADX INFO: renamed from: g */
    public final Object mo205g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new bq6(zzb, "\u0004\u0019\u0001\u0001\b&\u0019\u0000\u0000\u0000\b<\u0000\tဂ\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000f<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000\u001dင\u0001\u001e<\u0000\u001f<\u0000 <\u0000!<\u0000\"<\u0000#<\u0000$<\u0000%<\u0000&<\u0000", new Object[]{"zzf", "zze", "zzd", ag6.class, "zzg", ph6.class, ub6.class, w36.class, me6.class, v46.class, ta6.class, k46.class, c66.class, pc6.class, ed6.class, xj6.class, yg6.class, hl6.class, "zzh", dl6.class, bi6.class, y66.class, gj6.class, wi6.class, y46.class, nl6.class, dk6.class, k86.class});
        }
        if (i2 == 3) {
            return new za6();
        }
        if (i2 == 4) {
            return new wa6(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
