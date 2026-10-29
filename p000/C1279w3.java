package p000;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.invoke.VarHandle;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: w3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1279w3 extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a */
    public C1251vc f33054a;

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        C1251vc c1251vc = this.f33054a;
        C1242v3 c1242v3 = new C1242v3();
        c1242v3.f32354b = -1;
        c1242v3.f32355c = -1;
        c1242v3.f32353a = accessibilityNodeInfo;
        VarHandle.storeStoreFence();
        c1251vc.f32516j.m13482c(i, c1242v3, str, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C1242v3 c1242v3M11804F = this.f33054a.m11804F(i);
        if (c1242v3M11804F == null) {
            return null;
        }
        return c1242v3M11804F.f32353a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f33054a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C1242v3 c1242v3M11804F;
        C1251vc c1251vc = this.f33054a;
        ViewOnAttachStateChangeListenerC1400zc viewOnAttachStateChangeListenerC1400zc = c1251vc.f32516j;
        if (i == 1) {
            int i2 = viewOnAttachStateChangeListenerC1400zc.f35959l;
            c1242v3M11804F = i2 == Integer.MIN_VALUE ? null : c1251vc.m11804F(i2);
        } else {
            if (i != 2) {
                C1077qn.m9987m(c75.m3877i(i, "Unknown focus type: "));
                return null;
            }
            c1242v3M11804F = c1251vc.m11804F(viewOnAttachStateChangeListenerC1400zc.f35958k);
        }
        if (c1242v3M11804F == null) {
            return null;
        }
        return c1242v3M11804F.f32353a;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0275  */
    /* JADX WARN: Code duplicated, block: B:531:0x0757  */
    /* JADX WARN: Code duplicated, block: B:536:0x0769  */
    /* JADX WARN: Code duplicated, block: B:543:0x077b  */
    /* JADX WARN: Code duplicated, block: B:545:0x077f  */
    /* JADX WARN: Code duplicated, block: B:547:0x078b  */
    /* JADX WARN: Code duplicated, block: B:549:0x078f  */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x01c7, code lost:
    
        r1 = null;
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performAction(int i, int i2, Bundle bundle) {
        i14 i14Var;
        int i3;
        AbstractC0597e3 abstractC0597e3;
        int iM13490k;
        int i4;
        C0636f3 c0636f3;
        jl4 jl4VarM13849M;
        C0711h3 c0711h3;
        C0711h3 c0711h4;
        C0674g3 c0674g3;
        C0674g3 c0674g4;
        C0748i3 c0748i3;
        wp1 wp1Var;
        wp1 wp1Var2;
        wp1 wp1Var3;
        wp1 wp1Var4;
        wp1 wp1Var5;
        wp1 wp1Var6;
        wp1 wp1Var7;
        wp1 wp1Var8;
        wp1 wp1Var9;
        yp1 yp1Var;
        C1353y2 c1353y2;
        long jMo4005S;
        long jFloatToRawIntBits;
        yp1 yp1Var2;
        wp1 wp1Var10;
        long j;
        C1353y2 c1353y3;
        wp1 wp1Var11;
        float fIntBitsToFloat;
        C1353y2 c1353y4;
        wp1 wp1Var12;
        yp1 yp1Var3;
        wp1 wp1Var13;
        wp1 wp1Var14;
        wp1 wp1Var15;
        wp1 wp1Var16;
        CharSequence charSequence;
        ViewOnAttachStateChangeListenerC1400zc viewOnAttachStateChangeListenerC1400zc = this.f33054a.f32516j;
        AccessibilityManager accessibilityManager = viewOnAttachStateChangeListenerC1400zc.f35954g;
        Float fValueOf = Float.valueOf(0.0f);
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = viewOnAttachStateChangeListenerC1400zc.f35951d;
        k14 k14Var = (k14) viewOnAttachStateChangeListenerC1400zc.m13491l().m8197b(i);
        if (k14Var == null || (i14Var = k14Var.f22816a) == null) {
            return false;
        }
        wf2 wf2Var = i14Var.f21011c;
        int i5 = i14Var.f21014f;
        e14 e14Var = i14Var.f21012d;
        lw2 lw2Var = e14Var.f17631a;
        Object objM8132g = lw2Var.m8132g(m14.f24566o);
        if (objM8132g == null) {
            objM8132g = null;
        }
        Boolean bool = Boolean.TRUE;
        boolean z = true;
        if (z62.m13387o(objM8132g, bool)) {
            if (!(Build.VERSION.SDK_INT >= 34 ? AbstractC0561d3.m4333g(accessibilityManager) : true)) {
                return false;
            }
        }
        if (i2 == 64) {
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = viewOnAttachStateChangeListenerC1400zc.f35958k) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                ViewOnAttachStateChangeListenerC1400zc.m13474y(viewOnAttachStateChangeListenerC1400zc, i3, 65536, null, 12);
            }
            viewOnAttachStateChangeListenerC1400zc.f35958k = i;
            viewTreeObserverOnGlobalLayoutListenerC1140sc.invalidate();
            ViewOnAttachStateChangeListenerC1400zc.m13474y(viewOnAttachStateChangeListenerC1400zc, i, 32768, null, 12);
            return true;
        }
        if (i2 == 128) {
            if (viewOnAttachStateChangeListenerC1400zc.f35958k != i) {
                return false;
            }
            viewOnAttachStateChangeListenerC1400zc.f35958k = Integer.MIN_VALUE;
            viewOnAttachStateChangeListenerC1400zc.f35960m = null;
            viewTreeObserverOnGlobalLayoutListenerC1140sc.invalidate();
            ViewOnAttachStateChangeListenerC1400zc.m13474y(viewOnAttachStateChangeListenerC1400zc, i, 65536, null, 12);
            return true;
        }
        if (i2 == 256 || i2 == 512) {
            if (bundle == null) {
                return false;
            }
            int i6 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
            boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
            boolean z3 = i2 == 256;
            Integer num = viewOnAttachStateChangeListenerC1400zc.f35968u;
            if (num == null || i5 != num.intValue()) {
                viewOnAttachStateChangeListenerC1400zc.f35967t = -1;
                viewOnAttachStateChangeListenerC1400zc.f35968u = Integer.valueOf(i5);
            }
            String strM13470m = ViewOnAttachStateChangeListenerC1400zc.m13470m(i14Var);
            if (strM13470m == null || strM13470m.length() == 0) {
                return false;
            }
            String strM13470m2 = ViewOnAttachStateChangeListenerC1400zc.m13470m(i14Var);
            if (strM13470m2 == null || strM13470m2.length() == 0) {
                abstractC0597e3 = null;
            } else {
                if (i6 == 1) {
                    Locale locale = viewTreeObserverOnGlobalLayoutListenerC1140sc.getContext().getResources().getConfiguration().locale;
                    c0636f3 = C0636f3.f18695q;
                    if (c0636f3 == null) {
                        c0636f3 = new C0636f3((byte) 0);
                        c0636f3.f18698p = BreakIterator.getCharacterInstance(locale);
                        C0636f3.f18695q = c0636f3;
                    }
                    c0636f3.m5460n(strM13470m2);
                } else if (i6 == 2) {
                    Locale locale2 = viewTreeObserverOnGlobalLayoutListenerC1140sc.getContext().getResources().getConfiguration().locale;
                    c0636f3 = C0636f3.f18696r;
                    if (c0636f3 == null) {
                        c0636f3 = new C0636f3((byte) 1);
                        c0636f3.f18698p = BreakIterator.getWordInstance(locale2);
                        C0636f3.f18696r = c0636f3;
                    }
                    c0636f3.m5460n(strM13470m2);
                } else if (i6 == 4) {
                    if (lw2Var.m8128c(d14.f16704a) || (jl4VarM13849M = zy5.m13849M(e14Var)) == null) {
                        abstractC0597e3 = null;
                    } else if (i6 == 4) {
                        c0674g3 = C0674g3.f19545p;
                        if (c0674g3 == null) {
                            c0674g4 = c0674g3;
                            C0674g3 c0674g5 = new C0674g3();
                            C0674g3.f19545p = c0674g5;
                            c0674g4 = c0674g5;
                        }
                        c0674g4 = c0674g3;
                        c0674g4.f17656a = strM13470m2;
                        c0674g4.f19548o = jl4VarM13849M;
                        abstractC0597e3 = c0674g4;
                    } else {
                        c0711h3 = C0711h3.f20291q;
                        if (c0711h3 == null) {
                            c0711h4 = c0711h3;
                            C0711h3 c0711h5 = new C0711h3();
                            new Rect();
                            C0711h3.f20291q = c0711h5;
                            c0711h4 = c0711h5;
                        }
                        c0711h4 = c0711h3;
                        c0711h4.f17656a = strM13470m2;
                        c0711h4.f20294o = jl4VarM13849M;
                        c0711h4.f20295p = i14Var;
                        abstractC0597e3 = c0711h4;
                    }
                } else if (i6 == 8) {
                    C0748i3 c0748i4 = C0748i3.f21087o;
                    if (c0748i4 == null) {
                        c0748i3 = c0748i4;
                        C0748i3 c0748i5 = new C0748i3();
                        C0748i3.f21087o = c0748i5;
                        c0748i3 = c0748i5;
                    }
                    c0748i3 = c0748i4;
                    c0748i3.f17656a = strM13470m2;
                    abstractC0597e3 = c0748i3;
                } else if (i6 != 16) {
                    abstractC0597e3 = null;
                } else if (lw2Var.m8128c(d14.f16704a)) {
                    abstractC0597e3 = null;
                } else if (i6 == 4) {
                    c0674g3 = C0674g3.f19545p;
                    if (c0674g3 == null) {
                        c0674g4 = c0674g3;
                        C0674g3 c0674g6 = new C0674g3();
                        C0674g3.f19545p = c0674g6;
                        c0674g4 = c0674g6;
                    }
                    c0674g4 = c0674g3;
                    c0674g4.f17656a = strM13470m2;
                    c0674g4.f19548o = jl4VarM13849M;
                    abstractC0597e3 = c0674g4;
                } else {
                    c0711h3 = C0711h3.f20291q;
                    if (c0711h3 == null) {
                        c0711h4 = c0711h3;
                        C0711h3 c0711h6 = new C0711h3();
                        new Rect();
                        C0711h3.f20291q = c0711h6;
                        c0711h4 = c0711h6;
                    }
                    c0711h4 = c0711h3;
                    c0711h4.f17656a = strM13470m2;
                    c0711h4.f20294o = jl4VarM13849M;
                    c0711h4.f20295p = i14Var;
                    abstractC0597e3 = c0711h4;
                }
                abstractC0597e3 = c0636f3;
            }
            if (abstractC0597e3 == null) {
                return false;
            }
            int iM13489j = viewOnAttachStateChangeListenerC1400zc.m13489j(i14Var);
            if (iM13489j == -1) {
                iM13489j = z3 ? 0 : strM13470m.length();
            }
            int[] iArrMo4905a = z3 ? abstractC0597e3.mo4905a(iM13489j) : abstractC0597e3.mo4913m(iM13489j);
            if (iArrMo4905a == null) {
                return false;
            }
            int i7 = iArrMo4905a[0];
            int i8 = iArrMo4905a[1];
            if (z2 && !lw2Var.m8128c(m14.f24552a) && lw2Var.m8128c(m14.f24539F)) {
                iM13490k = viewOnAttachStateChangeListenerC1400zc.m13490k(i14Var);
                if (iM13490k == -1) {
                    iM13490k = z3 ? i7 : i8;
                }
                i4 = z3 ? i8 : i7;
            } else {
                iM13490k = z3 ? i8 : i7;
                i4 = iM13490k;
            }
            int i9 = z3 ? 256 : 512;
            long jUptimeMillis = SystemClock.uptimeMillis();
            C1288wc c1288wc = new C1288wc();
            c1288wc.f33229a = i14Var;
            c1288wc.f33230b = i9;
            c1288wc.f33231c = i6;
            c1288wc.f33232d = i7;
            c1288wc.f33233e = i8;
            c1288wc.f33234f = jUptimeMillis;
            VarHandle.storeStoreFence();
            viewOnAttachStateChangeListenerC1400zc.f35972y = c1288wc;
            viewOnAttachStateChangeListenerC1400zc.m13479E(i14Var, iM13490k, i4, true);
            return true;
        }
        if (i2 == 16384) {
            Object objM8132g2 = lw2Var.m8132g(d14.f16720q);
            C1353y2 c1353y5 = (C1353y2) (objM8132g2 == null ? null : objM8132g2);
            if (c1353y5 == null || (wp1Var = (wp1) c1353y5.f34818b) == null) {
                return false;
            }
            return ((Boolean) wp1Var.invoke()).booleanValue();
        }
        if (i2 == 131072) {
            boolean zM13479E = viewOnAttachStateChangeListenerC1400zc.m13479E(i14Var, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
            if (zM13479E) {
                ViewOnAttachStateChangeListenerC1400zc.m13474y(viewOnAttachStateChangeListenerC1400zc, viewOnAttachStateChangeListenerC1400zc.m13496u(i5), 0, null, 12);
            }
            return zM13479E;
        }
        if (!vd6.m11857p(i14Var)) {
            return false;
        }
        if (i2 == 1) {
            if (viewTreeObserverOnGlobalLayoutListenerC1140sc.isInTouchMode()) {
                viewTreeObserverOnGlobalLayoutListenerC1140sc.requestFocusFromTouch();
            }
            Object objM8132g3 = lw2Var.m8132g(d14.f16726w);
            C1353y2 c1353y6 = (C1353y2) (objM8132g3 == null ? null : objM8132g3);
            if (c1353y6 == null || (wp1Var2 = (wp1) c1353y6.f34818b) == null) {
                return false;
            }
            return ((Boolean) wp1Var2.invoke()).booleanValue();
        }
        if (i2 == 2) {
            Object objM8132g4 = lw2Var.m8132g(m14.f24563l);
            if (objM8132g4 == null) {
                objM8132g4 = null;
            }
            if (!z62.m13387o(objM8132g4, bool)) {
                return false;
            }
            ((bl1) viewTreeObserverOnGlobalLayoutListenerC1140sc.getFocusOwner()).m3616b(8, false, true);
            return true;
        }
        switch (i2) {
            case 16:
                Object objM8132g5 = lw2Var.m8132g(d14.f16705b);
                if (objM8132g5 == null) {
                    objM8132g5 = null;
                }
                C1353y2 c1353y7 = (C1353y2) objM8132g5;
                Boolean bool2 = (c1353y7 == null || (wp1Var3 = (wp1) c1353y7.f34818b) == null) ? null : (Boolean) wp1Var3.invoke();
                ViewOnAttachStateChangeListenerC1400zc.m13474y(viewOnAttachStateChangeListenerC1400zc, i, 1, null, 12);
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return false;
            case 32:
                Object objM8132g6 = lw2Var.m8132g(d14.f16706c);
                C1353y2 c1353y8 = (C1353y2) (objM8132g6 == null ? null : objM8132g6);
                if (c1353y8 == null || (wp1Var4 = (wp1) c1353y8.f34818b) == null) {
                    return false;
                }
                return ((Boolean) wp1Var4.invoke()).booleanValue();
            case 4096:
            case 8192:
                break;
            case 32768:
                Object objM8132g7 = lw2Var.m8132g(d14.f16722s);
                C1353y2 c1353y9 = (C1353y2) (objM8132g7 == null ? null : objM8132g7);
                if (c1353y9 == null || (wp1Var5 = (wp1) c1353y9.f34818b) == null) {
                    return false;
                }
                return ((Boolean) wp1Var5.invoke()).booleanValue();
            case 65536:
                Object objM8132g8 = lw2Var.m8132g(d14.f16721r);
                C1353y2 c1353y10 = (C1353y2) (objM8132g8 == null ? null : objM8132g8);
                if (c1353y10 == null || (wp1Var6 = (wp1) c1353y10.f34818b) == null) {
                    return false;
                }
                return ((Boolean) wp1Var6.invoke()).booleanValue();
            case 262144:
                Object objM8132g9 = lw2Var.m8132g(d14.f16723t);
                C1353y2 c1353y11 = (C1353y2) (objM8132g9 == null ? null : objM8132g9);
                if (c1353y11 == null || (wp1Var7 = (wp1) c1353y11.f34818b) == null) {
                    return false;
                }
                return ((Boolean) wp1Var7.invoke()).booleanValue();
            case 524288:
                Object objM8132g10 = lw2Var.m8132g(d14.f16724u);
                C1353y2 c1353y12 = (C1353y2) (objM8132g10 == null ? null : objM8132g10);
                if (c1353y12 == null || (wp1Var8 = (wp1) c1353y12.f34818b) == null) {
                    return false;
                }
                return ((Boolean) wp1Var8.invoke()).booleanValue();
            case 1048576:
                Object objM8132g11 = lw2Var.m8132g(d14.f16725v);
                C1353y2 c1353y13 = (C1353y2) (objM8132g11 == null ? null : objM8132g11);
                if (c1353y13 == null || (wp1Var9 = (wp1) c1353y13.f34818b) == null) {
                    return false;
                }
                return ((Boolean) wp1Var9.invoke()).booleanValue();
            case 2097152:
                String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                Object objM8132g12 = lw2Var.m8132g(d14.f16714k);
                C1353y2 c1353y14 = (C1353y2) (objM8132g12 == null ? null : objM8132g12);
                if (c1353y14 == null || (yp1Var = (yp1) c1353y14.f34818b) == null) {
                    return false;
                }
                if (string == null) {
                    string = "";
                }
                return ((Boolean) yp1Var.invoke(new C0875lk(string))).booleanValue();
            case R.id.accessibilityActionShowOnScreen:
                i14 i14VarM6550l = i14Var.m6550l();
                if (i14VarM6550l != null) {
                    Object objM8132g13 = i14VarM6550l.f21012d.f17631a.m8132g(d14.f16707d);
                    if (objM8132g13 == null) {
                        objM8132g13 = null;
                    }
                    c1353y2 = (C1353y2) objM8132g13;
                    while (c1353y2 == null && i14VarM6550l != null) {
                        i14VarM6550l = i14VarM6550l.m6550l();
                        if (i14VarM6550l != null) {
                            Object objM8132g14 = i14VarM6550l.f21012d.f17631a.m8132g(d14.f16707d);
                            if (objM8132g14 == null) {
                                objM8132g14 = null;
                            }
                            c1353y2 = (C1353y2) objM8132g14;
                        } else {
                            c1353y2 = null;
                        }
                    }
                    if (i14VarM6550l == null) {
                        jl3 jl3VarM6546g = i14Var.m6546g();
                        return viewTreeObserverOnGlobalLayoutListenerC1140sc.requestRectangleOnScreen(new Rect((int) Math.floor(jl3VarM6546g.f22396a), (int) Math.floor(jl3VarM6546g.f22397b), qq2.m10010E((float) Math.ceil(jl3VarM6546g.f22398c)), qq2.m10010E((float) Math.ceil(jl3VarM6546g.f22399d))));
                    }
                    long jM3429g = 0;
                    boolean z4 = false;
                    while (i14VarM6550l != null) {
                        wf2 wf2Var2 = i14VarM6550l.f21011c;
                        lw2 lw2Var2 = i14VarM6550l.f21012d.f17631a;
                        Object objM8132g15 = lw2Var2.m8132g(d14.f16707d);
                        if (objM8132g15 == null) {
                            objM8132g15 = null;
                        }
                        C1353y2 c1353y15 = (C1353y2) objM8132g15;
                        if (c1353y15 != null) {
                            jl3 jl3VarM12844P = y42.m12844P((w32) wf2Var2.f33299G.f25607d);
                            cf2 cf2VarMo4011n = ((w32) wf2Var2.f33299G.f25607d).mo4011n();
                            jl3 jl3VarM7174j = jl3VarM12844P.m7174j(cf2VarMo4011n != null ? ((e13) cf2VarMo4011n).mo4005S(0L) : 0L);
                            e13 e13VarM6543d = i14Var.m6543d();
                            if (e13VarM6543d == null) {
                                jMo4005S = 0;
                            } else {
                                if (!e13VarM6543d.mo4871Z0().f25208n) {
                                    e13VarM6543d = null;
                                }
                                if (e13VarM6543d != null) {
                                    jMo4005S = e13VarM6543d.mo4005S(0L);
                                } else {
                                    jMo4005S = 0;
                                }
                            }
                            long jM3430h = b33.m3430h(jMo4005S, jM3429g);
                            e13 e13VarM6543d2 = i14Var.m6543d();
                            long j2 = jM3429g;
                            jl3 jl3VarM5672j = AbstractC0647fd.m5672j(jM3430h, z62.m13369a0(e13VarM6543d2 != null ? e13VarM6543d2.f16901c : 0L));
                            float f = jl3VarM5672j.f22396a - jl3VarM7174j.f22396a;
                            float f2 = jl3VarM5672j.f22398c - jl3VarM7174j.f22398c;
                            if (Math.signum(f) != Math.signum(f2)) {
                                f = 0.0f;
                            } else if (Math.abs(f) >= Math.abs(f2)) {
                                f = f2;
                            }
                            float f3 = jl3VarM5672j.f22397b - jl3VarM7174j.f22397b;
                            float f4 = jl3VarM5672j.f22399d - jl3VarM7174j.f22399d;
                            if (Math.signum(f3) != Math.signum(f4)) {
                                f3 = 0.0f;
                            } else if (Math.abs(f3) >= Math.abs(f4)) {
                                f3 = f4;
                            }
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                            if (b33.m3425c(jFloatToRawIntBits2, 0L)) {
                                jFloatToRawIntBits = jFloatToRawIntBits2;
                            } else {
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
                                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
                                Object objM8132g16 = lw2Var2.m8132g(m14.f24573v);
                                if (objM8132g16 == null) {
                                    objM8132g16 = null;
                                }
                                if (wf2Var.f33293A == df2.f17012b) {
                                    fIntBitsToFloat2 = -fIntBitsToFloat2;
                                }
                                Object objM8132g17 = lw2Var2.m8132g(m14.f24574w);
                                if (objM8132g17 == null) {
                                    objM8132g17 = null;
                                }
                                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
                            }
                            mq1 mq1Var = (mq1) c1353y15.f34818b;
                            z4 = (mq1Var != null && ((Boolean) mq1Var.invoke(Float.valueOf(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))))).booleanValue()) || z4;
                            jM3429g = b33.m3429g(j2, jFloatToRawIntBits2);
                        } else {
                            jM3429g = jM3429g;
                        }
                        i14VarM6550l = i14VarM6550l.m6550l();
                    }
                    return z4;
                }
                c1353y2 = null;
                break;
            case R.id.accessibilityActionSetProgress:
                if (bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    return false;
                }
                Object objM8132g18 = lw2Var.m8132g(d14.f16712i);
                C1353y2 c1353y16 = (C1353y2) (objM8132g18 == null ? null : objM8132g18);
                if (c1353y16 == null || (yp1Var2 = (yp1) c1353y16.f34818b) == null) {
                    return false;
                }
                return ((Boolean) yp1Var2.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
            case R.id.accessibilityActionImeEnter:
                Object objM8132g19 = lw2Var.m8132g(d14.f16719p);
                C1353y2 c1353y17 = (C1353y2) (objM8132g19 == null ? null : objM8132g19);
                if (c1353y17 == null || (wp1Var10 = (wp1) c1353y17.f34818b) == null) {
                    return false;
                }
                return ((Boolean) wp1Var10.invoke()).booleanValue();
            default:
                switch (i2) {
                    case R.id.accessibilityActionScrollUp:
                    case R.id.accessibilityActionScrollLeft:
                    case R.id.accessibilityActionScrollDown:
                    case R.id.accessibilityActionScrollRight:
                        break;
                    default:
                        switch (i2) {
                            case R.id.accessibilityActionPageUp:
                                Object objM8132g20 = lw2Var.m8132g(d14.f16728y);
                                C1353y2 c1353y18 = (C1353y2) (objM8132g20 == null ? null : objM8132g20);
                                if (c1353y18 == null || (wp1Var13 = (wp1) c1353y18.f34818b) == null) {
                                    return false;
                                }
                                return ((Boolean) wp1Var13.invoke()).booleanValue();
                            case R.id.accessibilityActionPageDown:
                                Object objM8132g21 = lw2Var.m8132g(d14.f16701A);
                                C1353y2 c1353y19 = (C1353y2) (objM8132g21 == null ? null : objM8132g21);
                                if (c1353y19 == null || (wp1Var14 = (wp1) c1353y19.f34818b) == null) {
                                    return false;
                                }
                                return ((Boolean) wp1Var14.invoke()).booleanValue();
                            case R.id.accessibilityActionPageLeft:
                                Object objM8132g22 = lw2Var.m8132g(d14.f16729z);
                                C1353y2 c1353y20 = (C1353y2) (objM8132g22 == null ? null : objM8132g22);
                                if (c1353y20 == null || (wp1Var15 = (wp1) c1353y20.f34818b) == null) {
                                    return false;
                                }
                                return ((Boolean) wp1Var15.invoke()).booleanValue();
                            case R.id.accessibilityActionPageRight:
                                Object objM8132g23 = lw2Var.m8132g(d14.f16702B);
                                C1353y2 c1353y21 = (C1353y2) (objM8132g23 == null ? null : objM8132g23);
                                if (c1353y21 == null || (wp1Var16 = (wp1) c1353y21.f34818b) == null) {
                                    return false;
                                }
                                return ((Boolean) wp1Var16.invoke()).booleanValue();
                            default:
                                ra4 ra4Var = viewOnAttachStateChangeListenerC1400zc.f35965r;
                                ra4Var.getClass();
                                ra4 ra4Var2 = (ra4) sc6.m10680u(ra4Var, i);
                                if (ra4Var2 == null || (charSequence = (CharSequence) sc6.m10680u(ra4Var2, i2)) == null) {
                                    return false;
                                }
                                Object objM8132g24 = lw2Var.m8132g(d14.f16727x);
                                List list = (List) (objM8132g24 == null ? null : objM8132g24);
                                if (list == null) {
                                    return false;
                                }
                                int size = list.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    fs0 fs0Var = (fs0) list.get(i10);
                                    if (z62.m13387o(fs0Var.f19247a, charSequence)) {
                                        return ((Boolean) fs0Var.f19248b.invoke()).booleanValue();
                                    }
                                }
                                return false;
                        }
                }
                break;
        }
        boolean z5 = i2 == 4096;
        boolean z6 = i2 == 8192;
        boolean z7 = i2 == 16908345;
        boolean z8 = i2 == 16908347;
        boolean z9 = i2 == 16908344;
        boolean z10 = i2 == 16908346;
        boolean z11 = z7 || z8 || z5 || z6;
        if (!z9 && !z10 && !z5 && !z6) {
            z = false;
        }
        if (z5 || z6) {
            Object objM8132g25 = lw2Var.m8132g(m14.f24554c);
            if (objM8132g25 == null) {
                objM8132g25 = null;
            }
            bh3 bh3Var = (bh3) objM8132g25;
            Object objM8132g26 = lw2Var.m8132g(d14.f16712i);
            if (objM8132g26 == null) {
                objM8132g26 = null;
            }
            C1353y2 c1353y22 = (C1353y2) objM8132g26;
            if (bh3Var != null) {
                ma0 ma0Var = bh3Var.f15272b;
                if (c1353y22 != null) {
                    float f5 = ma0Var.f24779b;
                    float f6 = ma0Var.f24778a;
                    float f7 = f5 < f6 ? f6 : f5;
                    if (f6 <= f5) {
                        f5 = f6;
                    }
                    float f8 = (f7 - f5) / 20.0f;
                    if (z6) {
                        f8 = -f8;
                    }
                    yp1 yp1Var4 = (yp1) c1353y22.f34818b;
                    if (yp1Var4 != null) {
                        return ((Boolean) yp1Var4.invoke(Float.valueOf(bh3Var.f15271a + f8))).booleanValue();
                    }
                    return false;
                }
            }
        }
        long jM7168d = y42.m12844P((w32) wf2Var.f33299G.f25607d).m7168d();
        ArrayList arrayList = new ArrayList();
        Object objM8132g27 = lw2Var.m8132g(d14.f16703C);
        if (objM8132g27 == null) {
            objM8132g27 = null;
        }
        C1353y2 c1353y23 = (C1353y2) objM8132g27;
        Float f9 = (c1353y23 == null || (yp1Var3 = (yp1) c1353y23.f34818b) == null || !((Boolean) yp1Var3.invoke(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
        Object objM8132g28 = lw2Var.m8132g(d14.f16707d);
        if (objM8132g28 == null) {
            objM8132g28 = null;
        }
        C1353y2 c1353y24 = (C1353y2) objM8132g28;
        if (c1353y24 == null) {
            return false;
        }
        iq1 iq1Var = c1353y24.f34818b;
        Object objM8132g29 = lw2Var.m8132g(m14.f24573v);
        if (objM8132g29 == null) {
            objM8132g29 = null;
        }
        ww3 ww3Var = (ww3) objM8132g29;
        if (ww3Var == null || !z11) {
            j = jM7168d;
        } else {
            if (f9 != null) {
                fIntBitsToFloat = f9.floatValue();
                j = jM7168d;
            } else {
                j = jM7168d;
                fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            }
            if (z7 || z6) {
                fIntBitsToFloat = -fIntBitsToFloat;
            }
            if (wf2Var.f33293A == df2.f17012b && (z7 || z8)) {
                fIntBitsToFloat = -fIntBitsToFloat;
            }
            if (ViewOnAttachStateChangeListenerC1400zc.m13471q(ww3Var, fIntBitsToFloat)) {
                p14 p14Var = d14.f16729z;
                if (!lw2Var.m8128c(p14Var) && !lw2Var.m8128c(d14.f16702B)) {
                    mq1 mq1Var2 = (mq1) iq1Var;
                    if (mq1Var2 != null) {
                        return ((Boolean) mq1Var2.invoke(Float.valueOf(fIntBitsToFloat), fValueOf)).booleanValue();
                    }
                    return false;
                }
                if (fIntBitsToFloat > 0.0f) {
                    Object objM8132g30 = lw2Var.m8132g(d14.f16702B);
                    c1353y4 = (C1353y2) (objM8132g30 == null ? null : objM8132g30);
                } else {
                    Object objM8132g31 = lw2Var.m8132g(p14Var);
                    c1353y4 = (C1353y2) (objM8132g31 == null ? null : objM8132g31);
                }
                if (c1353y4 == null || (wp1Var12 = (wp1) c1353y4.f34818b) == null) {
                    return false;
                }
                return ((Boolean) wp1Var12.invoke()).booleanValue();
            }
        }
        Object objM8132g32 = lw2Var.m8132g(m14.f24574w);
        if (objM8132g32 == null) {
            objM8132g32 = null;
        }
        ww3 ww3Var2 = (ww3) objM8132g32;
        if (ww3Var2 == null || !z) {
            return false;
        }
        float fFloatValue = f9 != null ? f9.floatValue() : Float.intBitsToFloat((int) (j & 4294967295L));
        if (z9 || z6) {
            fFloatValue = -fFloatValue;
        }
        if (!ViewOnAttachStateChangeListenerC1400zc.m13471q(ww3Var2, fFloatValue)) {
            return false;
        }
        p14 p14Var2 = d14.f16728y;
        if (!lw2Var.m8128c(p14Var2) && !lw2Var.m8128c(d14.f16701A)) {
            mq1 mq1Var3 = (mq1) iq1Var;
            if (mq1Var3 != null) {
                return ((Boolean) mq1Var3.invoke(fValueOf, Float.valueOf(fFloatValue))).booleanValue();
            }
            return false;
        }
        if (fFloatValue > 0.0f) {
            Object objM8132g33 = lw2Var.m8132g(d14.f16701A);
            c1353y3 = (C1353y2) (objM8132g33 == null ? null : objM8132g33);
        } else {
            Object objM8132g34 = lw2Var.m8132g(p14Var2);
            c1353y3 = (C1353y2) (objM8132g34 == null ? null : objM8132g34);
        }
        if (c1353y3 == null || (wp1Var11 = (wp1) c1353y3.f34818b) == null) {
            return false;
        }
        return ((Boolean) wp1Var11.invoke()).booleanValue();
    }
}
