package p000;

import android.view.KeyEvent;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rd0 extends AbstractC0892m0 {

    /* JADX INFO: renamed from: K */
    public wp1 f29165K;

    /* JADX INFO: renamed from: L */
    public boolean f29166L;

    /* JADX INFO: renamed from: M */
    public sv2 f29167M;

    /* JADX INFO: renamed from: N */
    public sv2 f29168N;

    /* JADX INFO: renamed from: O */
    public lc3 f29169O;

    /* JADX INFO: renamed from: P */
    public t82 f29170P;

    /* JADX INFO: renamed from: Q */
    public t82 f29171Q;

    /* JADX INFO: renamed from: R */
    public boolean f29172R;

    /* JADX INFO: renamed from: S */
    public boolean f29173S;

    /* JADX INFO: renamed from: T */
    public long f29174T;

    /* JADX INFO: renamed from: U */
    public boolean f29175U;

    /* JADX INFO: renamed from: V */
    public s22 f29176V;

    /* JADX INFO: renamed from: W */
    public t82 f29177W;

    /* JADX INFO: renamed from: X */
    public t82 f29178X;

    /* JADX INFO: renamed from: Y */
    public boolean f29179Y;

    /* JADX INFO: renamed from: Z */
    public boolean f29180Z;

    /* JADX INFO: renamed from: a0 */
    public long f29181a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f29182b0;

    @Override // p000.a32
    /* JADX INFO: renamed from: G */
    public final void mo29G() {
        m10294f1(true);
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: I0 */
    public final void mo6006I0() {
        m10297i1();
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
        byte b = 1;
        int i = 0;
        if (fc3Var != fc3.f18904b) {
            if (fc3Var != fc3.f18905c || this.f29176V == null || this.f29180Z) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                s22 s22Var = (s22) arrayList.get(i);
                if (s22Var.f29839i && s22Var != this.f29176V) {
                    m10294f1(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.f29176V == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (gq6.m6085j((s22) arrayList.get(i2))) {
                    s22 s22Var2 = (s22) arrayList.get(0);
                    s22Var2.f29839i = true;
                    this.f29176V = s22Var2;
                    if (this.f24505v) {
                        t82 t82Var = this.f29178X;
                        wm0 wm0Var = null;
                        if (t82Var != null && t82Var.mo4995b()) {
                            ((fy4) sj3.m10825u(this, ij0.f21485t)).getClass();
                            if (s22Var2.f29832b - this.f29181a0 < 40) {
                                this.f29182b0 = true;
                                return;
                            }
                            this.f29179Y = true;
                            t82 t82Var2 = this.f29178X;
                            if (t82Var2 != null) {
                                t82Var2.mo4993a(null);
                            }
                            this.f29178X = null;
                        }
                        this.f29180Z = false;
                        m8161X0(s22Var2);
                        if (this.f29165K != null) {
                            this.f29177W = lb5.m7910S(m8391C0(), null, null, new qd0(this, wm0Var, b), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.f29180Z) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                s22 s22Var3 = (s22) arrayList.get(i3);
                if (!s22Var3.f29838h || s22Var3.f29834d) {
                    int size4 = arrayList.size();
                    while (i < size4) {
                        ((s22) arrayList.get(i)).f29839i = true;
                        i++;
                    }
                    return;
                }
            }
            s22 s22Var4 = (s22) arrayList.get(0);
            s22Var4.f29839i = true;
            m10295g1(s22Var4.f29832b, this.f29176V);
            return;
        }
        int size5 = arrayList.size();
        for (int i4 = 0; i4 < size5; i4++) {
            s22 s22Var5 = (s22) arrayList.get(i4);
            if (s22Var5.f29839i || !s22Var5.f29838h || s22Var5.f29834d) {
                float fMo5859d = ((fy4) sj3.m10825u(this, ij0.f21485t)).mo5859d();
                int size6 = arrayList.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    s22 s22Var6 = (s22) arrayList.get(i5);
                    boolean z = Math.abs(b33.m3426d(b33.m3429g(s22Var6.f29833c, this.f29176V.f29833c))) > fMo5859d;
                    if (s22Var6.f29839i || z) {
                        m10294f1(true);
                        return;
                    }
                }
                return;
            }
        }
        s22 s22Var7 = (s22) arrayList.get(0);
        s22Var7.f29839i = true;
        m10295g1(s22Var7.f29832b, this.f29176V);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC0892m0, p000.oc3
    /* JADX INFO: renamed from: N */
    public final void mo6964N(ec3 ec3Var, fc3 fc3Var, long j) {
        super.mo6964N(ec3Var, fc3Var, j);
        byte b = 0;
        if (fc3Var != fc3.f18904b) {
            if (fc3Var != fc3.f18905c || this.f29169O == null || this.f29173S) {
                return;
            }
            List list = ec3Var.f18000a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                lc3 lc3Var = (lc3) list.get(i);
                if (lc3Var.m7954c() && lc3Var != this.f29169O) {
                    m10294f1(false);
                    return;
                }
            }
            return;
        }
        wm0 wm0Var = null;
        if (this.f29169O == null) {
            if (fi4.m5721e(ec3Var, true)) {
                lc3 lc3Var2 = (lc3) ec3Var.f18000a.get(0);
                lc3Var2.m7952a();
                this.f29169O = lc3Var2;
                if (this.f24505v) {
                    t82 t82Var = this.f29171Q;
                    if (t82Var != null && t82Var.mo4995b()) {
                        ((fy4) sj3.m10825u(this, ij0.f21485t)).getClass();
                        if (lc3Var2.f23936b - this.f29174T < 40) {
                            this.f29175U = true;
                            return;
                        }
                        this.f29172R = true;
                        t82 t82Var2 = this.f29171Q;
                        if (t82Var2 != null) {
                            t82Var2.mo4993a(null);
                        }
                        this.f29171Q = null;
                    }
                    this.f29173S = false;
                    m8162Y0(lc3Var2);
                    if (this.f29165K != null) {
                        this.f29170P = lb5.m7910S(m8391C0(), null, null, new qd0(this, wm0Var, b == true ? 1 : 0), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        byte b2 = ec3Var.f18002c == 2;
        List list2 = ec3Var.f18000a;
        if (b2 != false && !this.f29173S && this.f24505v && this.f29165K != null) {
            t82 t82Var3 = this.f29170P;
            if (t82Var3 != null) {
                t82Var3.mo4993a(null);
            }
            this.f29170P = null;
            wp1 wp1Var = this.f29165K;
            if (wp1Var != null) {
                wp1Var.invoke();
            }
            if (this.f29166L) {
                ((fv1) sj3.m10825u(this, ij0.f21477l)).mo5818a(0);
            }
            this.f29173S = true;
        }
        if (this.f29173S) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!AbstractC1356y5.m12923q((lc3) list2.get(i2))) {
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((lc3) list2.get(i3)).m7952a();
                    }
                    return;
                }
            }
            lc3 lc3Var3 = (lc3) list2.get(0);
            lc3Var3.m7952a();
            m10296h1(lc3Var3.f23936b, this.f29169O);
            return;
        }
        int size4 = list2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            if (!AbstractC1356y5.m12922p((lc3) list2.get(i4))) {
                long jM8158U0 = m8158U0(j);
                int size5 = list2.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    lc3 lc3Var4 = (lc3) list2.get(i5);
                    if (lc3Var4.m7954c() || AbstractC1356y5.m12895D(lc3Var4, j, jM8158U0)) {
                        m10294f1(false);
                        return;
                    }
                }
                return;
            }
        }
        lc3 lc3Var5 = (lc3) list2.get(0);
        lc3Var5.m7952a();
        m10296h1(lc3Var5.f23936b, this.f29169O);
    }

    @Override // p000.AbstractC0892m0
    /* JADX INFO: renamed from: R0 */
    public final void mo7568R0(q14 q14Var) {
        if (this.f29165K != null) {
            C1053q c1053q = new C1053q((byte) 14);
            c1053q.f28113b = this;
            VarHandle.storeStoreFence();
            ic2[] ic2VarArr = o14.f26289a;
            q14Var.mo4898a(d14.f16706c, new C1353y2(null, c1053q));
        }
    }

    @Override // p000.AbstractC0892m0
    /* JADX INFO: renamed from: a1 */
    public final void mo8164a1() {
        m10297i1();
    }

    @Override // p000.AbstractC0892m0
    /* JADX INFO: renamed from: b1 */
    public final boolean mo8165b1(KeyEvent keyEvent) {
        boolean z;
        sv2 sv2Var = this.f29167M;
        sv2 sv2Var2 = this.f29168N;
        long jM10079D = qs5.m10079D(keyEvent);
        wm0 wm0Var = null;
        if (this.f29165K == null || sv2Var.m10924d(jM10079D) != null) {
            z = false;
        } else {
            sv2Var.m10927g(jM10079D, lb5.m7910S(m8391C0(), null, null, new qd0(this, wm0Var, (byte) 2), 3));
            z = true;
        }
        return z;
    }

    @Override // p000.AbstractC0892m0
    /* JADX INFO: renamed from: c1 */
    public final void mo8166c1(KeyEvent keyEvent) {
        long jM10079D = qs5.m10079D(keyEvent);
        sv2 sv2Var = this.f29167M;
        boolean z = false;
        if (sv2Var.m10924d(jM10079D) != null) {
            t82 t82Var = (t82) sv2Var.m10924d(jM10079D);
            if (t82Var != null) {
                if (t82Var.mo4995b()) {
                    t82Var.mo4993a(null);
                } else {
                    z = true;
                }
            }
            sv2Var.m10926f(jM10079D);
        }
        if (z) {
            return;
        }
        m8167d1();
    }

    /* JADX INFO: renamed from: f1 */
    public final void m10294f1(boolean z) {
        if (z) {
            this.f29176V = null;
            t82 t82Var = this.f29177W;
            if (t82Var != null) {
                t82Var.mo4993a(null);
            }
            this.f29177W = null;
            t82 t82Var2 = this.f29178X;
            if (t82Var2 != null) {
                t82Var2.mo4993a(null);
            }
            this.f29178X = null;
            this.f29179Y = false;
            this.f29180Z = false;
            this.f29181a0 = -1L;
            this.f29182b0 = false;
        } else {
            this.f29169O = null;
            t82 t82Var3 = this.f29170P;
            if (t82Var3 != null) {
                t82Var3.mo4993a(null);
            }
            this.f29170P = null;
            t82 t82Var4 = this.f29171Q;
            if (t82Var4 != null) {
                t82Var4.mo4993a(null);
            }
            this.f29171Q = null;
            this.f29172R = false;
            this.f29173S = false;
            this.f29174T = -1L;
            this.f29175U = false;
        }
        m8159V0(z);
    }

    /* JADX INFO: renamed from: g1 */
    public final void m10295g1(long j, s22 s22Var) {
        if (this.f24505v && !this.f29182b0) {
            m8160W0(s22Var.f29833c, true);
            this.f29181a0 = j;
            if (!this.f29180Z && !this.f29179Y) {
                m8167d1();
            }
        }
        this.f29176V = null;
        this.f29182b0 = false;
        this.f29179Y = false;
        t82 t82Var = this.f29177W;
        if (t82Var != null) {
            t82Var.mo4993a(null);
        }
        this.f29177W = null;
        this.f29180Z = false;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m10296h1(long j, lc3 lc3Var) {
        if (this.f24505v && !this.f29175U) {
            m8160W0(lc3Var.f23937c, false);
            this.f29174T = j;
            if (!this.f29173S && !this.f29172R) {
                m8167d1();
            }
        }
        this.f29169O = null;
        this.f29175U = false;
        this.f29172R = false;
        t82 t82Var = this.f29170P;
        if (t82Var != null) {
            t82Var.mo4993a(null);
        }
        this.f29170P = null;
        this.f29173S = false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x009f A[LOOP:2: B:24:0x0071->B:35:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:36:0x00a2 BREAK  A[LOOP:2: B:24:0x0071->B:35:0x009f], SYNTHETIC] */
    /* JADX INFO: renamed from: i1 */
    public final void m10297i1() {
        char c;
        long j;
        long j2;
        sv2 sv2Var = this.f29167M;
        Object[] objArr = sv2Var.f30591c;
        long[] jArr = sv2Var.f30589a;
        int length = jArr.length - 2;
        char c2 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c2) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            ((t82) objArr[(i << 3) + i3]).mo4993a(null);
                        }
                        j3 >>= 8;
                        i3++;
                        c2 = c2;
                    }
                    c = c2;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c2;
                }
                if (i == length) {
                    break;
                }
                i++;
                c2 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        sv2Var.m10921a();
        sv2 sv2Var2 = this.f29168N;
        Object[] objArr2 = sv2Var2.f30591c;
        long[] jArr2 = sv2Var2.f30589a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i4 != length2) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((pd0) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 != length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        sv2Var2.m10921a();
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
        m10294f1(false);
    }
}
