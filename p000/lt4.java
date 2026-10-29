package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lt4 implements oq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ sg2 f24357a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f24358b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ ch0 f24359c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f24360d;

    @Override // p000.oq1
    /* JADX INFO: renamed from: g */
    public final Object mo183g(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        sg2 sg2Var = this.f24357a;
        Object obj6 = this.f24358b;
        ch0 ch0Var = this.f24359c;
        int i = this.f24360d;
        en3 en3Var = (en3) obj;
        ((Boolean) obj2).getClass();
        mi0 mi0Var = (mi0) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        byte b = 4;
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((ir1) mi0Var).m6890g(en3Var) ? 4 : 2;
        }
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 131) != 130)) {
            nt2 nt2VarM3253l = as4.m3253l(sg2Var, ir1Var);
            sn0 sn0Var = ((vx2) obj6).f32907a;
            boolean zM6890g = ir1Var.m6890g(ch0Var) | ir1Var.m6886e(i) | ir1Var.m6894i(obj6);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == ki0.f23136a) {
                obj5 = objM6869O;
                C0005a4 c0005a4 = new C0005a4(b);
                c0005a4.f88c = ch0Var;
                c0005a4.f87b = i;
                c0005a4.f89d = obj6;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0005a4);
                obj5 = c0005a4;
            }
            obj5 = objM6869O;
            u04 u04Var = new u04((byte) 10);
            u04Var.f31581b = en3Var;
            VarHandle.storeStoreFence();
            qq2.m10017a(sn0Var, (yp1) obj5, nt2VarM3253l, false, "Click", vd6.m11834R(-1764465182, u04Var, ir1Var), ir1Var, 221184);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
