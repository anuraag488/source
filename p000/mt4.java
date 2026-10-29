package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mt4 implements oq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ String f25211a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ mq1 f25212b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ yp1 f25213c;

    @Override // p000.oq1
    /* JADX INFO: renamed from: g */
    public final Object mo183g(Object obj, Object obj2, Object obj3, Object obj4) {
        C1297wl c1297wl;
        String str = this.f25211a;
        mq1 mq1Var = this.f25212b;
        yp1 yp1Var = this.f25213c;
        pn0 pn0Var = (pn0) obj2;
        mi0 mi0Var = (mi0) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        if ((iIntValue & 48) == 0) {
            iIntValue |= ((ir1) mi0Var).m6890g(pn0Var) ? 32 : 16;
        }
        byte b = 0;
        byte b2 = 1;
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 145) != 144)) {
            it4 it4Var = new it4(b2);
            it4Var.f21775b = pn0Var;
            it4Var.f21776c = yp1Var;
            VarHandle.storeStoreFence();
            C1297wl c1297wlM10510c = rz2.m10510c(vd6.m11834R(289657306, it4Var, ir1Var), ir1Var);
            pg0 pg0VarM11834R = null;
            if (pn0Var == null) {
                ir1Var.m6885d0(774249740);
                ir1Var.m6912r(false);
                c1297wl = null;
            } else {
                ir1Var.m6885d0(-1083401879);
                it4 it4Var2 = new it4(b);
                it4Var2.f21775b = pn0Var;
                it4Var2.f21776c = yp1Var;
                VarHandle.storeStoreFence();
                C1297wl c1297wlM10510c2 = rz2.m10510c(vd6.m11834R(-1256804609, it4Var2, ir1Var), ir1Var);
                ir1Var.m6912r(false);
                c1297wl = c1297wlM10510c2;
            }
            er1 er1Var = new er1((byte) 23);
            er1Var.f18412b = str;
            er1Var.f18413c = pn0Var;
            VarHandle.storeStoreFence();
            pg0 pg0VarM11834R2 = vd6.m11834R(-571420308, er1Var, ir1Var);
            if (str == null) {
                ir1Var.m6885d0(774837996);
                ir1Var.m6912r(false);
            } else {
                ir1Var.m6885d0(-1083383304);
                jt4 jt4Var = new jt4(b);
                jt4Var.f22612b = pn0Var;
                VarHandle.storeStoreFence();
                pg0VarM11834R = vd6.m11834R(-163172463, jt4Var, ir1Var);
                ir1Var.m6912r(false);
            }
            pg0 pg0Var = pg0VarM11834R;
            jt4 jt4Var2 = new jt4(b2);
            jt4Var2.f22612b = pn0Var;
            VarHandle.storeStoreFence();
            mz3.m8463e(null, null, true, c1297wlM10510c, c1297wl, null, pg0VarM11834R2, pg0Var, mq1Var, vd6.m11834R(1373262063, jt4Var2, ir1Var), ir1Var, 806879232, 35);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
