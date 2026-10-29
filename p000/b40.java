package p000;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b40 extends xq1 implements nq1 {

    /* JADX INFO: renamed from: b */
    public static final b40 f15071b = new b40(3, f40.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p80 p80Var;
        f40 f40Var = (f40) obj;
        g04 g04Var = (g04) obj2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f40.f18724d;
        f40Var.getClass();
        p80 p80Var2 = (p80) AbstractC1078qo.f28633a.getObjectVolatile(f40Var, f40.f18735o);
        while (!f40Var.m5502y()) {
            long andIncrement = f40.f18725e.getAndIncrement(f40Var);
            long j = h40.f20361b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (p80Var2.f22d != j2) {
                p80 p80VarM5490k = f40Var.m5490k(j2, p80Var2);
                if (p80VarM5490k == null) {
                    continue;
                } else {
                    p80Var = p80VarM5490k;
                }
            } else {
                p80Var = p80Var2;
            }
            Object objM5479K = f40Var.m5479K(p80Var, i, andIncrement, g04Var);
            p80 p80Var3 = p80Var;
            if (objM5479K == h40.f20372m) {
                if (g04Var == null) {
                    g04Var = null;
                }
                if (g04Var != null) {
                    g04Var.f19474c = p80Var3;
                    g04Var.f19475d = i;
                }
            } else if (objM5479K == h40.f20374o) {
                if (andIncrement < f40Var.m5499u()) {
                    p80Var3.m9128a();
                }
                p80Var2 = p80Var3;
            } else {
                if (objM5479K == h40.f20373n) {
                    C1077qn.m9989o("unexpected");
                    return null;
                }
                p80Var3.m9128a();
                g04Var.f19476e = objM5479K;
            }
            return ju4.f22634a;
        }
        g04Var.f19476e = h40.f20371l;
        return ju4.f22634a;
    }
}
