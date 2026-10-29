package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hx3 implements si1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ si1 f20912a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long f20913b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.si1
    public final Object collect(ti1 ti1Var, wm0 wm0Var) {
        ex3 ex3Var;
        if (wm0Var instanceof ex3) {
            ex3Var = (ex3) wm0Var;
            int i = ex3Var.f18560u;
            if ((i & Integer.MIN_VALUE) != 0) {
                ex3Var.f18560u = i - Integer.MIN_VALUE;
            } else {
                ex3Var = new ex3(this, wm0Var);
            }
        } else {
            ex3Var = new ex3(this, wm0Var);
        }
        Object obj = ex3Var.f18559t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = ex3Var.f18560u;
        if (i2 == 0) {
            k43.m7376J(obj);
            si1 si1Var = this.f20912a;
            long j = this.f20913b;
            gx3 gx3Var = new gx3();
            gx3Var.f20173a = ti1Var;
            gx3Var.f20174b = j;
            VarHandle.storeStoreFence();
            ex3Var.f18560u = 1;
            if (si1Var.collect(gx3Var, ex3Var) == ap0Var) {
                return ap0Var;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj);
        }
        return ju4.f22634a;
    }
}
