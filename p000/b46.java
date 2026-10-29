package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b46 extends zh6 {
    private static final b46 zzi;
    private int zzb;
    private int zzd;
    private mi6 zze;
    private mi6 zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        b46 b46Var = new b46();
        zzi = b46Var;
        zh6.m13562k(b46.class, b46Var);
    }

    public b46() {
        ck6 ck6Var = ck6.f16093e;
        this.zze = ck6Var;
        this.zzf = ck6Var;
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", u46.class, "zzf", f46.class, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new b46();
        }
        if (i2 == 4) {
            return new z36(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m3439o() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: p */
    public final int m3440p() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: q */
    public final List m3441q() {
        return this.zze;
    }

    /* JADX INFO: renamed from: r */
    public final int m3442r() {
        return this.zze.size();
    }

    /* JADX INFO: renamed from: s */
    public final u46 m3443s(int i) {
        return (u46) this.zze.get(i);
    }

    /* JADX INFO: renamed from: t */
    public final mi6 m3444t() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: u */
    public final int m3445u() {
        return this.zzf.size();
    }

    /* JADX INFO: renamed from: v */
    public final f46 m3446v(int i) {
        return (f46) this.zzf.get(i);
    }

    /* JADX INFO: renamed from: w */
    public final void m3447w(int i, u46 u46Var) {
        mi6 mi6VarMo4032o = this.zze;
        if (!((hf6) mi6VarMo4032o).f20538a) {
            int size = mi6VarMo4032o.size();
            mi6VarMo4032o = mi6VarMo4032o.mo4032o(size + size);
            this.zze = mi6VarMo4032o;
        }
        mi6VarMo4032o.set(i, u46Var);
    }

    /* JADX INFO: renamed from: x */
    public final void m3448x(int i, f46 f46Var) {
        mi6 mi6VarMo4032o = this.zzf;
        if (!((hf6) mi6VarMo4032o).f20538a) {
            int size = mi6VarMo4032o.size();
            mi6VarMo4032o = mi6VarMo4032o.mo4032o(size + size);
            this.zzf = mi6VarMo4032o;
        }
        mi6VarMo4032o.set(i, f46Var);
    }
}
