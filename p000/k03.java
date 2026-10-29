package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k03 extends mt2 implements pp4, d03 {

    /* JADX INFO: renamed from: o */
    public d03 f22795o;

    /* JADX INFO: renamed from: p */
    public g03 f22796p;

    /* JADX INFO: renamed from: q */
    public k03 f22797q;

    /* JADX INFO: renamed from: r */
    public final String f22798r;

    public k03(d03 d03Var, g03 g03Var) {
        this.f22795o = d03Var;
        this.f22796p = g03Var == null ? new g03() : g03Var;
        this.f22798r = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: G0 */
    public final void mo26G0() {
        g03 g03Var = this.f22796p;
        g03Var.f19466a = this;
        g03Var.f19467b = null;
        this.f22797q = null;
        g32 g32Var = new g32((byte) 11);
        g32Var.f19558b = this;
        VarHandle.storeStoreFence();
        g03Var.f19468c = g32Var;
        g03Var.f19469d = m8391C0();
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
        ql3 ql3Var = new ql3();
        C0607ec c0607ec = new C0607ec((byte) 3);
        c0607ec.f17957b = ql3Var;
        VarHandle.storeStoreFence();
        dt0.m4696Y(this, c0607ec);
        k03 k03Var = (k03) ((pp4) ql3Var.f28555a);
        this.f22797q = k03Var;
        g03 g03Var = this.f22796p;
        g03Var.f19467b = k03Var;
        if (g03Var.f19466a == this) {
            g03Var.f19466a = null;
            g03Var.f19469d = null;
            g03Var.f19468c = sc6.f30169f;
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final zo0 m7352O0() {
        k03 k03VarM7353P0 = m7353P0();
        zo0 zo0VarM7352O0 = k03VarM7353P0 != null ? k03VarM7353P0.m7352O0() : null;
        if (zo0VarM7352O0 != null && zp0.m13653D(zo0VarM7352O0)) {
            return zo0VarM7352O0;
        }
        zo0 zo0Var = this.f22796p.f19469d;
        if (zo0Var != null) {
            return zo0Var;
        }
        C1077qn.m9989o("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX INFO: renamed from: P0 */
    public final k03 m7353P0() {
        C0940nb c0940nb;
        pp4 pp4Var = null;
        if (!this.f25208n) {
            return null;
        }
        if (!this.f25195a.f25208n) {
            q32.m9721c("visitAncestors called on an unattached node");
        }
        mt2 mt2Var = this.f25195a.f25199e;
        wf2 wf2VarM10652X = sc6.m10652X(this);
        loop0: while (wf2VarM10652X != null) {
            if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 262144) != 0) {
                while (mt2Var != null) {
                    if ((mt2Var.f25197c & 262144) != 0) {
                        mt2 mt2VarM10644P = mt2Var;
                        uw2 uw2Var = null;
                        while (mt2VarM10644P != null) {
                            if (mt2VarM10644P instanceof pp4) {
                                pp4 pp4Var2 = (pp4) mt2VarM10644P;
                                if (z62.m13387o(this.f22798r, pp4Var2.mo3663w()) && k03.class == pp4Var2.getClass()) {
                                    pp4Var = pp4Var2;
                                    break loop0;
                                }
                            }
                            if ((mt2VarM10644P.f25197c & 262144) != 0 && (mt2VarM10644P instanceof qx0)) {
                                int i = 0;
                                for (mt2 mt2Var2 = ((qx0) mt2VarM10644P).f28863p; mt2Var2 != null; mt2Var2 = mt2Var2.f25200f) {
                                    if ((mt2Var2.f25197c & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            mt2VarM10644P = mt2Var2;
                                        } else {
                                            if (uw2Var == null) {
                                                uw2Var = new uw2(new mt2[16]);
                                            }
                                            if (mt2VarM10644P != null) {
                                                uw2Var.m11663b(mt2VarM10644P);
                                                mt2VarM10644P = null;
                                            }
                                            uw2Var.m11663b(mt2Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            mt2VarM10644P = sc6.m10644P(uw2Var);
                        }
                    }
                    mt2Var = mt2Var.f25199e;
                }
            }
            wf2VarM10652X = wf2VarM10652X.m12295v();
            mt2Var = (wf2VarM10652X == null || (c0940nb = wf2VarM10652X.f33299G) == null) ? null : (vh4) c0940nb.f25609f;
        }
        return (k03) pp4Var;
    }

    @Override // p000.d03
    /* JADX INFO: renamed from: Q */
    public final long mo4257Q(long j, int i, long j2) {
        long jMo4257Q = this.f22795o.mo4257Q(j, i, j2);
        k03 k03VarM7353P0 = this.f25208n ? m7353P0() : null;
        return b33.m3430h(jMo4257Q, k03VarM7353P0 != null ? k03VarM7353P0.mo4257Q(b33.m3430h(j, jMo4257Q), i, b33.m3429g(j2, jMo4257Q)) : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // p000.d03
    /* JADX INFO: renamed from: R */
    public final Object mo4258R(long j, long j2, wm0 wm0Var) {
        i03 i03Var;
        long j3;
        long j4;
        long j5;
        long j6;
        if (wm0Var instanceof i03) {
            i03Var = (i03) wm0Var;
            int i = i03Var.f20985x;
            if ((i & Integer.MIN_VALUE) != 0) {
                i03Var.f20985x = i - Integer.MIN_VALUE;
            } else {
                i03Var = new i03(this, (ym0) wm0Var);
            }
        } else {
            i03Var = new i03(this, (ym0) wm0Var);
        }
        i03 i03Var2 = i03Var;
        Object objMo4258R = i03Var2.f20983v;
        ap0 ap0Var = ap0.f14763a;
        int i2 = i03Var2.f20985x;
        k03 k03VarM7353P0 = null;
        if (i2 == 0) {
            k43.m7376J(objMo4258R);
            d03 d03Var = this.f22795o;
            i03Var2.f20981t = j;
            i03Var2.f20982u = j2;
            i03Var2.f20985x = 1;
            objMo4258R = d03Var.mo4258R(j, j2, i03Var2);
            if (objMo4258R != ap0Var) {
                j3 = j2;
            }
            return ap0Var;
        }
        if (i2 == 1) {
            long j7 = i03Var2.f20982u;
            long j8 = i03Var2.f20981t;
            k43.m7376J(objMo4258R);
            j3 = j7;
            j = j8;
        } else {
            if (i2 != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j6 = i03Var2.f20981t;
            k43.m7376J(objMo4258R);
        }
        j5 = ((jx4) objMo4258R).f22730a;
        j4 = j6;
        return jx4.m7330a(jx4.m7335f(j4, j5));
        j4 = ((jx4) objMo4258R).f22730a;
        boolean z = this.f25208n;
        if (!z) {
            k03VarM7353P0 = this.f22797q;
        } else if (z) {
            k03VarM7353P0 = m7353P0();
        }
        d03 d03Var2 = k03VarM7353P0;
        if (d03Var2 != null) {
            long jM7335f = jx4.m7335f(j, j4);
            long jM7334e = jx4.m7334e(j3, j4);
            i03Var2.f20981t = j4;
            i03Var2.f20985x = 2;
            objMo4258R = d03Var2.mo4258R(jM7335f, jM7334e, i03Var2);
            if (objMo4258R != ap0Var) {
                j6 = j4;
                j5 = ((jx4) objMo4258R).f22730a;
                j4 = j6;
            }
            return ap0Var;
        }
        j5 = 0;
        return jx4.m7330a(jx4.m7335f(j4, j5));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r9 == r1) goto L27;
     */
    @Override // p000.d03
    /* JADX INFO: renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo4259Z(long j, wm0 wm0Var) {
        j03 j03Var;
        long j2;
        long j3;
        if (wm0Var instanceof j03) {
            j03Var = (j03) wm0Var;
            int i = j03Var.f21932w;
            if ((i & Integer.MIN_VALUE) != 0) {
                j03Var.f21932w = i - Integer.MIN_VALUE;
            } else {
                j03Var = new j03(this, (ym0) wm0Var);
            }
        } else {
            j03Var = new j03(this, (ym0) wm0Var);
        }
        Object objMo4259Z = j03Var.f21930u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = j03Var.f21932w;
        if (i2 != 0) {
            if (i2 == 1) {
                j = j03Var.f21929t;
                k43.m7376J(objMo4259Z);
            } else {
                if (i2 != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = j03Var.f21929t;
                k43.m7376J(objMo4259Z);
            }
            return jx4.m7330a(jx4.m7335f(j3, ((jx4) objMo4259Z).f22730a));
        }
        k43.m7376J(objMo4259Z);
        k03 k03VarM7353P0 = this.f25208n ? m7353P0() : null;
        if (k03VarM7353P0 != null) {
            j03Var.f21929t = j;
            j03Var.f21932w = 1;
            objMo4259Z = k03VarM7353P0.mo4259Z(j, j03Var);
        } else {
            j2 = 0;
            d03 d03Var = this.f22795o;
            long jM7334e = jx4.m7334e(j, j2);
            j03Var.f21929t = j2;
            j03Var.f21932w = 2;
            objMo4259Z = d03Var.mo4259Z(jM7334e, j03Var);
            if (objMo4259Z != ap0Var) {
                j3 = j2;
                return jx4.m7330a(jx4.m7335f(j3, ((jx4) objMo4259Z).f22730a));
            }
        }
        return ap0Var;
        j2 = ((jx4) objMo4259Z).f22730a;
        d03 d03Var2 = this.f22795o;
        long jM7334e2 = jx4.m7334e(j, j2);
        j03Var.f21929t = j2;
        j03Var.f21932w = 2;
        objMo4259Z = d03Var2.mo4259Z(jM7334e2, j03Var);
        if (objMo4259Z != ap0Var) {
            j3 = j2;
            return jx4.m7330a(jx4.m7335f(j3, ((jx4) objMo4259Z).f22730a));
        }
        return ap0Var;
    }

    @Override // p000.d03
    /* JADX INFO: renamed from: p0 */
    public final long mo4260p0(int i, long j) {
        k03 k03VarM7353P0 = this.f25208n ? m7353P0() : null;
        long jMo4260p0 = k03VarM7353P0 != null ? k03VarM7353P0.mo4260p0(i, j) : 0L;
        return b33.m3430h(jMo4260p0, this.f22795o.mo4260p0(i, b33.m3429g(j, jMo4260p0)));
    }

    @Override // p000.pp4
    /* JADX INFO: renamed from: w */
    public final Object mo3663w() {
        return this.f22798r;
    }
}
