package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class be4 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15225a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ee4 f15226b;

    public /* synthetic */ be4(byte b) {
        this.f15225a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f15225a;
        ju4 ju4Var = ju4.f22634a;
        ee4 ee4Var = this.f15226b;
        switch (b) {
            case 0:
                he4 he4Var = ee4Var.f18032a;
                wf2 wf2Var = (wf2) obj;
                jg2 jg2Var = wf2Var.f33301I;
                if (jg2Var == null) {
                    jg2Var = new jg2();
                    jg2Var.f22230a = wf2Var;
                    jg2Var.f22232c = he4Var;
                    long[] jArr = tv3.f31472a;
                    jg2Var.f22235f = new lw2();
                    jg2Var.f22236g = new lw2();
                    eg2 eg2Var = new eg2();
                    eg2Var.f18071d = jg2Var;
                    eg2Var.f18068a = df2.f17012b;
                    VarHandle.storeStoreFence();
                    jg2Var.f22237h = eg2Var;
                    bg2 bg2Var = new bg2();
                    bg2Var.f15257b = jg2Var;
                    bg2Var.f15256a = eg2Var;
                    VarHandle.storeStoreFence();
                    jg2Var.f22238i = bg2Var;
                    jg2Var.f22239j = new lw2();
                    dw2 dw2VarM3856a = c63.m3856a();
                    ge4 ge4Var = new ge4((byte) 0);
                    ge4Var.f19758b = dw2VarM3856a;
                    VarHandle.storeStoreFence();
                    jg2Var.f22240k = ge4Var;
                    jg2Var.f22241l = new lw2();
                    jg2Var.f22242m = new uw2(new Object[16]);
                    jg2Var.f22245p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
                    VarHandle.storeStoreFence();
                    wf2Var.f33301I = jg2Var;
                }
                ee4Var.f18033b = jg2Var;
                ee4Var.m5105a().m7096i();
                jg2 jg2VarM5105a = ee4Var.m5105a();
                if (jg2VarM5105a.f22232c != he4Var) {
                    jg2VarM5105a.f22232c = he4Var;
                    jg2VarM5105a.m7097j(false);
                    wf2.m12245X(jg2VarM5105a.f22230a, false, 7);
                }
                break;
            case 1:
                ee4Var.m5105a().f22231b = (ui0) obj2;
                break;
            default:
                jg2 jg2VarM5105a2 = ee4Var.m5105a();
                ((wf2) obj).m12276e0(new gg2(jg2VarM5105a2, (mq1) obj2, jg2VarM5105a2.f22245p));
                break;
        }
        return ju4Var;
    }
}
