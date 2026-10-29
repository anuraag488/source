package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xr1 implements a24 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f34560a = 1;

    /* JADX INFO: renamed from: b */
    public yp1 f34561b;

    /* JADX INFO: renamed from: c */
    public Object f34562c;

    public xr1(wp1 wp1Var, yp1 yp1Var) {
        this.f34562c = wp1Var;
        this.f34561b = yp1Var;
    }

    @Override // p000.a24
    public final Iterator iterator() {
        switch (this.f34560a) {
            case 0:
                xf1 xf1Var = new xf1((byte) 1);
                xf1Var.f34224d = this;
                xf1Var.f34223c = -2;
                VarHandle.storeStoreFence();
                return xf1Var;
            default:
                wo4 wo4Var = new wo4();
                wo4Var.f33563b = this;
                wo4Var.f33562a = ((a24) this.f34562c).iterator();
                VarHandle.storeStoreFence();
                return wo4Var;
        }
    }

    public /* synthetic */ xr1() {
    }
}
