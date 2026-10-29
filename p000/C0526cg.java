package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: cg */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0526cg implements mq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ fy4 f15991a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long f15992b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f15993c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ nt2 f15994d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ c33 f15995e;

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        fy4 fy4Var = this.f15991a;
        long j = this.f15992b;
        boolean z = this.f15993c;
        nt2 nt2Var = this.f15994d;
        c33 c33Var = this.f15995e;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            zh3 zh3VarMo7523a = ij0.f21485t.mo7523a(fy4Var);
            C0611eg c0611eg = new C0611eg();
            c0611eg.f18059a = j;
            c0611eg.f18060b = z;
            c0611eg.f18061c = nt2Var;
            c0611eg.f18062d = c33Var;
            VarHandle.storeStoreFence();
            as4.m3244c(zh3VarMo7523a, vd6.m11834R(1260045569, c0611eg, ir1Var), ir1Var, 56);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
