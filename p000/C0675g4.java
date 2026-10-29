package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityManager;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: g4 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0675g4 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f19599a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f19600b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f19601c;

    public /* synthetic */ C0675g4(byte b) {
        this.f19599a = b;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v24, types: [sw2, xb4] */
    /* JADX WARN: Type inference failed for: r1v10, types: [androidx.work.impl.WorkDatabase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [androidx.work.impl.WorkDatabase] */
    /* JADX WARN: Type inference failed for: r5v0, types: [wm0] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11 */
    @Override // p000.wp1
    public final Object invoke() throws Throwable {
        i14 i14Var;
        wf2 wf2Var;
        jl3 jl3Var;
        List listM6310V0;
        l84 l84VarM8230e;
        byte b = 2;
        byte b2 = 0;
        byte b3 = 1;
        ?? r5 = 0;
        r23 r23Var = null;
        switch (this.f19599a) {
            case 0:
                fm2 fm2Var = (fm2) this.f19600b;
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.f19601c;
                fm2Var.getClass();
                accessibilityManager.removeAccessibilityStateChangeListener(fm2Var);
                em2 em2Var = fm2Var.f19121c;
                if (em2Var != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(em2Var);
                }
                dm2 dm2Var = fm2Var.f19122d;
                if (dm2Var != null) {
                    accessibilityManager.removeAccessibilityServicesStateChangeListener(dm2Var);
                }
                return ju4.f22634a;
            case 1:
                return Boolean.valueOf(ViewTreeObserverOnGlobalLayoutListenerC1140sc.m10592h((ViewTreeObserverOnGlobalLayoutListenerC1140sc) this.f19600b, (KeyEvent) this.f19601c));
            case 2:
                sx3 sx3Var = (sx3) this.f19600b;
                ViewOnAttachStateChangeListenerC1400zc viewOnAttachStateChangeListenerC1400zc = (ViewOnAttachStateChangeListenerC1400zc) this.f19601c;
                ww3 ww3Var = sx3Var.f30638e;
                ww3 ww3Var2 = sx3Var.f30639f;
                Float f = sx3Var.f30636c;
                Float f2 = sx3Var.f30637d;
                float fFloatValue = (ww3Var == null || f == null) ? 0.0f : ((Number) ww3Var.f33800a.invoke()).floatValue() - f.floatValue();
                float fFloatValue2 = (ww3Var2 == null || f2 == null) ? 0.0f : ((Number) ww3Var2.f33800a.invoke()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iM13496u = viewOnAttachStateChangeListenerC1400zc.m13496u(sx3Var.f30634a);
                    k14 k14Var = (k14) viewOnAttachStateChangeListenerC1400zc.m13491l().m8197b(viewOnAttachStateChangeListenerC1400zc.f35958k);
                    if (k14Var != null) {
                        try {
                            C1242v3 c1242v3 = viewOnAttachStateChangeListenerC1400zc.f35960m;
                            if (c1242v3 != null) {
                                c1242v3.f32353a.setBoundsInScreen(viewOnAttachStateChangeListenerC1400zc.m13483d(k14Var));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    k14 k14Var2 = (k14) viewOnAttachStateChangeListenerC1400zc.m13491l().m8197b(viewOnAttachStateChangeListenerC1400zc.f35959l);
                    if (k14Var2 != null) {
                        try {
                            C1242v3 c1242v4 = viewOnAttachStateChangeListenerC1400zc.f35961n;
                            if (c1242v4 != null) {
                                c1242v4.f32353a.setBoundsInScreen(viewOnAttachStateChangeListenerC1400zc.m13483d(k14Var2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    viewOnAttachStateChangeListenerC1400zc.f35951d.invalidate();
                    k14 k14Var3 = (k14) viewOnAttachStateChangeListenerC1400zc.m13491l().m8197b(iM13496u);
                    if (k14Var3 != null && (i14Var = k14Var3.f22816a) != null && (wf2Var = i14Var.f21011c) != null) {
                        if (ww3Var != null) {
                            viewOnAttachStateChangeListenerC1400zc.f35963p.m8121h(iM13496u, ww3Var);
                        }
                        if (ww3Var2 != null) {
                            viewOnAttachStateChangeListenerC1400zc.f35964q.m8121h(iM13496u, ww3Var2);
                        }
                        viewOnAttachStateChangeListenerC1400zc.m13494p(wf2Var);
                    }
                }
                if (ww3Var != null) {
                    sx3Var.f30636c = (Float) ww3Var.f33800a.invoke();
                }
                if (ww3Var2 != null) {
                    sx3Var.f30637d = (Float) ww3Var2.f33800a.invoke();
                }
                return ju4.f22634a;
            case 3:
                ((ql3) this.f19600b).f28555a = ((wp1) this.f19601c).invoke();
                return ju4.f22634a;
            case 4:
                ((b80) this.f19600b).mo5493n(this.f19601c);
                return ju4.f22634a;
            case 5:
                C1112rl c1112rl = (C1112rl) this.f19600b;
                ?? r11 = (sw2) this.f19601c;
                r11.setValue(z62.m13387o(c1112rl, (C1112rl) r11.getValue()) ? 0 : c1112rl);
                return ju4.f22634a;
            case 6:
                ((kh0) this.f19600b).f23114o = (wp1) this.f19601c;
                return ju4.f22634a;
            case 7:
                C0850kw c0850kw = (C0850kw) this.f19600b;
                yf2 yf2Var = (yf2) this.f19601c;
                c0850kw.f23554u = c0850kw.f23549p.mo5797a(yf2Var.f35194a.mo11227d(), yf2Var.getLayoutDirection(), yf2Var);
                return ju4.f22634a;
            case 8:
                C0508bz c0508bz = (C0508bz) this.f19600b;
                C0851kx c0851kx = (C0851kx) this.f19601c;
                C0556cz c0556cz = c0508bz.f15688a;
                synchronized (c0556cz.f16622c) {
                    if (c0556cz.f16623d.remove(c0851kx) && c0556cz.f16623d.isEmpty()) {
                        wn2.m12326e().m12328b(p30.f27335a, c0556cz.getClass().getSimpleName().concat(": unregistering receiver"));
                        c0556cz.f16621b.unregisterReceiver(c0556cz.f16625f);
                    }
                    break;
                }
                return ju4.f22634a;
            case 9:
                lb5.m7910S((zo0) this.f19600b, null, null, new C1125ry((co4) this.f19601c, r5, b2), 3);
                return Boolean.TRUE;
            case 10:
                d64 d64Var = (d64) this.f19600b;
                zo0 zo0Var = (zo0) this.f19601c;
                if (((Boolean) d64Var.f16819c.invoke(e64.f17844c)).booleanValue()) {
                    lb5.m7910S(zo0Var, null, null, new t10(d64Var, r5, (byte) 5), 3);
                }
                return Boolean.TRUE;
            case 11:
                wp1 wp1Var = (wp1) this.f19600b;
                e13 e13Var = (e13) this.f19601c;
                if (wp1Var != null && (jl3Var = (jl3) wp1Var.invoke()) != null) {
                    return jl3Var;
                }
                if (!e13Var.mo4871Z0().f25208n) {
                    e13Var = null;
                }
                if (e13Var != null) {
                    return AbstractC0647fd.m5672j(0L, z62.m13369a0(e13Var.f16901c));
                }
                return null;
            case 12:
                try {
                    ((Context) this.f19600b).unregisterReceiver((q30) this.f19601c);
                    break;
                } catch (Throwable th) {
                    sc6.m10643O(th);
                    sj3.m10807c(th);
                }
                return ju4.f22634a;
            case 13:
                ((y50) this.f19600b).f34898q.invoke((z50) this.f19601c);
                return ju4.f22634a;
            case 14:
                g25 g25Var = (g25) this.f19600b;
                UUID uuid = (UUID) this.f19601c;
                ?? r1 = g25Var.f19514c;
                RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9(b);
                runnableC1285w9.f33164b = g25Var;
                runnableC1285w9.f33165c = uuid;
                VarHandle.storeStoreFence();
                r1.m3074q(runnableC1285w9);
                ew3.m5411b(g25Var.f19513b, g25Var.f19514c, g25Var.f19516e);
                return ju4.f22634a;
            case 15:
                g25 g25Var2 = (g25) this.f19600b;
                String str = (String) this.f19601c;
                ?? r2 = g25Var2.f19514c;
                RunnableC0612eh runnableC0612eh = new RunnableC0612eh(b3);
                runnableC0612eh.f18081b = r2;
                runnableC0612eh.f18082c = str;
                runnableC0612eh.f18083d = g25Var2;
                VarHandle.storeStoreFence();
                r2.m3074q(runnableC0612eh);
                ew3.m5411b(g25Var2.f19513b, g25Var2.f19514c, g25Var2.f19516e);
                return ju4.f22634a;
            case 16:
                xn2 xn2Var = (xn2) this.f19600b;
                he0 he0Var = (he0) this.f19601c;
                String strM12721a = xn2Var.m12721a();
                k44 k44Var = k44.f22883b;
                if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                    xn2Var.m12722b(k44Var, strM12721a, "is animating " + he0Var.m6364a(), null);
                }
                return ju4.f22634a;
            case 17:
                ((sw2) this.f19601c).setValue(this.f19600b);
                return ju4.f22634a;
            case 18:
                ((yp1) this.f19600b).invoke((C0766im) this.f19601c);
                return ju4.f22634a;
            case 19:
                Activity activity = (Activity) this.f19600b;
                sw2 sw2Var = (sw2) this.f19601c;
                Window window = activity.getWindow();
                w42 w42Var = new w42(activity.getWindow().getDecorView());
                pq3 x05Var = Build.VERSION.SDK_INT >= 35 ? new x05(window, w42Var) : new pq3(window, w42Var);
                WindowInsetsController windowInsetsController = (WindowInsetsController) x05Var.f27896b;
                if (((Boolean) sw2Var.getValue()).booleanValue()) {
                    x05Var.mo9613l(2);
                    windowInsetsController.hide(519);
                } else {
                    x05Var.mo9613l(1);
                    windowInsetsController.show(519);
                }
                return ju4.f22634a;
            case 20:
                xi0 xi0Var = (xi0) this.f19600b;
                Object obj = this.f19601c;
                ir1 ir1Var = xi0Var.f34299a;
                m84 m84Var = ir1Var.f21687c;
                l84 l84VarM8230e2 = m84Var.m8230e();
                int i = 0;
                while (true) {
                    try {
                        if (i < m84Var.f24734b) {
                            if (l84VarM8230e2.m7856l(i)) {
                                Object objM7858n = l84VarM8230e2.m7858n(i);
                                if (objM7858n != obj) {
                                    mr1 mr1Var = objM7858n instanceof mr1 ? (mr1) objM7858n : null;
                                    if ((mr1Var != null ? mr1Var.f25168a : null) == obj) {
                                    }
                                }
                                r23 r23Var2 = new r23(i, null);
                                l84VarM8230e2.m7847c();
                                r23Var = r23Var2;
                                if (r23Var != null) {
                                    int i2 = r23Var.f28968a;
                                    Integer num = r23Var.f28969b;
                                    l84VarM8230e = m84Var.m8230e();
                                    try {
                                        ArrayList arrayListM5374x0 = ev0.m5374x0(l84VarM8230e, i2, num);
                                        l84VarM8230e.m7847c();
                                        listM6310V0 = hb0.m6310V0(arrayListM5374x0, ir1Var.m6862H());
                                    } catch (Throwable th2) {
                                        l84VarM8230e.m7847c();
                                        throw th2;
                                    }
                                } else {
                                    listM6310V0 = v71.f32439a;
                                }
                                return new yh0(listM6310V0, ir1Var.f21666C);
                            }
                            int[] iArr = l84VarM8230e2.f23848b;
                            int i3 = i + 1;
                            int iM8984e = (i3 < l84VarM8230e2.f23849c ? iArr[(i3 * 5) + 4] : l84VarM8230e2.f23851e) - o84.m8984e(iArr, i);
                            int i4 = 0;
                            while (true) {
                                if (i4 >= iM8984e) {
                                    i = i3;
                                } else {
                                    Object objM7852h = l84VarM8230e2.m7852h(i, i4);
                                    if (objM7852h != obj) {
                                        mr1 mr1Var2 = objM7852h instanceof mr1 ? (mr1) objM7852h : null;
                                        if ((mr1Var2 != null ? mr1Var2.f25168a : null) != obj) {
                                            i4++;
                                        }
                                    }
                                    r23Var = new r23(i, Integer.valueOf(i4));
                                }
                            }
                        }
                        l84VarM8230e2.m7847c();
                        if (r23Var != null) {
                            int i5 = r23Var.f28968a;
                            Integer num2 = r23Var.f28969b;
                            l84VarM8230e = m84Var.m8230e();
                            ArrayList arrayListM5374x1 = ev0.m5374x0(l84VarM8230e, i5, num2);
                            l84VarM8230e.m7847c();
                            listM6310V0 = hb0.m6310V0(arrayListM5374x1, ir1Var.m6862H());
                        } else {
                            listM6310V0 = v71.f32439a;
                        }
                        return new yh0(listM6310V0, ir1Var.f21666C);
                    } catch (Throwable th3) {
                        l84VarM8230e2.m7847c();
                        throw th3;
                    }
                }
            case 21:
                xn2 xn2Var2 = (xn2) this.f19600b;
                sw2 sw2Var2 = (sw2) this.f19601c;
                String strM12721a2 = xn2Var2.m12721a();
                k44 k44Var2 = k44.f22883b;
                if (xn2Var2.f34459a.m8274a().compareTo(k44Var2) <= 0) {
                    xn2Var2.m12722b(k44Var2, strM12721a2, zi4.m13620t("current app changed ", (String) sw2Var2.getValue()), null);
                }
                return ju4.f22634a;
            case 22:
                return o52.m8954a(y42.m12827F0(((ej4) this.f19600b).mo5134j((cf2) ((wp1) this.f19601c).invoke())));
            case 23:
                ((kj4) this.f19600b).f23182d.invoke((pj4) this.f19601c);
                return ju4.f22634a;
            case 24:
                xn2 xn2Var3 = (xn2) this.f19600b;
                dz0 dz0Var = (dz0) this.f19601c;
                if (xn2Var3 != null) {
                    String strM12721a3 = xn2Var3.m12721a();
                    k44 k44Var3 = k44.f22883b;
                    if (xn2Var3.f34459a.m8274a().compareTo(k44Var3) <= 0) {
                        xn2Var3.m12722b(k44Var3, strM12721a3, "screen state " + ((uw3) dz0Var.f17510a.getValue()), null);
                    }
                }
                return ju4.f22634a;
            case 25:
                w91 w91Var = (w91) this.f19600b;
                String str2 = (String) this.f19601c;
                Enum[] enumArr = w91Var.f33168a;
                int length = enumArr.length;
                t91 t91Var = new t91(str2, null, length);
                t91Var.f31008l = l24.f23749j;
                s91 s91Var = new s91();
                s91Var.f30005a = length;
                s91Var.f30006b = str2;
                s91Var.f30007c = t91Var;
                VarHandle.storeStoreFence();
                t91Var.f31009m = new dg4(s91Var);
                VarHandle.storeStoreFence();
                for (Enum r0 : enumArr) {
                    t91Var.m4438l(r0.name(), false);
                }
                return t91Var;
            case 26:
                qe3 qe3Var = (qe3) this.f19600b;
                System.out.println((Object) ("trial mode " + ((xp4) ((sw2) this.f19601c).getValue()) + " " + qe3Var.mo9870c() + " " + qe3Var.mo9868a()));
                return ju4.f22634a;
            case 27:
                ((ql3) this.f19600b).f28555a = sj3.m10825u((ql1) this.f19601c, bb3.f15198a);
                return ju4.f22634a;
            case 28:
                ((ql3) this.f19600b).f28555a = ((sl1) this.f19601c).m10855Q0();
                return ju4.f22634a;
            default:
                ((ql3) this.f19600b).f28555a = sj3.m10825u((xl1) this.f19601c, bb3.f15198a);
                return ju4.f22634a;
        }
    }
}
