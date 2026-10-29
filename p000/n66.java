package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n66 extends zh6 {
    private static final n66 zzu;
    private int zzb;
    private long zzd;
    private String zze = "";
    private int zzf;
    private mi6 zzg;
    private mi6 zzh;
    private mi6 zzi;
    private String zzj;
    private boolean zzk;
    private mi6 zzl;
    private mi6 zzm;
    private String zzn;
    private String zzo;
    private a66 zzp;
    private r66 zzq;
    private i76 zzr;
    private w66 zzs;
    private q66 zzt;

    static {
        n66 n66Var = new n66();
        zzu = n66Var;
        zh6.m13562k(n66.class, n66Var);
    }

    public n66() {
        ck6 ck6Var = ck6.f16093e;
        this.zzg = ck6Var;
        this.zzh = ck6Var;
        this.zzi = ck6Var;
        this.zzj = "";
        this.zzl = ck6Var;
        this.zzm = ck6Var;
        this.zzn = "";
        this.zzo = "";
    }

    /* JADX INFO: renamed from: E */
    public static l66 m8547E() {
        return (l66) zzu.m13568f();
    }

    /* JADX INFO: renamed from: F */
    public static n66 m8548F() {
        return zzu;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m8549A() {
        return (this.zzb & 128) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final a66 m8550B() {
        a66 a66Var = this.zzp;
        return a66Var == null ? a66.m105u() : a66Var;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m8551C() {
        return (this.zzb & 512) != 0;
    }

    /* JADX INFO: renamed from: D */
    public final i76 m8552D() {
        i76 i76Var = this.zzr;
        return i76Var == null ? i76.m6689q() : i76Var;
    }

    /* JADX INFO: renamed from: G */
    public final void m8553G(int i, h66 h66Var) {
        mi6 mi6VarMo4032o = this.zzh;
        if (!((hf6) mi6VarMo4032o).f20538a) {
            int size = mi6VarMo4032o.size();
            mi6VarMo4032o = mi6VarMo4032o.mo4032o(size + size);
            this.zzh = mi6VarMo4032o;
        }
        mi6VarMo4032o.set(i, h66Var);
    }

    /* JADX INFO: renamed from: H */
    public final void m8554H() {
        this.zzi = ck6.f16093e;
    }

    /* JADX INFO: renamed from: I */
    public final void m8555I() {
        this.zzl = ck6.f16093e;
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", b76.class, "zzh", h66.class, "zzi", b46.class, "zzj", "zzk", "zzl", gc6.class, "zzm", d66.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i2 == 3) {
            return new n66();
        }
        if (i2 == 4) {
            return new l66(zzu);
        }
        if (i2 == 5) {
            return zzu;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m8556o() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: p */
    public final long m8557p() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m8558q() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final String m8559r() {
        return this.zze;
    }

    /* JADX INFO: renamed from: s */
    public final mi6 m8560s() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: t */
    public final int m8561t() {
        return this.zzh.size();
    }

    /* JADX INFO: renamed from: u */
    public final h66 m8562u(int i) {
        return (h66) this.zzh.get(i);
    }

    /* JADX INFO: renamed from: v */
    public final mi6 m8563v() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: w */
    public final mi6 m8564w() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: x */
    public final int m8565x() {
        return this.zzl.size();
    }

    /* JADX INFO: renamed from: y */
    public final List m8566y() {
        return this.zzm;
    }

    /* JADX INFO: renamed from: z */
    public final String m8567z() {
        return this.zzn;
    }
}
