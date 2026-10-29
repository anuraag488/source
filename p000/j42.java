package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsetsAnimation;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j42 extends b05 implements Runnable, k33, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b */
    public boolean f21997b;

    /* JADX INFO: renamed from: c */
    public int f21998c;

    /* JADX INFO: renamed from: d */
    public w05 f21999d;

    /* JADX INFO: renamed from: e */
    public lw2 f22000e;

    /* JADX INFO: renamed from: f */
    public a83 f22001f;

    /* JADX INFO: renamed from: g */
    public cw2 f22002g;

    /* JADX INFO: renamed from: h */
    public w94 f22003h;

    @Override // p000.b05
    /* JADX INFO: renamed from: a */
    public final void mo3390a(d05 d05Var) {
        boolean z = false;
        this.f21997b = false;
        int typeMask = ((WindowInsetsAnimation) d05Var.f16688a.f33259b).getTypeMask();
        this.f21998c &= ~typeMask;
        this.f21999d = null;
        a15 a15Var = (a15) c15.f15756a.m8197b(typeMask);
        if (a15Var != null) {
            p15 p15Var = (p15) this.f22000e.m8132g(a15Var);
            p15Var.f27297c.m13400i(0.0f);
            p15Var.f27299e.m13400i(1.0f);
            p15Var.f27298d.m3513i(0L);
            p15Var.f27297c.m13400i(0.0f);
            p15Var.f27296b.setValue(Boolean.FALSE);
            p15Var.f27304j = -1L;
            p15Var.f27305k = -1L;
            a83 a83Var = this.f22001f;
            a83Var.m133i(a83Var.m132h() + 1);
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
    }

    @Override // p000.k33
    /* JADX INFO: renamed from: b */
    public final w05 mo3601b(w05 w05Var) {
        if (this.f21997b) {
            this.f21999d = w05Var;
            return w05Var;
        }
        if (this.f21998c == 0) {
            m7000f(w05Var);
        }
        return w05Var;
    }

    @Override // p000.b05
    /* JADX INFO: renamed from: c */
    public final void mo3391c(d05 d05Var) {
        this.f21997b = true;
    }

    @Override // p000.b05
    /* JADX INFO: renamed from: d */
    public final w05 mo3392d(w05 w05Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            d05 d05Var = (d05) list.get(i);
            a15 a15Var = (a15) c15.f15756a.m8197b(((WindowInsetsAnimation) d05Var.f16688a.f33259b).getTypeMask());
            if (a15Var != null) {
                p15 p15Var = (p15) this.f22000e.m8132g(a15Var);
                if (((Boolean) p15Var.f27296b.getValue()).booleanValue()) {
                    wd3 wd3Var = d05Var.f16688a;
                    WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) wd3Var.f33259b;
                    WindowInsetsAnimation windowInsetsAnimation2 = (WindowInsetsAnimation) wd3Var.f33259b;
                    p15Var.f27297c.m13400i(windowInsetsAnimation.getInterpolatedFraction());
                    p15Var.f27299e.m13400i(windowInsetsAnimation2.getAlpha());
                    p15Var.f27298d.m3513i(windowInsetsAnimation2.getDurationMillis());
                }
            }
        }
        m7000f(w05Var);
        return w05Var;
    }

    @Override // p000.b05
    /* JADX INFO: renamed from: e */
    public final yg3 mo3393e(d05 d05Var, yg3 yg3Var) {
        w05 w05Var = this.f21999d;
        boolean z = false;
        this.f21997b = false;
        this.f21999d = null;
        if (((WindowInsetsAnimation) d05Var.f16688a.f33259b).getDurationMillis() > 0 && w05Var != null) {
            int typeMask = ((WindowInsetsAnimation) d05Var.f16688a.f33259b).getTypeMask();
            this.f21998c |= typeMask;
            a15 a15Var = (a15) c15.f15756a.m8197b(typeMask);
            if (a15Var != null) {
                p15 p15Var = (p15) this.f22000e.m8132g(a15Var);
                g42 g42VarMo7777i = w05Var.f33012a.mo7777i(typeMask);
                long j = (((long) g42VarMo7777i.f19606a) << 48) | (((long) g42VarMo7777i.f19607b) << 32) | (((long) g42VarMo7777i.f19608c) << 16) | ((long) g42VarMo7777i.f19609d);
                long j2 = p15Var.f27302h;
                if (!gq6.m6094s(j, j2)) {
                    p15Var.f27304j = j2;
                    p15Var.f27305k = j;
                    p15Var.f27296b.setValue(Boolean.TRUE);
                    wd3 wd3Var = d05Var.f16688a;
                    p15Var.f27297c.m13400i(((WindowInsetsAnimation) wd3Var.f33259b).getInterpolatedFraction());
                    p15Var.f27299e.m13400i(((WindowInsetsAnimation) wd3Var.f33259b).getAlpha());
                    p15Var.f27298d.m3513i(((WindowInsetsAnimation) wd3Var.f33259b).getDurationMillis());
                    a83 a83Var = this.f22001f;
                    a83Var.m133i(a83Var.m132h() + 1);
                    synchronized (k94.f23012c) {
                        mw2 mw2Var = k94.f23019j.f29681h;
                        if (mw2Var != null && mw2Var.m8416h()) {
                            z = true;
                        }
                    }
                    if (z) {
                        k94.m7446c();
                        return yg3Var;
                    }
                }
            }
        }
        return yg3Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m7000f(w05 w05Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        boolean z5;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        Object[] objArr2;
        int i;
        lv2 lv2Var = c15.f15756a;
        int[] iArr2 = lv2Var.f24666b;
        Object[] objArr3 = lv2Var.f24667c;
        long[] jArr2 = lv2Var.f24665a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j2 = jArr2[i2];
                z = true;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j2 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr2[i6];
                            a15 a15Var = (a15) objArr3[i6];
                            g42 g42VarMo7777i = w05Var.f33012a.mo7777i(i7);
                            long j3 = (((long) g42VarMo7777i.f19606a) << 48) | (((long) g42VarMo7777i.f19607b) << 32) | (((long) g42VarMo7777i.f19608c) << 16) | ((long) g42VarMo7777i.f19609d);
                            p15 p15Var = (p15) this.f22000e.m8132g(a15Var);
                            if (!gq6.m6094s(j3, p15Var.f27302h)) {
                                p15Var.f27302h = j3;
                                z2 = true;
                                if (!gq6.m6094s(j3, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                g42 g42VarMo7778j = w05Var.f33012a.mo7778j(i7);
                                objArr2 = objArr3;
                                long j4 = (((long) g42VarMo7778j.f19607b) << 32) | (((long) g42VarMo7778j.f19606a) << 48) | (((long) g42VarMo7778j.f19608c) << 16) | ((long) g42VarMo7778j.f19609d);
                                if (!gq6.m6094s(p15Var.f27303i, j4)) {
                                    p15Var.f27303i = j4;
                                    z2 = true;
                                    if (!gq6.m6094s(j4, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            p15Var.f27295a.setValue(Boolean.valueOf(w05Var.f33012a.mo7784u(i7)));
                            i = 8;
                        } else {
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j2 >>= i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        m01 m01VarMo8475h = w05Var.f33012a.mo8475h();
        if (m01VarMo8475h == null) {
            j = 0;
        } else {
            g42 g42VarM5899b = g42.m5899b(m01VarMo8475h.f24510a.getWaterfallInsets());
            j = (((long) g42VarM5899b.f19606a) << c3) | (((long) g42VarM5899b.f19607b) << c2) | (((long) g42VarM5899b.f19608c) << c) | ((long) g42VarM5899b.f19609d);
        }
        lw2 lw2Var = this.f22000e;
        a15.f55a.getClass();
        p15 p15Var2 = (p15) lw2Var.m8132g(z05.f35687j);
        p15Var2.f27295a.setValue(Boolean.valueOf(!gq6.m6094s(j, 0L)));
        if (!gq6.m6094s(p15Var2.f27302h, j)) {
            p15Var2.f27302h = j;
            p15Var2.f27303i = j;
            z2 = z;
            if (!gq6.m6094s(j, 0L)) {
                z3 = z2;
            }
        }
        if (m01VarMo8475h == null) {
            cw2 cw2Var = this.f22002g;
            if (cw2Var.f16533b > 0) {
                cw2Var.m4203d();
                this.f22003h.clear();
                z2 = z;
            }
        } else {
            List<Rect> boundingRects = m01VarMo8475h.f24510a.getBoundingRects();
            int size = boundingRects.size();
            cw2 cw2Var2 = this.f22002g;
            if (size < cw2Var2.f16533b) {
                cw2Var2.m4212m(boundingRects.size(), this.f22002g.f16533b);
                this.f22003h.m12170c(boundingRects.size(), this.f22003h.size());
                z2 = z;
            } else {
                int size2 = boundingRects.size() - this.f22002g.f16533b;
                int i8 = 0;
                while (i8 < size2) {
                    cw2 cw2Var3 = this.f22002g;
                    cw2Var3.m4200a(k43.m7398w(boundingRects.get(cw2Var3.f16533b)));
                    this.f22003h.add(se0.m10713b("display cutout rect " + this.f22002g.f16533b));
                    i8++;
                    z2 = z;
                }
            }
            List<Rect> list = boundingRects;
            int size3 = list.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = boundingRects.get(i9);
                sw2 sw2Var = (sw2) this.f22002g.m4206g(i9);
                if (!z62.m13387o(sw2Var.getValue(), rect)) {
                    sw2Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!list.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.f22001f.m132h() != 0) && z2) {
            a83 a83Var = this.f22001f;
            a83Var.m133i(a83Var.m132h() + 1);
            synchronized (k94.f23012c) {
                mw2 mw2Var = k94.f23019j.f29681h;
                z4 = (mw2Var == null || mw2Var.m8416h() != (z5 = z)) ? false : z5;
            }
            if (z4) {
                k94.m7446c();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = cy4.f16619a;
        yx4.m13270a(view, this);
        wd3.m12235n(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = cy4.f16619a;
        yx4.m13270a(view, null);
        view.setWindowInsetsAnimationCallback(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f21997b) {
            this.f21998c = 0;
            this.f21997b = false;
            w05 w05Var = this.f21999d;
            if (w05Var != null) {
                m7000f(w05Var);
                this.f21999d = null;
            }
        }
    }
}
