package p000;

import android.accessibilityservice.AccessibilityService;
import android.content.Context;
import android.view.WindowManager;
import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hv1 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20890a;

    public /* synthetic */ hv1(byte b) {
        this.f20890a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Object obj5;
        nt2 nt2VarM9120z;
        byte b = this.f20890a;
        byte b2 = 1;
        i50 i50Var = ki0.f23136a;
        switch (b) {
            case 0:
                nt2 nt2VarM10327a = (nt2) obj;
                ((Integer) obj3).getClass();
                ir1 ir1Var = (ir1) ((mi0) obj2);
                ir1Var.m6885d0(-297577518);
                lv1 lv1Var = (lv1) ir1Var.m6898k(nv1.f26110a);
                if (lv1Var == null) {
                    ir1Var.m6885d0(1790816022);
                    ir1Var.m6912r(false);
                } else {
                    ir1Var.m6885d0(1790816745);
                    boolean zM6890g = ir1Var.m6890g(lv1Var);
                    Object objM6869O = ir1Var.m6869O();
                    if (zM6890g || objM6869O == i50Var) {
                        obj4 = objM6869O;
                        C1252vd c1252vd = new C1252vd((byte) 1);
                        c1252vd.f32529b = lv1Var;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c1252vd);
                        obj4 = c1252vd;
                    }
                    nt2VarM10327a = rf4.m10327a(nt2VarM10327a, lv1Var, (PointerInputEventHandler) obj4);
                    ir1Var.m6912r(false);
                }
                ir1Var.m6912r(false);
                return nt2VarM10327a;
            case 1:
                nt2 nt2Var = (nt2) obj;
                ((Integer) obj3).getClass();
                ir1 ir1Var2 = (ir1) ((mi0) obj2);
                ir1Var2.m6885d0(-835236549);
                zk1 zk1Var = (zk1) ir1Var2.m6898k(ij0.f21474i);
                boolean zM6890g2 = ir1Var2.m6890g(zk1Var);
                Object objM6869O2 = ir1Var2.m6869O();
                Object obj6 = objM6869O2;
                if (zM6890g2 || objM6869O2 == i50Var) {
                    md2 md2Var = new md2();
                    md2Var.f24834a = zk1Var;
                    VarHandle.storeStoreFence();
                    ir1Var2.m6905n0(md2Var);
                    obj6 = md2Var;
                }
                nt2 nt2VarM4289D = d24.m4289D(nt2Var, (md2) obj6, null);
                ir1Var2.m6912r(false);
                return nt2VarM4289D;
            case 2:
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ir1 ir1Var3 = (ir1) mi0Var;
                if (ir1Var3.m6871T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    gv3 gv3Var = new gv3((byte) 15);
                    VarHandle.storeStoreFence();
                    AbstractC0647fd.m5673k(null, vd6.m11834R(-1620570615, gv3Var, ir1Var3), ir1Var3, 384);
                } else {
                    ir1Var3.m6874W();
                }
                return ju4.f22634a;
            case 3:
                nt2 nt2VarM10327a2 = (nt2) obj;
                ((Integer) obj3).getClass();
                ir1 ir1Var4 = (ir1) ((mi0) obj2);
                ir1Var4.m6885d0(-1452295646);
                Object objM6898k = ir1Var4.m6898k(rm2.f29413a);
                nh4 nh4Var = (nh4) (objM6898k instanceof nh4 ? objM6898k : null);
                if (nh4Var != null) {
                    C1354y3 c1354y3 = (C1354y3) ir1Var4.m6898k(AbstractC0637f4.f18723a);
                    Object objM6869O3 = ir1Var4.m6869O();
                    if (objM6869O3 == i50Var) {
                        obj5 = objM6869O3;
                        zo0 zo0VarM7942w = lb5.m7942w(r71.f29063a, ir1Var4);
                        ir1Var4.m6905n0(zo0VarM7942w);
                        obj5 = zo0VarM7942w;
                    }
                    obj5 = objM6869O3;
                    zo0 zo0Var = (zo0) obj5;
                    Object objM6869O4 = ir1Var4.m6869O();
                    Object obj7 = objM6869O4;
                    if (objM6869O4 == i50Var) {
                        d83 d83VarM7398w = k43.m7398w(jl3.f22395e);
                        ir1Var4.m6905n0(d83VarM7398w);
                        obj7 = d83VarM7398w;
                    }
                    sw2 sw2Var = (sw2) obj7;
                    Object objM6869O5 = ir1Var4.m6869O();
                    Object obj8 = objM6869O5;
                    if (objM6869O5 == i50Var) {
                        C0761ih c0761ih = new C0761ih((byte) 11);
                        c0761ih.f21416b = sw2Var;
                        VarHandle.storeStoreFence();
                        ir1Var4.m6905n0(c0761ih);
                        obj8 = c0761ih;
                    }
                    nt2 nt2VarM9120z2 = oh6.m9120z(nt2VarM10327a2, (yp1) obj8);
                    boolean zM6890g3 = ir1Var4.m6890g(nh4Var) | ir1Var4.m6890g(c1354y3) | ir1Var4.m6890g(zo0Var);
                    Object objM6869O6 = ir1Var4.m6869O();
                    Object obj9 = objM6869O6;
                    if (zM6890g3 || objM6869O6 == i50Var) {
                        i84 i84Var = new i84(b2);
                        i84Var.f21174c = nh4Var;
                        i84Var.f21175d = c1354y3;
                        i84Var.f21176e = zo0Var;
                        i84Var.f21173b = sw2Var;
                        VarHandle.storeStoreFence();
                        ir1Var4.m6905n0(i84Var);
                        obj9 = i84Var;
                    }
                    nt2VarM10327a2 = rf4.m10327a(nt2VarM9120z2, nh4Var, (PointerInputEventHandler) obj9);
                }
                ir1Var4.m6912r(false);
                return nt2VarM10327a2;
            default:
                nt2 nt2Var2 = (nt2) obj;
                ((Integer) obj3).getClass();
                ir1 ir1Var5 = (ir1) ((mi0) obj2);
                ir1Var5.m6885d0(-446806786);
                if (((C0950nl) ir1Var5.m6898k(AbstractC0987ol.m9168a())).f25925f >= 34) {
                    ir1Var5.m6885d0(-717221985);
                    se0.m10708W("system_overlay_trigger_debug", 0L, zp0.f36242e, ir1Var5, 24582, 14).invoke(ir1Var5, 0);
                    ir1Var5.m6912r(false);
                } else {
                    ir1Var5.m6885d0(-716817404);
                    ir1Var5.m6912r(false);
                }
                Object objM6898k2 = ir1Var5.m6898k(rm2.f29413a);
                nh4 nh4Var2 = (nh4) (objM6898k2 instanceof nh4 ? objM6898k2 : null);
                if (nh4Var2 != null) {
                    ky0 ky0Var = (ky0) ir1Var5.m6898k(ij0.f21473h);
                    if (gh4.m6005a((a44) ir1Var5.m6898k(h44.m6217a()))) {
                        ir1Var5.m6885d0(-715487876);
                        Object objM6869O7 = ir1Var5.m6869O();
                        if (objM6869O7 == i50Var) {
                            fh4 fh4Var = new fh4(nh4Var2, nh4Var2.getContext());
                            ir1Var5.m6905n0(fh4Var);
                            objM6869O7 = fh4Var;
                        }
                        fh4 fh4Var2 = (fh4) objM6869O7;
                        Object objM6869O8 = ir1Var5.m6869O();
                        Object obj10 = objM6869O8;
                        if (objM6869O8 == i50Var) {
                            zg4 zg4Var = new zg4(nh4Var2.getContext() instanceof AccessibilityService ? hh4.f20583a : hh4.f20584b, 6);
                            ir1Var5.m6905n0(zg4Var);
                            obj10 = zg4Var;
                        }
                        zg4 zg4Var2 = (zg4) obj10;
                        Context context = nh4Var2.getContext();
                        boolean zM6890g4 = ir1Var5.m6890g(context);
                        Object objM6869O9 = ir1Var5.m6869O();
                        if (zM6890g4 || objM6869O9 == i50Var) {
                            objM6869O9 = context.getSystemService((Class<Object>) WindowManager.class);
                            ir1Var5.m6905n0(objM6869O9);
                        }
                        c20.m3812g(fh4Var2, zg4Var2, (WindowManager) objM6869O9, ir1Var5, 48);
                        boolean zM6890g5 = ir1Var5.m6890g(ky0Var) | ir1Var5.m6894i(fh4Var2) | ir1Var5.m6892h(false);
                        Object objM6869O10 = ir1Var5.m6869O();
                        Object obj11 = objM6869O10;
                        if (zM6890g5 || objM6869O10 == i50Var) {
                            cz3 cz3Var = new cz3((byte) 8);
                            cz3Var.f16638b = zg4Var2;
                            cz3Var.f16639c = fh4Var2;
                            VarHandle.storeStoreFence();
                            ir1Var5.m6905n0(cz3Var);
                            obj11 = cz3Var;
                        }
                        nt2 nt2VarM6101z = gq6.m6101z(nt2Var2, (yp1) obj11);
                        boolean zM6890g6 = ir1Var5.m6890g(nh4Var2) | ir1Var5.m6894i(fh4Var2);
                        Object objM6869O11 = ir1Var5.m6869O();
                        Object obj12 = objM6869O11;
                        if (zM6890g6 || objM6869O11 == i50Var) {
                            bh4 bh4Var = new bh4(false ? 1 : 0);
                            bh4Var.f15274b = nh4Var2;
                            bh4Var.f15275c = fh4Var2;
                            bh4Var.f15276d = zg4Var2;
                            VarHandle.storeStoreFence();
                            ir1Var5.m6905n0(bh4Var);
                            obj12 = bh4Var;
                        }
                        nt2VarM9120z = oh6.m9120z(nt2VarM6101z, (yp1) obj12);
                        ir1Var5.m6912r(false);
                    } else {
                        ir1Var5.m6885d0(-716588841);
                        Object objM6869O12 = ir1Var5.m6869O();
                        if (objM6869O12 == i50Var) {
                            objM6869O12 = new Object();
                            ir1Var5.m6905n0(objM6869O12);
                        }
                        boolean zM6890g7 = ir1Var5.m6890g(nh4Var2) | ir1Var5.m6894i(objM6869O12);
                        Object objM6869O13 = ir1Var5.m6869O();
                        Object obj13 = objM6869O13;
                        if (zM6890g7 || objM6869O13 == i50Var) {
                            ah4 ah4Var = new ah4(false ? 1 : 0);
                            ah4Var.f14510b = nh4Var2;
                            ah4Var.f14511c = objM6869O12;
                            VarHandle.storeStoreFence();
                            ir1Var5.m6905n0(ah4Var);
                            obj13 = ah4Var;
                        }
                        lb5.m7923d(nh4Var2, (yp1) obj13, ir1Var5);
                        boolean zM6890g8 = ir1Var5.m6890g(nh4Var2) | ir1Var5.m6894i(objM6869O12);
                        Object objM6869O14 = ir1Var5.m6869O();
                        Object obj14 = objM6869O14;
                        if (zM6890g8 || objM6869O14 == i50Var) {
                            ah4 ah4Var2 = new ah4(b2);
                            ah4Var2.f14510b = nh4Var2;
                            ah4Var2.f14511c = objM6869O12;
                            VarHandle.storeStoreFence();
                            ir1Var5.m6905n0(ah4Var2);
                            obj14 = ah4Var2;
                        }
                        nt2VarM9120z = oh6.m9120z(nt2Var2, (yp1) obj14);
                        ir1Var5.m6912r(false);
                    }
                    nt2Var2 = nt2VarM9120z;
                }
                ir1Var5.m6912r(false);
                return nt2Var2;
        }
    }
}
