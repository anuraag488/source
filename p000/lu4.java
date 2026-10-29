package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lu4 implements jc2 {

    /* JADX INFO: renamed from: b */
    public static final lu4 f24379b;

    /* JADX INFO: renamed from: a */
    public /* synthetic */ s23 f24380a;

    static {
        lu4 lu4Var = new lu4();
        s23 s23Var = new s23();
        aj2 aj2Var = aj2.f14536a;
        g32 g32Var = new g32((byte) 12);
        g32Var.f19558b = s23Var;
        VarHandle.storeStoreFence();
        s23Var.f29840a = i25.m6630z(aj2Var, g32Var);
        VarHandle.storeStoreFence();
        lu4Var.f24380a = s23Var;
        VarHandle.storeStoreFence();
        f24379b = lu4Var;
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: b */
    public final Object mo13b(iv0 iv0Var) {
        this.f24380a.mo13b(iv0Var);
        return ju4.f22634a;
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        this.f24380a.mo14c(g81Var, (ju4) obj);
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return this.f24380a.mo15d();
    }
}
