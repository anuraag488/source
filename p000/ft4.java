package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ft4 implements jc2 {

    /* JADX INFO: renamed from: a */
    public static final ft4 f19281a = new ft4();

    /* JADX INFO: renamed from: b */
    public static final m32 f19282b = AbstractC1356y5.m12908b("kotlin.UShort", h64.f20409a);

    @Override // p000.jc2
    /* JADX INFO: renamed from: b */
    public final Object mo13b(iv0 iv0Var) {
        short sMo5403z = iv0Var.mo5401x(f19282b).mo5403z();
        bt4 bt4Var = new bt4();
        bt4Var.f15594a = sMo5403z;
        VarHandle.storeStoreFence();
        return bt4Var;
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        g81Var.mo5925l(f19282b).mo5922h(((bt4) obj).f15594a);
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return f19282b;
    }
}
