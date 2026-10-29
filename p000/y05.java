package p000;

import android.graphics.Path;
import android.view.View;
import java.lang.invoke.VarHandle;
import java.util.WeakHashMap;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y05 {

    /* JADX INFO: renamed from: x */
    public static final WeakHashMap f34773x = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public final C0726hi f34774a;

    /* JADX INFO: renamed from: b */
    public final C0726hi f34775b;

    /* JADX INFO: renamed from: c */
    public final C0726hi f34776c;

    /* JADX INFO: renamed from: d */
    public final C0726hi f34777d;

    /* JADX INFO: renamed from: e */
    public final C0726hi f34778e;

    /* JADX INFO: renamed from: f */
    public final C0726hi f34779f;

    /* JADX INFO: renamed from: g */
    public final C0726hi f34780g;

    /* JADX INFO: renamed from: h */
    public final C0726hi f34781h;

    /* JADX INFO: renamed from: i */
    public final C0726hi f34782i;

    /* JADX INFO: renamed from: j */
    public final ow4 f34783j;

    /* JADX INFO: renamed from: k */
    public final d83 f34784k;

    /* JADX INFO: renamed from: l */
    public final gu4 f34785l;

    /* JADX INFO: renamed from: m */
    public final gu4 f34786m;

    /* JADX INFO: renamed from: n */
    public final ow4 f34787n;

    /* JADX INFO: renamed from: o */
    public final ow4 f34788o;

    /* JADX INFO: renamed from: p */
    public final ow4 f34789p;

    /* JADX INFO: renamed from: q */
    public final ow4 f34790q;

    /* JADX INFO: renamed from: r */
    public final ow4 f34791r;

    /* JADX INFO: renamed from: s */
    public final ow4 f34792s;

    /* JADX INFO: renamed from: t */
    public final ow4 f34793t;

    /* JADX INFO: renamed from: u */
    public final boolean f34794u;

    /* JADX INFO: renamed from: v */
    public int f34795v;

    /* JADX INFO: renamed from: w */
    public final k42 f34796w;

    /* JADX WARN: Multi-variable type inference failed */
    public y05(View view) {
        C0726hi c0726hiM7374H = k43.m7374H(4, "captionBar");
        this.f34774a = c0726hiM7374H;
        C0726hi c0726hiM7374H2 = k43.m7374H(128, "displayCutout");
        this.f34775b = c0726hiM7374H2;
        C0726hi c0726hiM7374H3 = k43.m7374H(8, "ime");
        this.f34776c = c0726hiM7374H3;
        C0726hi c0726hiM7374H4 = k43.m7374H(32, "mandatorySystemGestures");
        this.f34777d = c0726hiM7374H4;
        C0726hi c0726hiM7374H5 = k43.m7374H(2, "navigationBars");
        this.f34778e = c0726hiM7374H5;
        C0726hi c0726hiM7374H6 = k43.m7374H(1, "statusBars");
        this.f34779f = c0726hiM7374H6;
        C0726hi c0726hiM7374H7 = k43.m7374H(519, "systemBars");
        this.f34780g = c0726hiM7374H7;
        C0726hi c0726hiM7374H8 = k43.m7374H(16, "systemGestures");
        this.f34781h = c0726hiM7374H8;
        C0726hi c0726hiM7374H9 = k43.m7374H(64, "tappableElement");
        this.f34782i = c0726hiM7374H9;
        g42 g42Var = g42.f19605e;
        ow4 ow4VarM3249h = as4.m3249h(g42Var, "waterfall");
        this.f34783j = ow4VarM3249h;
        this.f34784k = k43.m7398w(null);
        gu4 gu4VarM5375y0 = ev0.m5375y0(ev0.m5375y0(c0726hiM7374H7, c0726hiM7374H3), c0726hiM7374H2);
        this.f34785l = gu4VarM5375y0;
        this.f34786m = ev0.m5375y0(gu4VarM5375y0, ev0.m5375y0(ev0.m5375y0(ev0.m5375y0(c0726hiM7374H9, c0726hiM7374H4), c0726hiM7374H8), ow4VarM3249h));
        this.f34787n = as4.m3249h(g42Var, "captionBarIgnoringVisibility");
        this.f34788o = as4.m3249h(g42Var, "navigationBarsIgnoringVisibility");
        this.f34789p = as4.m3249h(g42Var, "statusBarsIgnoringVisibility");
        this.f34790q = as4.m3249h(g42Var, "systemBarsIgnoringVisibility");
        this.f34791r = as4.m3249h(g42Var, "tappableElementIgnoringVisibility");
        this.f34792s = as4.m3249h(g42Var, "imeAnimationTarget");
        this.f34793t = as4.m3249h(g42Var, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(C0995R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : 0;
        this.f34794u = zBooleanValue;
        k42 k42Var = new k42(!zBooleanValue);
        k42Var.f22857b = this;
        VarHandle.storeStoreFence();
        this.f34796w = k42Var;
        int i = cy4.f16619a;
        w05 w05VarM13834a = zx4.m13834a(view);
        if (w05VarM13834a != null) {
            t05 t05Var = w05VarM13834a.f33012a;
            c0726hiM7374H.m6405f(t05Var.mo7784u(4));
            c0726hiM7374H2.m6405f(t05Var.mo7784u(128));
            c0726hiM7374H3.m6405f(t05Var.mo7784u(8));
            c0726hiM7374H4.m6405f(t05Var.mo7784u(32));
            c0726hiM7374H5.m6405f(t05Var.mo7784u(2));
            c0726hiM7374H6.m6405f(t05Var.mo7784u(1));
            c0726hiM7374H7.m6405f(t05Var.mo7784u(519));
            c0726hiM7374H8.m6405f(t05Var.mo7784u(16));
            c0726hiM7374H9.m6405f(t05Var.mo7784u(64));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m12812b(y05 y05Var, w05 w05Var) {
        Path cutoutPath;
        boolean z = false;
        y05Var.f34774a.m6406g(w05Var, 0);
        y05Var.f34776c.m6406g(w05Var, 0);
        y05Var.f34775b.m6406g(w05Var, 0);
        y05Var.f34778e.m6406g(w05Var, 0);
        y05Var.f34779f.m6406g(w05Var, 0);
        y05Var.f34780g.m6406g(w05Var, 0);
        y05Var.f34781h.m6406g(w05Var, 0);
        y05Var.f34782i.m6406g(w05Var, 0);
        y05Var.f34777d.m6406g(w05Var, 0);
        y05Var.f34787n.m9321f(as4.m3240S(w05Var.f33012a.mo7778j(4)));
        y05Var.f34788o.m9321f(as4.m3240S(w05Var.f33012a.mo7778j(2)));
        y05Var.f34789p.m9321f(as4.m3240S(w05Var.f33012a.mo7778j(1)));
        y05Var.f34790q.m9321f(as4.m3240S(w05Var.f33012a.mo7778j(519)));
        y05Var.f34791r.m9321f(as4.m3240S(w05Var.f33012a.mo7778j(64)));
        m01 m01VarMo8475h = w05Var.f33012a.mo8475h();
        y05Var.f34783j.m9321f(as4.m3240S(m01VarMo8475h != null ? g42.m5899b(m01VarMo8475h.f24510a.getWaterfallInsets()) : g42.f19605e));
        y05Var.f34784k.setValue((m01VarMo8475h == null || (cutoutPath = m01VarMo8475h.f24510a.getCutoutPath()) == null) ? null : new C0489bf(cutoutPath));
        synchronized (k94.f23012c) {
            mw2 mw2Var = k94.f23019j.f29681h;
            if (mw2Var != null && mw2Var.m8416h()) {
                z = true;
            }
        }
        if (z) {
            k94.m7446c();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12813a(View view) {
        if (this.f34795v == 0) {
            k42 k42Var = this.f34796w;
            k42Var.f22858c = false;
            k42Var.f22859d = false;
            k42Var.f22860e = null;
            int i = cy4.f16619a;
            yx4.m13270a(view, k42Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(k42Var);
            wd3.m12235n(view, k42Var);
        }
        this.f34795v++;
    }
}
