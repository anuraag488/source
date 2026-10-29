package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f43 extends xq1 implements nq1 {

    /* JADX INFO: renamed from: b */
    public static final f43 f18746b = new f43(3, g43.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        g43 g43Var = (g43) obj;
        g04 g04Var = (g04) obj2;
        long j = g43Var.f19610a;
        ju4 ju4Var = ju4.f22634a;
        if (j <= 0) {
            g04Var.f19476e = ju4Var;
            return ju4Var;
        }
        RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 16);
        runnableC1285w9.f33164b = g04Var;
        runnableC1285w9.f33165c = g43Var;
        VarHandle.storeStoreFence();
        ro0 ro0Var = g04Var.f19472a;
        g04Var.f19474c = d24.m4321v(ro0Var).mo6961A(j, runnableC1285w9, ro0Var);
        return ju4Var;
    }
}
