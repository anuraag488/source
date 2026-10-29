package p000;

import android.graphics.Paint;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class of2 extends e13 {

    /* JADX INFO: renamed from: i0 */
    public static final C1253ve f26670i0;

    /* JADX INFO: renamed from: e0 */
    public lf2 f26671e0;

    /* JADX INFO: renamed from: f0 */
    public kl0 f26672f0;

    /* JADX INFO: renamed from: g0 */
    public mf2 f26673g0;

    /* JADX INFO: renamed from: h0 */
    public C0878ln f26674h0;

    static {
        C1253ve c1253veM3810e = c20.m3810e();
        c1253veM3810e.m11881k(pb0.f27499f);
        ((Paint) c1253veM3810e.f32549b).setStrokeWidth(1.0f);
        c1253veM3810e.m11885o(1);
        f26670i0 = c1253veM3810e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public of2(wf2 wf2Var, lf2 lf2Var) {
        super(wf2Var);
        this.f26671e0 = lf2Var;
        this.f26673g0 = wf2Var.f33319i != null ? new mf2(this) : null;
        this.f26674h0 = (((mt2) lf2Var).f25195a.f25197c & 512) != 0 ? new C0878ln(this, (m20) lf2Var) : null;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x019e  */
    /* JADX INFO: renamed from: C1 */
    public final void m9056C1() {
        e13 e13Var;
        e13 e13Var2;
        boolean z;
        w52 w52Var;
        long j;
        long jMo4006V;
        long j2;
        jl3 jl3Var;
        e13 e13Var3;
        of2 of2Var = this;
        if (of2Var.f30440n) {
            return;
        }
        of2Var.m4883l1();
        e13 e13Var4 = of2Var.f17628x;
        C0878ln c0878ln = of2Var.f26674h0;
        if (c0878ln != null) {
            m20 m20Var = c0878ln.f24188b;
            n20 n20Var = m20Var.f24588s;
            zo2 zo2Var = m20Var.f24584o;
            zo0 zo0VarM8391C0 = m20Var.m8391C0();
            boolean z2 = m20Var.f24587r;
            ry2 ry2Var = m20Var.f24585p;
            n20Var.getClass();
            cf2 cf2VarMo3948b = of2Var.f30442p.mo3948b();
            if (cf2VarMo3948b != null) {
                cf2 cf2VarMo3109b = zo2Var.mo3109b();
                if (z2) {
                    List arrayList = n20Var.f25403h;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    cf2 cf2VarMo4012v = cf2VarMo3948b;
                    long jM3429g = 0;
                    int i = 0;
                    while (true) {
                        if (zo2Var.mo3108a(cf2VarMo4012v).equals(cf2VarMo3109b)) {
                            e13Var2 = e13Var4;
                            break;
                        }
                        if (cf2VarMo4012v.mo4010l()) {
                            if (arrayList.size() == i) {
                                arrayList.add(cf2VarMo4012v);
                                cf2 cf2VarMo4011n = cf2VarMo4012v.mo4011n();
                                e13Var3 = e13Var4;
                                jM3429g = b33.m3430h(jM3429g, cf2VarMo4011n != null ? cf2VarMo4011n.mo3998G(cf2VarMo4012v, 0L) : 0L);
                            } else {
                                e13Var3 = e13Var4;
                                if (!z62.m13387o(arrayList.get(i), cf2VarMo4012v)) {
                                    cf2 cf2Var = (cf2) arrayList.get(i);
                                    cf2 cf2VarMo4011n2 = cf2Var.mo4011n();
                                    e13Var2 = e13Var3;
                                    long jM3429g2 = b33.m3429g(jM3429g, cf2VarMo4011n2 != null ? cf2VarMo4011n2.mo3998G(cf2Var, 0L) : 0L);
                                    arrayList.set(i, cf2VarMo4012v);
                                    cf2 cf2VarMo4011n3 = cf2VarMo4012v.mo4011n();
                                    jM3429g = b33.m3430h(jM3429g2, cf2VarMo4011n3 != null ? cf2VarMo4011n3.mo3998G(cf2VarMo4012v, 0L) : 0L);
                                }
                                i++;
                            }
                            e13Var2 = e13Var3;
                            i++;
                        } else {
                            e13Var2 = e13Var4;
                        }
                        cf2VarMo4012v = cf2VarMo4012v.mo4012v();
                        if (cf2VarMo4012v == null) {
                            break;
                        } else {
                            e13Var4 = e13Var2;
                        }
                    }
                    int size = arrayList.size() - 1;
                    if (i <= size) {
                        while (true) {
                            cf2 cf2Var2 = (cf2) arrayList.get(size);
                            cf2 cf2VarMo4011n4 = cf2Var2.mo4011n();
                            jM3429g = b33.m3429g(jM3429g, cf2VarMo4011n4 != null ? cf2VarMo4011n4.mo3998G(cf2Var2, 0L) : 0L);
                            arrayList.remove(arrayList.size() - 1);
                            if (size == i) {
                                break;
                            } else {
                                size--;
                            }
                        }
                    }
                    j = jM3429g;
                    n20Var.f25403h = arrayList;
                } else {
                    e13Var2 = e13Var4;
                    j = 0;
                }
                n20Var.f25404i = b33.m3430h(n20Var.f25404i, j);
                cf2 cf2VarMo3108a = zo2Var.mo3108a(cf2VarMo3109b);
                cf2 cf2VarMo3108a2 = zo2Var.mo3108a(cf2VarMo3948b);
                if (cf2VarMo3108a instanceof vo2) {
                    jMo4006V = ((vo2) cf2VarMo3108a).mo4006V(cf2VarMo3108a2, 0L, false);
                } else {
                    jMo4006V = cf2VarMo3108a2 instanceof vo2 ? ((vo2) cf2VarMo3108a2).mo4006V(cf2VarMo3108a, 0L, false) ^ (-9223372034707292160L) : cf2VarMo3108a.mo4006V(cf2VarMo3108a, 0L, false);
                }
                long jM3430h = b33.m3430h(jMo4006V, n20Var.f25404i);
                if ((n20Var.f25398c & 9223372034707292159L) != 9205357640488583168L) {
                    j2 = 9223372034707292159L;
                    if (!o52.m8956c(y42.m12827F0(jM3430h), y42.m12827F0(n20Var.f25398c))) {
                        n20Var.f25399d = true;
                    }
                } else {
                    j2 = 9223372034707292159L;
                }
                n20Var.f25398c = jM3430h;
                if ((n20Var.f25400e & j2) == 9205357640488583168L) {
                    n20Var.f25400e = jM3430h;
                }
                if ((jM3430h & j2) != 9205357640488583168L) {
                    long j3 = n20Var.f25397b;
                    if (j3 != 9205357640488583168L) {
                        jl3 jl3VarM5672j = AbstractC0647fd.m5672j(jM3430h, j3);
                        C0910mi c0910mi = n20Var.f25396a;
                        if (c0910mi == null) {
                            c0910mi = new C0910mi(jl3VarM5672j, sw4.f30620i, null, 12);
                        }
                        C0910mi c0910mi2 = c0910mi;
                        n20Var.f25396a = c0910mi2;
                        if (n20Var.f25399d) {
                            n20Var.f25399d = false;
                            z = true;
                            w52Var = null;
                            lb5.m7910S(zo0VarM8391C0, null, cp0.f16328d, new C1031pe((Object) c0910mi2, (Object) jl3VarM5672j, (Object) ry2Var, (Object) n20Var, (wm0) null, (byte) 4), 1);
                        } else {
                            z = true;
                            w52Var = null;
                        }
                    } else {
                        z = true;
                        w52Var = null;
                    }
                } else {
                    z = true;
                    w52Var = null;
                }
                C0910mi c0910mi3 = n20Var.f25396a;
                if (c0910mi3 == null || (jl3Var = (jl3) c0910mi3.m8328d()) == null) {
                    jl3Var = jl3.f22395e;
                }
                n20Var.f25402g.setValue(jl3Var.m7174j(n20Var.f25404i ^ (-9223372034707292160L)));
            } else {
                e13Var2 = e13Var4;
                z = true;
                w52Var = null;
            }
            m20Var.f24587r = false;
            if (!n20Var.m8477a() || c0878ln.f24189c) {
                of2Var = this;
                e13Var = e13Var2;
            } else {
                of2Var = this;
                long j4 = of2Var.f16901c;
                mf2 mf2Var = of2Var.f26673g0;
                e13Var = e13Var2;
                if (w52.m12107b(j4, mf2Var != null ? w52.m12106a(mf2Var.m11597N0()) : w52Var)) {
                    long j5 = e13Var.f16901c;
                    uo2 uo2VarMo4869X0 = e13Var.mo4869X0();
                    if (!w52.m12107b(j5, uo2VarMo4869X0 != null ? w52.m12106a(uo2VarMo4869X0.m11597N0()) : w52Var)) {
                    }
                }
                e13Var.f17626v = z;
            }
            z = false;
            e13Var.f17626v = z;
        } else {
            e13Var = e13Var4;
        }
        boolean z3 = e13Var.f30441o;
        e13Var.f30441o = of2Var.f30441o;
        of2Var.mo4855F0().mo4503b();
        e13Var.f30441o = z3;
        e13Var.f17626v = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D1 */
    public final void m9057D1(lf2 lf2Var) {
        if (!lf2Var.equals(this.f26671e0)) {
            if ((((mt2) lf2Var).f25195a.f25197c & 512) != 0) {
                m20 m20Var = (m20) lf2Var;
                C0878ln c0878ln = this.f26674h0;
                if (c0878ln != null) {
                    c0878ln.f24188b = m20Var;
                } else {
                    c0878ln = new C0878ln(this, m20Var);
                }
                this.f26674h0 = c0878ln;
            } else {
                this.f26674h0 = null;
            }
        }
        this.f26671e0 = lf2Var;
    }

    @Override // p000.e13
    /* JADX INFO: renamed from: T0 */
    public final void mo4865T0() {
        if (this.f26673g0 == null) {
            this.f26673g0 = new mf2(this);
        }
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: W */
    public final int mo5823W(int i) {
        C0878ln c0878ln = this.f26674h0;
        if (c0878ln == null) {
            return this.f26671e0.mo5819V(this, this.f17628x, i);
        }
        m20 m20Var = c0878ln.f24188b;
        e13 e13Var = this.f17628x;
        if (!m20Var.f25195a.f25202h.mo4869X0().mo4853D0()) {
            return e13Var.mo5823W(i);
        }
        return m20Var.m8193O0(new C0767in(c0878ln, c0878ln.getLayoutDirection()), new fw0(e13Var, h13.f20264a, i13.f21006a, (byte) 2), ll0.m8010b(0, 0, 0, i, 7)).mo4506g();
    }

    @Override // p000.e13
    /* JADX INFO: renamed from: X0 */
    public final uo2 mo4869X0() {
        return this.f26673g0;
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: Z */
    public final int mo5824Z(int i) {
        C0878ln c0878ln = this.f26674h0;
        if (c0878ln == null) {
            return this.f26671e0.mo5820h(this, this.f17628x, i);
        }
        m20 m20Var = c0878ln.f24188b;
        e13 e13Var = this.f17628x;
        if (!m20Var.f25195a.f25202h.mo4869X0().mo4853D0()) {
            return e13Var.mo5824Z(i);
        }
        return m20Var.m8193O0(new C0767in(c0878ln, c0878ln.getLayoutDirection()), new fw0(e13Var, h13.f20265b, i13.f21006a, (byte) 2), ll0.m8010b(0, 0, 0, i, 7)).mo4506g();
    }

    @Override // p000.e13
    /* JADX INFO: renamed from: Z0 */
    public final mt2 mo4871Z0() {
        return ((mt2) this.f26671e0).f25195a;
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: b0 */
    public final int mo5825b0(int i) {
        C0878ln c0878ln = this.f26674h0;
        if (c0878ln == null) {
            return this.f26671e0.mo4192I(this, this.f17628x, i);
        }
        m20 m20Var = c0878ln.f24188b;
        e13 e13Var = this.f17628x;
        if (!m20Var.f25195a.f25202h.mo4869X0().mo4853D0()) {
            return e13Var.mo5825b0(i);
        }
        return m20Var.m8193O0(new C0767in(c0878ln, c0878ln.getLayoutDirection()), new fw0(e13Var, h13.f20264a, i13.f21007b, (byte) 2), ll0.m8010b(0, i, 0, 0, 13)).mo4504d();
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: e */
    public final db3 mo5826e(long j) {
        long j2;
        yq2 yq2VarMo28e;
        long j3;
        kl0 kl0Var;
        if (this.f17627w) {
            kl0 kl0Var2 = this.f26672f0;
            if (kl0Var2 == null) {
                C1077qn.m9987m("Lookahead constraints cannot be null in approach pass.");
                return null;
            }
            j2 = kl0Var2.f23210a;
        } else {
            j2 = j;
        }
        m4427r0(j2);
        C0878ln c0878ln = this.f26674h0;
        if (c0878ln != null) {
            m20 m20Var = c0878ln.f24188b;
            long jMo6044i = c0878ln.mo6044i();
            n20 n20Var = m20Var.f24588s;
            long jM13369a0 = z62.m13369a0(jMo6044i);
            if (n20Var.f25397b != 9205357640488583168L) {
                j3 = 9205357640488583168L;
                if (!w52.m12108c(z62.m13361T(jM13369a0), z62.m13361T(n20Var.f25397b))) {
                    n20Var.f25399d = true;
                }
            } else {
                j3 = 9205357640488583168L;
            }
            n20Var.f25397b = jM13369a0;
            if (n20Var.f25401f == j3) {
                n20Var.f25401f = jM13369a0;
            }
            boolean z = (n20Var.m8477a() && (kl0Var = this.f26672f0) != null && j2 == kl0Var.f23210a) ? false : true;
            c0878ln.f24189c = z;
            if (!z) {
                this.f17628x.f17627w = true;
            }
            yq2VarMo28e = m20Var.m8193O0(c0878ln, this.f17628x, j2);
            this.f17628x.f17627w = false;
            boolean z2 = yq2VarMo28e.mo4506g() == this.f26673g0.f16899a && yq2VarMo28e.mo4504d() == this.f26673g0.f16900b;
            if (!c0878ln.f24189c) {
                e13 e13Var = this.f17628x;
                long j4 = e13Var.f16901c;
                uo2 uo2VarMo4869X0 = e13Var.mo4869X0();
                if (w52.m12107b(j4, uo2VarMo4869X0 != null ? w52.m12106a(uo2VarMo4869X0.m11597N0()) : null) && !z2) {
                    nf2 nf2Var = new nf2();
                    nf2Var.f25746a = yq2VarMo28e;
                    mf2 mf2Var = this.f26673g0;
                    nf2Var.f25747b = mf2Var.f16899a;
                    nf2Var.f25748c = mf2Var.f16900b;
                    VarHandle.storeStoreFence();
                    yq2VarMo28e = nf2Var;
                }
            }
        } else {
            yq2VarMo28e = this.f26671e0.mo28e(this, this.f17628x, j2);
        }
        m4891t1(yq2VarMo28e);
        m4882k1();
        return this;
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: h */
    public final int mo5827h(int i) {
        C0878ln c0878ln = this.f26674h0;
        if (c0878ln == null) {
            return this.f26671e0.mo4198u(this, this.f17628x, i);
        }
        m20 m20Var = c0878ln.f24188b;
        e13 e13Var = this.f17628x;
        if (!m20Var.f25195a.f25202h.mo4869X0().mo4853D0()) {
            return e13Var.mo5827h(i);
        }
        return m20Var.m8193O0(new C0767in(c0878ln, c0878ln.getLayoutDirection()), new fw0(e13Var, h13.f20265b, i13.f21007b, (byte) 2), ll0.m8010b(0, i, 0, 0, 13)).mo4504d();
    }

    @Override // p000.db3
    /* JADX INFO: renamed from: n0 */
    public final void mo4424n0(long j, float f, yp1 yp1Var) {
        if (this.f17626v) {
            m4888q1(mo4869X0().f32027v, f, yp1Var, null);
        } else {
            m4888q1(j, f, yp1Var, null);
        }
        m9056C1();
    }

    @Override // p000.e13, p000.db3
    /* JADX INFO: renamed from: p0 */
    public final void mo4425p0(long j, float f, bu1 bu1Var) {
        of2 of2Var;
        if (this.f17626v) {
            of2Var = this;
            of2Var.m4888q1(mo4869X0().f32027v, f, null, bu1Var);
        } else {
            of2Var = this;
            of2Var.m4888q1(j, f, null, bu1Var);
        }
        of2Var.m9056C1();
    }

    @Override // p000.e13
    /* JADX INFO: renamed from: p1 */
    public final void mo4887p1(h70 h70Var, bu1 bu1Var) throws Throwable {
        e13 e13Var;
        this.f17628x.m4863R0(h70Var, bu1Var);
        if (!((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(this.f17625u)).getShowLayoutBounds() || (e13Var = this.f17628x) == null) {
            return;
        }
        if (w52.m12108c(this.f16901c, e13Var.f16901c) && o52.m8956c(e13Var.f17609H, 0L)) {
            return;
        }
        long j = this.f16901c;
        h70Var.mo6259p(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f26670i0);
    }

    @Override // p000.so2
    /* JADX INFO: renamed from: u0 */
    public final int mo8294u0(AbstractC0568da abstractC0568da) {
        mf2 mf2Var = this.f26673g0;
        if (mf2Var == null) {
            return y62.m12989q(this, abstractC0568da);
        }
        yv2 yv2Var = mf2Var.f32031z;
        int iM13260d = yv2Var.m13260d(abstractC0568da);
        if (iM13260d >= 0) {
            return yv2Var.f35549c[iM13260d];
        }
        return Integer.MIN_VALUE;
    }
}
