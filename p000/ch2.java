package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ch2 extends mt2 implements lf2 {

    /* JADX INFO: renamed from: r */
    public static final ah2 f16017r = new ah2();

    /* JADX INFO: renamed from: o */
    public ei2 f16018o;

    /* JADX INFO: renamed from: p */
    public b30 f16019p;

    /* JADX INFO: renamed from: q */
    public d63 f16020q;

    /* JADX INFO: renamed from: O0 */
    public final boolean m4026O0(yg2 yg2Var, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.f16020q != d63.f16814a) {
                }
            } else if (i != 1 && i != 2) {
                C1077qn.m9989o("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (m4027P0(i) ? yg2Var.f35211a > 0 : yg2Var.f35212b < this.f16018o.f18120a.m10789h().f24954o - 1) {
                return true;
            }
        } else if (this.f16020q != d63.f16815b) {
            if (m4027P0(i)) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: P0 */
    public final boolean m4027P0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = sc6.m10652X(this).f33293A.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            C0670g.m5864c();
            return false;
        }
        if (i != 4) {
            C1077qn.m9989o("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int iOrdinal2 = sc6.m10652X(this).f33293A.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        C0670g.m5864c();
        return false;
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        db3 db3VarMo5826e = sq2Var.mo5826e(j);
        int i = db3VarMo5826e.f16899a;
        int i2 = db3VarMo5826e.f16900b;
        C0830kc c0830kc = new C0830kc((byte) 8);
        c0830kc.f23061b = db3VarMo5826e;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(i, i2, w71.f33134a, c0830kc);
    }
}
