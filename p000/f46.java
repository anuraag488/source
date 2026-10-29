package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f46 extends zh6 {
    private static final f46 zzl;
    private int zzb;
    private int zzd;
    private String zze = "";
    private mi6 zzf = ck6.f16093e;
    private boolean zzg;
    private o46 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        f46 f46Var = new f46();
        zzl = f46Var;
        zh6.m13562k(f46.class, f46Var);
    }

    /* JADX INFO: renamed from: A */
    public static c46 m5507A() {
        return (c46) zzl.m13568f();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m5508B(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    /* JADX INFO: renamed from: C */
    public final void m5509C(int i, j46 j46Var) {
        mi6 mi6VarMo4032o = this.zzf;
        if (!((hf6) mi6VarMo4032o).f20538a) {
            int size = mi6VarMo4032o.size();
            mi6VarMo4032o = mi6VarMo4032o.mo4032o(size + size);
            this.zzf = mi6VarMo4032o;
        }
        mi6VarMo4032o.set(i, j46Var);
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", j46.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new f46();
        }
        if (i2 == 4) {
            return new c46(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m5510o() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: p */
    public final int m5511p() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: q */
    public final String m5512q() {
        return this.zze;
    }

    /* JADX INFO: renamed from: r */
    public final List m5513r() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: s */
    public final int m5514s() {
        return this.zzf.size();
    }

    /* JADX INFO: renamed from: t */
    public final j46 m5515t(int i) {
        return (j46) this.zzf.get(i);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m5516u() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final o46 m5517v() {
        o46 o46Var = this.zzh;
        return o46Var == null ? o46.m8943x() : o46Var;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m5518w() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m5519x() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m5520y() {
        return (this.zzb & 64) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m5521z() {
        return this.zzk;
    }
}
