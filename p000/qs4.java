package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qs4 implements jc2 {

    /* JADX INFO: renamed from: a */
    public static final qs4 f28766a = new qs4();

    /* JADX INFO: renamed from: b */
    public static final m32 f28767b = AbstractC1356y5.m12908b("kotlin.UByte", d50.f16784a);

    @Override // p000.jc2
    /* JADX INFO: renamed from: b */
    public final Object mo13b(iv0 iv0Var) {
        byte bMo5400w = iv0Var.mo5401x(f28767b).mo5400w();
        ms4 ms4Var = new ms4();
        ms4Var.f25180a = bMo5400w;
        VarHandle.storeStoreFence();
        return ms4Var;
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        g81Var.mo5925l(f28767b).mo5923j(((ms4) obj).f25180a);
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return f28767b;
    }
}
