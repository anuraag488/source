package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vs4 implements jc2 {

    /* JADX INFO: renamed from: a */
    public static final vs4 f32840a = new vs4();

    /* JADX INFO: renamed from: b */
    public static final m32 f32841b = AbstractC1356y5.m12908b("kotlin.UInt", u52.f31657a);

    @Override // p000.jc2
    /* JADX INFO: renamed from: b */
    public final Object mo13b(iv0 iv0Var) {
        int iMo5396s = iv0Var.mo5401x(f32841b).mo5396s();
        rs4 rs4Var = new rs4();
        rs4Var.f29588a = iMo5396s;
        VarHandle.storeStoreFence();
        return rs4Var;
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        g81Var.mo5925l(f32841b).mo5927p(((rs4) obj).f29588a);
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return f32841b;
    }
}
