package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pa6 extends zh6 {
    private static final pa6 zzh;
    private int zzb;
    private mi6 zzd = ck6.f16093e;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        pa6 pa6Var = new pa6();
        zzh = pa6Var;
        zh6.m13562k(pa6.class, pa6Var);
    }

    /* JADX INFO: renamed from: v */
    public static fa6 m9446v() {
        return (fa6) zzh.m13568f();
    }

    /* JADX INFO: renamed from: w */
    public static fa6 m9447w(pa6 pa6Var) {
        th6 th6VarM13568f = zzh.m13568f();
        th6VarM13568f.m11057f(pa6Var);
        return (fa6) th6VarM13568f;
    }

    /* JADX INFO: renamed from: A */
    public final void m9448A() {
        this.zzd = ck6.f16093e;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m9449B(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m9450C(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: D */
    public final void m9451D() {
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
            return zh6.m13563l(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", ua6.class, "zze", "zzf", "zzg", m46.f24656j});
        }
        if (i2 == 3) {
            return new pa6();
        }
        if (i2 == 4) {
            return new fa6(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final List m9452o() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: p */
    public final int m9453p() {
        return this.zzd.size();
    }

    /* JADX INFO: renamed from: q */
    public final ua6 m9454q(int i) {
        return (ua6) this.zzd.get(i);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m9455r() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final String m9456s() {
        return this.zze;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m9457t() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final String m9458u() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m9459x(int i, ua6 ua6Var) {
        m9451D();
        this.zzd.set(i, ua6Var);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m9460y(ua6 ua6Var) {
        m9451D();
        this.zzd.add(ua6Var);
    }

    /* JADX INFO: renamed from: z */
    public final void m9461z(ArrayList arrayList) {
        m9451D();
        th6.m11053b(arrayList, this.zzd);
    }
}
