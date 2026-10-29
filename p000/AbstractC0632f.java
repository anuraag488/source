package p000;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: f */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0632f {

    /* JADX INFO: renamed from: a */
    public static final nw0 f18620a;

    static {
        pw0 pw0Var = l01.f23664a;
        yu1 yu1Var = mp2.f25111a.f35531e;
        gw0 gw0Var = gw0.f20149b;
        gd3 gd3Var = gd3.f19747c;
        Bitmap.Config config = AbstractC0707h.f20232b;
        a60 a60Var = a60.ENABLED;
        f18620a = new nw0(yu1Var, gw0Var, gw0Var, gw0Var, q13.f28142a, gd3Var, config, true, false, null, null, null, a60Var, a60Var, a60Var);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m5437a(b12 b12Var) {
        int iOrdinal = b12Var.f15000e.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    C0670g.m5864c();
                    return false;
                }
                if (b12Var.f15020y.f24429a != null || !(b12Var.f15017v instanceof p01)) {
                }
            }
            return true;
        }
        return false;
    }
}
