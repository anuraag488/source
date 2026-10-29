package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class at4 implements jc2 {

    /* JADX INFO: renamed from: a */
    public static final at4 f14862a = new at4();

    /* JADX INFO: renamed from: b */
    public static final m32 f14863b = AbstractC1356y5.m12908b("kotlin.ULong", no2.f25981a);

    @Override // p000.jc2
    /* JADX INFO: renamed from: b */
    public final Object mo13b(iv0 iv0Var) {
        long jMo5383c = iv0Var.mo5401x(f14863b).mo5383c();
        ws4 ws4Var = new ws4();
        ws4Var.f33693a = jMo5383c;
        VarHandle.storeStoreFence();
        return ws4Var;
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        g81Var.mo5925l(f14863b).mo5929v(((ws4) obj).f33693a);
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return f14863b;
    }
}
