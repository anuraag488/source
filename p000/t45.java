package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t45 extends mt2 implements lf2 {

    /* JADX INFO: renamed from: o */
    public float f30779o;

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        db3 db3VarMo5826e = sq2Var.mo5826e(j);
        int i = db3VarMo5826e.f16899a;
        int i2 = db3VarMo5826e.f16900b;
        s45 s45Var = new s45((byte) 0);
        s45Var.f29909b = db3VarMo5826e;
        s45Var.f29910c = this;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(i, i2, w71.f33134a, s45Var);
    }

    public final String toString() {
        return "ZIndexModifier(zIndex=" + this.f30779o + ")";
    }
}
