package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ii0 {

    /* JADX INFO: renamed from: a */
    public final View f21434a;

    /* JADX INFO: renamed from: b */
    public boolean f21435b;

    /* JADX INFO: renamed from: c */
    public ui0 f21436c;

    /* JADX INFO: renamed from: d */
    public lk2 f21437d;

    /* JADX INFO: renamed from: e */
    public av3 f21438e;

    /* JADX INFO: renamed from: f */
    public py4 f21439f;

    /* JADX INFO: renamed from: g */
    public final j12 f21440g;

    /* JADX INFO: renamed from: h */
    public final ro3 f21441h;

    /* JADX INFO: renamed from: i */
    public final Configuration f21442i;

    /* JADX INFO: renamed from: j */
    public final sw2 f21443j;

    /* JADX INFO: renamed from: k */
    public final ig1 f21444k;

    /* JADX INFO: renamed from: l */
    public final ia5 f21445l;

    /* JADX INFO: renamed from: m */
    public final z32 f21446m;

    /* JADX INFO: renamed from: n */
    public final ha0 f21447n;

    /* JADX INFO: renamed from: o */
    public final zl1 f21448o;

    /* JADX INFO: renamed from: p */
    public final sw2 f21449p;

    /* JADX INFO: renamed from: q */
    public final fv1 f21450q;

    /* JADX INFO: renamed from: r */
    public final C1182th f21451r;

    /* JADX INFO: renamed from: s */
    public final yf2 f21452s;

    /* JADX INFO: renamed from: t */
    public final cj2 f21453t;

    /* JADX INFO: renamed from: u */
    public final k70 f21454u;

    /* JADX INFO: renamed from: v */
    public int f21455v;

    /* JADX INFO: renamed from: w */
    public final C1053q f21456w;

    /* JADX INFO: renamed from: x */
    public C1144sg f21457x;

    /* JADX INFO: renamed from: y */
    public final hi0 f21458y;

    public ii0(ii0 ii0Var, View view, ui0 ui0Var, lk2 lk2Var, av3 av3Var, py4 py4Var) {
        j12 j12Var;
        ro3 ro3Var;
        ig1 ig1Var;
        ia5 ia5Var;
        z32 z32Var;
        ha0 ha0Var;
        zl1 wv1Var;
        fv1 fv1Var;
        C1182th c1182th;
        yf2 yf2Var;
        k70 k70Var;
        View view2;
        boolean zM13387o = z62.m13387o((ii0Var == null || (view2 = ii0Var.f21434a) == null) ? null : view2.getContext(), view.getContext());
        this.f21434a = view;
        this.f21436c = ui0Var;
        this.f21437d = lk2Var;
        this.f21438e = av3Var;
        this.f21439f = py4Var;
        if (zM13387o) {
            j12Var = ii0Var.f21440g;
        } else {
            j12Var = new j12();
            j12Var.f21952a = new HashMap();
            VarHandle.storeStoreFence();
        }
        this.f21440g = j12Var;
        if (ii0Var == null || (ro3Var = ii0Var.f21441h) == null) {
            ro3Var = new ro3();
            ro3Var.f29477a = new lv2();
            VarHandle.storeStoreFence();
        }
        this.f21441h = ro3Var;
        Configuration configuration = zM13387o ? ii0Var.f21442i : new Configuration(view.getContext().getResources().getConfiguration());
        this.f21442i = configuration;
        this.f21443j = zM13387o ? ii0Var.f21443j : k43.m7398w(new Configuration(configuration));
        byte b = 28;
        if (zM13387o) {
            ig1Var = ii0Var.f21444k;
        } else {
            Context context = view.getContext();
            ig1Var = new ig1(b);
        }
        this.f21444k = ig1Var;
        if (zM13387o) {
            ia5Var = ii0Var.f21445l;
        } else {
            view.getContext();
            ia5Var = new ia5((byte) 28);
        }
        this.f21445l = ia5Var;
        if (zM13387o) {
            z32Var = ii0Var.f21446m;
        } else {
            Context context2 = view.getContext();
            z32Var = new z32((byte) 3);
            z32Var.f35738b = context2;
            VarHandle.storeStoreFence();
        }
        this.f21446m = z32Var;
        if (zM13387o) {
            ha0Var = ii0Var.f21447n;
        } else {
            C0486bc c0486bc = new C0486bc();
            c0486bc.f15199a = z32Var;
            VarHandle.storeStoreFence();
            ha0Var = c0486bc;
        }
        this.f21447n = ha0Var;
        if (zM13387o) {
            wv1Var = ii0Var.f21448o;
        } else {
            view.getContext();
            wv1Var = new wv1(b);
        }
        this.f21448o = wv1Var;
        this.f21449p = zM13387o ? ii0Var.f21449p : new d83(d24.m4316q(view.getContext()), o85.f26454n);
        if (view == (ii0Var != null ? ii0Var.f21434a : null)) {
            fv1Var = ii0Var.f21450q;
        } else {
            mv1 mv1Var = new mv1((byte) 1);
            mv1Var.f25230b = view;
            VarHandle.storeStoreFence();
            fv1Var = mv1Var;
        }
        this.f21450q = fv1Var;
        if (zM13387o) {
            c1182th = ii0Var.f21451r;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
            C1182th c1182th2 = new C1182th();
            c1182th2.f31159a = viewConfiguration;
            VarHandle.storeStoreFence();
            c1182th = c1182th2;
        }
        this.f21451r = c1182th;
        if (ii0Var == null || (yf2Var = ii0Var.f21452s) == null) {
            j70 j70Var = new j70();
            yf2Var = new yf2();
            yf2Var.f35194a = j70Var;
            VarHandle.storeStoreFence();
        }
        this.f21452s = yf2Var;
        cj2 cj2Var = new cj2();
        cj2Var.f16064c = k43.m7398w(Boolean.FALSE);
        VarHandle.storeStoreFence();
        this.f21453t = cj2Var;
        this.f21454u = (ii0Var == null || (k70Var = ii0Var.f21454u) == null) ? new k70() : k70Var;
        C1053q c1053q = new C1053q((byte) 17);
        c1053q.f28113b = this;
        VarHandle.storeStoreFence();
        this.f21456w = c1053q;
        hi0 hi0Var = new hi0();
        hi0Var.f20595a = this;
        VarHandle.storeStoreFence();
        this.f21458y = hi0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m6805a(ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc, mq1 mq1Var, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(123858079);
        int i2 = i | (ir1Var.m6894i(viewTreeObserverOnGlobalLayoutListenerC1140sc) ? 4 : 2) | (ir1Var.m6894i(mq1Var) ? 32 : 16) | (ir1Var.m6894i(this) ? 256 : 128);
        byte b = 0;
        if (ir1Var.m6871T(i2 & 1, (i2 & 147) != 146)) {
            Object tag = viewTreeObserverOnGlobalLayoutListenerC1140sc.getTag(C0995R.id.inspection_slot_table_set);
            Set set = null;
            Set set2 = (!(tag instanceof Set) || ((tag instanceof cc2) && !(tag instanceof gc2))) ? null : (Set) tag;
            if (set2 == null) {
                Object parent = viewTreeObserverOnGlobalLayoutListenerC1140sc.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(C0995R.id.inspection_slot_table_set) : null;
                if ((tag2 instanceof Set) && (!(tag2 instanceof cc2) || (tag2 instanceof gc2))) {
                    set = (Set) tag2;
                }
            } else {
                set = set2;
            }
            if (set != null) {
                set.add(ir1Var.m6920z());
                ir1Var.f21701q = true;
                ir1Var.f21666C = true;
                ir1Var.f21687c.m8228b();
                ir1Var.f21671H.m8228b();
                p84 p84Var = ir1Var.f21672I;
                m84 m84Var = p84Var.f27433a;
                p84Var.f27437e = m84Var.f24742j;
                p84Var.f27438f = m84Var.f24743k;
            }
            boolean zM6890g = ir1Var.m6890g(viewTreeObserverOnGlobalLayoutListenerC1140sc.getView());
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            Object obj = objM6869O;
            if (zM6890g || objM6869O == i50Var) {
                View view2 = viewTreeObserverOnGlobalLayoutListenerC1140sc.getView();
                ry4 ry4Var = new ry4();
                ry4Var.f29736a = view2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(ry4Var);
                obj = ry4Var;
            }
            ry4 ry4Var2 = (ry4) obj;
            nc4 nc4Var = rm2.f29413a;
            m6809e();
            zh3 zh3VarMo7523a = nc4Var.mo7523a(this.f21437d);
            xh3 xh3Var = xm2.f34419a;
            m6809e();
            zh3 zh3VarMo7523a2 = xh3Var.mo7523a(this.f21438e);
            zh3 zh3VarMo7523a3 = AndroidCompositionLocals_androidKt.f14653d.mo7523a(this.f21440g);
            zh3 zh3VarMo7523a4 = AndroidCompositionLocals_androidKt.f14654e.mo7523a(this.f21441h);
            nc4 nc4Var2 = ij0.f21487v;
            boolean zM6894i = ir1Var.m6894i(this);
            Object objM6869O2 = ir1Var.m6869O();
            Object obj2 = objM6869O2;
            if (zM6894i || objM6869O2 == i50Var) {
                C1127s c1127s = new C1127s((byte) 25);
                c1127s.f29778b = this;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c1127s);
                obj2 = c1127s;
            }
            zh3 zh3VarM12695c = nc4Var2.m12695c((yp1) obj2);
            zh3 zh3VarMo7523a5 = AndroidCompositionLocals_androidKt.f14651b.mo7523a(viewTreeObserverOnGlobalLayoutListenerC1140sc.getContext());
            zh3 zh3VarMo7523a6 = r42.f28997a.mo7523a(set);
            zh3 zh3VarMo7523a7 = AndroidCompositionLocals_androidKt.f14650a.mo7523a(viewTreeObserverOnGlobalLayoutListenerC1140sc.getConfiguration());
            nc4 nc4Var3 = ou3.f27125a;
            boolean zM6894i2 = ir1Var.m6894i(viewTreeObserverOnGlobalLayoutListenerC1140sc);
            Object objM6869O3 = ir1Var.m6869O();
            Object obj3 = objM6869O3;
            if (zM6894i2 || objM6869O3 == i50Var) {
                C0522cc c0522cc = new C0522cc((byte) 3);
                c0522cc.f15920b = viewTreeObserverOnGlobalLayoutListenerC1140sc;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0522cc);
                obj3 = c0522cc;
            }
            zh3 zh3VarM12695c2 = nc4Var3.m12695c((yp1) obj3);
            zh3 zh3VarMo7523a8 = AndroidCompositionLocals_androidKt.f14655f.mo7523a(viewTreeObserverOnGlobalLayoutListenerC1140sc.getView());
            kj0 kj0Var = ij0.f21489x;
            boolean zM6894i3 = ir1Var.m6894i(viewTreeObserverOnGlobalLayoutListenerC1140sc);
            Object objM6869O4 = ir1Var.m6869O();
            Object obj4 = objM6869O4;
            if (zM6894i3 || objM6869O4 == i50Var) {
                C0522cc c0522cc2 = new C0522cc((byte) 4);
                c0522cc2.f15920b = viewTreeObserverOnGlobalLayoutListenerC1140sc;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0522cc2);
                obj4 = c0522cc2;
            }
            zh3[] zh3VarArr = {zh3VarMo7523a, zh3VarMo7523a2, zh3VarMo7523a3, zh3VarMo7523a4, zh3VarM12695c, zh3VarMo7523a5, zh3VarMo7523a6, zh3VarMo7523a7, zh3VarM12695c2, zh3VarMo7523a8, kj0Var.m12695c((yp1) obj4), ij0.f21485t.mo7523a(viewTreeObserverOnGlobalLayoutListenerC1140sc.getViewConfiguration()), jx1.f22711a.mo7523a(ry4Var2)};
            gi0 gi0Var = new gi0(b);
            gi0Var.f19801c = viewTreeObserverOnGlobalLayoutListenerC1140sc;
            gi0Var.f19800b = this;
            gi0Var.f19802d = mq1Var;
            VarHandle.storeStoreFence();
            as4.m3245d(zh3VarArr, vd6.m11834R(1317454175, gi0Var, ir1Var), ir1Var, 56);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            gi0 gi0Var2 = new gi0((byte) 1);
            gi0Var2.f19800b = this;
            gi0Var2.f19801c = viewTreeObserverOnGlobalLayoutListenerC1140sc;
            gi0Var2.f19802d = mq1Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = gi0Var2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6806b() {
        int i = this.f21455v - 1;
        this.f21455v = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            i = 0;
            this.f21455v = 0;
        }
        if (i == 0) {
            View view = this.f21434a;
            Context context = view.getContext();
            hi0 hi0Var = this.f21458y;
            context.unregisterComponentCallbacks(hi0Var);
            cj2 cj2Var = this.f21453t;
            if (cj2Var.f16063b == null) {
                cj2Var.f16062a = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(hi0Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6807c() {
        int i = this.f21455v + 1;
        this.f21455v = i;
        if (i == 1) {
            View view = this.f21434a;
            Context context = view.getContext();
            hi0 hi0Var = this.f21458y;
            context.registerComponentCallbacks(hi0Var);
            m6808d(view.getResources().getConfiguration());
            boolean zHasWindowFocus = view.hasWindowFocus();
            cj2 cj2Var = this.f21453t;
            cj2Var.f16064c.setValue(Boolean.valueOf(zHasWindowFocus));
            d83 d83Var = cj2Var.f16063b;
            C1053q c1053q = this.f21456w;
            if (d83Var == null) {
                cj2Var.f16062a = c1053q;
            }
            if (d83Var != null) {
                d83Var.setValue(c1053q.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(hi0Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6808d(Configuration configuration) {
        int iUpdateFrom = this.f21442i.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.f21440g.f21952a.entrySet().iterator();
            while (it.hasNext()) {
                h12 h12Var = (h12) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (h12Var == null || Configuration.needNewResources(iUpdateFrom, h12Var.f20263b)) {
                    it.remove();
                }
            }
            this.f21443j.setValue(new Configuration(configuration));
            ro3 ro3Var = this.f21441h;
            synchronized (ro3Var) {
                ro3Var.f29477a.m8116c();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                this.f21449p.setValue(d24.m4316q(this.f21434a.getContext()));
            }
            if ((805248384 & iUpdateFrom) != 0) {
                cj2 cj2Var = this.f21453t;
                C1053q c1053q = this.f21456w;
                d83 d83Var = cj2Var.f16063b;
                if (d83Var != null) {
                    d83Var.setValue(c1053q.invoke());
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6809e() {
        if (this.f21435b) {
            return;
        }
        this.f21435b = true;
        ui0 ui0Var = this.f21436c;
        View view = this.f21434a;
        if (ui0Var == null) {
            ui0 ui0VarM8926a = o15.m8926a(view);
            if (ui0VarM8926a == null) {
                Object parent = view.getParent();
                while (ui0VarM8926a == null && (parent instanceof View)) {
                    View view2 = (View) parent;
                    ui0VarM8926a = o15.m8926a(view2);
                    parent = n40.m8506p(view2);
                }
            }
            if (ui0VarM8926a == null) {
                ui0VarM8926a = o15.m8927b(view);
            }
            this.f21436c = ui0VarM8926a;
        }
        if (this.f21437d == null) {
            lk2 lk2VarM13694z = zp0.m13694z(view);
            if (lk2VarM13694z == null) {
                C1077qn.m9989o("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            this.f21437d = lk2VarM13694z;
        }
        if (this.f21438e == null) {
            av3 av3VarM4681D = dt0.m4681D(view);
            if (av3VarM4681D == null) {
                C1077qn.m9989o("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return;
            }
            this.f21438e = av3VarM4681D;
        }
        if (this.f21439f == null) {
            this.f21439f = ev0.m5352b0(view);
        }
    }
}
