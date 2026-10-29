package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fi2 implements oi2 {

    /* JADX INFO: renamed from: a */
    public C0795je f19015a;

    @Override // p000.oi2
    /* JADX INFO: renamed from: a */
    public final void mo5715a(Object obj, pg0 pg0Var) {
        b71 b71Var;
        C0795je c0795je = this.f19015a;
        if (obj != null) {
            b71Var = new b71((byte) 13);
            b71Var.f15141b = obj;
            VarHandle.storeStoreFence();
        } else {
            b71Var = null;
        }
        el1 el1Var = new el1((byte) 18);
        VarHandle.storeStoreFence();
        C0750i5 c0750i5 = new C0750i5((byte) 5);
        c0750i5.f21129b = pg0Var;
        VarHandle.storeStoreFence();
        c0795je.m7077b(1, new jp0(b71Var, el1Var, new pg0(-857469575, true, c0750i5), (byte) 27));
    }

    @Override // p000.oi2
    /* JADX INFO: renamed from: d */
    public final void mo5716d(int i, C1143sf c1143sf, pg0 pg0Var) {
        this.f19015a.m7077b(i, new jp0(null, c1143sf, pg0Var, (byte) 27));
    }
}
