package p000;

import android.view.ViewConfiguration;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class xa4 {

    /* JADX INFO: renamed from: a */
    public static final float f34115a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: a */
    public static final gv0 m12642a(mi0 mi0Var) {
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ky0 ky0Var = (ky0) ir1Var.m6898k(ij0.f21473h);
        boolean zM6884d = ir1Var.m6884d(ky0Var.mo3580c());
        Object objM6869O = ir1Var.m6869O();
        if (zM6884d || objM6869O == ki0.f23136a) {
            obj = objM6869O;
            wd3 wd3Var = new wd3(ky0Var);
            gv0 gv0Var = new gv0();
            gv0Var.f20145a = wd3Var;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(gv0Var);
            obj = gv0Var;
        }
        obj = objM6869O;
        return (gv0) obj;
    }
}
