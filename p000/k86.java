package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k86 extends jo6 {
    private static final k86 zzb;
    private int zzd;
    private r76 zze;
    private f86 zzg;
    private m76 zzh;
    private e76 zzi;
    private String zzf = "";
    private qo6 zzj = aq6.f14790e;

    static {
        k86 k86Var = new k86();
        zzb = k86Var;
        jo6.m7197l(k86.class, k86Var);
    }

    /* JADX INFO: renamed from: m */
    public static h76 m7428m() {
        return (h76) zzb.m7200h();
    }

    /* JADX INFO: renamed from: n */
    public static void m7429n(k86 k86Var, String str) {
        str.getClass();
        qo6 qo6VarMo3123i = k86Var.zzj;
        if (!((jm6) qo6VarMo3123i).f22436a) {
            int size = qo6VarMo3123i.size();
            qo6VarMo3123i = qo6VarMo3123i.mo3123i(size + size);
            k86Var.zzj = qo6VarMo3123i;
        }
        qo6VarMo3123i.add(str);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m7430o(k86 k86Var, String str) {
        k86Var.zzd |= 2;
        k86Var.zzf = str;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m7431p(k86 k86Var, e76 e76Var) {
        k86Var.zzi = e76Var;
        k86Var.zzd |= 16;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m7432q(k86 k86Var, m76 m76Var) {
        k86Var.zzh = m76Var;
        k86Var.zzd |= 8;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m7433r(k86 k86Var, r76 r76Var) {
        k86Var.zze = r76Var;
        k86Var.zzd |= 1;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m7434s(k86 k86Var, f86 f86Var) {
        k86Var.zzg = f86Var;
        k86Var.zzd |= 4;
    }

    @Override // p000.jo6
    /* JADX INFO: renamed from: g */
    public final Object mo205g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new bq6(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006Ț", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new k86();
        }
        if (i2 == 4) {
            return new h76(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
