package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lf4 implements yp1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ql3 f24001a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f24002b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ InterfaceC1221uj f24003c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ AbstractC0654fk f24004d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ C0457ak f24005e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ float f24006f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ yp1 f24007g;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        ql3 ql3Var = this.f24001a;
        Object obj2 = this.f24002b;
        InterfaceC1221uj interfaceC1221uj = this.f24003c;
        AbstractC0654fk abstractC0654fk = this.f24004d;
        C0457ak c0457ak = this.f24005e;
        float f = this.f24006f;
        yp1 yp1Var = this.f24007g;
        long jLongValue = ((Long) obj).longValue();
        sq4 sq4VarMo5815d = interfaceC1221uj.mo5815d();
        Object objMo5816e = interfaceC1221uj.mo5816e();
        a14 a14Var = new a14((byte) 2);
        a14Var.f54b = c0457ak;
        VarHandle.storeStoreFence();
        C1370yj c1370yj = new C1370yj(obj2, sq4VarMo5815d, abstractC0654fk, jLongValue, objMo5816e, jLongValue, a14Var);
        qs5.m10114s(c1370yj, jLongValue, f, interfaceC1221uj, c0457ak, yp1Var);
        ql3Var.f28555a = c1370yj;
        return ju4.f22634a;
    }
}
