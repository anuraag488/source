package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x96 extends zh6 {
    private static final x96 zzj;
    private int zzb;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private mi6 zzi = ck6.f16093e;

    static {
        x96 x96Var = new x96();
        zzj = x96Var;
        zh6.m13562k(x96.class, x96Var);
    }

    /* JADX INFO: renamed from: A */
    public static u96 m12535A() {
        return (u96) zzj.m13568f();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m12536B(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m12537C(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m12538D() {
        this.zzb &= -3;
        this.zze = zzj.zze;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m12539E(long j) {
        this.zzb |= 4;
        this.zzf = j;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m12540F() {
        this.zzb &= -5;
        this.zzf = 0L;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m12541G(double d) {
        this.zzb |= 16;
        this.zzh = d;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m12542H() {
        this.zzb &= -17;
        this.zzh = 0.0d;
    }

    /* JADX INFO: renamed from: I */
    public final void m12543I(x96 x96Var) {
        mi6 mi6VarMo4032o = this.zzi;
        if (!((hf6) mi6VarMo4032o).f20538a) {
            int size = mi6VarMo4032o.size();
            mi6VarMo4032o = mi6VarMo4032o.mo4032o(size + size);
            this.zzi = mi6VarMo4032o;
        }
        mi6VarMo4032o.add(x96Var);
    }

    /* JADX INFO: renamed from: J */
    public final void m12544J(ArrayList arrayList) {
        mi6 mi6VarMo4032o = this.zzi;
        if (!((hf6) mi6VarMo4032o).f20538a) {
            int size = mi6VarMo4032o.size();
            mi6VarMo4032o = mi6VarMo4032o.mo4032o(size + size);
            this.zzi = mi6VarMo4032o;
        }
        th6.m11053b(arrayList, mi6VarMo4032o);
    }

    /* JADX INFO: renamed from: K */
    public final void m12545K() {
        this.zzi = ck6.f16093e;
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", x96.class});
        }
        if (i2 == 3) {
            return new x96();
        }
        if (i2 == 4) {
            return new u96(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m12546o() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: p */
    public final String m12547p() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m12548q() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final String m12549r() {
        return this.zze;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m12550s() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final long m12551t() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m12552u() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final float m12553v() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m12554w() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final double m12555x() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: y */
    public final List m12556y() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: z */
    public final int m12557z() {
        return this.zzi.size();
    }
}
