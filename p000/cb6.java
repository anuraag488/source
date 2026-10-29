package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cb6 extends zh6 {
    private static final cb6 zzg;
    private li6 zzb;
    private li6 zzd;
    private mi6 zze;
    private mi6 zzf;

    static {
        cb6 cb6Var = new cb6();
        zzg = cb6Var;
        zh6.m13562k(cb6.class, cb6Var);
    }

    public cb6() {
        yi6 yi6Var = yi6.f35248e;
        this.zzb = yi6Var;
        this.zzd = yi6Var;
        ck6 ck6Var = ck6.f16093e;
        this.zze = ck6Var;
        this.zzf = ck6Var;
    }

    /* JADX INFO: renamed from: w */
    public static bb6 m3954w() {
        return (bb6) zzg.m13568f();
    }

    /* JADX INFO: renamed from: x */
    public static cb6 m3955x() {
        return zzg;
    }

    /* JADX INFO: renamed from: A */
    public final void m3956A(List list) {
        List list2 = this.zzd;
        boolean z = ((hf6) list2).f20538a;
        List list3 = list2;
        if (!z) {
            int size = list2.size();
            yi6 yi6VarMo4032o = ((yi6) list2).mo4032o(size + size);
            this.zzd = yi6VarMo4032o;
            list3 = yi6VarMo4032o;
        }
        th6.m11053b(list, list3);
    }

    /* JADX INFO: renamed from: B */
    public final void m3957B() {
        this.zzd = yi6.f35248e;
    }

    /* JADX INFO: renamed from: C */
    public final void m3958C(ArrayList arrayList) {
        mi6 mi6VarMo4032o = this.zze;
        if (!((hf6) mi6VarMo4032o).f20538a) {
            int size = mi6VarMo4032o.size();
            mi6VarMo4032o = mi6VarMo4032o.mo4032o(size + size);
            this.zze = mi6VarMo4032o;
        }
        th6.m11053b(arrayList, mi6VarMo4032o);
    }

    /* JADX INFO: renamed from: D */
    public final void m3959D() {
        this.zze = ck6.f16093e;
    }

    /* JADX INFO: renamed from: E */
    public final void m3960E(Iterable iterable) {
        mi6 mi6VarMo4032o = this.zzf;
        if (!((hf6) mi6VarMo4032o).f20538a) {
            int size = mi6VarMo4032o.size();
            mi6VarMo4032o = mi6VarMo4032o.mo4032o(size + size);
            this.zzf = mi6VarMo4032o;
        }
        th6.m11053b(iterable, mi6VarMo4032o);
    }

    /* JADX INFO: renamed from: F */
    public final void m3961F() {
        this.zzf = ck6.f16093e;
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", j96.class, "zzf", fb6.class});
        }
        if (i2 == 3) {
            return new cb6();
        }
        if (i2 == 4) {
            return new bb6(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final List m3962o() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: p */
    public final int m3963p() {
        return this.zzb.size();
    }

    /* JADX INFO: renamed from: q */
    public final List m3964q() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: r */
    public final int m3965r() {
        return this.zzd.size();
    }

    /* JADX INFO: renamed from: s */
    public final mi6 m3966s() {
        return this.zze;
    }

    /* JADX INFO: renamed from: t */
    public final int m3967t() {
        return this.zze.size();
    }

    /* JADX INFO: renamed from: u */
    public final List m3968u() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: v */
    public final int m3969v() {
        return this.zzf.size();
    }

    /* JADX INFO: renamed from: y */
    public final void m3970y(Iterable iterable) {
        List list = this.zzb;
        boolean z = ((hf6) list).f20538a;
        List list2 = list;
        if (!z) {
            int size = list.size();
            yi6 yi6VarMo4032o = ((yi6) list).mo4032o(size + size);
            this.zzb = yi6VarMo4032o;
            list2 = yi6VarMo4032o;
        }
        th6.m11053b(iterable, list2);
    }

    /* JADX INFO: renamed from: z */
    public final void m3971z() {
        this.zzb = yi6.f35248e;
    }
}
