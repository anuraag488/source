package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class id3 {
    static {
        new nc4(new da2((byte) 12));
    }

    /* JADX INFO: renamed from: a */
    public static final void m6765a(pg0 pg0Var, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(442516910);
        if (ir1Var.m6871T(i & 1, (i & 3) != 2)) {
            ir1Var.m6885d0(1766838549);
            ir1Var.m6912r(false);
            ir1Var.m6885d0(1767392772);
            pg0Var.invoke(ir1Var, 6);
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            h02 h02Var = new h02((byte) 7);
            h02Var.f20244b = pg0Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = h02Var;
        }
    }
}
