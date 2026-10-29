package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ij0 {

    /* JADX INFO: renamed from: a */
    public static final nc4 f21466a = new nc4(new nh0((byte) 7));

    /* JADX INFO: renamed from: b */
    public static final nc4 f21467b = new nc4(new nh0((byte) 9));

    /* JADX INFO: renamed from: c */
    public static final nc4 f21468c = new nc4(new nh0((byte) 14));

    /* JADX INFO: renamed from: d */
    public static final nc4 f21469d = new nc4(new nh0((byte) 15));

    /* JADX INFO: renamed from: e */
    public static final nc4 f21470e = new nc4(new nh0((byte) 16));

    /* JADX INFO: renamed from: f */
    public static final nc4 f21471f = new nc4(new nh0((byte) 17));

    /* JADX INFO: renamed from: g */
    public static final nc4 f21472g = new nc4(new nh0((byte) 19));

    /* JADX INFO: renamed from: h */
    public static final nc4 f21473h = new nc4(new nh0((byte) 20));

    /* JADX INFO: renamed from: i */
    public static final nc4 f21474i = new nc4(new nh0((byte) 21));

    /* JADX INFO: renamed from: j */
    public static final nc4 f21475j = new nc4(new nh0((byte) 22));

    /* JADX INFO: renamed from: k */
    public static final nc4 f21476k = new nc4(new nh0((byte) 18));

    /* JADX INFO: renamed from: l */
    public static final nc4 f21477l = new nc4(new nh0((byte) 23));

    /* JADX INFO: renamed from: m */
    public static final nc4 f21478m = new nc4(new nh0((byte) 25));

    /* JADX INFO: renamed from: n */
    public static final nc4 f21479n = new nc4(new nh0((byte) 26));

    /* JADX INFO: renamed from: o */
    public static final nc4 f21480o = new nc4(new nh0((byte) 27));

    /* JADX INFO: renamed from: p */
    public static final nc4 f21481p;

    /* JADX INFO: renamed from: q */
    public static final nc4 f21482q;

    /* JADX INFO: renamed from: r */
    public static final nc4 f21483r;

    /* JADX INFO: renamed from: s */
    public static final nc4 f21484s;

    /* JADX INFO: renamed from: t */
    public static final nc4 f21485t;

    /* JADX INFO: renamed from: u */
    public static final nc4 f21486u;

    /* JADX INFO: renamed from: v */
    public static final nc4 f21487v;

    /* JADX INFO: renamed from: w */
    public static final nc4 f21488w;

    /* JADX INFO: renamed from: x */
    public static final kj0 f21489x;

    /* JADX INFO: renamed from: y */
    public static final nc4 f21490y;

    static {
        as4.m3263v(new dh0((byte) 7));
        f21481p = new nc4(new nh0((byte) 28));
        f21482q = new nc4(new nh0((byte) 29));
        f21483r = new nc4(new fj0((byte) 0));
        f21484s = new nc4(new nh0((byte) 8));
        f21485t = new nc4(new nh0((byte) 10));
        f21486u = new nc4(new nh0((byte) 11));
        f21487v = new nc4(new nh0((byte) 12));
        f21488w = new nc4(new nh0((byte) 13));
        f21489x = as4.m3262u(new da2((byte) 12));
        f21490y = new nc4(new fj0((byte) 6));
    }

    /* JADX INFO: renamed from: a */
    public static final void m6811a(r63 r63Var, ia5 ia5Var, mq1 mq1Var, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1925803616);
        int i2 = i | (ir1Var.m6890g(r63Var) ? 4 : 2) | (ir1Var.m6890g(ia5Var) ? 32 : 16) | (ir1Var.m6894i(mq1Var) ? 256 : 128);
        if (ir1Var.m6871T(i2 & 1, (i2 & 147) != 146)) {
            ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = (ViewTreeObserverOnGlobalLayoutListenerC1140sc) r63Var;
            zh3 zh3VarMo7523a = f21466a.mo7523a(viewTreeObserverOnGlobalLayoutListenerC1140sc.getAccessibilityManager());
            zh3 zh3VarMo7523a2 = f21467b.mo7523a(viewTreeObserverOnGlobalLayoutListenerC1140sc.getAutofill());
            zh3 zh3VarMo7523a3 = f21469d.mo7523a(viewTreeObserverOnGlobalLayoutListenerC1140sc.getAutofillManager());
            zh3 zh3VarMo7523a4 = f21468c.mo7523a(viewTreeObserverOnGlobalLayoutListenerC1140sc.getAutofillTree());
            zh3 zh3VarMo7523a5 = f21470e.mo7523a(viewTreeObserverOnGlobalLayoutListenerC1140sc.getClipboardManager());
            zh3 zh3VarMo7523a6 = f21471f.mo7523a(viewTreeObserverOnGlobalLayoutListenerC1140sc.getClipboard());
            zh3 zh3VarMo7523a7 = f21473h.mo7523a(viewTreeObserverOnGlobalLayoutListenerC1140sc.getDensity());
            zh3 zh3VarMo7523a8 = f21474i.mo7523a(viewTreeObserverOnGlobalLayoutListenerC1140sc.getFocusOwner());
            zh3 zh3VarMo7523a9 = f21475j.mo7523a(viewTreeObserverOnGlobalLayoutListenerC1140sc.getFontLoader());
            zh3VarMo7523a9.f36098h = false;
            zh3 zh3VarMo7523a10 = f21476k.mo7523a(viewTreeObserverOnGlobalLayoutListenerC1140sc.getFontFamilyResolver());
            zh3VarMo7523a10.f36098h = false;
            zh3 zh3VarMo7523a11 = f21477l.mo7523a(viewTreeObserverOnGlobalLayoutListenerC1140sc.getHapticFeedBack());
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            Object obj = objM6869O;
            if (z || objM6869O == i50Var) {
                C0522cc c0522cc = new C0522cc((byte) 5);
                c0522cc.f15920b = viewTreeObserverOnGlobalLayoutListenerC1140sc;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0522cc);
                obj = c0522cc;
            }
            zh3 zh3VarM12695c = f21478m.m12695c((yp1) obj);
            zh3 zh3VarMo7523a12 = f21479n.mo7523a(viewTreeObserverOnGlobalLayoutListenerC1140sc.getLayoutDirection());
            boolean z2 = i3 == 4;
            Object objM6869O2 = ir1Var.m6869O();
            Object obj2 = objM6869O2;
            if (z2 || objM6869O2 == i50Var) {
                C0522cc c0522cc2 = new C0522cc((byte) 6);
                c0522cc2.f15920b = viewTreeObserverOnGlobalLayoutListenerC1140sc;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0522cc2);
                obj2 = c0522cc2;
            }
            zh3 zh3VarM12695c2 = f21481p.m12695c((yp1) obj2);
            boolean z3 = i3 == 4;
            Object objM6869O3 = ir1Var.m6869O();
            Object obj3 = objM6869O3;
            if (z3 || objM6869O3 == i50Var) {
                C0522cc c0522cc3 = new C0522cc((byte) 7);
                c0522cc3.f15920b = viewTreeObserverOnGlobalLayoutListenerC1140sc;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0522cc3);
                obj3 = c0522cc3;
            }
            zh3 zh3VarM12695c3 = f21482q.m12695c((yp1) obj3);
            boolean z4 = i3 == 4;
            Object objM6869O4 = ir1Var.m6869O();
            Object obj4 = objM6869O4;
            if (z4 || objM6869O4 == i50Var) {
                C0522cc c0522cc4 = new C0522cc((byte) 8);
                c0522cc4.f15920b = viewTreeObserverOnGlobalLayoutListenerC1140sc;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0522cc4);
                obj4 = c0522cc4;
            }
            zh3 zh3VarM12695c4 = f21483r.m12695c((yp1) obj4);
            zh3 zh3VarMo7523a13 = f21484s.mo7523a(ia5Var);
            zh3 zh3VarMo7523a14 = f21485t.mo7523a(viewTreeObserverOnGlobalLayoutListenerC1140sc.getViewConfiguration());
            zh3 zh3VarMo7523a15 = f21486u.mo7523a(viewTreeObserverOnGlobalLayoutListenerC1140sc.getWindowInfo());
            boolean z5 = i3 == 4;
            Object objM6869O5 = ir1Var.m6869O();
            Object obj5 = objM6869O5;
            if (z5 || objM6869O5 == i50Var) {
                C0522cc c0522cc5 = new C0522cc((byte) 9);
                c0522cc5.f15920b = viewTreeObserverOnGlobalLayoutListenerC1140sc;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0522cc5);
                obj5 = c0522cc5;
            }
            as4.m3245d(new zh3[]{zh3VarMo7523a, zh3VarMo7523a2, zh3VarMo7523a3, zh3VarMo7523a4, zh3VarMo7523a5, zh3VarMo7523a6, zh3VarMo7523a7, zh3VarMo7523a8, zh3VarMo7523a9, zh3VarMo7523a10, zh3VarMo7523a11, zh3VarM12695c, zh3VarMo7523a12, zh3VarM12695c2, zh3VarM12695c3, zh3VarM12695c4, zh3VarMo7523a13, zh3VarMo7523a14, zh3VarMo7523a15, f21488w.m12695c((yp1) obj5), f21472g.mo7523a(viewTreeObserverOnGlobalLayoutListenerC1140sc.getGraphicsContext()), wm2.f33489a.mo7523a(viewTreeObserverOnGlobalLayoutListenerC1140sc.getRetainedValuesStore()), f21480o.mo7523a(viewTreeObserverOnGlobalLayoutListenerC1140sc.getLocaleList())}, mq1Var, ir1Var, 8 | ((i2 >> 3) & 112));
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0712h4 c0712h4 = new C0712h4((byte) 4);
            c0712h4.f20357b = r63Var;
            c0712h4.f20358c = ia5Var;
            c0712h4.f20359d = mq1Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0712h4;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m6812b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
