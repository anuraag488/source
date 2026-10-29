package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ot4 implements yp1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27092a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ rn3 f27093b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ fv3 f27094c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ ch0 f27095d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ int f27096e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ fv3 f27097f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ ch0 f27098g;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        Object obj2 = this.f27092a;
        rn3 rn3Var = this.f27093b;
        fv3 fv3Var = this.f27094c;
        ch0 ch0Var = this.f27095d;
        int i = this.f27096e;
        ch0 ch0Var2 = this.f27098g;
        kz3 kz3Var = (kz3) obj;
        pt4 pt4Var = new pt4();
        pt4Var.f27977a = rn3Var;
        pt4Var.f27978b = obj2;
        pt4Var.f27979c = fv3Var;
        pt4Var.f27980d = ch0Var;
        pt4Var.f27981e = i;
        VarHandle.storeStoreFence();
        kz3Var.m7753a(obj2, new pg0(329824002, true, pt4Var));
        qt4 qt4Var = new qt4();
        qt4Var.f28789a = obj2;
        qt4Var.f28790b = ch0Var2;
        qt4Var.f28791c = i;
        VarHandle.storeStoreFence();
        kz3Var.m7753a(obj2 + "_long", new pg0(354079595, true, qt4Var));
        return ju4.f22634a;
    }
}
