package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sz2 implements mq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ pz2 f30682a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ nt2 f30683b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f30684c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ List f30685d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ yp1 f30686e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ yp1 f30687f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ mq1 f30688g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ y94 f30689h;

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        pz2 pz2Var = this.f30682a;
        nt2 nt2Var = this.f30683b;
        List list = this.f30684c;
        List list2 = this.f30685d;
        yp1 yp1Var = this.f30686e;
        yp1 yp1Var2 = this.f30687f;
        mq1 mq1Var = this.f30688g;
        y94 y94Var = this.f30689h;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            List listM9689a = pz2Var.m9689a();
            boolean zM6890g = ir1Var.m6890g(pz2Var);
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (zM6890g || objM6869O == i50Var) {
                obj3 = objM6869O;
                ep1 ep1Var = new ep1((byte) 1);
                ep1Var.f18354b = pz2Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(ep1Var);
                obj3 = ep1Var;
            }
            wp1 wp1Var = (wp1) obj3;
            Object objM6869O2 = ir1Var.m6869O();
            if (objM6869O2 == i50Var) {
                objM6869O2 = new kr2((byte) 13);
                ir1Var.m6905n0(objM6869O2);
            }
            kx5.m7702d(listM9689a, nt2Var, null, wp1Var, list, list2, null, yp1Var, yp1Var2, mq1Var, (yp1) objM6869O2, ir1Var, 0);
            List listM5276O = eq2.m5276O(y94Var);
            uc1 uc1Var = new uc1((byte) 2);
            uc1Var.f31781b = pz2Var;
            VarHandle.storeStoreFence();
            for (l73 l73Var : hb0.m6315a1(listM5276O, uc1Var)) {
                ir1Var.m6879a0(-1791246923, l73Var.f23833a);
                ((mq1) l73Var.f23834b).invoke(ir1Var, 0);
                ir1Var.m6912r(false);
            }
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
