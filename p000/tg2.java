package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tg2 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31141a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ yp1 f31142b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ gr1 f31143c;

    public /* synthetic */ tg2(byte b) {
        this.f31141a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f31141a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                yp1 yp1Var = this.f31142b;
                oi2 oi2Var = (oi2) obj;
                ga3 ga3VarMo6114j = this.f31143c.mo6114j();
                vg2 vg2Var = new vg2();
                vg2Var.f32596c = oi2Var;
                vg2Var.f32594a = oi2Var;
                vg2Var.f32595b = ga3VarMo6114j;
                VarHandle.storeStoreFence();
                yp1Var.invoke(vg2Var);
                break;
            default:
                yp1 yp1Var2 = this.f31142b;
                oi2 oi2Var2 = (oi2) obj;
                ga3 ga3VarMo6114j2 = this.f31143c.mo6114j();
                vg2 vg2Var2 = new vg2();
                vg2Var2.f32596c = oi2Var2;
                vg2Var2.f32594a = oi2Var2;
                vg2Var2.f32595b = ga3VarMo6114j2;
                VarHandle.storeStoreFence();
                yp1Var2.invoke(vg2Var2);
                break;
        }
        return ju4Var;
    }
}
