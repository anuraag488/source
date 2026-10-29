package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: ym */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1373ym implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35320a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f35321b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f35322c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f35323d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f35324e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f35325f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ iq1 f35326g;

    public /* synthetic */ C1373ym(byte b) {
        this.f35320a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.f35320a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC1410zm.m13637a((dc0) this.f35321b, (lu2) this.f35322c, (s44) this.f35323d, (js4) this.f35324e, (tp3) this.f35325f, (pg0) this.f35326g, (mi0) obj, vd6.m11838V(196609));
                return ju4Var;
            case 1:
                ((Integer) obj2).getClass();
                as4.m3247f((nt2) this.f35321b, (si2) this.f35322c, (e73) this.f35323d, (InterfaceC1188tn) this.f35324e, (C0816jz) this.f35325f, (yp1) this.f35326g, (mi0) obj, vd6.m11838V(3079));
                return ju4Var;
            default:
                sw2 sw2Var = (sw2) this.f35321b;
                bp4 bp4Var = (bp4) this.f35322c;
                bp4 bp4Var2 = (bp4) this.f35323d;
                xb4 xb4Var = (xb4) this.f35324e;
                pg0 pg0Var = (pg0) this.f35326g;
                Object obj4 = (bo4) this.f35325f;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                boolean zM6871T = ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2);
                InterfaceC0618en interfaceC0618en = ir1Var.f21685a;
                if (!zM6871T) {
                    ir1Var.m6874W();
                    return ju4Var;
                }
                Object objM6869O = ir1Var.m6869O();
                i50 i50Var = ki0.f23136a;
                if (objM6869O == i50Var) {
                    obj3 = objM6869O;
                    C0761ih c0761ih = new C0761ih((byte) 15);
                    c0761ih.f21416b = sw2Var;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0761ih);
                    obj3 = c0761ih;
                }
                obj3 = objM6869O;
                kt2 kt2Var = kt2.f23428a;
                nt2 nt2VarM9120z = oh6.m9120z(kt2Var, (yp1) obj3);
                C0853kz c0853kz = ig1.f21378b;
                xq2 xq2VarM9704c = q20.m9704c(c0853kz, false);
                int iHashCode = Long.hashCode(ir1Var.f21683T);
                ga3 ga3VarM6902m = ir1Var.m6902m();
                nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM9120z);
                bi0.f15310ap.getClass();
                if (interfaceC0618en == null) {
                    dt0.m4682E();
                    throw null;
                }
                ir1Var.m6893h0();
                boolean z = ir1Var.f21682S;
                da2 da2Var = wf2.f33290T;
                if (z) {
                    ir1Var.m6900l(da2Var);
                } else {
                    ir1Var.m6911q0();
                }
                jh0 jh0Var = ia5.f21216g;
                C0006a5.m53I(ir1Var, jh0Var, xq2VarM9704c);
                jh0 jh0Var2 = ia5.f21215f;
                C0006a5.m53I(ir1Var, jh0Var2, ga3VarM6902m);
                Integer numValueOf = Integer.valueOf(iHashCode);
                jh0 jh0Var3 = ia5.f21217h;
                C0006a5.m53I(ir1Var, jh0Var3, numValueOf);
                C0006a5.m50F(ir1Var);
                jh0 jh0Var4 = ia5.f21214e;
                C0006a5.m53I(ir1Var, jh0Var4, nt2VarM10006A);
                ir1Var.m6879a0(-1350495383, Integer.valueOf(((Number) xb4Var.getValue()).intValue()));
                boolean zM6890g = ir1Var.m6890g(bp4Var) | ir1Var.m6890g(bp4Var2);
                Object objM6869O2 = ir1Var.m6869O();
                Object obj5 = objM6869O2;
                if (zM6890g || objM6869O2 == i50Var) {
                    cz3 cz3Var = new cz3((byte) 13);
                    cz3Var.f16638b = bp4Var;
                    cz3Var.f16639c = bp4Var2;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(cz3Var);
                    obj5 = cz3Var;
                }
                nt2 nt2VarM10693F = se0.m10693F(kt2Var, (yp1) obj5);
                xq2 xq2VarM9704c2 = q20.m9704c(c0853kz, false);
                int iHashCode2 = Long.hashCode(ir1Var.f21683T);
                ga3 ga3VarM6902m2 = ir1Var.m6902m();
                nt2 nt2VarM10006A2 = qq2.m10006A(ir1Var, nt2VarM10693F);
                ir1Var.m6893h0();
                if (ir1Var.f21682S) {
                    ir1Var.m6900l(da2Var);
                } else {
                    ir1Var.m6911q0();
                }
                C0006a5.m53I(ir1Var, jh0Var, xq2VarM9704c2);
                C0006a5.m53I(ir1Var, jh0Var2, ga3VarM6902m2);
                d55.m4373r(iHashCode2, ir1Var, jh0Var3, ir1Var);
                C0006a5.m53I(ir1Var, jh0Var4, nt2VarM10006A2);
                pg0Var.invoke(obj4, ir1Var, 6);
                ir1Var.m6912r(true);
                ir1Var.m6912r(false);
                ir1Var.m6912r(true);
                return ju4Var;
        }
    }
}
