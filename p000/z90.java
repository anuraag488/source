package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class z90 extends AbstractC0892m0 {

    /* JADX INFO: renamed from: K */
    public lc3 f35877K;

    /* JADX INFO: renamed from: L */
    public s22 f35878L;

    @Override // p000.a32
    /* JADX INFO: renamed from: G */
    public final void mo29G() {
        m13453f1(true);
    }

    @Override // p000.a32
    /* JADX INFO: renamed from: K */
    public final void mo30K(C0795je c0795je, fc3 fc3Var) {
        ArrayList arrayList = (ArrayList) c0795je.f22194c;
        m8163Z0();
        if (this.f24505v && this.f24509z == null) {
            bs1 bs1Var = new bs1();
            bs1Var.f15546o = this;
            VarHandle.storeStoreFence();
            m10154O0(bs1Var);
            this.f24509z = bs1Var;
        }
        if (fc3Var != fc3.f18904b) {
            if (fc3Var == fc3.f18905c) {
                if (this.f35878L != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        s22 s22Var = (s22) arrayList.get(i);
                        if (s22Var.f29839i && s22Var != this.f35878L) {
                            m13453f1(true);
                            break;
                        }
                    }
                }
                if (z62.m13387o(this.f24490A, "recognized")) {
                    this.f24490A = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.f35878L == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (gq6.m6085j((s22) arrayList.get(i2))) {
                    s22 s22Var2 = (s22) arrayList.get(0);
                    s22Var2.f29839i = true;
                    this.f35878L = s22Var2;
                    if (this.f24505v) {
                        this.f24490A = "waiting";
                        m8161X0(s22Var2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            s22 s22Var3 = (s22) arrayList.get(i3);
            if (s22Var3.f29839i || !s22Var3.f29838h || s22Var3.f29834d) {
                float fMo5859d = ((fy4) sj3.m10825u(this, ij0.f21485t)).mo5859d();
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    s22 s22Var4 = (s22) arrayList.get(i4);
                    boolean z = Math.abs(b33.m3426d(b33.m3429g(s22Var4.f29833c, this.f35878L.f29833c))) > fMo5859d;
                    if (s22Var4.f29839i || z) {
                        m13453f1(true);
                        return;
                    }
                }
                return;
            }
        }
        ((s22) arrayList.get(0)).f29839i = true;
        if (this.f24505v) {
            this.f24490A = "recognized";
            m8160W0(this.f35878L.f29833c, true);
            m8167d1();
        }
        this.f35878L = null;
    }

    @Override // p000.AbstractC0892m0, p000.oc3
    /* JADX INFO: renamed from: N */
    public final void mo6964N(ec3 ec3Var, fc3 fc3Var, long j) {
        super.mo6964N(ec3Var, fc3Var, j);
        if (fc3Var != fc3.f18904b) {
            if (fc3Var == fc3.f18905c) {
                if (this.f35877K != null) {
                    List list = ec3Var.f18000a;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        lc3 lc3Var = (lc3) list.get(i);
                        if (lc3Var.m7954c() && lc3Var != this.f35877K) {
                            m13453f1(false);
                            break;
                        }
                    }
                }
                if (z62.m13387o(this.f24490A, "recognized")) {
                    this.f24490A = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.f35877K == null) {
            if (fi4.m5721e(ec3Var, true)) {
                lc3 lc3Var2 = (lc3) ec3Var.f18000a.get(0);
                lc3Var2.m7952a();
                this.f35877K = lc3Var2;
                if (this.f24505v) {
                    this.f24490A = "waiting";
                    m8162Y0(lc3Var2);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = ec3Var.f18000a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!AbstractC1356y5.m12922p((lc3) list2.get(i2))) {
                long jM8158U0 = m8158U0(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    lc3 lc3Var3 = (lc3) list2.get(i3);
                    if (lc3Var3.m7954c() || AbstractC1356y5.m12895D(lc3Var3, j, jM8158U0)) {
                        m13453f1(false);
                        return;
                    }
                }
                return;
            }
        }
        ((lc3) list2.get(0)).m7952a();
        if (this.f24505v) {
            this.f24490A = "recognized";
            m8160W0(this.f35877K.f23937c, false);
            m8167d1();
        }
        this.f35877K = null;
    }

    /* JADX INFO: renamed from: f1 */
    public final void m13453f1(boolean z) {
        if (z) {
            this.f35878L = null;
        } else {
            this.f35877K = null;
        }
        m8159V0(z);
        this.f24490A = "idle";
    }

    @Override // p000.oc3
    /* JADX INFO: renamed from: j0 */
    public final void mo8143j0() {
        mx1 mx1Var;
        nv2 nv2Var = this.f24500q;
        if (nv2Var != null && (mx1Var = this.f24493D) != null) {
            nv2Var.m8861b(new nx1(mx1Var));
        }
        this.f24493D = null;
        m13453f1(false);
    }
}
