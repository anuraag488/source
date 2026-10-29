package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: pd */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1030pd {

    /* JADX INFO: renamed from: a */
    public static final float f27528a = (25.0f * 2.0f) / 2.4142137f;

    /* JADX INFO: renamed from: a */
    public static final void m9494a(c33 c33Var, nt2 nt2Var, long j, mi0 mi0Var, int i) {
        int i2;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1776202187);
        int i3 = (ir1Var.m6890g(c33Var) ? 4 : 2) | i | (ir1Var.m6890g(nt2Var) ? 32 : 16) | 128;
        byte b = 0;
        if (ir1Var.m6871T(i3 & 1, (i3 & 147) != 146)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                ir1Var.m6874W();
                i2 = i3 & (-897);
            }
            ir1Var.m6913s();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objM6869O = ir1Var.m6869O();
            if (z || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                C1127s c1127s = new C1127s((byte) 10);
                c1127s.f29778b = c33Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c1127s);
                obj = c1127s;
            }
            obj = objM6869O;
            nt2 nt2VarM5458a = f14.m5458a(nt2Var, false, (yp1) obj);
            C0853kz c0853kz = ig1.f21379c;
            C0868ld c0868ld = new C0868ld();
            c0868ld.f23956a = j;
            c0868ld.f23957b = nt2VarM5458a;
            VarHandle.storeStoreFence();
            i20.m6578c(c33Var, c0853kz, vd6.m11834R(-1653527038, c0868ld, ir1Var), ir1Var, i4 | 432);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0905md c0905md = new C0905md(b);
            c0905md.f24823c = c33Var;
            c0905md.f24824d = nt2Var;
            c0905md.f24822b = j;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0905md;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m9495b(nt2 nt2Var, mi0 mi0Var, int i, int i2) {
        int i3;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (ir1Var.m6890g(nt2Var) ? 4 : 2);
        }
        byte b = 0;
        byte b2 = 1;
        if (ir1Var.m6871T(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                nt2Var = kt2.f23428a;
            }
            nt2 nt2VarM8580h = n74.m8580h(nt2Var, f27528a, 25.0f);
            long j = ((rl4) ir1Var.m6898k(sl4.f30376a)).f29397a;
            C0942nd c0942nd = new C0942nd(b);
            c0942nd.f25690b = j;
            VarHandle.storeStoreFence();
            i25.m6610b(ir1Var, C0638f5.m5543n(nt2VarM8580h, c0942nd));
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0823k5 c0823k5 = new C0823k5(b2);
            c0823k5.f22893c = nt2Var;
            c0823k5.f22892b = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0823k5;
        }
    }
}
