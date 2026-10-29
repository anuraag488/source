package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bx3 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public boolean f15671t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f15672u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ float f15673v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC1407zj f15674w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ nl3 f15675x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx3(float f, InterfaceC1407zj interfaceC1407zj, nl3 nl3Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f15673v = f;
        this.f15674w = interfaceC1407zj;
        this.f15675x = nl3Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        bx3 bx3Var = new bx3(this.f15673v, this.f15674w, this.f15675x, wm0Var);
        bx3Var.f15672u = obj;
        return bx3Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((bx3) create((wm0) obj2, (tx3) obj)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f15671t;
        if (!z) {
            k43.m7376J(obj);
            tx3 tx3Var = (tx3) this.f15672u;
            er1 er1Var = new er1((byte) 11);
            er1Var.f18412b = this.f15675x;
            er1Var.f18413c = tx3Var;
            VarHandle.storeStoreFence();
            this.f15671t = true;
            if (qs5.m10104i(0.0f, this.f15673v, this.f15674w, er1Var, this, 4) == ap0Var) {
                return ap0Var;
            }
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj);
        }
        return ju4.f22634a;
    }
}
