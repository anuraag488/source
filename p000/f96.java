package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f96 extends zh6 {
    private static final f96 zzd;
    private mi6 zzb = ck6.f16093e;

    static {
        f96 f96Var = new f96();
        zzd = f96Var;
        zh6.m13562k(f96.class, f96Var);
    }

    /* JADX INFO: renamed from: p */
    public static u86 m5618p() {
        return (u86) zzd.m13568f();
    }

    /* JADX INFO: renamed from: q */
    public static f96 m5619q() {
        return zzd;
    }

    @Override // p000.zh6
    /* JADX INFO: renamed from: n */
    public final Object mo97n(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zh6.m13563l(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", b96.class});
        }
        if (i2 == 3) {
            return new f96();
        }
        if (i2 == 4) {
            return new u86(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final List m5620o() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: r */
    public final void m5621r(ArrayList arrayList) {
        mi6 mi6VarMo4032o = this.zzb;
        if (!((hf6) mi6VarMo4032o).f20538a) {
            int size = mi6VarMo4032o.size();
            mi6VarMo4032o = mi6VarMo4032o.mo4032o(size + size);
            this.zzb = mi6VarMo4032o;
        }
        th6.m11053b(arrayList, mi6VarMo4032o);
    }
}
