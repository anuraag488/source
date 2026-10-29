package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class l05 extends t05 {

    /* JADX INFO: renamed from: c */
    public final WindowInsets f23671c;

    /* JADX INFO: renamed from: d */
    public g42[] f23672d;

    /* JADX INFO: renamed from: e */
    public g42 f23673e;

    /* JADX INFO: renamed from: f */
    public w05 f23674f;

    /* JADX INFO: renamed from: g */
    public g42 f23675g;

    /* JADX INFO: renamed from: h */
    public int f23676h;

    /* JADX INFO: renamed from: i */
    public o01 f23677i;

    /* JADX INFO: renamed from: j */
    public int f23678j;

    /* JADX INFO: renamed from: k */
    public int f23679k;

    /* JADX INFO: renamed from: l */
    public Rect[][] f23680l;

    /* JADX INFO: renamed from: m */
    public Rect[][] f23681m;

    public l05(w05 w05Var, WindowInsets windowInsets) {
        super(w05Var);
        this.f23673e = null;
        this.f23680l = new Rect[10][];
        this.f23681m = new Rect[10][];
        this.f23671c = windowInsets;
    }

    /* JADX INFO: renamed from: C */
    private o01 m7762C(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f30711a.f33012a.mo7783t()) {
            return o01.m8913a(point.x, point.y, true, 0, 0, 0, 0);
        }
        er3 er3VarM8508r = n40.m8508r(display, 0);
        er3 er3VarM8508r2 = n40.m8508r(display, 1);
        er3 er3VarM8508r3 = n40.m8508r(display, 2);
        er3 er3VarM8508r4 = n40.m8508r(display, 3);
        return o01.m8913a(point.x, point.y, false, er3VarM8508r != null ? er3VarM8508r.f18420b : 0, er3VarM8508r2 != null ? er3VarM8508r2.f18420b : 0, er3VarM8508r3 != null ? er3VarM8508r3.f18420b : 0, er3VarM8508r4 != null ? er3VarM8508r4.f18420b : 0);
    }

    /* JADX INFO: renamed from: D */
    private static List<Rect> m7763D(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[qq2.m10036t(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    /* JADX INFO: renamed from: E */
    private Rect[] m7764E(g42 g42Var) {
        ArrayList arrayList = new ArrayList();
        int i = g42Var.f19606a;
        int i2 = g42Var.f19609d;
        int i3 = g42Var.f19608c;
        int i4 = g42Var.f19607b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, g42Var.f19606a, this.f23678j));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.f23679k, i4));
        }
        if (i3 != 0) {
            int i5 = this.f23679k;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.f23678j));
        }
        if (i2 != 0) {
            int i6 = this.f23678j;
            arrayList.add(new Rect(0, i6 - i2, this.f23679k, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    /* JADX INFO: renamed from: F */
    private g42 m7765F(int i, boolean z) {
        g42 g42VarM5898a = g42.f19605e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                g42 g42VarM7771G = m7771G(i2, z);
                g42VarM5898a = g42.m5898a(Math.max(g42VarM5898a.f19606a, g42VarM7771G.f19606a), Math.max(g42VarM5898a.f19607b, g42VarM7771G.f19607b), Math.max(g42VarM5898a.f19608c, g42VarM7771G.f19608c), Math.max(g42VarM5898a.f19609d, g42VarM7771G.f19609d));
            }
        }
        return g42VarM5898a;
    }

    /* JADX INFO: renamed from: H */
    private g42 m7766H() {
        w05 w05Var = this.f23674f;
        return w05Var != null ? w05Var.f33012a.mo8171l() : g42.f19605e;
    }

    /* JADX INFO: renamed from: I */
    private g42 m7767I(View view) {
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    /* JADX INFO: renamed from: K */
    public static boolean m7768K(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: A */
    public void mo7769A(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f23680l = (Rect[][]) rectArr.clone();
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: B */
    public void mo7770B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f23681m = (Rect[][]) rectArr.clone();
    }

    /* JADX INFO: renamed from: G */
    public g42 m7771G(int i, boolean z) {
        g42 g42VarMo8171l;
        int i2;
        g42 g42Var = g42.f19605e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    g42[] g42VarArr = this.f23672d;
                    g42VarMo8171l = g42VarArr != null ? g42VarArr[qq2.m10036t(8)] : null;
                    if (g42VarMo8171l != null) {
                        return g42VarMo8171l;
                    }
                    g42 g42VarMo7779n = mo7779n();
                    g42 g42VarM7766H = m7766H();
                    int i3 = g42VarMo7779n.f19609d;
                    if (i3 > g42VarM7766H.f19609d) {
                        return g42.m5898a(0, 0, 0, i3);
                    }
                    g42 g42Var2 = this.f23675g;
                    if (g42Var2 != null && !g42Var2.equals(g42Var) && (i2 = this.f23675g.f19609d) > g42VarM7766H.f19609d) {
                        return g42.m5898a(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return mo8915m();
                    }
                    if (i == 32) {
                        return mo8914k();
                    }
                    if (i == 64) {
                        return mo8916o();
                    }
                    if (i == 128) {
                        w05 w05Var = this.f23674f;
                        m01 m01VarMo8475h = w05Var != null ? w05Var.f33012a.mo8475h() : mo8475h();
                        if (m01VarMo8475h != null) {
                            DisplayCutout displayCutout = m01VarMo8475h.f24510a;
                            return g42.m5898a(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                        }
                    }
                }
            } else {
                if (z) {
                    g42 g42VarM7766H2 = m7766H();
                    g42 g42VarMo8171l2 = mo8171l();
                    return g42.m5898a(Math.max(g42VarM7766H2.f19606a, g42VarMo8171l2.f19606a), 0, Math.max(g42VarM7766H2.f19608c, g42VarMo8171l2.f19608c), Math.max(g42VarM7766H2.f19609d, g42VarMo8171l2.f19609d));
                }
                if ((this.f23676h & 2) == 0) {
                    g42 g42VarMo7779n2 = mo7779n();
                    w05 w05Var2 = this.f23674f;
                    g42VarMo8171l = w05Var2 != null ? w05Var2.f33012a.mo8171l() : null;
                    int iMin = g42VarMo7779n2.f19609d;
                    if (g42VarMo8171l != null) {
                        iMin = Math.min(iMin, g42VarMo8171l.f19609d);
                    }
                    return g42.m5898a(g42VarMo7779n2.f19606a, 0, g42VarMo7779n2.f19608c, iMin);
                }
            }
        } else {
            if (z) {
                return g42.m5898a(0, Math.max(m7766H().f19607b, mo7779n().f19607b), 0, 0);
            }
            if ((this.f23676h & 4) == 0) {
                return g42.m5898a(0, mo7779n().f19607b, 0, 0);
            }
        }
        return g42Var;
    }

    /* JADX INFO: renamed from: J */
    public boolean m7772J(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !m7771G(i, false).equals(g42.f19605e);
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: d */
    public void mo7773d(View view) {
        this.f23679k = view.getWidth();
        this.f23678j = view.getHeight();
        g42 g42VarM7767I = m7767I(view);
        if (g42VarM7767I == null) {
            g42VarM7767I = g42.f19605e;
        }
        mo7787x(g42VarM7767I);
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: e */
    public void mo7774e(w05 w05Var) {
        w05Var.f33012a.mo7788y(this.f23674f);
        g42 g42Var = this.f23675g;
        t05 t05Var = w05Var.f33012a;
        t05Var.mo7787x(g42Var);
        t05Var.mo7789z(this.f23676h);
        t05Var.mo7785v(this.f23677i);
        t05Var.mo7769A(this.f23680l);
        t05Var.mo7770B(this.f23681m);
    }

    @Override // p000.t05
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        l05 l05Var = (l05) obj;
        return Objects.equals(this.f23675g, l05Var.f23675g) && m7768K(this.f23676h, l05Var.f23676h);
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: f */
    public List<Rect> mo7775f(int i) {
        return m7763D(this.f23680l, i);
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: g */
    public List<Rect> mo7776g(int i) {
        return m7763D(this.f23681m, i);
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: i */
    public g42 mo7777i(int i) {
        return m7765F(i, false);
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: j */
    public g42 mo7778j(int i) {
        return m7765F(i, true);
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: n */
    public final g42 mo7779n() {
        g42 g42Var = this.f23673e;
        if (g42Var != null) {
            return g42Var;
        }
        WindowInsets windowInsets = this.f23671c;
        g42 g42VarM5898a = g42.m5898a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.f23673e = g42VarM5898a;
        return g42VarM5898a;
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: p */
    public void mo7780p(View view) {
        this.f23677i = m7762C(view);
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: q */
    public void mo7781q() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iM10036t = qq2.m10036t(i);
            this.f23680l[iM10036t] = m7764E(mo7777i(i));
            if (i != 8) {
                this.f23681m[iM10036t] = m7764E(mo7778j(i));
            }
        }
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: r */
    public w05 mo7782r(int i, int i2, int i3, int i4) {
        k05 h05Var;
        w05 w05VarM12042c = w05.m12042c(null, this.f23671c);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            h05Var = new j05(w05VarM12042c);
        } else if (i5 >= 35) {
            h05Var = new i05(w05VarM12042c);
        } else {
            h05Var = i5 >= 34 ? new h05(w05VarM12042c) : new g05(w05VarM12042c);
        }
        h05Var.mo4839e(w05.m12041a(mo7779n(), i, i2, i3, i4));
        h05Var.mo4838d(w05.m12041a(mo8171l(), i, i2, i3, i4));
        return h05Var.mo4837b();
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: t */
    public boolean mo7783t() {
        return this.f23671c.isRound();
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: u */
    public boolean mo7784u(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !m7772J(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: v */
    public void mo7785v(o01 o01Var) {
        this.f23677i = o01Var;
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: w */
    public void mo7786w(g42[] g42VarArr) {
        this.f23672d = g42VarArr;
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: x */
    public void mo7787x(g42 g42Var) {
        this.f23675g = g42Var;
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: y */
    public void mo7788y(w05 w05Var) {
        this.f23674f = w05Var;
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: z */
    public void mo7789z(int i) {
        this.f23676h = i;
    }

    public l05(w05 w05Var, l05 l05Var) {
        this(w05Var, new WindowInsets(l05Var.f23671c));
    }
}
