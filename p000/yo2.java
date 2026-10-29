package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yo2 extends db3 implements sq2, InterfaceC0718ha, iu2 {

    /* JADX INFO: renamed from: A */
    public wo2 f35400A;

    /* JADX INFO: renamed from: B */
    public wo2 f35401B;

    /* JADX INFO: renamed from: C */
    public boolean f35402C;

    /* JADX INFO: renamed from: f */
    public ag2 f35403f;

    /* JADX INFO: renamed from: g */
    public boolean f35404g;

    /* JADX INFO: renamed from: h */
    public int f35405h;

    /* JADX INFO: renamed from: i */
    public int f35406i;

    /* JADX INFO: renamed from: j */
    public uf2 f35407j;

    /* JADX INFO: renamed from: k */
    public boolean f35408k;

    /* JADX INFO: renamed from: l */
    public boolean f35409l;

    /* JADX INFO: renamed from: m */
    public boolean f35410m;

    /* JADX INFO: renamed from: n */
    public kl0 f35411n;

    /* JADX INFO: renamed from: o */
    public long f35412o;

    /* JADX INFO: renamed from: p */
    public yp1 f35413p;

    /* JADX INFO: renamed from: q */
    public bu1 f35414q;

    /* JADX INFO: renamed from: r */
    public xo2 f35415r;

    /* JADX INFO: renamed from: s */
    public xf2 f35416s;

    /* JADX INFO: renamed from: t */
    public uw2 f35417t;

    /* JADX INFO: renamed from: u */
    public boolean f35418u;

    /* JADX INFO: renamed from: v */
    public boolean f35419v;

    /* JADX INFO: renamed from: w */
    public wo2 f35420w;

    /* JADX INFO: renamed from: x */
    public boolean f35421x;

    /* JADX INFO: renamed from: y */
    public Object f35422y;

    /* JADX INFO: renamed from: z */
    public long f35423z;

    @Override // p000.InterfaceC0718ha
    /* JADX INFO: renamed from: B */
    public final void mo6282B() {
        this.f35419v = true;
        xf2 xf2Var = this.f35416s;
        xf2Var.m12693h();
        ag2 ag2Var = this.f35403f;
        boolean z = ag2Var.f14473f;
        wf2 wf2Var = ag2Var.f14468a;
        if (z) {
            uw2 uw2VarM12248A = wf2Var.m12248A();
            Object[] objArr = uw2VarM12248A.f32211a;
            int i = uw2VarM12248A.f32213c;
            for (int i2 = 0; i2 < i; i2++) {
                wf2 wf2Var2 = (wf2) objArr[i2];
                if (wf2Var2.f33300H.f14472e && wf2Var2.m12293t() == uf2.f31821a) {
                    yo2 yo2Var = wf2Var2.f33300H.f14484q;
                    if (yo2Var.m13199E0((yo2Var != null ? yo2Var.f35411n : null).f23210a)) {
                        wf2.m12244V(wf2Var, false, 7);
                    }
                }
            }
        }
        v32 v32Var = mo6286u().f33060f0;
        if (ag2Var.f14474g || (!this.f35408k && !v32Var.f30441o && ag2Var.f14473f)) {
            ag2Var.f14473f = false;
            sf2 sf2Var = ag2Var.f14471d;
            ag2Var.f14471d = sf2.f30229d;
            ag2Var.m2990i(false);
            u63 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2Var)).getSnapshotObserver();
            snapshotObserver.f31675a.m159e(wf2Var, snapshotObserver.f31682h, this.f35420w);
            ag2Var.f14471d = sf2Var;
            if (ag2Var.f14480m && v32Var.f30441o) {
                requestLayout();
            }
            ag2Var.f14474g = false;
        }
        if (xf2Var.f34228d) {
            xf2Var.f34229e = true;
        }
        if (xf2Var.f34226b && xf2Var.m12690e()) {
            xf2Var.m12692g();
        }
        this.f35419v = false;
    }

    /* JADX INFO: renamed from: C0 */
    public final void m13197C0() {
        sf2 sf2Var;
        this.f35402C = true;
        ag2 ag2Var = this.f35403f;
        wf2 wf2VarM12295v = ag2Var.f14468a.m12295v();
        xo2 xo2Var = this.f35415r;
        if ((xo2Var != xo2.f34490a && !ag2Var.f14470c) || (xo2Var != xo2.f34491b && ag2Var.f14470c)) {
            m13202v0();
            if (this.f35404g && wf2VarM12295v != null) {
                wf2VarM12295v.m12267U(false);
            }
        }
        if (wf2VarM12295v != null) {
            ag2 ag2Var2 = wf2VarM12295v.f33300H;
            if (!this.f35404g && ((sf2Var = ag2Var2.f14471d) == sf2.f30228c || sf2Var == sf2.f30229d)) {
                if (this.f35406i != Integer.MAX_VALUE) {
                    q32.m9721c("Place was called on a node which was placed already");
                }
                int i = ag2Var2.f14475h;
                this.f35406i = i;
                ag2Var2.f14475h = i + 1;
            }
        } else {
            this.f35406i = 0;
        }
        mo6282B();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001d, B:14:0x0021, B:15:0x0026, B:17:0x0035, B:19:0x0039, B:22:0x003f, B:21:0x003d, B:23:0x0042, B:25:0x004c, B:30:0x0056, B:32:0x0081, B:31:0x006b), top: B:36:0x0007 }] */
    /* JADX INFO: renamed from: D0 */
    public final void m13198D0(long j, yp1 yp1Var, bu1 bu1Var) throws Throwable {
        ag2 ag2Var = this.f35403f;
        wf2 wf2Var = ag2Var.f14468a;
        wf2 wf2Var2 = ag2Var.f14468a;
        try {
            wf2 wf2VarM12295v = wf2Var.m12295v();
            sf2 sf2Var = wf2VarM12295v != null ? wf2VarM12295v.f33300H.f14471d : null;
            sf2 sf2Var2 = sf2.f30229d;
            if (sf2Var == sf2Var2) {
                ag2Var.f14470c = false;
            }
            if (wf2Var2.f33310R) {
                q32.m9719a("place is called on a deactivated node");
            }
            ag2Var.f14471d = sf2Var2;
            boolean z = true;
            this.f35409l = true;
            this.f35402C = false;
            if (!o52.m8956c(j, this.f35412o)) {
                if (ag2Var.f14481n || ag2Var.f14480m) {
                    ag2Var.f14473f = true;
                }
                m13203y0();
            }
            r63 r63VarM13548a = zf2.m13548a(wf2Var2);
            this.f35412o = j;
            if (ag2Var.f14473f) {
                ag2Var.m2989h(false);
                this.f35416s.f34231g = false;
                u63 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) r63VarM13548a).getSnapshotObserver();
                snapshotObserver.f31675a.m159e(wf2Var2, snapshotObserver.f31681g, this.f35401B);
            } else {
                if (this.f35415r == xo2.f34492c) {
                    z = false;
                }
                if (z) {
                    uo2 uo2VarMo4869X0 = ag2Var.m2982a().mo4869X0();
                    uo2VarMo4869X0.m11599P0(o52.m8958e(j, uo2VarMo4869X0.f16903e));
                    m13197C0();
                } else {
                    ag2Var.m2989h(false);
                    this.f35416s.f34231g = false;
                    u63 snapshotObserver2 = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) r63VarM13548a).getSnapshotObserver();
                    snapshotObserver2.f31675a.m159e(wf2Var2, snapshotObserver2.f31681g, this.f35401B);
                }
            }
            this.f35413p = yp1Var;
            this.f35414q = bu1Var;
            ag2Var.f14471d = sf2.f30230e;
        } catch (Throwable th) {
            wf2Var.m12270a0(th);
            throw null;
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m13199E0(long j) {
        ag2 ag2Var = this.f35403f;
        wf2 wf2Var = ag2Var.f14468a;
        wf2 wf2Var2 = ag2Var.f14468a;
        try {
            if (wf2Var.f33310R) {
                q32.m9719a("measure is called on a deactivated node");
            }
            wf2 wf2VarM12295v = wf2Var2.m12295v();
            wf2Var2.f33298F = wf2Var2.f33298F || (wf2VarM12295v != null && wf2VarM12295v.f33298F);
            if (!wf2Var2.f33300H.f14472e) {
                kl0 kl0Var = this.f35411n;
                if (kl0Var == null ? false : kl0.m7533c(kl0Var.f23210a, j)) {
                    r63 r63Var = wf2Var2.f33325o;
                    if (r63Var != null) {
                        ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) r63Var).m10612i(wf2Var2, true);
                    }
                    wf2Var2.m12269Z();
                    return false;
                }
            }
            this.f35411n = kl0.m7531a(j);
            m4427r0(j);
            this.f35416s.f34230f = false;
            uw2 uw2VarM12248A = wf2Var2.m12248A();
            Object[] objArr = uw2VarM12248A.f32211a;
            int i = uw2VarM12248A.f32213c;
            for (int i2 = 0; i2 < i; i2++) {
                ((wf2) objArr[i2]).f33300H.f14484q.f35416s.f34227c = false;
            }
            long j2 = this.f35410m ? this.f16901c : -9223372034707292160L;
            this.f35410m = true;
            uo2 uo2VarMo4869X0 = ag2Var.m2982a().mo4869X0();
            if (uo2VarMo4869X0 == null) {
                q32.m9721c("Lookahead result from lookaheadRemeasure cannot be null");
            }
            ag2Var.m2984c(j);
            m4426q0((((long) uo2VarMo4869X0.f16899a) << 32) | (((long) uo2VarMo4869X0.f16900b) & 4294967295L));
            return (((int) (j2 >> 32)) == uo2VarMo4869X0.f16899a && ((int) (j2 & 4294967295L)) == uo2VarMo4869X0.f16900b) ? false : true;
        } catch (Throwable th) {
            wf2Var.m12270a0(th);
            throw null;
        }
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: W */
    public final int mo5823W(int i) {
        m13204z0();
        return this.f35403f.m2982a().mo4869X0().mo5823W(i);
    }

    @Override // p000.InterfaceC0718ha
    /* JADX INFO: renamed from: X */
    public final int mo6283X() {
        return this.f35406i;
    }

    @Override // p000.InterfaceC0718ha
    /* JADX INFO: renamed from: Y */
    public final void mo6284Y() {
        wf2.m12244V(this.f35403f.f14468a, false, 7);
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: Z */
    public final int mo5824Z(int i) {
        m13204z0();
        return this.f35403f.m2982a().mo4869X0().mo5824Z(i);
    }

    @Override // p000.InterfaceC0718ha
    /* JADX INFO: renamed from: a */
    public final xf2 mo6285a() {
        return this.f35416s;
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: b0 */
    public final int mo5825b0(int i) {
        m13204z0();
        return this.f35403f.m2982a().mo4869X0().mo5825b0(i);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    @Override // p000.sq2
    /* JADX INFO: renamed from: e */
    public final db3 mo5826e(long j) {
        uf2 uf2Var;
        uf2 uf2Var2 = uf2.f31823c;
        ag2 ag2Var = this.f35403f;
        wf2 wf2Var = ag2Var.f14468a;
        wf2 wf2Var2 = ag2Var.f14468a;
        wf2 wf2VarM12295v = wf2Var.m12295v();
        if ((wf2VarM12295v != null ? wf2VarM12295v.f33300H.f14471d : null) == sf2.f30227b) {
            ag2Var.f14469b = false;
        } else {
            wf2 wf2VarM12295v2 = wf2Var2.m12295v();
            if ((wf2VarM12295v2 != null ? wf2VarM12295v2.f33300H.f14471d : null) == sf2.f30229d) {
                ag2Var.f14469b = false;
            }
        }
        wf2 wf2VarM12295v3 = wf2Var2.m12295v();
        if (wf2VarM12295v3 != null) {
            ag2 ag2Var2 = wf2VarM12295v3.f33300H;
            if (this.f35407j != uf2Var2 && !wf2Var2.f33298F) {
                q32.m9721c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = ag2Var2.f14471d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                uf2Var = uf2.f31821a;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    wb1.m12197q(ag2Var2.f14471d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                uf2Var = uf2.f31822b;
            }
            this.f35407j = uf2Var;
        } else {
            this.f35407j = uf2Var2;
        }
        if (wf2Var2.f33296D == uf2Var2) {
            wf2Var2.m12277f();
        }
        m13199E0(j);
        return this;
    }

    @Override // p000.db3
    /* JADX INFO: renamed from: e0 */
    public final int mo4419e0(AbstractC0568da abstractC0568da) {
        xf2 xf2Var = this.f35416s;
        ag2 ag2Var = this.f35403f;
        wf2 wf2VarM12295v = ag2Var.f14468a.m12295v();
        if ((wf2VarM12295v != null ? wf2VarM12295v.f33300H.f14471d : null) == sf2.f30227b) {
            xf2Var.f34227c = true;
        } else {
            wf2 wf2VarM12295v2 = ag2Var.f14468a.m12295v();
            if ((wf2VarM12295v2 != null ? wf2VarM12295v2.f33300H.f14471d : null) == sf2.f30229d) {
                xf2Var.f34228d = true;
            }
        }
        this.f35408k = true;
        int iMo4419e0 = ag2Var.m2982a().mo4869X0().mo4419e0(abstractC0568da);
        this.f35408k = false;
        return iMo4419e0;
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: h */
    public final int mo5827h(int i) {
        m13204z0();
        return this.f35403f.m2982a().mo4869X0().mo5827h(i);
    }

    @Override // p000.db3
    /* JADX INFO: renamed from: i0 */
    public final int mo4420i0() {
        return this.f35403f.m2982a().mo4869X0().mo4420i0();
    }

    @Override // p000.db3
    /* JADX INFO: renamed from: j0 */
    public final int mo4421j0() {
        return this.f35403f.m2982a().mo4869X0().mo4421j0();
    }

    @Override // p000.db3, p000.sq2
    /* JADX INFO: renamed from: m */
    public final Object mo4423m() {
        return this.f35422y;
    }

    @Override // p000.db3
    /* JADX INFO: renamed from: n0 */
    public final void mo4424n0(long j, float f, yp1 yp1Var) throws Throwable {
        m13198D0(j, yp1Var, null);
    }

    @Override // p000.db3
    /* JADX INFO: renamed from: p0 */
    public final void mo4425p0(long j, float f, bu1 bu1Var) throws Throwable {
        m13198D0(j, null, bu1Var);
    }

    @Override // p000.InterfaceC0718ha
    public final void requestLayout() {
        this.f35403f.f14468a.m12267U(false);
    }

    @Override // p000.iu2
    /* JADX INFO: renamed from: s */
    public final void mo6940s(boolean z) {
        uo2 uo2VarMo4869X0;
        ag2 ag2Var = this.f35403f;
        uo2 uo2VarMo4869X1 = ag2Var.m2982a().mo4869X0();
        if (Boolean.valueOf(z).equals(uo2VarMo4869X1 != null ? Boolean.valueOf(uo2VarMo4869X1.f30438l) : null) || (uo2VarMo4869X0 = ag2Var.m2982a().mo4869X0()) == null) {
            return;
        }
        uo2VarMo4869X0.f30438l = z;
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m13200t0() {
        ag2 ag2Var = this.f35403f;
        return qq2.m10039w(ag2Var.f14468a) || ag2Var.f14470c;
    }

    @Override // p000.InterfaceC0718ha
    /* JADX INFO: renamed from: u */
    public final w32 mo6286u() {
        return (w32) this.f35403f.f14468a.f33299G.f25607d;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m13201u0(boolean z) {
        if (z && m13200t0()) {
            return;
        }
        if (z || m13200t0()) {
            this.f35415r = xo2.f34492c;
            uw2 uw2VarM12248A = this.f35403f.f14468a.m12248A();
            Object[] objArr = uw2VarM12248A.f32211a;
            int i = uw2VarM12248A.f32213c;
            for (int i2 = 0; i2 < i; i2++) {
                ((wf2) objArr[i2]).f33300H.f14484q.m13201u0(true);
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m13202v0() {
        xo2 xo2Var = this.f35415r;
        ag2 ag2Var = this.f35403f;
        boolean z = ag2Var.f14470c;
        wf2 wf2Var = ag2Var.f14468a;
        if (z) {
            this.f35415r = xo2.f34491b;
        } else {
            this.f35415r = xo2.f34490a;
        }
        if (xo2Var != xo2.f34490a && ag2Var.f14472e) {
            wf2.m12244V(wf2Var, true, 6);
        }
        uw2 uw2VarM12248A = wf2Var.m12248A();
        Object[] objArr = uw2VarM12248A.f32211a;
        int i = uw2VarM12248A.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            wf2 wf2Var2 = (wf2) objArr[i2];
            yo2 yo2Var = wf2Var2.f33300H.f14484q;
            if (yo2Var == null) {
                C1077qn.m9987m("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (yo2Var.f35406i != Integer.MAX_VALUE) {
                yo2Var.m13202v0();
                wf2.m12246Y(wf2Var2);
            }
        }
    }

    @Override // p000.InterfaceC0718ha
    /* JADX INFO: renamed from: w */
    public final void mo6287w(C1127s c1127s) {
        uw2 uw2VarM12248A = this.f35403f.f14468a.m12248A();
        Object[] objArr = uw2VarM12248A.f32211a;
        int i = uw2VarM12248A.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            c1127s.invoke(((wf2) objArr[i2]).f33300H.f14484q);
        }
    }

    @Override // p000.InterfaceC0718ha
    /* JADX INFO: renamed from: y */
    public final InterfaceC0718ha mo6288y() {
        ag2 ag2Var;
        wf2 wf2VarM12295v = this.f35403f.f14468a.m12295v();
        if (wf2VarM12295v == null || (ag2Var = wf2VarM12295v.f33300H) == null) {
            return null;
        }
        return ag2Var.f14484q;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m13203y0() {
        ag2 ag2Var = this.f35403f;
        if (ag2Var.f14482o > 0) {
            uw2 uw2VarM12248A = ag2Var.f14468a.m12248A();
            Object[] objArr = uw2VarM12248A.f32211a;
            int i = uw2VarM12248A.f32213c;
            for (int i2 = 0; i2 < i; i2++) {
                wf2 wf2Var = (wf2) objArr[i2];
                ag2 ag2Var2 = wf2Var.f33300H;
                if ((ag2Var2.f14480m || ag2Var2.f14481n) && !ag2Var2.f14473f) {
                    wf2Var.m12267U(false);
                }
                yo2 yo2Var = ag2Var2.f14484q;
                if (yo2Var != null) {
                    yo2Var.m13203y0();
                }
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m13204z0() {
        uf2 uf2Var;
        ag2 ag2Var = this.f35403f;
        wf2.m12244V(ag2Var.f14468a, false, 7);
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
}
