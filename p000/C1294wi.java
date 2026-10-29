package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: wi */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1294wi extends ue2 implements nq1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f33399i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f33400j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f33401k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f33402l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ iq1 f33403m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1294wi(Object obj, Object obj2, Object obj3, iq1 iq1Var, byte b) {
        super(3);
        this.f33399i = b;
        this.f33400j = obj;
        this.f33401k = obj2;
        this.f33402l = obj3;
        this.f33403m = iq1Var;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.f33399i;
        Object obj4 = this.f33401k;
        i50 i50Var = ki0.f23136a;
        iq1 iq1Var = this.f33403m;
        Object obj5 = this.f33402l;
        Object obj6 = this.f33400j;
        byte b2 = 0;
        byte b3 = 1;
        switch (b) {
            case 0:
                InterfaceC1147sj interfaceC1147sj = (InterfaceC1147sj) obj;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                w94 w94Var = (w94) obj4;
                C0727hj c0727hj = (C0727hj) obj5;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? ((ir1) mi0Var).m6890g(interfaceC1147sj) : ((ir1) mi0Var).m6894i(interfaceC1147sj) ? 4 : 2;
                }
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(1 & iIntValue, (iIntValue & 19) != 18)) {
                    boolean zM6890g = ir1Var.m6890g(w94Var) | ir1Var.m6894i(obj6) | ir1Var.m6894i(c0727hj);
                    Object objM6869O = ir1Var.m6869O();
                    if (zM6890g || objM6869O == i50Var) {
                        objM6869O = new C1257vi(w94Var, obj6, c0727hj, b2);
                        ir1Var.m6905n0(objM6869O);
                    }
                    lb5.m7924e(interfaceC1147sj, obj6, (yp1) objM6869O, ir1Var);
                    c0727hj.f20618d.m8138m(obj6, ((C1184tj) interfaceC1147sj).f31187b);
                    Object objM6869O2 = ir1Var.m6869O();
                    Object obj7 = objM6869O2;
                    if (objM6869O2 == i50Var) {
                        C0456aj c0456aj = new C0456aj();
                        c0456aj.f14532a = interfaceC1147sj;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c0456aj);
                        obj7 = c0456aj;
                    }
                    ((pg0) iq1Var).mo183g((C0456aj) obj7, obj6, ir1Var, 0);
                } else {
                    ir1Var.m6874W();
                }
                return ju4.f22634a;
            default:
                yp1 yp1Var = (yp1) obj5;
                nt2 nt2Var = (nt2) obj;
                ((Number) obj3).intValue();
                wp1 wp1Var = (wp1) iq1Var;
                en3 en3Var = (en3) obj6;
                ir1 ir1Var2 = (ir1) ((mi0) obj2);
                ir1Var2.m6885d0(231415144);
                ir1Var2.m6885d0(-1020090083);
                Object objM6869O3 = ir1Var2.m6869O();
                if (objM6869O3 == i50Var) {
                    objM6869O3 = k43.m7398w(b33.m3423a(0L));
                    ir1Var2.m6905n0(objM6869O3);
                }
                sw2 sw2Var = (sw2) objM6869O3;
                ir1Var2.m6912r(false);
                ir1Var2.m6885d0(-1020087938);
                Object objM6869O4 = ir1Var2.m6869O();
                if (objM6869O4 == i50Var) {
                    objM6869O4 = k43.m7398w(w52.m12106a(0L));
                    ir1Var2.m6905n0(objM6869O4);
                }
                sw2 sw2Var2 = (sw2) objM6869O4;
                ir1Var2.m6912r(false);
                Object objM6869O5 = ir1Var2.m6869O();
                if (objM6869O5 == i50Var) {
                    jj0 jj0Var = new jj0(lb5.m7942w(r71.f29063a, ir1Var2));
                    ir1Var2.m6905n0(jj0Var);
                    objM6869O5 = jj0Var;
                }
                zo0 zo0Var = ((jj0) objM6869O5).f22325a;
                ir1Var2.m6885d0(-1020083824);
                Object objM6869O6 = ir1Var2.m6869O();
                if (objM6869O6 == i50Var) {
                    objM6869O6 = new l20(sw2Var, sw2Var2, (byte) 2);
                    ir1Var2.m6905n0(objM6869O6);
                }
                ir1Var2.m6912r(false);
                nt2 nt2VarM9120z = oh6.m9120z(nt2Var, (yp1) objM6869O6);
                rn3 rn3Var = en3Var.f18272a;
                boolean z = ((Boolean) s94.m10566b(new dn3(en3Var.f18273b, rn3Var, b3)).getValue()).booleanValue() || !((Boolean) en3Var.f18272a.f29451l.getValue()).booleanValue();
                ig1 ig1Var = (ig1) obj4;
                ir1Var2.m6885d0(-1020069521);
                boolean zM6894i = ir1Var2.m6894i(zo0Var) | ir1Var2.m6890g(en3Var) | ir1Var2.m6890g(yp1Var);
                en3 en3Var2 = (en3) obj6;
                Object objM6869O7 = ir1Var2.m6869O();
                if (zM6894i || objM6869O7 == i50Var) {
                    cn3 cn3Var = new cn3(zo0Var, yp1Var, en3Var2, sw2Var, sw2Var2);
                    ir1Var2.m6905n0(cn3Var);
                    objM6869O7 = cn3Var;
                }
                yp1 yp1Var2 = (yp1) objM6869O7;
                ir1Var2.m6912r(false);
                ir1Var2.m6885d0(-1020052768);
                boolean zM6890g2 = ir1Var2.m6890g(en3Var) | ir1Var2.m6890g(wp1Var);
                Object objM6869O8 = ir1Var2.m6869O();
                if (zM6890g2 || objM6869O8 == i50Var) {
                    objM6869O8 = new dn3(en3Var, wp1Var, b2);
                    ir1Var2.m6905n0(objM6869O8);
                }
                wp1 wp1Var2 = (wp1) objM6869O8;
                ir1Var2.m6912r(false);
                ir1Var2.m6885d0(-1020048579);
                boolean zM6890g3 = ir1Var2.m6890g(en3Var);
                Object objM6869O9 = ir1Var2.m6869O();
                if (zM6890g3 || objM6869O9 == i50Var) {
                    objM6869O9 = new C1220ui(en3Var, b3);
                    ir1Var2.m6905n0(objM6869O9);
                }
                ir1Var2.m6912r(false);
                nt2 nt2VarM10029m = qq2.m10029m(nt2VarM9120z, new i31(rn3Var, wp1Var2, z, ig1Var, yp1Var2, (mq1) objM6869O9));
                ir1Var2.m6912r(false);
                return nt2VarM10029m;
        }
    }
}
