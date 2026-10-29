package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wq2 extends db3 implements sq2, InterfaceC0718ha, iu2 {

    /* JADX INFO: renamed from: A */
    public boolean f33608A;

    /* JADX INFO: renamed from: B */
    public boolean f33609B;

    /* JADX INFO: renamed from: C */
    public long f33610C;

    /* JADX INFO: renamed from: D */
    public vq2 f33611D;

    /* JADX INFO: renamed from: E */
    public vq2 f33612E;

    /* JADX INFO: renamed from: F */
    public float f33613F;

    /* JADX INFO: renamed from: G */
    public boolean f33614G;

    /* JADX INFO: renamed from: H */
    public yp1 f33615H;

    /* JADX INFO: renamed from: I */
    public bu1 f33616I;

    /* JADX INFO: renamed from: J */
    public long f33617J;

    /* JADX INFO: renamed from: K */
    public float f33618K;

    /* JADX INFO: renamed from: L */
    public vq2 f33619L;

    /* JADX INFO: renamed from: M */
    public boolean f33620M;

    /* JADX INFO: renamed from: f */
    public ag2 f33621f;

    /* JADX INFO: renamed from: g */
    public boolean f33622g;

    /* JADX INFO: renamed from: h */
    public int f33623h;

    /* JADX INFO: renamed from: i */
    public int f33624i;

    /* JADX INFO: renamed from: j */
    public boolean f33625j;

    /* JADX INFO: renamed from: k */
    public boolean f33626k;

    /* JADX INFO: renamed from: l */
    public uf2 f33627l;

    /* JADX INFO: renamed from: m */
    public boolean f33628m;

    /* JADX INFO: renamed from: n */
    public long f33629n;

    /* JADX INFO: renamed from: o */
    public yp1 f33630o;

    /* JADX INFO: renamed from: p */
    public bu1 f33631p;

    /* JADX INFO: renamed from: q */
    public float f33632q;

    /* JADX INFO: renamed from: r */
    public boolean f33633r;

    /* JADX INFO: renamed from: s */
    public Object f33634s;

    /* JADX INFO: renamed from: t */
    public boolean f33635t;

    /* JADX INFO: renamed from: u */
    public boolean f33636u;

    /* JADX INFO: renamed from: v */
    public boolean f33637v;

    /* JADX INFO: renamed from: w */
    public boolean f33638w;

    /* JADX INFO: renamed from: x */
    public boolean f33639x;

    /* JADX INFO: renamed from: y */
    public xf2 f33640y;

    /* JADX INFO: renamed from: z */
    public uw2 f33641z;

    @Override // p000.InterfaceC0718ha
    /* JADX INFO: renamed from: B */
    public final void mo6282B() {
        boolean zM12377E0;
        ag2 ag2Var = this.f33621f;
        this.f33609B = true;
        xf2 xf2Var = this.f33640y;
        xf2Var.m12693h();
        if (this.f33638w) {
            uw2 uw2VarM12248A = ag2Var.f14468a.m12248A();
            Object[] objArr = uw2VarM12248A.f32211a;
            int i = uw2VarM12248A.f32213c;
            for (int i2 = 0; i2 < i; i2++) {
                wf2 wf2Var = (wf2) objArr[i2];
                boolean zM12291r = wf2Var.m12291r();
                ag2 ag2Var2 = wf2Var.f33300H;
                if (zM12291r && wf2Var.m12292s() == uf2.f31821a) {
                    wq2 wq2Var = ag2Var2.f14483p;
                    kl0 kl0VarM7531a = wq2Var.f33625j ? kl0.m7531a(wq2Var.f16902d) : null;
                    if (kl0VarM7531a != null) {
                        if (wf2Var.f33296D == uf2.f31823c) {
                            wf2Var.m12277f();
                        }
                        zM12377E0 = ag2Var2.f14483p.m12377E0(kl0VarM7531a.f23210a);
                    } else {
                        zM12377E0 = false;
                    }
                    if (zM12377E0) {
                        wf2.m12245X(ag2Var.f14468a, false, 7);
                    }
                }
            }
        }
        if (this.f33639x || (!this.f33628m && !mo6286u().f30441o && this.f33638w)) {
            this.f33638w = false;
            sf2 sf2Var = ag2Var.f14471d;
            ag2Var.f14471d = sf2.f30228c;
            ag2Var.m2988g(false);
            wf2 wf2Var2 = ag2Var.f14468a;
            u63 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2Var2)).getSnapshotObserver();
            snapshotObserver.f31675a.m159e(wf2Var2, snapshotObserver.f31679e, this.f33612E);
            ag2Var.f14471d = sf2Var;
            this.f33639x = false;
        }
        if (xf2Var.f34228d) {
            xf2Var.f34229e = true;
        }
        if (xf2Var.f34226b && xf2Var.m12690e()) {
            xf2Var.m12692g();
        }
        this.f33609B = false;
    }

    /* JADX INFO: renamed from: C0 */
    public final void m12375C0(long j, float f, yp1 yp1Var, bu1 bu1Var) {
        ag2 ag2Var = this.f33621f;
        wf2 wf2Var = ag2Var.f14468a;
        wf2 wf2Var2 = ag2Var.f14468a;
        if (wf2Var.f33310R) {
            q32.m9719a("place is called on a deactivated node");
        }
        ag2Var.f14471d = sf2.f30228c;
        this.f33629n = j;
        this.f33632q = f;
        this.f33630o = yp1Var;
        this.f33631p = bu1Var;
        this.f33614G = false;
        r63 r63VarM13548a = zf2.m13548a(wf2Var2);
        if (this.f33638w || !this.f33635t) {
            this.f33640y.f34231g = false;
            ag2Var.m2987f(false);
            this.f33615H = yp1Var;
            this.f33617J = j;
            this.f33618K = f;
            this.f33616I = bu1Var;
            u63 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) r63VarM13548a).getSnapshotObserver();
            vq2 vq2Var = this.f33619L;
            snapshotObserver.f31675a.m159e(wf2Var2, snapshotObserver.f31680f, vq2Var);
        } else {
            e13 e13VarM2982a = ag2Var.m2982a();
            e13VarM2982a.m4888q1(o52.m8958e(j, e13VarM2982a.f16903e), f, yp1Var, bu1Var);
            m12383z0();
        }
        ag2Var.f14471d = sf2.f30230e;
        if (ag2Var.m2982a().f30441o && (ag2Var.f14478k || ag2Var.f14477j)) {
            requestLayout();
        }
        this.f33626k = true;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m12376D0(long j, float f, yp1 yp1Var, bu1 bu1Var) throws Throwable {
        cb3 placementScope;
        ag2 ag2Var = this.f33621f;
        wf2 wf2Var = ag2Var.f14468a;
        wf2 wf2Var2 = ag2Var.f14468a;
        try {
            this.f33636u = true;
            if (!o52.m8956c(j, this.f33629n) || yp1Var != this.f33630o || this.f33620M) {
                if (ag2Var.f14478k || ag2Var.f14477j || this.f33620M) {
                    this.f33638w = true;
                    this.f33620M = false;
                }
            }
            yo2 yo2Var = ag2Var.f14484q;
            if (yo2Var != null) {
                ag2 ag2Var2 = yo2Var.f35403f;
                if (yo2Var.f35415r == xo2.f34492c && !qq2.m10039w(ag2Var2.f14468a)) {
                    ag2Var2.f14470c = true;
                }
            }
            yo2 yo2Var2 = ag2Var.f14484q;
            if (yo2Var2 != null && yo2Var2.m13200t0()) {
                e13 e13Var = ag2Var.m2982a().f17629y;
                if (e13Var == null || (placementScope = e13Var.f30442p) == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2Var2)).getPlacementScope();
                }
                yo2 yo2Var3 = ag2Var.f14484q;
                wf2 wf2VarM12295v = wf2Var2.m12295v();
                if (wf2VarM12295v != null) {
                    wf2VarM12295v.f33300H.f14475h = 0;
                }
                yo2Var3.f35406i = Integer.MAX_VALUE;
                placementScope.m3952k(yo2Var3, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            }
            yo2 yo2Var4 = ag2Var.f14484q;
            if (yo2Var4 != null && !yo2Var4.f35409l) {
                q32.m9721c("Error: Placement happened before lookahead.");
            }
            m12375C0(j, f, yp1Var, bu1Var);
        } catch (Throwable th) {
            wf2Var.m12270a0(th);
            throw null;
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m12377E0(long j) throws Throwable {
        ag2 ag2Var = this.f33621f;
        wf2 wf2Var = ag2Var.f14468a;
        wf2 wf2Var2 = ag2Var.f14468a;
        try {
            if (wf2Var.f33310R) {
                q32.m9719a("measure is called on a deactivated node");
            }
            r63 r63VarM13548a = zf2.m13548a(wf2Var2);
            wf2 wf2VarM12295v = wf2Var2.m12295v();
            boolean z = true;
            wf2Var2.f33298F = wf2Var2.f33298F || (wf2VarM12295v != null && wf2VarM12295v.f33298F);
            if (!wf2Var2.m12291r() && kl0.m7533c(this.f16902d, j)) {
                ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) r63VarM13548a).m10612i(wf2Var2, false);
                wf2Var2.m12269Z();
                return false;
            }
            this.f33640y.f34230f = false;
            uw2 uw2VarM12248A = wf2Var2.m12248A();
            Object[] objArr = uw2VarM12248A.f32211a;
            int i = uw2VarM12248A.f32213c;
            for (int i2 = 0; i2 < i; i2++) {
                ((wf2) objArr[i2]).f33300H.f14483p.f33640y.f34227c = false;
            }
            this.f33625j = true;
            long j2 = ag2Var.m2982a().f16901c;
            m4427r0(j);
            sf2 sf2Var = ag2Var.f14471d;
            sf2 sf2Var2 = sf2.f30230e;
            if (sf2Var != sf2Var2) {
                q32.m9721c("layout state is not idle before measure starts");
            }
            this.f33610C = j;
            sf2 sf2Var3 = sf2.f30226a;
            ag2Var.f14471d = sf2Var3;
            this.f33637v = false;
            u63 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2Var2)).getSnapshotObserver();
            snapshotObserver.f31675a.m159e(wf2Var2, snapshotObserver.f31677c, this.f33611D);
            if (ag2Var.f14471d == sf2Var3) {
                this.f33638w = true;
                this.f33639x = true;
                ag2Var.f14471d = sf2Var2;
            }
            if (w52.m12108c(ag2Var.m2982a().f16901c, j2) && ag2Var.m2982a().f16899a == this.f16899a && ag2Var.m2982a().f16900b == this.f16900b) {
                z = false;
            }
            m4426q0((((long) ag2Var.m2982a().f16900b) & 4294967295L) | (((long) ag2Var.m2982a().f16899a) << 32));
            return z;
        } catch (Throwable th) {
            wf2Var.m12270a0(th);
            throw null;
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m12378F0() {
        ag2 ag2Var = this.f33621f;
        wf2 wf2Var = ag2Var.f14468a;
        wf2 wf2Var2 = ag2Var.f14468a;
        if (!wf2Var.m12257K() || ag2Var.f14479l <= 0) {
            return;
        }
        ag2 ag2Var2 = wf2Var2.f33300H;
        if ((ag2Var2.f14477j || ag2Var2.f14478k) && !ag2Var2.f14483p.f33638w) {
            wf2Var2.m12268W(false);
        }
        uw2 uw2VarM12248A = wf2Var2.m12248A();
        Object[] objArr = uw2VarM12248A.f32211a;
        int i = uw2VarM12248A.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            ((wf2) objArr[i2]).f33300H.f14483p.m12378F0();
        }
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: W */
    public final int mo5823W(int i) {
        ag2 ag2Var = this.f33621f;
        if (qq2.m10039w(ag2Var.f14468a)) {
            return ag2Var.f14484q.mo5823W(i);
        }
        m12382y0();
        return ag2Var.m2982a().mo5823W(i);
    }

    @Override // p000.InterfaceC0718ha
    /* JADX INFO: renamed from: X */
    public final int mo6283X() {
        return this.f33624i;
    }

    @Override // p000.InterfaceC0718ha
    /* JADX INFO: renamed from: Y */
    public final void mo6284Y() {
        wf2.m12245X(this.f33621f.f14468a, false, 7);
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: Z */
    public final int mo5824Z(int i) {
        ag2 ag2Var = this.f33621f;
        if (qq2.m10039w(ag2Var.f14468a)) {
            return ag2Var.f14484q.mo5824Z(i);
        }
        m12382y0();
        return ag2Var.m2982a().mo5824Z(i);
    }

    @Override // p000.InterfaceC0718ha
    /* JADX INFO: renamed from: a */
    public final xf2 mo6285a() {
        return this.f33640y;
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: b0 */
    public final int mo5825b0(int i) {
        ag2 ag2Var = this.f33621f;
        if (qq2.m10039w(ag2Var.f14468a)) {
            return ag2Var.f14484q.mo5825b0(i);
        }
        m12382y0();
        return ag2Var.m2982a().mo5825b0(i);
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: e */
    public final db3 mo5826e(long j) throws Throwable {
        uf2 uf2Var;
        ag2 ag2Var = this.f33621f;
        wf2 wf2Var = ag2Var.f14468a;
        wf2 wf2Var2 = ag2Var.f14468a;
        uf2 uf2Var2 = wf2Var.f33296D;
        uf2 uf2Var3 = uf2.f31823c;
        if (uf2Var2 == uf2Var3) {
            wf2Var.m12277f();
        }
        if (qq2.m10039w(wf2Var2)) {
            yo2 yo2Var = ag2Var.f14484q;
            yo2Var.f35407j = uf2Var3;
            yo2Var.mo5826e(j);
        }
        wf2 wf2VarM12295v = wf2Var2.m12295v();
        if (wf2VarM12295v != null) {
            ag2 ag2Var2 = wf2VarM12295v.f33300H;
            if (this.f33627l != uf2Var3 && !wf2Var2.f33298F) {
                q32.m9721c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = ag2Var2.f14471d.ordinal();
            if (iOrdinal == 0) {
                uf2Var = uf2.f31821a;
            } else {
                if (iOrdinal != 2) {
                    wb1.m12197q(ag2Var2.f14471d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                uf2Var = uf2.f31822b;
            }
            this.f33627l = uf2Var;
        } else {
            this.f33627l = uf2Var3;
        }
        m12377E0(j);
        return this;
    }

    @Override // p000.db3
    /* JADX INFO: renamed from: e0 */
    public final int mo4419e0(AbstractC0568da abstractC0568da) {
        xf2 xf2Var = this.f33640y;
        ag2 ag2Var = this.f33621f;
        wf2 wf2VarM12295v = ag2Var.f14468a.m12295v();
        if ((wf2VarM12295v != null ? wf2VarM12295v.f33300H.f14471d : null) == sf2.f30226a) {
            xf2Var.f34227c = true;
        } else {
            wf2 wf2VarM12295v2 = ag2Var.f14468a.m12295v();
            if ((wf2VarM12295v2 != null ? wf2VarM12295v2.f33300H.f14471d : null) == sf2.f30228c) {
                xf2Var.f34228d = true;
            }
        }
        this.f33628m = true;
        int iMo4419e0 = ag2Var.m2982a().mo4419e0(abstractC0568da);
        this.f33628m = false;
        return iMo4419e0;
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: h */
    public final int mo5827h(int i) {
        ag2 ag2Var = this.f33621f;
        if (qq2.m10039w(ag2Var.f14468a)) {
            return ag2Var.f14484q.mo5827h(i);
        }
        m12382y0();
        return ag2Var.m2982a().mo5827h(i);
    }

    @Override // p000.db3
    /* JADX INFO: renamed from: i0 */
    public final int mo4420i0() {
        return this.f33621f.m2982a().mo4420i0();
    }

    @Override // p000.db3
    /* JADX INFO: renamed from: j0 */
    public final int mo4421j0() {
        return this.f33621f.m2982a().mo4421j0();
    }

    @Override // p000.db3, p000.sq2
    /* JADX INFO: renamed from: m */
    public final Object mo4423m() {
        return this.f33634s;
    }

    @Override // p000.db3
    /* JADX INFO: renamed from: n0 */
    public final void mo4424n0(long j, float f, yp1 yp1Var) throws Throwable {
        m12376D0(j, f, yp1Var, null);
    }

    @Override // p000.db3
    /* JADX INFO: renamed from: p0 */
    public final void mo4425p0(long j, float f, bu1 bu1Var) throws Throwable {
        m12376D0(j, f, null, bu1Var);
    }

    @Override // p000.InterfaceC0718ha
    public final void requestLayout() {
        this.f33621f.f14468a.m12268W(false);
    }

    @Override // p000.iu2
    /* JADX INFO: renamed from: s */
    public final void mo6940s(boolean z) {
        ag2 ag2Var = this.f33621f;
        if (z != ag2Var.m2982a().f30438l) {
            ag2Var.m2982a().f30438l = z;
            this.f33620M = true;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final List m12379t0() {
        uw2 uw2Var = this.f33641z;
        ag2 ag2Var = this.f33621f;
        ag2Var.f14468a.m12282h0();
        if (!this.f33608A) {
            return uw2Var.m11667f();
        }
        wf2 wf2Var = ag2Var.f14468a;
        uw2 uw2VarM12248A = wf2Var.m12248A();
        Object[] objArr = uw2VarM12248A.f32211a;
        int i = uw2VarM12248A.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            wf2 wf2Var2 = (wf2) objArr[i2];
            if (uw2Var.f32213c <= i2) {
                uw2Var.m11663b(wf2Var2.f33300H.f14483p);
            } else {
                wq2 wq2Var = wf2Var2.f33300H.f14483p;
                Object[] objArr2 = uw2Var.f32211a;
                Object obj = objArr2[i2];
                objArr2[i2] = wq2Var;
            }
        }
        uw2Var.m11673m(((uw2) ((aw2) wf2Var.m12288o()).f14915b).f32213c, uw2Var.f32213c);
        this.f33608A = false;
        return uw2Var.m11667f();
    }

    @Override // p000.InterfaceC0718ha
    /* JADX INFO: renamed from: u */
    public final w32 mo6286u() {
        return (w32) this.f33621f.f14468a.f33299G.f25607d;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m12380u0() {
        boolean z = this.f33635t;
        this.f33635t = true;
        ag2 ag2Var = this.f33621f;
        wf2 wf2Var = ag2Var.f14468a;
        C0940nb c0940nb = wf2Var.f33299G;
        if (!z) {
            ((w32) c0940nb.f25607d).m4883l1();
            ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2Var)).getRectManager().m8031g(ag2Var.f14468a);
            if (wf2Var.m12291r()) {
                wf2.m12245X(wf2Var, true, 6);
            } else if (wf2Var.f33300H.f14472e) {
                wf2.m12244V(wf2Var, true, 6);
            }
        }
        e13 e13Var = ((w32) c0940nb.f25607d).f17628x;
        for (e13 e13Var2 = (e13) c0940nb.f25608e; !z62.m13387o(e13Var2, e13Var) && e13Var2 != null; e13Var2 = e13Var2.f17628x) {
            if (e13Var2.f17622U) {
                e13Var2.m4879h1();
            }
        }
        uw2 uw2VarM12248A = wf2Var.m12248A();
        Object[] objArr = uw2VarM12248A.f32211a;
        int i = uw2VarM12248A.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            wf2 wf2Var2 = (wf2) objArr[i2];
            if (wf2Var2.m12296w() != Integer.MAX_VALUE) {
                wf2Var2.f33300H.f14483p.m12380u0();
                wf2.m12246Y(wf2Var2);
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m12381v0() {
        ag2 ag2Var = this.f33621f;
        if (this.f33635t) {
            this.f33635t = false;
            wf2 wf2Var = ag2Var.f14468a;
            wf2 wf2Var2 = ag2Var.f14468a;
            ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2Var)).getRectManager().m8032h(wf2Var2);
            C0940nb c0940nb = wf2Var2.f33299G;
            e13 e13Var = ((w32) c0940nb.f25607d).f17628x;
            for (e13 e13Var2 = (e13) c0940nb.f25608e; !z62.m13387o(e13Var2, e13Var) && e13Var2 != null; e13Var2 = e13Var2.f17628x) {
                e13Var2.m4885n1();
                e13Var2.m4890s1();
            }
            uw2 uw2VarM12248A = wf2Var2.m12248A();
            Object[] objArr = uw2VarM12248A.f32211a;
            int i = uw2VarM12248A.f32213c;
            for (int i2 = 0; i2 < i; i2++) {
                ((wf2) objArr[i2]).f33300H.f14483p.m12381v0();
            }
        }
    }

    @Override // p000.InterfaceC0718ha
    /* JADX INFO: renamed from: w */
    public final void mo6287w(C1127s c1127s) {
        uw2 uw2VarM12248A = this.f33621f.f14468a.m12248A();
        Object[] objArr = uw2VarM12248A.f32211a;
        int i = uw2VarM12248A.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            c1127s.invoke(((wf2) objArr[i2]).f33300H.f14483p);
        }
    }

    @Override // p000.InterfaceC0718ha
    /* JADX INFO: renamed from: y */
    public final InterfaceC0718ha mo6288y() {
        ag2 ag2Var;
        wf2 wf2VarM12295v = this.f33621f.f14468a.m12295v();
        if (wf2VarM12295v == null || (ag2Var = wf2VarM12295v.f33300H) == null) {
            return null;
        }
        return ag2Var.f14483p;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m12382y0() {
        uf2 uf2Var;
        ag2 ag2Var = this.f33621f;
        wf2.m12245X(ag2Var.f14468a, false, 7);
        wf2 wf2Var = ag2Var.f14468a;
        wf2 wf2VarM12295v = wf2Var.m12295v();
        if (wf2VarM12295v == null || wf2Var.f33296D != uf2.f31823c) {
            return;
        }
        int iOrdinal = wf2VarM12295v.f33300H.f14471d.ordinal();
        if (iOrdinal != 0) {
            uf2Var = iOrdinal != 2 ? wf2VarM12295v.f33296D : uf2.f31822b;
        } else {
            uf2Var = uf2.f31821a;
        }
        wf2Var.f33296D = uf2Var;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m12383z0() {
        this.f33614G = true;
        ag2 ag2Var = this.f33621f;
        wf2 wf2VarM12295v = ag2Var.f14468a.m12295v();
        float f = mo6286u().f17610I;
        wf2 wf2Var = ag2Var.f14468a;
        C0940nb c0940nb = wf2Var.f33299G;
        e13 e13Var = (e13) c0940nb.f25608e;
        w32 w32Var = (w32) c0940nb.f25607d;
        while (e13Var != w32Var) {
            of2 of2Var = (of2) e13Var;
            f += of2Var.f17610I;
            e13Var = of2Var.f17628x;
        }
        if (f != this.f33613F) {
            this.f33613F = f;
            if (wf2VarM12295v != null) {
                wf2VarM12295v.m12263Q();
            }
            if (wf2VarM12295v != null) {
                wf2VarM12295v.m12251D();
            }
        }
        if (!mo6286u().f30441o) {
            boolean z = this.f33635t;
            if (!z || this.f33640y.m12689d()) {
                m12380u0();
            }
            if (z) {
                ((w32) wf2Var.f33299G.f25607d).m4883l1();
            } else {
                if (wf2VarM12295v != null) {
                    wf2VarM12295v.m12251D();
                }
                if (this.f33622g && wf2VarM12295v != null) {
                    wf2VarM12295v.m12268W(false);
                }
            }
        }
        if (wf2VarM12295v != null) {
            ag2 ag2Var2 = wf2VarM12295v.f33300H;
            if (!this.f33622g && ag2Var2.f14471d == sf2.f30228c) {
                if (this.f33624i != Integer.MAX_VALUE) {
                    q32.m9721c("Place was called on a node which was placed already");
                }
                int i = ag2Var2.f14476i;
                this.f33624i = i;
                ag2Var2.f14476i = i + 1;
            }
        } else {
            this.f33624i = 0;
        }
        mo6282B();
    }
}
