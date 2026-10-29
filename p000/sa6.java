package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sa6 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f30041a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f30042b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30043c;

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        switch (this.f30041a) {
            case 0:
                qm6 qm6Var = ((jc6) this.f30042b).f22167a;
                qm6Var.m9928A();
                ar5 ar5Var = qm6Var.f28593c;
                qm6.m9925S(ar5Var);
                return ar5Var.m3203r0((String) this.f30043c);
            case 1:
                qm6 qm6Var2 = ((jc6) this.f30042b).f22167a;
                qm6Var2.m9928A();
                return new bq5(qm6Var2.m9970o0(((cp6) this.f30043c).f16349d));
            default:
                cp6 cp6Var = (cp6) this.f30043c;
                String str = cp6Var.f16349d;
                y42.m12854a0(str);
                qm6 qm6Var3 = (qm6) this.f30042b;
                xc6 xc6VarM9947a = qm6Var3.m9947a(str);
                vc6 vc6Var = vc6.ANALYTICS_STORAGE;
                if (xc6VarM9947a.m12660i(vc6Var) && xc6.m12653c(100, cp6Var.f16367v).m12660i(vc6Var)) {
                    return qm6Var3.m9948a0(cp6Var).m13405E();
                }
                qm6Var3.mo9019b().f16831L.m12504a("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }
}
