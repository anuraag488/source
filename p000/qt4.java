package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qt4 implements nq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f28789a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ch0 f28790b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f28791c;

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Object obj5 = this.f28789a;
        ch0 ch0Var = this.f28790b;
        int i = this.f28791c;
        sg2 sg2Var = (sg2) obj;
        mi0 mi0Var = (mi0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((ir1) mi0Var).m6890g(sg2Var) ? 4 : 2;
        }
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 19) != 18)) {
            nt2 nt2VarM3253l = as4.m3253l(sg2Var, ir1Var);
            sn0 sn0Var = ((vx2) obj5).f32908b;
            boolean zM6890g = ir1Var.m6890g(ch0Var) | ir1Var.m6886e(i) | ir1Var.m6894i(obj5);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == ki0.f23136a) {
                obj4 = objM6869O;
                C0005a4 c0005a4 = new C0005a4((byte) 3);
                c0005a4.f88c = ch0Var;
                c0005a4.f87b = i;
                c0005a4.f89d = obj5;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0005a4);
                obj4 = c0005a4;
            }
            obj4 = objM6869O;
            qq2.m10017a(sn0Var, (yp1) obj4, nt2VarM3253l, false, "Long click", ev0.f18496d, ir1Var, 221184);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
