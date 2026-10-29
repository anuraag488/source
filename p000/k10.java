package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k10 implements yp1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f22807a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ d64 f22808b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f22809c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ String f22810d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ String f22811e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ wp1 f22812f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ zo0 f22813g;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        boolean z = this.f22807a;
        d64 d64Var = this.f22808b;
        String str = this.f22809c;
        String str2 = this.f22810d;
        String str3 = this.f22811e;
        wp1 wp1Var = this.f22812f;
        zo0 zo0Var = this.f22813g;
        q14 q14Var = (q14) obj;
        if (z) {
            n10 n10Var = new n10((byte) 0);
            n10Var.f25376b = wp1Var;
            VarHandle.storeStoreFence();
            ic2[] ic2VarArr = o14.f26289a;
            q14Var.mo4898a(d14.f16725v, new C1353y2(str, n10Var));
            e64 e64VarM4386c = d64Var.m4386c();
            e64 e64Var = e64.f17844c;
            if (e64VarM4386c == e64Var) {
                C1048pv c1048pv = new C1048pv((byte) 3);
                c1048pv.f28016b = d64Var;
                c1048pv.f28017c = zo0Var;
                c1048pv.f28018d = d64Var;
                VarHandle.storeStoreFence();
                q14Var.mo4898a(d14.f16723t, new C1353y2(str2, c1048pv));
            } else if (d64Var.f16820d.m8670h().m11653c(e64Var)) {
                C0675g4 c0675g4 = new C0675g4((byte) 10);
                c0675g4.f19600b = d64Var;
                c0675g4.f19601c = zo0Var;
                VarHandle.storeStoreFence();
                q14Var.mo4898a(d14.f16724u, new C1353y2(str3, c0675g4));
            }
        }
        return ju4.f22634a;
    }
}
