package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m96 extends zh6 {
    private static final m96 zzi;
    private int zzb;
    private mi6 zzd = ck6.f16093e;
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;

    static {
        m96 m96Var = new m96();
        zzi = m96Var;
        zh6.m13562k(m96.class, m96Var);
    }

    /* JADX INFO: renamed from: y */
    public static l96 m8235y() {
        return (l96) zzi.m13568f();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m8236A(x96 x96Var) {
        x96Var.getClass();
        m8243H();
        this.zzd.add(x96Var);
    }

    /* JADX INFO: renamed from: B */
    public final void m8237B(Iterable iterable) {
        m8243H();
        th6.m11053b(iterable, this.zzd);
    }

    /* JADX INFO: renamed from: C */
    public final void m8238C() {
        this.zzd = ck6.f16093e;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m8239D(int i) {
        m8243H();
        this.zzd.remove(i);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m8240E(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m8241F(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m8242G(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    /* JADX INFO: renamed from: H */
    public final void m8243H() {
        mi6 mi6Var = this.zzd;
        if (((hf6) mi6Var).f20538a) {
            return;
        }
        int size = mi6Var.size();
        this.zzd = mi6Var.mo4032o(size + size);
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzb", "zzd", x96.class, "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new m96();
        }
        if (i2 == 4) {
            return new l96(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final List m8244o() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: p */
    public final int m8245p() {
        return this.zzd.size();
    }

    /* JADX INFO: renamed from: q */
    public final x96 m8246q(int i) {
        return (x96) this.zzd.get(i);
    }

    /* JADX INFO: renamed from: r */
    public final String m8247r() {
        return this.zze;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m8248s() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final long m8249t() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m8250u() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final long m8251v() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m8252w() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final int m8253x() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m8254z(int i, x96 x96Var) {
        m8243H();
        this.zzd.set(i, x96Var);
    }
}
