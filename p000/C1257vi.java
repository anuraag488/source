package p000;

import ads_mobile_sdk.AbstractC0137h;
import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: vi */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1257vi extends ue2 implements yp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f32633i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f32634j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f32635k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f32636l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1257vi(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.f32633i = b;
        this.f32634j = obj;
        this.f32635k = obj2;
        this.f32636l = obj3;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f32633i;
        boolean z = false;
        Object obj2 = this.f32636l;
        Object obj3 = this.f32635k;
        Object obj4 = this.f32634j;
        switch (b) {
            case 0:
                C0785j4 c0785j4 = new C0785j4((byte) 1);
                c0785j4.f21994b = (w94) obj4;
                c0785j4.f21995c = obj3;
                c0785j4.f21996d = (C0727hj) obj2;
                VarHandle.storeStoreFence();
                return c0785j4;
            case 1:
                qn3 qn3Var = (qn3) obj;
                long jM9991a = qn3Var.m9991a();
                rn3 rn3Var = (rn3) obj4;
                if (((Boolean) rn3Var.f29448i.invoke((jl3) obj3, AbstractC0647fd.m5672j(i20.m6580e((int) (jM9991a >> 32), (int) (jM9991a & 4294967295L)), z62.m13369a0(qn3Var.m9992b())))).booleanValue() && rn3Var.f29457r.contains(qn3Var.f28622a.f25855j) && ((Boolean) ((yp1) obj2).invoke(qn3Var)).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (((AtomicBoolean) obj4).compareAndSet(false, true)) {
                    ((zl2) obj3).cancel(true);
                    try {
                        ((i82) obj2).close();
                    } catch (Throwable th) {
                        AbstractC0137h.m1115c("Failed to close isolate on cancellation", th);
                    }
                    break;
                }
                return ju4.f22634a;
        }
    }
}
