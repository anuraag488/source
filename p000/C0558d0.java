package p000;

import android.content.Context;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: renamed from: d0 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0558d0 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f16654a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f16655b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f16656c;

    public /* synthetic */ C0558d0(byte b) {
        this.f16654a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = 3;
        wm0 wm0Var = null;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 1;
        switch (this.f16654a) {
            case 0:
                ((nv2) this.f16655b).m8861b((ef3) this.f16656c);
                return ju4.f22634a;
            case 1:
                C1354y3 c1354y3 = (C1354y3) this.f16655b;
                C0004a3 c0004a3 = (C0004a3) this.f16656c;
                c1354y3.f34831d.add(c0004a3);
                C0562d4 c0562d4 = new C0562d4(b3 == true ? 1 : 0);
                c0562d4.f16768b = c1354y3;
                c0562d4.f16769c = c0004a3;
                VarHandle.storeStoreFence();
                return c0562d4;
            case 2:
                fm2 fm2Var = (fm2) this.f16655b;
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.f16656c;
                if (((ek2) obj) == ek2.ON_RESUME) {
                    fm2Var.getClass();
                    fm2Var.f19120b.setValue(Boolean.valueOf(accessibilityManager.isEnabled()));
                    accessibilityManager.addAccessibilityStateChangeListener(fm2Var);
                    em2 em2Var = fm2Var.f19121c;
                    if (em2Var != null) {
                        em2Var.f18258a.setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
                        accessibilityManager.addTouchExplorationStateChangeListener(em2Var);
                    }
                    dm2 dm2Var = fm2Var.f19122d;
                    if (dm2Var != null) {
                        dm2Var.f17187a.setValue(Boolean.valueOf(fm2.m5743a(accessibilityManager)));
                        dm2Var.f17188b.setValue(Boolean.valueOf(fm2.m5744b(accessibilityManager)));
                        accessibilityManager.addAccessibilityServicesStateChangeListener(dm2Var);
                    }
                }
                return ju4.f22634a;
            case 3:
                C0719hb c0719hb = (C0719hb) this.f16655b;
                C0903mb c0903mb = (C0903mb) this.f16656c;
                long jM3431i = b33.m3431i(((e21) obj).f17638a, (sc6.m10652X(c0719hb).f33293A == df2.f17012b && c0719hb.f32335q == d63.f16815b) ? -1.0f : 1.0f);
                c0903mb.m8259a(c0719hb.f20462J.m8673k(Float.intBitsToFloat((int) (c0719hb.f32335q == d63.f16814a ? jM3431i & 4294967295L : jM3431i >> 32))), 0.0f);
                return ju4.f22634a;
            case 4:
                vj2 vj2Var = (vj2) this.f16655b;
                C0723hf c0723hf = (C0723hf) this.f16656c;
                C1053q c1053q = new C1053q(b6);
                c1053q.f28113b = c0723hf;
                VarHandle.storeStoreFence();
                a42 a42Var = new a42();
                a42Var.f95a = vj2Var;
                a42Var.f96b = c1053q;
                a42Var.f97c = new Object();
                a42Var.f98d = new uw2(new ez4[16]);
                VarHandle.storeStoreFence();
                return a42Var;
            case 5:
                cd3 cd3Var = (cd3) this.f16655b;
                cd3Var.setPositionProvider((dd3) this.f16656c);
                cd3Var.m3983q();
                return new C1069qf((byte) 0);
            case 6:
                lb5.m7910S((zo0) this.f16655b, null, null, new C0787j6((Context) this.f16656c, (String) obj, wm0Var, b6), 3);
                return ju4.f22634a;
            case 7:
                ((wf2) this.f16655b).m12278f0(((nt2) obj).mo7630d((nt2) this.f16656c));
                return ju4.f22634a;
            case 8:
                Context context = (Context) this.f16655b;
                C0950nl c0950nl = (C0950nl) this.f16656c;
                C1122rv c1122rv = new C1122rv(b6, b4 == true ? 1 : 0);
                c1122rv.f29651b = new ArrayList();
                c1122rv.f29652c = new ArrayList();
                ArrayList arrayList = new ArrayList();
                c1122rv.f29653d = arrayList;
                c1122rv.f29654e = new ArrayList();
                c1122rv.f29655f = new ArrayList();
                C0617em c0617em = new C0617em();
                c0617em.f18248a = context;
                c0617em.f18249b = c0950nl;
                VarHandle.storeStoreFence();
                c1122rv.m10446e(c0617em, C0532cm.class);
                arrayList.add(new l73(new C0656fm(), C0532cm.class));
                ((z02) obj).f35669c = c1122rv.m10449h();
                return ju4.f22634a;
            case 9:
                C0923mv c0923mv = (C0923mv) this.f16655b;
                C0960nv c0960nv = (C0960nv) this.f16656c;
                ju4 ju4Var = ju4.f22634a;
                lm4 lm4Var = c0923mv.f25226o;
                if (lm4Var != null) {
                    lm4Var.m8038b();
                }
                c0923mv.f25226o = null;
                cf0 cf0Var = c0960nv.f26106b;
                if (cf0Var != null) {
                    cf0Var.m4989U(ju4Var);
                }
                c0960nv.f26106b = null;
                return ju4Var;
            case 10:
                C1345xv c1345xv = (C1345xv) this.f16655b;
                kh0 kh0Var = (kh0) this.f16656c;
                c1345xv.m12759a(kh0Var);
                C0562d4 c0562d5 = new C0562d4(b);
                c0562d5.f16768b = c1345xv;
                c0562d5.f16769c = kh0Var;
                VarHandle.storeStoreFence();
                return c0562d5;
            case 11:
                InterfaceC0961nw interfaceC0961nw = (InterfaceC0961nw) this.f16655b;
                yp1 yp1Var = (yp1) this.f16656c;
                kz3 kz3Var = (kz3) obj;
                C1012ow c1012ow = new C1012ow(b5 == true ? 1 : 0);
                c1012ow.f27152b = interfaceC0961nw;
                c1012ow.f27153c = yp1Var;
                VarHandle.storeStoreFence();
                kz3Var.m7753a(null, new pg0(-776746861, true, c1012ow));
                C1012ow c1012ow2 = new C1012ow(b6);
                c1012ow2.f27152b = interfaceC0961nw;
                c1012ow2.f27153c = yp1Var;
                VarHandle.storeStoreFence();
                kz3Var.m7753a(null, new pg0(1656191804, true, c1012ow2));
                return ju4.f22634a;
            case 12:
                String str = (String) this.f16655b;
                b80 b80Var = (b80) this.f16656c;
                ju4 ju4Var2 = ju4.f22634a;
                if (z62.m13387o(((AccessibilityEvent) obj).getPackageName(), str)) {
                    b80Var.mo5493n(ju4Var2);
                }
                return ju4Var2;
            case 13:
                return z62.m13387o((g12) obj, (g12) this.f16655b) ? (nt2) this.f16656c : kt2.f23428a;
            case 14:
                xk4 xk4Var = (xk4) this.f16655b;
                yp1 yp1Var2 = (yp1) this.f16656c;
                xk4 xk4Var2 = (xk4) obj;
                if (!z62.m13387o(xk4Var, xk4Var2)) {
                    yp1Var2.invoke(xk4Var2);
                }
                return ju4.f22634a;
            case 15:
                Context context2 = (Context) this.f16655b;
                xn2 xn2Var = (xn2) this.f16656c;
                C0890lz c0890lz = new C0890lz();
                c0890lz.f24478b = context2;
                VarHandle.storeStoreFence();
                i50 i50Var = new i50((byte) 14);
                VarHandle.storeStoreFence();
                c0890lz.f24477a = i50Var;
                c0890lz.f24480d = true;
                C1163sz c1163sz = new C1163sz(b2);
                c1163sz.f30676b = xn2Var;
                c1163sz.f30677c = (wp1) obj;
                VarHandle.storeStoreFence();
                c0890lz.f24479c = c1163sz;
                if (context2 == null) {
                    C1077qn.m9987m("Please provide a valid Context.");
                    return null;
                }
                if (c0890lz.f24479c == null) {
                    C1077qn.m9987m("Please provide a valid listener for purchases updates.");
                    return null;
                }
                if (c0890lz.f24477a == null) {
                    C1077qn.m9987m("Pending purchases for one-time products must be supported.");
                    return null;
                }
                c0890lz.f24477a.getClass();
                C1163sz c1163sz2 = c0890lz.f24479c;
                i50 i50Var2 = c0890lz.f24477a;
                if (c1163sz2 == null) {
                    if (!c0890lz.m8155a()) {
                        return new C0927mz(i50Var2, context2, c0890lz);
                    }
                    ez5 ez5Var = new ez5(i50Var2, context2, c0890lz);
                    ez5Var.f18616G = (byte) 0;
                    ez5Var.f18615F = context2;
                    VarHandle.storeStoreFence();
                    return ez5Var;
                }
                C1163sz c1163sz3 = c0890lz.f24479c;
                if (!c0890lz.m8155a()) {
                    return new C0927mz(i50Var2, context2, c1163sz3, c0890lz);
                }
                ez5 ez5Var2 = new ez5(i50Var2, context2, c1163sz3, c0890lz);
                ez5Var2.f18616G = (byte) 0;
                ez5Var2.f18615F = context2;
                VarHandle.storeStoreFence();
                return ez5Var2;
            case 16:
                cb3.m3946u((cb3) obj, (db3) this.f16655b, 0, 0, ((q00) this.f16656c).f28116o, 4);
                return ju4.f22634a;
            case 17:
                C0489bf c0489bf = (C0489bf) this.f16655b;
                ga4 ga4Var = (ga4) this.f16656c;
                yf2 yf2Var = (yf2) obj;
                yf2Var.m13113a();
                u31.m11217A(yf2Var, c0489bf, ga4Var, 0.0f, null, 60);
                return ju4.f22634a;
            case 18:
                g63 g63Var = (g63) this.f16655b;
                ga4 ga4Var2 = (ga4) this.f16656c;
                yf2 yf2Var2 = (yf2) obj;
                yf2Var2.m13113a();
                u31.m11217A(yf2Var2, g63Var.f19622o, ga4Var2, 0.0f, null, 60);
                return ju4.f22634a;
            case 19:
                cb3.m3944n((cb3) obj, (db3) this.f16655b, -qq2.m10010E(((nl3) this.f16656c).f25933a), 0);
                return ju4.f22634a;
            case 20:
                ((b30) this.f16655b).f15048a.m11671k((cm0) this.f16656c);
                return ju4.f22634a;
            case 21:
                he0 he0Var = (he0) this.f16655b;
                wp1 wp1Var = (wp1) this.f16656c;
                he0Var.f20510a.add(wp1Var);
                C0562d4 c0562d6 = new C0562d4((byte) 4);
                c0562d6.f16768b = he0Var;
                c0562d6.f16769c = wp1Var;
                VarHandle.storeStoreFence();
                return c0562d6;
            case 22:
                Object obj2 = this.f16655b;
                sw2 sw2Var = (sw2) this.f16656c;
                ((Boolean) obj).getClass();
                sw2Var.setValue(obj2);
                return ju4.f22634a;
            case 23:
                String str2 = (String) this.f16655b;
                yp1 yp1Var3 = (yp1) this.f16656c;
                vg2 vg2Var = (vg2) obj;
                if (str2 != null) {
                    C0914mm c0914mm = new C0914mm(b6);
                    c0914mm.f25018b = str2;
                    VarHandle.storeStoreFence();
                    oi2.m9121c(vg2Var, "header", new pg0(-1937226822, true, c0914mm), 2);
                }
                yp1Var3.invoke(vg2Var);
                return ju4.f22634a;
            case 24:
                ((pz2) this.f16655b).m9690b((kr3) this.f16656c, obj);
                return ju4.f22634a;
            case 25:
                uj2 uj2Var = (uj2) this.f16655b;
                t30 t30Var = (t30) this.f16656c;
                yf2 yf2Var3 = (yf2) obj;
                yf2Var3.m13113a();
                if (((Boolean) uj2Var.f31930s.getValue()).booleanValue() || ((Boolean) uj2Var.f31931t.getValue()).booleanValue()) {
                    u31.m11221f0(yf2Var3, t30Var, 0L, 0L, 0.0f, null, 126);
                }
                return ju4.f22634a;
            case 26:
                w94 w94Var = (w94) this.f16655b;
                yp1 yp1Var4 = (yp1) this.f16656c;
                w94Var.add(yp1Var4);
                C0562d4 c0562d7 = new C0562d4((byte) 5);
                c0562d7.f16768b = w94Var;
                c0562d7.f16769c = yp1Var4;
                VarHandle.storeStoreFence();
                return c0562d7;
            case 27:
                ry0 ry0Var = (ry0) this.f16655b;
                ry0Var.f29726b.m13540A((ve4) obj, (oy0) this.f16656c);
                return ju4.f22634a;
            default:
                return (dc0) ((mq1) this.f16655b).invoke((w41) this.f16656c, (dc0) obj);
        }
    }
}
