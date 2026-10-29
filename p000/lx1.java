package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class lx1 extends mt2 implements pp4, oc3, bj0 {

    /* JADX INFO: renamed from: o */
    public u11 f24432o;

    /* JADX INFO: renamed from: p */
    public jc3 f24433p;

    /* JADX INFO: renamed from: q */
    public boolean f24434q;

    public lx1(C0796jf c0796jf, u11 u11Var) {
        this.f24432o = u11Var;
        this.f24433p = c0796jf;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
        m8142S0();
    }

    @Override // p000.oc3
    /* JADX INFO: renamed from: N */
    public final void mo6964N(ec3 ec3Var, fc3 fc3Var, long j) {
        if (fc3Var == fc3.f18904b) {
            List list = ec3Var.f18000a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (mo8141R0(((lc3) list.get(i)).f23943i)) {
                    int i2 = ec3Var.f18005f;
                    if (i2 == 4) {
                        this.f24434q = true;
                        m8140Q0();
                        return;
                    } else {
                        if (i2 == 5) {
                            m8142S0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m8139O0() {
        jc3 jc3Var;
        ql3 ql3Var = new ql3();
        el1 el1Var = new el1((byte) 4);
        VarHandle.storeStoreFence();
        dt0.m4696Y(this, el1Var);
        lx1 lx1Var = (lx1) ql3Var.f28555a;
        if (lx1Var == null || (jc3Var = lx1Var.f24433p) == null) {
            jc3Var = this.f24433p;
        }
        mo6748P0(jc3Var);
    }

    /* JADX INFO: renamed from: P0 */
    public void mo6748P0(jc3 jc3Var) {
        kc3 kc3Var = (kc3) sj3.m10825u(this, ij0.f21488w);
        if (kc3Var != null) {
            ((C0978oc) kc3Var).f26545a = jc3Var;
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m8140Q0() {
        ml3 ml3Var = new ml3();
        ml3Var.f25002a = true;
        w11 w11Var = new w11((byte) 1);
        w11Var.f33019b = ml3Var;
        VarHandle.storeStoreFence();
        dt0.m4698a0(this, w11Var);
        if (ml3Var.f25002a) {
            m8139O0();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public boolean mo8141R0(int i) {
        return (i == 3 || i == 4) ? false : true;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m8142S0() {
        if (this.f24434q) {
            this.f24434q = false;
            if (this.f25208n) {
                ql3 ql3Var = new ql3();
                C0607ec c0607ec = new C0607ec((byte) 2);
                c0607ec.f17957b = ql3Var;
                VarHandle.storeStoreFence();
                dt0.m4696Y(this, c0607ec);
                lx1 lx1Var = (lx1) ql3Var.f28555a;
                if (lx1Var != null) {
                    lx1Var.m8139O0();
                } else {
                    mo6748P0(null);
                }
            }
        }
    }

    @Override // p000.oc3
    /* JADX INFO: renamed from: j0 */
    public final void mo8143j0() {
        m8142S0();
    }

    @Override // p000.oc3
    /* JADX INFO: renamed from: y */
    public final long mo8144y() {
        if (this.f24432o == null) {
            return io4.f21607a;
        }
        ky0 ky0Var = sc6.m10652X(this).f33336z;
        int i = io4.f21608b;
        return i20.m6601z(ky0Var.mo3579U(10.0f), ky0Var.mo3579U(40.0f), ky0Var.mo3579U(10.0f), ky0Var.mo3579U(40.0f));
    }
}
