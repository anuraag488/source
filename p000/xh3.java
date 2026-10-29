package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class xh3 {

    /* JADX INFO: renamed from: a */
    public bj2 f34281a;

    public xh3(wp1 wp1Var) {
        bj2 bj2Var = new bj2();
        bj2Var.f15330a = new dg4(wp1Var);
        VarHandle.storeStoreFence();
        this.f34281a = bj2Var;
    }

    /* JADX INFO: renamed from: a */
    public zh3 mo7523a(Object obj) {
        return new zh3(this, obj, obj == null, null, null, null, false);
    }

    /* JADX INFO: renamed from: b */
    public nw4 mo7524b() {
        return this.f34281a;
    }

    /* JADX INFO: renamed from: c */
    public final zh3 m12695c(yp1 yp1Var) {
        return new zh3(this, null, false, null, null, yp1Var, false);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034 A[PHI: r4
  0x0034: PHI (r4v2 nw4) = (r4v9 nw4), (r4v10 nw4) binds: [B:21:0x0040, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: d */
    public final nw4 m12696d(zh3 zh3Var, nw4 nw4Var) {
        lj0 lj0Var;
        nw4 nw4Var2;
        oc4 oc4Var;
        z41 z41Var;
        nw4 nw4Var3 = null;
        nw4Var3 = null;
        nw4Var3 = null;
        nw4Var3 = null;
        nw4Var3 = null;
        nw4Var3 = null;
        if (nw4Var instanceof z41) {
            if (zh3Var.f36096f) {
                z41Var = (z41) nw4Var;
                z41Var.f35746a.setValue(zh3Var.m13560a());
            }
        } else if (nw4Var instanceof oc4) {
            if ((zh3Var.f36092b || zh3Var.f36097g != null) && !zh3Var.f36096f) {
                oc4Var = (oc4) nw4Var;
                if (z62.m13387o(zh3Var.m13560a(), oc4Var.f26623a)) {
                    nw4Var2 = lj0Var;
                    nw4Var2 = oc4Var;
                    nw4Var3 = nw4Var2;
                }
            }
        } else if (nw4Var instanceof lj0) {
            lj0Var = (lj0) nw4Var;
            if (zh3Var.f36095e == lj0Var.f24062a) {
                nw4Var2 = lj0Var;
                nw4Var2 = oc4Var;
                nw4Var3 = nw4Var2;
            }
        }
        if (nw4Var3 != null) {
            nw4Var3 = z41Var;
            return nw4Var3;
        }
        boolean z = zh3Var.f36096f;
        sw2 d83Var = zh3Var.f36094d;
        if (!z) {
            yp1 yp1Var = zh3Var.f36095e;
            if (yp1Var == null) {
                return d83Var != null ? new z41(d83Var) : new oc4(zh3Var.m13560a());
            }
            nw4Var3 = z41Var;
            return new lj0(yp1Var);
        }
        if (d83Var == null) {
            Object obj = zh3Var.f36097g;
            r94 r94Var = zh3Var.f36093c;
            if (r94Var == null) {
                nw4Var3 = z41Var;
                r94Var = ia5.f21230u;
            }
            nw4Var3 = z41Var;
            d83Var = new d83(obj, r94Var);
        }
        nw4Var3 = z41Var;
        return new z41(d83Var);
    }
}
