package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.invoke.VarHandle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dl4 implements yb3 {

    /* JADX INFO: renamed from: a */
    public View f17158a;

    /* JADX INFO: renamed from: b */
    public jp0 f17159b;

    /* JADX INFO: renamed from: c */
    public ExecutorC0646fc f17160c;

    /* JADX INFO: renamed from: d */
    public boolean f17161d;

    /* JADX INFO: renamed from: e */
    public yp1 f17162e;

    /* JADX INFO: renamed from: f */
    public yp1 f17163f;

    /* JADX INFO: renamed from: g */
    public xk4 f17164g;

    /* JADX INFO: renamed from: h */
    public l12 f17165h;

    /* JADX INFO: renamed from: i */
    public ArrayList f17166i;

    /* JADX INFO: renamed from: j */
    public pg2 f17167j;

    /* JADX INFO: renamed from: k */
    public Rect f17168k;

    /* JADX INFO: renamed from: l */
    public ds0 f17169l;

    /* JADX INFO: renamed from: m */
    public uw2 f17170m;

    /* JADX INFO: renamed from: n */
    public RunnableC1054q0 f17171n;

    @Override // p000.yb3
    /* JADX INFO: renamed from: a */
    public final void mo4545a(xk4 xk4Var, l12 l12Var, bh4 bh4Var, zn0 zn0Var) {
        this.f17161d = true;
        this.f17164g = xk4Var;
        this.f17165h = l12Var;
        this.f17162e = bh4Var;
        this.f17163f = zn0Var;
        m4553i(cl4.f16106a);
    }

    @Override // p000.yb3
    /* JADX INFO: renamed from: b */
    public final void mo4546b(xk4 xk4Var, vi3 vi3Var, jl4 jl4Var, C1143sf c1143sf, jl3 jl3Var, jl3 jl3Var2) {
        ds0 ds0Var = this.f17169l;
        synchronized (ds0Var.f17315c) {
            try {
                ds0Var.f17322j = xk4Var;
                ds0Var.f17324l = vi3Var;
                ds0Var.f17323k = jl4Var;
                ds0Var.f17325m = c1143sf;
                ds0Var.f17326n = jl3Var;
                ds0Var.f17327o = jl3Var2;
                if (ds0Var.f17317e || ds0Var.f17316d) {
                    ds0Var.m4664a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.yb3
    /* JADX INFO: renamed from: c */
    public final void mo4547c() {
        m4553i(cl4.f16106a);
    }

    @Override // p000.yb3
    /* JADX INFO: renamed from: d */
    public final void mo4548d(xk4 xk4Var, xk4 xk4Var2) {
        boolean z = (ql4.m9899c(this.f17164g.f34342b, xk4Var2.f34342b) && z62.m13387o(this.f17164g.f34343c, xk4Var2.f34343c)) ? false : true;
        this.f17164g = xk4Var2;
        int size = this.f17166i.size();
        for (int i = 0; i < size; i++) {
            fl3 fl3Var = (fl3) ((WeakReference) this.f17166i.get(i)).get();
            if (fl3Var != null) {
                fl3Var.f19083d = xk4Var2;
            }
        }
        ds0 ds0Var = this.f17169l;
        synchronized (ds0Var.f17315c) {
            ds0Var.f17322j = null;
            ds0Var.f17324l = null;
            ds0Var.f17323k = null;
            ds0Var.f17325m = C1106rf.f29216c;
            ds0Var.f17326n = null;
            ds0Var.f17327o = null;
        }
        if (z62.m13387o(xk4Var, xk4Var2)) {
            if (z) {
                jp0 jp0Var = this.f17159b;
                int iM9903g = ql4.m9903g(xk4Var2.f34342b);
                int iM9902f = ql4.m9902f(xk4Var2.f34342b);
                ql4 ql4Var = this.f17164g.f34343c;
                int iM9903g2 = ql4Var != null ? ql4.m9903g(ql4Var.f28558a) : -1;
                ql4 ql4Var2 = this.f17164g.f34343c;
                ((InputMethodManager) ((pg2) jp0Var.f22482c).getValue()).updateSelection((View) jp0Var.f22481b, iM9903g, iM9902f, iM9903g2, ql4Var2 != null ? ql4.m9902f(ql4Var2.f28558a) : -1);
                return;
            }
            return;
        }
        if (xk4Var != null && (!z62.m13387o(xk4Var.f34341a.f24092b, xk4Var2.f34341a.f24092b) || (ql4.m9899c(xk4Var.f34342b, xk4Var2.f34342b) && !z62.m13387o(xk4Var.f34343c, xk4Var2.f34343c)))) {
            jp0 jp0Var2 = this.f17159b;
            ((InputMethodManager) ((pg2) jp0Var2.f22482c).getValue()).restartInput((View) jp0Var2.f22481b);
            return;
        }
        int size2 = this.f17166i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            fl3 fl3Var2 = (fl3) ((WeakReference) this.f17166i.get(i2)).get();
            if (fl3Var2 != null) {
                xk4 xk4Var3 = this.f17164g;
                jp0 jp0Var3 = this.f17159b;
                if (fl3Var2.f19087h) {
                    fl3Var2.f19083d = xk4Var3;
                    if (fl3Var2.f19085f) {
                        ((InputMethodManager) ((pg2) jp0Var3.f22482c).getValue()).updateExtractedText((View) jp0Var3.f22481b, fl3Var2.f19084e, i20.m6571F(xk4Var3));
                    }
                    ql4 ql4Var3 = xk4Var3.f34343c;
                    long j = xk4Var3.f34342b;
                    int iM9903g3 = ql4Var3 != null ? ql4.m9903g(ql4Var3.f28558a) : -1;
                    ql4 ql4Var4 = xk4Var3.f34343c;
                    ((InputMethodManager) ((pg2) jp0Var3.f22482c).getValue()).updateSelection((View) jp0Var3.f22481b, ql4.m9903g(j), ql4.m9902f(j), iM9903g3, ql4Var4 != null ? ql4.m9902f(ql4Var4.f28558a) : -1);
                }
            }
        }
    }

    @Override // p000.yb3
    /* JADX INFO: renamed from: e */
    public final void mo4549e() {
        m4553i(cl4.f16108c);
    }

    @Override // p000.yb3
    /* JADX INFO: renamed from: f */
    public final void mo4550f() {
        m4553i(cl4.f16109d);
    }

    @Override // p000.yb3
    /* JADX INFO: renamed from: g */
    public final void mo4551g() {
        this.f17161d = false;
        this.f17162e = new r54((byte) 25);
        this.f17163f = new r54((byte) 26);
        this.f17168k = null;
        m4553i(cl4.f16107b);
    }

    @Override // p000.yb3
    /* JADX INFO: renamed from: h */
    public final void mo4552h(jl3 jl3Var) {
        Rect rect;
        this.f17168k = new Rect(qq2.m10010E(jl3Var.f22396a), qq2.m10010E(jl3Var.f22397b), qq2.m10010E(jl3Var.f22398c), qq2.m10010E(jl3Var.f22399d));
        if (!this.f17166i.isEmpty() || (rect = this.f17168k) == null) {
            return;
        }
        this.f17158a.requestRectangleOnScreen(new Rect(rect));
    }

    /* JADX INFO: renamed from: i */
    public final void m4553i(cl4 cl4Var) {
        this.f17170m.m11663b(cl4Var);
        if (this.f17171n == null) {
            RunnableC1054q0 runnableC1054q0 = new RunnableC1054q0((byte) 14);
            runnableC1054q0.f28115b = this;
            VarHandle.storeStoreFence();
            this.f17160c.execute(runnableC1054q0);
            this.f17171n = runnableC1054q0;
        }
    }
}
