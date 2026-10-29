package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qs1 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28747a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ yp1 f28748b;

    public /* synthetic */ qs1(byte b) {
        this.f28747a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        long j;
        switch (this.f28747a) {
            case 0:
                i94 i94Var = (i94) obj;
                synchronized (k94.f23012c) {
                    j = k94.f23014e;
                    k94.f23014e = 1 + j;
                }
                yp1 yp1Var = this.f28748b;
                wj3 wj3Var = new wj3(j, i94Var);
                wj3Var.f33429e = yp1Var;
                wj3Var.f33430f = 1;
                VarHandle.storeStoreFence();
                return wj3Var;
            default:
                return this.f28748b.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
