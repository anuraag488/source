package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c92 extends xq1 implements nq1 {

    /* JADX INFO: renamed from: b */
    public static final c92 f15892b = new c92(3, e92.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object objM4983O;
        e92 e92Var = (e92) obj;
        g04 g04Var = (g04) obj2;
        int i = e92.f17909c;
        do {
            objM4983O = e92Var.m4983O();
            if (!(objM4983O instanceof c22)) {
                if (!(objM4983O instanceof ff0)) {
                    objM4983O = f92.m5616a(objM4983O);
                }
                g04Var.f19476e = objM4983O;
            }
            return ju4.f22634a;
        } while (e92Var.m4998d0(objM4983O) < 0);
        g04Var.f19474c = y70.m13005F(e92Var, true, new b92(e92Var, g04Var));
        return ju4.f22634a;
    }
}
