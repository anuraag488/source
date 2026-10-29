package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fb6 extends zh6 {
    private static final fb6 zzf;
    private int zzb;
    private int zzd;
    private li6 zze = yi6.f35248e;

    static {
        fb6 fb6Var = new fb6();
        zzf = fb6Var;
        zh6.m13562k(fb6.class, fb6Var);
    }

    /* JADX INFO: renamed from: t */
    public static eb6 m5630t() {
        return (eb6) zzf.m13568f();
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new fb6();
        }
        if (i2 == 4) {
            return new eb6(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m5631o() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: p */
    public final int m5632p() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: q */
    public final List m5633q() {
        return this.zze;
    }

    /* JADX INFO: renamed from: r */
    public final int m5634r() {
        return this.zze.size();
    }

    /* JADX INFO: renamed from: s */
    public final long m5635s(int i) {
        return ((yi6) this.zze).m13141b(i);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m5636u(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    /* JADX INFO: renamed from: v */
    public final void m5637v(List list) {
        List list2 = this.zze;
        boolean z = ((hf6) list2).f20538a;
        List list3 = list2;
        if (!z) {
            int size = list2.size();
            yi6 yi6VarM13142c = ((yi6) list2).mo4032o(size + size);
            this.zze = yi6VarM13142c;
            list3 = yi6VarM13142c;
        }
        th6.m11053b(list, list3);
    }
}
