package p000;

import android.graphics.Rect;
import android.view.View;
import java.lang.invoke.VarHandle;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: qe */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1068qe implements yb3 {

    /* JADX INFO: renamed from: a */
    public ej2 f28401a;

    /* JADX INFO: renamed from: b */
    public t82 f28402b;

    /* JADX INFO: renamed from: c */
    public vj2 f28403c;

    /* JADX INFO: renamed from: d */
    public y44 f28404d;

    @Override // p000.yb3
    /* JADX INFO: renamed from: a */
    public final void mo4545a(xk4 xk4Var, l12 l12Var, bh4 bh4Var, zn0 zn0Var) {
        C0869le c0869le = new C0869le((byte) 0);
        c0869le.f23968b = xk4Var;
        c0869le.f23969c = this;
        c0869le.f23970d = l12Var;
        c0869le.f23971e = bh4Var;
        c0869le.f23972f = zn0Var;
        VarHandle.storeStoreFence();
        m9864j(c0869le);
    }

    @Override // p000.yb3
    /* JADX INFO: renamed from: b */
    public final void mo4546b(xk4 xk4Var, vi3 vi3Var, jl4 jl4Var, C1143sf c1143sf, jl3 jl3Var, jl3 jl3Var2) {
        vj2 vj2Var = this.f28403c;
        if (vj2Var != null) {
            fj2 fj2Var = vj2Var.f32680m;
            synchronized (fj2Var.f19026c) {
                try {
                    fj2Var.f19033j = xk4Var;
                    fj2Var.f19035l = vi3Var;
                    fj2Var.f19034k = jl4Var;
                    fj2Var.f19036m = jl3Var;
                    fj2Var.f19037n = jl3Var2;
                    if (fj2Var.f19028e || fj2Var.f19027d) {
                        fj2Var.m5726a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p000.yb3
    /* JADX INFO: renamed from: c */
    public final void mo4547c() {
        m9864j(null);
    }

    @Override // p000.yb3
    /* JADX INFO: renamed from: d */
    public final void mo4548d(xk4 xk4Var, xk4 xk4Var2) {
        vj2 vj2Var = this.f28403c;
        if (vj2Var != null) {
            boolean z = (ql4.m9899c(vj2Var.f32675h.f34342b, xk4Var2.f34342b) && z62.m13387o(vj2Var.f32675h.f34343c, xk4Var2.f34343c)) ? false : true;
            vj2Var.f32675h = xk4Var2;
            int size = vj2Var.f32677j.size();
            for (int i = 0; i < size; i++) {
                gl3 gl3Var = (gl3) ((WeakReference) vj2Var.f32677j.get(i)).get();
                if (gl3Var != null) {
                    gl3Var.f19864g = xk4Var2;
                }
            }
            fj2 fj2Var = vj2Var.f32680m;
            synchronized (fj2Var.f19026c) {
                fj2Var.f19033j = null;
                fj2Var.f19035l = null;
                fj2Var.f19034k = null;
                fj2Var.f19036m = null;
                fj2Var.f19037n = null;
            }
            if (z62.m13387o(xk4Var, xk4Var2)) {
                if (z) {
                    z32 z32Var = vj2Var.f32669b;
                    int iM9903g = ql4.m9903g(xk4Var2.f34342b);
                    int iM9902f = ql4.m9902f(xk4Var2.f34342b);
                    ql4 ql4Var = vj2Var.f32675h.f34343c;
                    int iM9903g2 = ql4Var != null ? ql4.m9903g(ql4Var.f28558a) : -1;
                    ql4 ql4Var2 = vj2Var.f32675h.f34343c;
                    z32Var.m13307C().updateSelection((View) z32Var.f35738b, iM9903g, iM9902f, iM9903g2, ql4Var2 != null ? ql4.m9902f(ql4Var2.f28558a) : -1);
                    return;
                }
                return;
            }
            if (xk4Var != null && (!z62.m13387o(xk4Var.f34341a.f24092b, xk4Var2.f34341a.f24092b) || (ql4.m9899c(xk4Var.f34342b, xk4Var2.f34342b) && !z62.m13387o(xk4Var.f34343c, xk4Var2.f34343c)))) {
                z32 z32Var2 = vj2Var.f32669b;
                z32Var2.m13307C().restartInput((View) z32Var2.f35738b);
                return;
            }
            int size2 = vj2Var.f32677j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                gl3 gl3Var2 = (gl3) ((WeakReference) vj2Var.f32677j.get(i2)).get();
                if (gl3Var2 != null) {
                    xk4 xk4Var3 = vj2Var.f32675h;
                    z32 z32Var3 = vj2Var.f32669b;
                    if (gl3Var2.f19868k) {
                        gl3Var2.f19864g = xk4Var3;
                        if (gl3Var2.f19866i) {
                            z32Var3.m13307C().updateExtractedText((View) z32Var3.f35738b, gl3Var2.f19865h, oh6.m9082G(xk4Var3));
                        }
                        ql4 ql4Var3 = xk4Var3.f34343c;
                        long j = xk4Var3.f34342b;
                        int iM9903g3 = ql4Var3 != null ? ql4.m9903g(ql4Var3.f28558a) : -1;
                        ql4 ql4Var4 = xk4Var3.f34343c;
                        z32Var3.m13307C().updateSelection((View) z32Var3.f35738b, ql4.m9903g(j), ql4.m9902f(j), iM9903g3, ql4Var4 != null ? ql4.m9902f(ql4Var4.f28558a) : -1);
                    }
                }
            }
        }
    }

    @Override // p000.yb3
    /* JADX INFO: renamed from: e */
    public final void mo4549e() {
        ea4 ea4Var;
        ej2 ej2Var = this.f28401a;
        if (ej2Var == null || (ea4Var = (ea4) sj3.m10825u(ej2Var, ij0.f21482q)) == null) {
            return;
        }
        ((ay0) ea4Var).m3366b();
    }

    @Override // p000.yb3
    /* JADX INFO: renamed from: f */
    public final void mo4550f() {
        ea4 ea4Var;
        ej2 ej2Var = this.f28401a;
        if (ej2Var == null || (ea4Var = (ea4) sj3.m10825u(ej2Var, ij0.f21482q)) == null) {
            return;
        }
        ((ay0) ea4Var).m3365a();
    }

    @Override // p000.yb3
    /* JADX INFO: renamed from: g */
    public final void mo4551g() throws Throwable {
        t82 t82Var = this.f28402b;
        if (t82Var != null) {
            t82Var.mo4993a(null);
        }
        this.f28402b = null;
        qw2 qw2VarM9863i = m9863i();
        if (qw2VarM9863i != null) {
            ((y44) qw2VarM9863i).mo196e();
        }
    }

    @Override // p000.yb3
    /* JADX INFO: renamed from: h */
    public final void mo4552h(jl3 jl3Var) {
        Rect rect;
        vj2 vj2Var = this.f28403c;
        if (vj2Var != null) {
            vj2Var.f32679l = new Rect(qq2.m10010E(jl3Var.f22396a), qq2.m10010E(jl3Var.f22397b), qq2.m10010E(jl3Var.f22398c), qq2.m10010E(jl3Var.f22399d));
            if (!vj2Var.f32677j.isEmpty() || (rect = vj2Var.f32679l) == null) {
                return;
            }
            vj2Var.f32668a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    /* JADX INFO: renamed from: i */
    public final qw2 m9863i() {
        y44 y44Var = this.f28404d;
        if (y44Var != null) {
            return y44Var;
        }
        if (!ud4.f31794a) {
            return null;
        }
        y44 y44VarM13332b = z44.m13332b(0, 2, y30.f34834c);
        this.f28404d = y44VarM13332b;
        return y44VarM13332b;
    }

    /* JADX INFO: renamed from: j */
    public final void m9864j(C0869le c0869le) {
        ej2 ej2Var = this.f28401a;
        if (ej2Var == null) {
            return;
        }
        t82 t82VarM7910S = null;
        byte b = 0;
        C1031pe c1031pe = new C1031pe((Object) c0869le, (Object) this, (Object) ej2Var, (wm0) (0 == true ? 1 : 0), (byte) 0);
        if (ej2Var.f25208n) {
            t82VarM7910S = lb5.m7910S(ej2Var.m8391C0(), null, cp0.f16328d, new it1((Object) ej2Var, (Object) c1031pe, (wm0) (b == true ? 1 : 0), (byte) 6), 1);
        }
        this.f28402b = t82VarM7910S;
    }

    /* JADX INFO: renamed from: k */
    public final void m9865k(ej2 ej2Var) {
        ej2 ej2Var2 = this.f28401a;
        if (ej2Var2 != ej2Var) {
            t32.m10970c("Expected textInputModifierNode to be " + ej2Var + " but was " + ej2Var2);
        }
        this.f28401a = null;
    }
}
