package p000;

import android.accessibilityservice.AccessibilityService;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ox3 {

    /* JADX INFO: renamed from: a */
    public static final long f27187a;

    /* JADX INFO: renamed from: b */
    public static final long f27188b;

    /* JADX INFO: renamed from: c */
    public static final long f27189c;

    /* JADX INFO: renamed from: d */
    public static final long f27190d;

    /* JADX INFO: renamed from: e */
    public static final long f27191e;

    /* JADX INFO: renamed from: f */
    public static final long f27192f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f27193g = 0;

    static {
        AbstractC0990oo.m9216k0(new AccessibilityNodeInfo.AccessibilityAction[]{AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT});
        r50 r50Var = i41.f21117b;
        m41 m41Var = m41.MILLISECONDS;
        f27187a = as4.m3238Q(90, m41Var);
        f27188b = as4.m3238Q(15, m41.SECONDS);
        f27189c = as4.m3238Q(1500, m41Var);
        f27190d = as4.m3238Q(150, m41Var);
        f27191e = as4.m3238Q(150, m41Var);
        f27192f = as4.m3238Q(120, m41Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m9322a(si1 si1Var, ym0 ym0Var) {
        cx3 cx3Var;
        if (ym0Var instanceof cx3) {
            cx3Var = (cx3) ym0Var;
            int i = cx3Var.f16580u;
            if ((i & Integer.MIN_VALUE) != 0) {
                cx3Var.f16580u = i - Integer.MIN_VALUE;
            } else {
                cx3Var = new cx3(ym0Var);
            }
        } else {
            cx3Var = new cx3(ym0Var);
        }
        Object obj = cx3Var.f16579t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = cx3Var.f16580u;
        if (i2 == 0) {
            k43.m7376J(obj);
            r50 r50Var = i41.f21117b;
            C0455ai c0455ai = new C0455ai((byte) 1, as4.m3239R(SystemClock.uptimeMillis(), m41.MILLISECONDS), null, si1Var);
            cx3Var.f16580u = 1;
            if (se0.m10729j0(f27189c, c0455ai, cx3Var) == ap0Var) {
                return ap0Var;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj);
        }
        return ju4.f22634a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ea  */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x01ca, please report this as an issue */
    /* JADX INFO: renamed from: b */
    public static final void m9323b(xn2 xn2Var, Rect rect, long j, ArrayList arrayList, AccessibilityNodeInfo accessibilityNodeInfo, int i, boolean z) {
        boolean z2;
        int childCount;
        int i2;
        AccessibilityNodeInfo child;
        String strM12721a;
        k44 k44Var;
        CharSequence className;
        String string;
        xn2 xn2Var2 = xn2Var;
        String strM9041V = od4.m9041V(i, "  ");
        boolean z3 = z || !((className = accessibilityNodeInfo.getClassName()) == null || (string = className.toString()) == null || (!hd4.m6335a0(string, "WebView", true) && !hd4.m6335a0(string, "GeckoView", true)));
        Integer numM9326e = m9326e(accessibilityNodeInfo);
        if (numM9326e != null) {
            if (accessibilityNodeInfo.isVisibleToUser()) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                if (rect2.intersect(rect)) {
                    z2 = z3;
                    long jWidth = ((long) rect2.width()) * ((long) rect2.height());
                    if (jWidth < j) {
                        if (xn2Var2 != null) {
                            String strM12721a2 = xn2Var2.m12721a();
                            k44 k44Var2 = k44.f22883b;
                            if (xn2Var2.f34459a.m8274a().compareTo(k44Var2) <= 0) {
                                xn2Var2.m12722b(k44Var2, strM12721a2, "candidates: " + strM9041V + ((Object) accessibilityNodeInfo.getClassName()) + " " + rect2 + " skipped, area " + jWidth + " < " + j, null);
                            }
                        }
                        arrayList = arrayList;
                    } else {
                        if (xn2Var2 != null) {
                            String strM12721a3 = xn2Var2.m12721a();
                            k44 k44Var3 = k44.f22883b;
                            if (xn2Var2.f34459a.m8274a().compareTo(k44Var3) <= 0) {
                                xn2Var2.m12722b(k44Var3, strM12721a3, "candidates: " + strM9041V + ((Object) accessibilityNodeInfo.getClassName()) + " " + rect2 + " ACCEPTED area=" + jWidth + " depth=" + i + " action=" + numM9326e, null);
                            }
                        }
                        xw3 xw3Var = new xw3();
                        xw3Var.f34669a = accessibilityNodeInfo;
                        xw3Var.f34670b = jWidth;
                        xw3Var.f34671c = i;
                        VarHandle.storeStoreFence();
                        arrayList = arrayList;
                        arrayList.add(xw3Var);
                    }
                } else {
                    if (xn2Var2 != null) {
                        String strM12721a4 = xn2Var2.m12721a();
                        k44 k44Var4 = k44.f22883b;
                        if (xn2Var2.f34459a.m8274a().compareTo(k44Var4) <= 0) {
                            xn2Var2.m12722b(k44Var4, strM12721a4, "candidates: " + strM9041V + ((Object) accessibilityNodeInfo.getClassName()) + " " + rect2 + " skipped, outside window", null);
                        }
                    }
                    z2 = z3;
                }
            } else if (xn2Var2 != null) {
                String strM12721a5 = xn2Var2.m12721a();
                k44 k44Var5 = k44.f22883b;
                if (xn2Var2.f34459a.m8274a().compareTo(k44Var5) <= 0) {
                    xn2Var2.m12722b(k44Var5, strM12721a5, "candidates: " + strM9041V + ((Object) accessibilityNodeInfo.getClassName()) + " skipped, not visible", null);
                }
            }
            childCount = accessibilityNodeInfo.getChildCount();
            i2 = 0;
            while (i2 < childCount) {
                child = accessibilityNodeInfo.getChild(i2);
                if (child == null) {
                    m9323b(xn2Var2, rect, j, arrayList, child, i + 1, z2);
                } else if (xn2Var2 != null) {
                    strM12721a = xn2Var2.m12721a();
                    k44Var = k44.f22883b;
                    if (xn2Var2.f34459a.m8274a().compareTo(k44Var) <= 0) {
                        xn2Var2.m12722b(k44Var, strM12721a, "candidates: " + strM9041V + "  child " + i2 + " is null", null);
                    }
                }
                i2++;
                xn2Var2 = xn2Var;
                arrayList = arrayList;
            }
        }
        if (xn2Var2 != null) {
            String strM12721a6 = xn2Var2.m12721a();
            k44 k44Var6 = k44.f22883b;
            if (xn2Var2.f34459a.m8274a().compareTo(k44Var6) <= 0) {
                xn2Var2.m12722b(k44Var6, strM12721a6, "candidates: " + strM9041V + ((Object) accessibilityNodeInfo.getClassName()) + " no scroll up action", null);
            }
        }
        z2 = z3;
        childCount = accessibilityNodeInfo.getChildCount();
        i2 = 0;
        while (i2 < childCount) {
            child = accessibilityNodeInfo.getChild(i2);
            if (child == null) {
                m9323b(xn2Var2, rect, j, arrayList, child, i + 1, z2);
            } else if (xn2Var2 != null) {
                strM12721a = xn2Var2.m12721a();
                k44Var = k44.f22883b;
                if (xn2Var2.f34459a.m8274a().compareTo(k44Var) <= 0) {
                    xn2Var2.m12722b(k44Var, strM12721a, "candidates: " + strM9041V + "  child " + i2 + " is null", null);
                }
            }
            i2++;
            xn2Var2 = xn2Var;
            arrayList = arrayList;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: c */
    public static final Object m9324c(AccessibilityService accessibilityService, AccessibilityNodeInfo accessibilityNodeInfo, si1 si1Var, xn2 xn2Var, ym0 ym0Var) {
        ix3 ix3Var;
        xn2 xn2Var2;
        ml3 ml3Var;
        ol3 ol3Var;
        xn2 xn2Var3;
        String strM12721a;
        k44 k44Var;
        if (ym0Var instanceof ix3) {
            ix3Var = (ix3) ym0Var;
            int i = ix3Var.f21865x;
            if ((i & Integer.MIN_VALUE) != 0) {
                ix3Var.f21865x = i - Integer.MIN_VALUE;
            } else {
                ix3Var = new ix3(ym0Var);
            }
        } else {
            ix3Var = new ix3(ym0Var);
        }
        Object obj = ix3Var.f21864w;
        ap0 ap0Var = ap0.f14763a;
        int i2 = ix3Var.f21865x;
        if (i2 == 0) {
            k43.m7376J(obj);
            ol3 ol3Var2 = new ol3();
            ml3 ml3Var2 = new ml3();
            ml3 ml3Var3 = new ml3();
            ml3Var3.f25002a = true;
            try {
                long j = f27188b;
                xn2Var2 = xn2Var;
                try {
                    jx3 jx3Var = new jx3(accessibilityService, accessibilityNodeInfo, xn2Var2, si1Var, ml3Var2, ml3Var3, ol3Var2, null);
                    ix3Var.f21861t = xn2Var2;
                    ix3Var.f21862u = ol3Var2;
                    ix3Var.f21863v = ml3Var2;
                    ix3Var.f21865x = 1;
                    if (se0.m10725h0(j, jx3Var, ix3Var) == ap0Var) {
                        return ap0Var;
                    }
                    xn2Var3 = xn2Var2;
                    ml3Var = ml3Var2;
                    ol3Var = ol3Var2;
                } catch (zm4 unused) {
                    ml3Var = ml3Var2;
                    ol3Var = ol3Var2;
                    if (xn2Var2 != null) {
                        strM12721a = xn2Var2.m12721a();
                        k44Var = k44.f22883b;
                        if (xn2Var2.f34459a.m8274a().compareTo(k44Var) <= 0) {
                            xn2Var2.m12722b(k44Var, strM12721a, "fling: timed out", null);
                        }
                    }
                    xn2Var3 = xn2Var2;
                }
            } catch (zm4 unused2) {
                xn2Var2 = xn2Var;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ml3Var = ix3Var.f21863v;
            ol3Var = ix3Var.f21862u;
            xn2Var3 = ix3Var.f21861t;
            try {
                k43.m7376J(obj);
            } catch (zm4 unused3) {
                xn2Var2 = xn2Var3;
                if (xn2Var2 != null) {
                    strM12721a = xn2Var2.m12721a();
                    k44Var = k44.f22883b;
                    if (xn2Var2.f34459a.m8274a().compareTo(k44Var) <= 0) {
                        xn2Var2.m12722b(k44Var, strM12721a, "fling: timed out", null);
                    }
                }
                xn2Var3 = xn2Var2;
            }
        }
        if (xn2Var3 != null) {
            String strM12721a2 = xn2Var3.m12721a();
            k44 k44Var2 = k44.f22883b;
            if (xn2Var3.f34459a.m8274a().compareTo(k44Var2) <= 0) {
                xn2Var3.m12722b(k44Var2, strM12721a2, "fling: finished scrolled=" + ml3Var.f25002a + " flings=" + ol3Var.f26851a, null);
            }
        }
        return Boolean.valueOf(ml3Var.f25002a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00bd -> B:33:0x00be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public static final java.lang.Object m9325d(android.view.accessibility.AccessibilityNodeInfo r8, p000.xn2 r9, p000.ym0 r10) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ox3.m9325d(android.view.accessibility.AccessibilityNodeInfo, xn2, ym0):java.lang.Object");
    }

    /* JADX INFO: renamed from: e */
    public static final Integer m9326e(AccessibilityNodeInfo accessibilityNodeInfo) {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (!actionList.contains(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT) && !actionList.contains(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT)) {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
            if (actionList.contains(accessibilityAction)) {
                return Integer.valueOf(accessibilityAction.getId());
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD;
            if (actionList.contains(accessibilityAction2)) {
                return Integer.valueOf(accessibilityAction2.getId());
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: f */
    public static final Object m9327f(AccessibilityService accessibilityService, long j, long j2, ym0 ym0Var) {
        mx3 mx3Var;
        if (ym0Var instanceof mx3) {
            mx3Var = (mx3) ym0Var;
            int i = mx3Var.f25283u;
            if ((i & Integer.MIN_VALUE) != 0) {
                mx3Var.f25283u = i - Integer.MIN_VALUE;
            } else {
                mx3Var = new mx3(ym0Var);
            }
        } else {
            mx3Var = new mx3(ym0Var);
        }
        Object objM10729j0 = mx3Var.f25282t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = mx3Var.f25283u;
        if (i2 == 0) {
            k43.m7376J(objM10729j0);
            r50 r50Var = i41.f21117b;
            long jM6652k = i41.m6652k(f27187a, as4.m3238Q(1, m41.SECONDS));
            nx3 nx3Var = new nx3(accessibilityService, j, j2, null);
            mx3Var.f25283u = 1;
            objM10729j0 = se0.m10729j0(jM6652k, nx3Var, mx3Var);
            if (objM10729j0 == ap0Var) {
                return ap0Var;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(objM10729j0);
        }
        return Boolean.valueOf(z62.m13387o(objM10729j0, Boolean.TRUE));
    }
}
