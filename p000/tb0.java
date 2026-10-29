package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tb0 implements mq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ float f31047a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ mq1 f31048b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f31049c;

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        float f = this.f31047a;
        mq1 mq1Var = this.f31048b;
        String str = this.f31049c;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            oz3 oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
            boolean zM6890g = ir1Var.m6890g(mq1Var);
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (zM6890g || objM6869O == i50Var) {
                obj3 = objM6869O;
                ub0 ub0Var = new ub0((byte) 0);
                ub0Var.f31768b = mq1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(ub0Var);
                obj3 = ub0Var;
            }
            yp1 yp1Var = (yp1) obj3;
            boolean zM6890g2 = ir1Var.m6890g(mq1Var);
            Object objM6869O2 = ir1Var.m6869O();
            Object obj4 = objM6869O2;
            if (zM6890g2 || objM6869O2 == i50Var) {
                ub0 ub0Var2 = new ub0((byte) 1);
                ub0Var2.f31768b = mq1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(ub0Var2);
                obj4 = ub0Var2;
            }
            ne0 ne0Var = new ne0((byte) 11);
            ne0Var.f25728b = str;
            ne0Var.f25729c = oz3VarM10799H;
            VarHandle.storeStoreFence();
            pg0 pg0VarM11834R = vd6.m11834R(-1823199394, ne0Var, ir1Var);
            vb0 vb0Var = new vb0();
            vb0Var.f32504a = f;
            VarHandle.storeStoreFence();
            mz3.m8465g(f, null, oz3VarM10799H, false, null, yp1Var, (yp1) obj4, null, pg0VarM11834R, vd6.m11834R(-1825521494, vb0Var, ir1Var), ir1Var, 805306368);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
