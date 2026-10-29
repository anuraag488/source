package p000;

import android.os.Trace;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sl1 extends mt2 implements bj0, y23, pt2, px0 {

    /* JADX INFO: renamed from: o */
    public final boolean f30366o;

    /* JADX INFO: renamed from: p */
    public final mq1 f30367p;

    /* JADX INFO: renamed from: q */
    public boolean f30368q;

    /* JADX INFO: renamed from: r */
    public boolean f30369r;

    /* JADX INFO: renamed from: s */
    public final int f30370s;

    /* JADX INFO: renamed from: t */
    public ku3 f30371t;

    public sl1(int i, mq1 mq1Var, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        mq1Var = (i2 & 4) != 0 ? null : mq1Var;
        this.f30366o = z;
        this.f30367p = mq1Var;
        this.f30370s = i;
    }

    /* JADX INFO: renamed from: X0 */
    public static boolean m10852X0(sl1 sl1Var) {
        return sl1Var.m10861W0(7);
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: D0 */
    public final boolean mo4191D0() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
        bl1 bl1Var;
        int iOrdinal = m10858T0().ordinal();
        if (iOrdinal == 0) {
            bl1Var = (bl1) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(this)).getFocusOwner();
            bl1Var.m3616b(8, true, false);
            if (this.f30366o) {
                bl1Var.f15394a.m10599D();
            }
            bl1Var.f15397d.m12699a();
        } else if (iOrdinal == 1) {
            zk1 focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(this)).getFocusOwner();
            sl1 sl1VarM13844H = zy5.m13844H(this);
            if (sl1VarM13844H != null && sl1VarM13844H.f30366o) {
                bl1 bl1Var2 = (bl1) focusOwner;
                bl1Var2.f15394a.m10599D();
                bl1Var2.f15397d.m12699a();
            }
        } else if (iOrdinal == 2) {
            bl1Var = (bl1) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(this)).getFocusOwner();
            bl1Var.m3616b(8, true, false);
            if (this.f30366o) {
                bl1Var.f15394a.m10599D();
            }
            bl1Var.f15397d.m12699a();
        } else if (iOrdinal != 3) {
            C0670g.m5864c();
            return;
        }
        ku3 ku3Var = this.f30371t;
        if (ku3Var != null) {
            ((tt2) ku3Var).m11145D();
        }
        this.f30371t = null;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: I0 */
    public final void mo6006I0() {
        if (m10858T0().m8794a()) {
            ((bl1) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(this)).getFocusOwner()).m3616b(8, true, true);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m10853O0(int i) {
        int iOrdinal = kx5.m7709g0(this, i).ordinal();
        if (iOrdinal == 0) {
            return kx5.m7711h0(this);
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        C0670g.m5864c();
        return false;
    }

    @Override // p000.y23
    /* JADX INFO: renamed from: P */
    public final void mo4194P() {
        m10859U0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [mt2] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [mt2] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [uw2] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [uw2] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX INFO: renamed from: P0 */
    public final void m10854P0(nl1 nl1Var, nl1 nl1Var2) {
        C0940nb c0940nb;
        mq1 mq1Var;
        bl1 bl1Var = (bl1) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(this)).getFocusOwner();
        sl1 sl1VarM3620f = bl1Var.m3620f();
        if (!nl1Var.equals(nl1Var2) && (mq1Var = this.f30367p) != null) {
            mq1Var.invoke(nl1Var, nl1Var2);
        }
        mt2 mt2Var = this.f25195a;
        if (!mt2Var.f25208n) {
            q32.m9721c("visitAncestors called on an unattached node");
        }
        mt2 mt2Var2 = this.f25195a;
        wf2 wf2VarM10652X = sc6.m10652X(this);
        while (wf2VarM10652X != null) {
            if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 5120) != 0) {
                while (mt2Var2 != null) {
                    int i = mt2Var2.f25197c;
                    if ((i & 5120) != 0) {
                        if (mt2Var2 != mt2Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? M10644P = mt2Var2;
                            ?? uw2Var = 0;
                            while (M10644P != 0) {
                                if (M10644P instanceof nk1) {
                                    nk1 nk1Var = (nk1) M10644P;
                                    if (sl1VarM3620f == bl1Var.m3620f()) {
                                        nk1Var.mo7995Y(nl1Var2);
                                    }
                                } else if ((M10644P.f25197c & 4096) != 0 && (M10644P instanceof qx0)) {
                                    mt2 mt2Var3 = ((qx0) M10644P).f28863p;
                                    int i2 = 0;
                                    M10644P = M10644P;
                                    uw2Var = uw2Var;
                                    while (mt2Var3 != null) {
                                        if ((mt2Var3.f25197c & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                uw2Var = uw2Var;
                                                M10644P = mt2Var3;
                                            } else {
                                                if (uw2Var == 0) {
                                                    uw2Var = new uw2(new mt2[16]);
                                                }
                                                if (M10644P != 0) {
                                                    uw2Var.m11663b(M10644P);
                                                    M10644P = 0;
                                                }
                                                uw2Var.m11663b(mt2Var3);
                                            }
                                        }
                                        mt2Var3 = mt2Var3.f25200f;
                                        M10644P = M10644P;
                                        uw2Var = uw2Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M10644P = sc6.m10644P(uw2Var);
                            }
                        }
                    }
                    mt2Var2 = mt2Var2.f25199e;
                }
            }
            wf2VarM10652X = wf2VarM10652X.m12295v();
            mt2Var2 = (wf2VarM10652X == null || (c0940nb = wf2VarM10652X.f33299G) == null) ? null : (vh4) c0940nb.f25609f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [mt2] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [mt2] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [uw2] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [uw2] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX INFO: renamed from: Q0 */
    public final fl1 m10855Q0() {
        boolean z;
        C0940nb c0940nb;
        fl1 fl1Var = new fl1();
        fl1Var.f19067a = true;
        jl1 jl1Var = jl1.f22391b;
        fl1Var.f19068b = jl1Var;
        fl1Var.f19069c = jl1Var;
        fl1Var.f19070d = jl1Var;
        fl1Var.f19071e = jl1Var;
        fl1Var.f19072f = jl1Var;
        fl1Var.f19073g = jl1Var;
        fl1Var.f19074h = jl1Var;
        fl1Var.f19075i = jl1Var;
        fl1Var.f19076j = new dh0((byte) 29);
        fl1Var.f19077k = new el1((byte) 0);
        fl1Var.f19078l = o85.f26447g;
        int i = this.f30370s;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((b42) ((d42) ((c42) sj3.m10825u(this, ij0.f21478m))).f16776a.getValue()).f15077a == 1);
        } else {
            if (i != 2) {
                C1077qn.m9989o("Unknown Focusability");
                return null;
            }
            z = false;
        }
        fl1Var.f19067a = z;
        mt2 mt2Var = this.f25195a;
        if (!mt2Var.f25208n) {
            q32.m9721c("visitAncestors called on an unattached node");
        }
        mt2 mt2Var2 = this.f25195a;
        wf2 wf2VarM10652X = sc6.m10652X(this);
        loop0: while (wf2VarM10652X != null) {
            if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 3072) != 0) {
                while (mt2Var2 != null) {
                    int i2 = mt2Var2.f25197c;
                    if ((i2 & 3072) != 0) {
                        if (mt2Var2 != mt2Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? uw2Var = 0;
                            ?? M10644P = mt2Var2;
                            while (M10644P != 0) {
                                if (M10644P instanceof hl1) {
                                    ((hl1) M10644P).mo6426W(fl1Var);
                                } else if ((M10644P.f25197c & 2048) != 0 && (M10644P instanceof qx0)) {
                                    mt2 mt2Var3 = ((qx0) M10644P).f28863p;
                                    int i3 = 0;
                                    while (mt2Var3 != null) {
                                        if ((mt2Var3.f25197c & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                M10644P = M10644P;
                                                uw2Var = uw2Var;
                                                uw2Var = uw2Var;
                                                M10644P = mt2Var3;
                                            } else {
                                                if (uw2Var == 0) {
                                                    uw2Var = new uw2(new mt2[16]);
                                                }
                                                if (M10644P != 0) {
                                                    uw2Var.m11663b(M10644P);
                                                    M10644P = 0;
                                                }
                                                uw2Var.m11663b(mt2Var3);
                                            }
                                        } else {
                                            M10644P = M10644P;
                                            uw2Var = uw2Var;
                                        }
                                        mt2Var3 = mt2Var3.f25200f;
                                        M10644P = M10644P;
                                        uw2Var = uw2Var;
                                    }
                                    if (i3 == 1) {
                                        M10644P = M10644P;
                                        uw2Var = uw2Var;
                                    } else {
                                        M10644P = M10644P;
                                        uw2Var = uw2Var;
                                    }
                                }
                                M10644P = sc6.m10644P(uw2Var);
                            }
                        }
                    }
                    mt2Var2 = mt2Var2.f25199e;
                }
            }
            wf2VarM10652X = wf2VarM10652X.m12295v();
            mt2Var2 = (wf2VarM10652X == null || (c0940nb = wf2VarM10652X.f33299G) == null) ? null : (vh4) c0940nb.f25609f;
        }
        return fl1Var;
    }

    /* JADX INFO: renamed from: R0 */
    public final jl3 m10856R0(cf2 cf2Var) {
        jl3 jl3Var = m10855Q0().f19078l;
        if (jl3Var != o85.f26447g) {
            return cf2Var == null ? jl3Var : jl3Var.m7174j(cf2Var.mo4006V(sc6.m10651W(this), 0L, true));
        }
        return cf2Var != null ? cf2Var.mo4003Q(sc6.m10651W(this), false) : AbstractC0647fd.m5672j(0L, z62.m13369a0(sc6.m10651W(this).f16901c));
    }

    /* JADX INFO: renamed from: S0 */
    public final ch2 m10857S0() {
        C0940nb c0940nb;
        Object obj;
        if (!this.f25195a.f25208n) {
            q32.m9721c("visitAncestors called on an unattached node");
        }
        mt2 mt2Var = this.f25195a.f25199e;
        wf2 wf2VarM10652X = sc6.m10652X(this);
        loop0: while (wf2VarM10652X != null) {
            if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 8388640) != 0) {
                while (mt2Var != null) {
                    int i = mt2Var.f25197c;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(mt2Var instanceof ch2)) {
                                if (mt2Var instanceof qx0) {
                                    mt2Var = null;
                                    for (mt2 mt2Var2 = ((qx0) mt2Var).f28863p; mt2Var2 != null; mt2Var2 = mt2Var2.f25200f) {
                                        if (mt2Var2 instanceof ch2) {
                                            mt2Var = mt2Var2;
                                        }
                                    }
                                } else {
                                    mt2Var = null;
                                }
                            }
                            ch2 ch2Var = (ch2) mt2Var;
                            if (ch2Var != null) {
                                return ch2Var;
                            }
                        } else if ((i & 32) == 0) {
                            continue;
                        } else {
                            if (mt2Var instanceof pt2) {
                                obj = mt2Var;
                            } else if (mt2Var instanceof qx0) {
                                obj = null;
                                for (mt2 mt2Var3 = ((qx0) mt2Var).f28863p; mt2Var3 != null; mt2Var3 = mt2Var3.f25200f) {
                                    if (mt2Var3 instanceof pt2) {
                                        obj = mt2Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            pt2 pt2Var = (pt2) obj;
                            if (pt2Var != null && pt2Var.mo9667l().mo6633o(C0638f5.f18751e)) {
                                return (ch2) pt2Var.mo9667l().mo6634u();
                            }
                        }
                    }
                    mt2Var = mt2Var.f25199e;
                }
            }
            wf2VarM10652X = wf2VarM10652X.m12295v();
            mt2Var = (wf2VarM10652X == null || (c0940nb = wf2VarM10652X.f33299G) == null) ? null : (vh4) c0940nb.f25609f;
        }
        return null;
    }

    /* JADX INFO: renamed from: T0 */
    public final nl1 m10858T0() {
        C0940nb c0940nb;
        if (!this.f25208n) {
            return nl1.f25929c;
        }
        sl1 sl1VarM3620f = ((bl1) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(this)).getFocusOwner()).m3620f();
        if (sl1VarM3620f == null) {
            return nl1.f25929c;
        }
        if (this == sl1VarM3620f) {
            return nl1.f25927a;
        }
        if (sl1VarM3620f.f25208n) {
            if (!sl1VarM3620f.f25195a.f25208n) {
                q32.m9721c("visitAncestors called on an unattached node");
            }
            mt2 mt2Var = sl1VarM3620f.f25195a.f25199e;
            wf2 wf2VarM10652X = sc6.m10652X(sl1VarM3620f);
            while (wf2VarM10652X != null) {
                if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 1024) != 0) {
                    while (mt2Var != null) {
                        if ((mt2Var.f25197c & 1024) != 0) {
                            mt2 mt2VarM10644P = mt2Var;
                            uw2 uw2Var = null;
                            while (mt2VarM10644P != null) {
                                if (mt2VarM10644P instanceof sl1) {
                                    if (this == ((sl1) mt2VarM10644P)) {
                                        return nl1.f25928b;
                                    }
                                } else if ((mt2VarM10644P.f25197c & 1024) != 0 && (mt2VarM10644P instanceof qx0)) {
                                    int i = 0;
                                    for (mt2 mt2Var2 = ((qx0) mt2VarM10644P).f28863p; mt2Var2 != null; mt2Var2 = mt2Var2.f25200f) {
                                        if ((mt2Var2.f25197c & 1024) != 0) {
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
        }
        return nl1.f25929c;
    }

    /* JADX INFO: renamed from: U0 */
    public final void m10859U0() {
        int iOrdinal = m10858T0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                C0670g.m5864c();
                return;
            }
        }
        ql3 ql3Var = new ql3();
        C0675g4 c0675g4 = new C0675g4((byte) 28);
        c0675g4.f19600b = ql3Var;
        c0675g4.f19601c = this;
        VarHandle.storeStoreFence();
        c20.m3797B(this, c0675g4);
        Object obj = ql3Var.f28555a;
        if (obj == null) {
            z62.m13366Y("focusProperties");
            throw null;
        }
        if (((cl1) obj).mo4039b()) {
            return;
        }
        ((bl1) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(this)).getFocusOwner()).m3616b(8, true, true);
    }

    /* JADX INFO: renamed from: W0 */
    public final boolean m10861W0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            if (m10855Q0().f19067a) {
                return m10853O0(i);
            }
            C0720hc c0720hc = new C0720hc((byte) 4);
            c0720hc.f20474b = i;
            VarHandle.storeStoreFence();
            return y42.m12860i0(this, i, c0720hc);
        } finally {
            Trace.endSection();
        }
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: G0 */
    public final void mo26G0() {
    }

    /* JADX INFO: renamed from: V0 */
    public final void m10860V0() {
    }
}
