package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ne6 extends s66 {
    private static final ne6 zzb;
    private int zzd;
    private int zzf;
    private od6 zzi;
    private boolean zzj;
    private boolean zzk;
    private eg6 zzl;
    private String zze = "";
    private c76 zzg = u66.f31684e;
    private f76 zzh = ga6.f19693e;

    static {
        ne6 ne6Var = new ne6();
        zzb = ne6Var;
        s66.m10531f(ne6.class, ne6Var);
    }

    /* JADX INFO: renamed from: q */
    public static ie6 m8693q() {
        return (ie6) zzb.m10542k();
    }

    /* JADX INFO: renamed from: r */
    public static void m8694r(ne6 ne6Var, xd6 xd6Var) {
        List list = ne6Var.zzg;
        boolean z = ((y36) list).f34844a;
        List list2 = list;
        if (!z) {
            int size = list.size();
            u66 u66VarM11266c = ((u66) list).mo5612i(size + size);
            ne6Var.zzg = u66VarM11266c;
            list2 = u66VarM11266c;
        }
        ((u66) list2).m11267d(xd6Var.f34182a);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m8695s(ne6 ne6Var, od6 od6Var) {
        ne6Var.zzi = od6Var;
        ne6Var.zzd |= 4;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m8696t(ne6 ne6Var) {
        ne6Var.zzd |= 1;
        ne6Var.zze = "ProxyBillingBroadcastReceiver";
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m8697u(ne6 ne6Var, eg6 eg6Var) {
        ne6Var.zzl = eg6Var;
        ne6Var.zzd |= 32;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m8698v(ne6 ne6Var, int i) {
        ne6Var.zzf = i - 1;
        ne6Var.zzd |= 2;
    }

    @Override // p000.s66
    /* JADX INFO: renamed from: j */
    public final Object mo3836j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s66.m10535p(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004\bဉ\u0005", new Object[]{"zzd", "zze", "zzf", e36.f17671f, "zzg", e36.f17670e, "zzh", rf6.class, "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new ne6();
        }
        if (i2 == 4) {
            return new ie6(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
