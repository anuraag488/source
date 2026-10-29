package p000;

import androidx.compose.p001ui.tooling.PreviewActivity;
import java.lang.invoke.VarHandle;
import java.util.Arrays;

/* JADX INFO: renamed from: h4 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0712h4 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20356a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f20357b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f20358c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f20359d;

    public /* synthetic */ C0712h4(byte b) {
        this.f20356a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) throws Exception {
        Object obj3;
        byte b = this.f20356a;
        wm0 wm0Var = null;
        i50 i50Var = ki0.f23136a;
        ju4 ju4Var = ju4.f22634a;
        byte b2 = 1;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                as4.m3248g((lk2) this.f20357b, (yp1) this.f20358c, (wp1) this.f20359d, (mi0) obj, vd6.m11838V(1));
                return ju4Var;
            case 1:
                ((Integer) obj2).getClass();
                lb5.m7918a((String) this.f20357b, (nt2) this.f20358c, (nq1) this.f20359d, (mi0) obj, vd6.m11838V(1));
                return ju4Var;
            case 2:
                nt2 nt2Var = (nt2) this.f20357b;
                sw2 sw2Var = (sw2) this.f20358c;
                pg0 pg0Var = (pg0) this.f20359d;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objM6869O = ir1Var.m6869O();
                    if (objM6869O == i50Var) {
                        obj3 = objM6869O;
                        C0761ih c0761ih = new C0761ih(false ? (byte) 1 : (byte) 0);
                        c0761ih.f21416b = sw2Var;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c0761ih);
                        obj3 = c0761ih;
                    }
                    obj3 = objM6869O;
                    nt2 nt2VarM9120z = oh6.m9120z(nt2Var, (yp1) obj3);
                    xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, true);
                    int iHashCode = Long.hashCode(ir1Var.f21683T);
                    ga3 ga3VarM6902m = ir1Var.m6902m();
                    nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM9120z);
                    bi0.f15310ap.getClass();
                    if (ir1Var.f21685a == null) {
                        dt0.m4682E();
                        throw null;
                    }
                    ir1Var.m6893h0();
                    if (ir1Var.f21682S) {
                        ir1Var.m6900l(wf2.f33290T);
                    } else {
                        ir1Var.m6911q0();
                    }
                    C0006a5.m53I(ir1Var, ia5.f21216g, xq2VarM9704c);
                    C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
                    C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
                    C0006a5.m50F(ir1Var);
                    C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
                    pg0Var.invoke(ir1Var, 0);
                    ir1Var.m6912r(true);
                } else {
                    ir1Var.m6874W();
                }
                return ju4Var;
            case 3:
                g12 g12Var = (g12) this.f20357b;
                nt2 nt2Var2 = (nt2) this.f20358c;
                xb4 xb4Var = (xb4) this.f20359d;
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    g12 g12Var2 = ((Boolean) xb4Var.getValue()).booleanValue() ? (g12) o02.f26240H.getValue() : g12Var;
                    boolean zM6890g = ir1Var2.m6890g(g12Var) | ir1Var2.m6890g(nt2Var2);
                    Object objM6869O2 = ir1Var2.m6869O();
                    Object obj4 = objM6869O2;
                    if (zM6890g || objM6869O2 == i50Var) {
                        C0558d0 c0558d0 = new C0558d0((byte) 13);
                        c0558d0.f16655b = g12Var;
                        c0558d0.f16656c = nt2Var2;
                        VarHandle.storeStoreFence();
                        ir1Var2.m6905n0(c0558d0);
                        obj4 = c0558d0;
                    }
                    je0.m7085a(g12Var2, null, (yp1) obj4, ir1Var2, 0, 2);
                } else {
                    ir1Var2.m6874W();
                }
                return ju4Var;
            case 4:
                ((Integer) obj2).getClass();
                ij0.m6811a((r63) this.f20357b, (ia5) this.f20358c, (mq1) this.f20359d, (mi0) obj, vd6.m11838V(1));
                return ju4Var;
            case 5:
                ((Integer) obj2).getClass();
                oh6.m9097c((nt2) this.f20357b, (pk4) this.f20358c, (pg0) this.f20359d, (mi0) obj, vd6.m11838V(385));
                return ju4Var;
            case 6:
                ((Integer) obj2).getClass();
                zt5.m13775f((nt2) this.f20357b, (String) this.f20358c, (String) this.f20359d, (mi0) obj, vd6.m11838V(1));
                return ju4Var;
            case 7:
                String str = (String) this.f20357b;
                String str2 = (String) this.f20358c;
                Object[] objArr = (Object[]) this.f20359d;
                mi0 mi0Var3 = (mi0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i = PreviewActivity.f14656w;
                ir1 ir1Var3 = (ir1) mi0Var3;
                if (ir1Var3.m6871T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    zp0.m13651B(str, str2, ir1Var3, Arrays.copyOf(objArr, objArr.length));
                } else {
                    ir1Var3.m6874W();
                }
                return ju4Var;
            case 8:
                nl3 nl3Var = (nl3) this.f20357b;
                vy3 vy3Var = (vy3) this.f20358c;
                ty3 ty3Var = (ty3) this.f20359d;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jM12036i = vy3Var.m12036i(vy3Var.m12032e(fFloatValue - nl3Var.f25933a));
                vy3 vy3Var2 = ty3Var.f31538a;
                nl3Var.f25933a += vy3Var.m12032e(vy3Var.m12035h(vy3Var2.m12031d(vy3Var2.f32968k, jM12036i, 1)));
                return ju4Var;
            case 9:
                hn4 hn4Var = (hn4) this.f20357b;
                oh4 oh4Var = (oh4) this.f20358c;
                g12 g12VarM5550u = (g12) this.f20359d;
                mi0 mi0Var4 = (mi0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ir1 ir1Var4 = (ir1) mi0Var4;
                if (ir1Var4.m6871T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    if (((oh4) hn4Var.f20725a.getValue()) == oh4Var) {
                        g12VarM5550u = C0638f5.m5550u();
                    }
                    je0.m7085a(g12VarM5550u, null, null, ir1Var4, 0, 6);
                } else {
                    ir1Var4.m6874W();
                }
                return ju4Var;
            default:
                n35 n35Var = (n35) this.f20357b;
                ii0 ii0Var = (ii0) this.f20358c;
                mq1 mq1Var = (mq1) this.f20359d;
                mi0 mi0Var5 = (mi0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ir1 ir1Var5 = (ir1) mi0Var5;
                if (ir1Var5.m6871T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = n35Var.f25424a;
                    boolean zM6894i = ir1Var5.m6894i(n35Var);
                    Object objM6869O3 = ir1Var5.m6869O();
                    if (zM6894i || objM6869O3 == i50Var) {
                        objM6869O3 = new m35(n35Var, wm0Var, false ? (byte) 1 : (byte) 0);
                        ir1Var5.m6905n0(objM6869O3);
                    }
                    lb5.m7926g(ir1Var5, (mq1) objM6869O3, viewTreeObserverOnGlobalLayoutListenerC1140sc);
                    boolean zM6894i2 = ir1Var5.m6894i(n35Var);
                    Object objM6869O4 = ir1Var5.m6869O();
                    if (zM6894i2 || objM6869O4 == i50Var) {
                        objM6869O4 = new m35(n35Var, wm0Var, b2);
                        ir1Var5.m6905n0(objM6869O4);
                    }
                    lb5.m7926g(ir1Var5, (mq1) objM6869O4, viewTreeObserverOnGlobalLayoutListenerC1140sc);
                    ii0Var.m6805a(viewTreeObserverOnGlobalLayoutListenerC1140sc, mq1Var, ir1Var5, 0);
                } else {
                    ir1Var5.m6874W();
                }
                return ju4Var;
        }
    }
}
