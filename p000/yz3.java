package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yz3 extends zh0 {

    /* JADX INFO: renamed from: Q */
    public static final C0494bk f35644Q = new C0494bk(0.0f);

    /* JADX INFO: renamed from: R */
    public static final C0494bk f35645R = new C0494bk(1.0f);

    /* JADX INFO: renamed from: L */
    public cw2 f35646L;

    /* JADX INFO: renamed from: M */
    public rz3 f35647M;

    /* JADX INFO: renamed from: N */
    public qz3 f35648N;

    /* JADX INFO: renamed from: O */
    public float f35649O;

    /* JADX INFO: renamed from: P */
    public qz3 f35650P;

    /* JADX INFO: renamed from: f */
    public d83 f35651f;

    /* JADX INFO: renamed from: g */
    public d83 f35652g;

    /* JADX INFO: renamed from: h */
    public Object f35653h;

    /* JADX INFO: renamed from: i */
    public dp4 f35654i;

    /* JADX INFO: renamed from: j */
    public long f35655j;

    /* JADX INFO: renamed from: k */
    public g32 f35656k;

    /* JADX INFO: renamed from: l */
    public aa4 f35657l;

    /* JADX INFO: renamed from: m */
    public z73 f35658m;

    /* JADX INFO: renamed from: n */
    public b70 f35659n;

    /* JADX INFO: renamed from: o */
    public gx2 f35660o;

    /* JADX INFO: renamed from: p */
    public ex2 f35661p;

    /* JADX INFO: renamed from: q */
    public long f35662q;

    /* JADX INFO: renamed from: y */
    public static void m13272y(rz3 rz3Var, long j) {
        long j2 = rz3Var.f29747a + j;
        rz3Var.f29747a = j2;
        long j3 = rz3Var.f29754h;
        if (j2 >= j3) {
            rz3Var.f29750d = 1.0f;
            return;
        }
        bx4 bx4Var = rz3Var.f29748b;
        C0494bk c0494bk = rz3Var.f29751e;
        if (bx4Var == null) {
            float f = j2 / j3;
            rz3Var.f29750d = (f * 1.0f) + ((1.0f - f) * c0494bk.mo3608a(0));
            return;
        }
        C0494bk c0494bk2 = rz3Var.f29752f;
        if (c0494bk2 == null) {
            c0494bk2 = f35644Q;
        }
        rz3Var.f29750d = sc6.m10674o(((C0494bk) bx4Var.mo4795s(j2, c0494bk, f35645R, c0494bk2)).mo3608a(0), 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: A */
    public final Object m13273A(float f, Object obj, of4 of4Var) {
        if (0.0f > f || f > 1.0f) {
            md3.m8284a("Expecting fraction between 0 and 1. Got " + f);
        }
        dp4 dp4Var = this.f35654i;
        if (dp4Var != null) {
            Object objM5420a = ex2.m5420a(this.f35661p, new vz3(obj, this.f35651f.getValue(), this, dp4Var, f, null), of4Var);
            if (objM5420a == ap0.f14763a) {
                return objM5420a;
            }
        }
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: B */
    public final void m13274B() {
        dp4 dp4Var = this.f35654i;
        if (dp4Var == null) {
            return;
        }
        dp4Var.m4653o(qq2.m10011F(((double) this.f35658m.m13399h()) * ((Number) dp4Var.f17270m.getValue()).longValue()));
    }

    /* JADX INFO: renamed from: C */
    public final void m13275C(float f) {
        this.f35658m.m13400i(f);
    }

    /* JADX INFO: renamed from: D */
    public final void m13276D(aa4 aa4Var) {
        C1040pn c1040pn;
        if (z62.m13387o(this.f35657l, aa4Var)) {
            return;
        }
        aa4 aa4Var2 = this.f35657l;
        if (aa4Var2 != null) {
            aa4Var2.m156b(this);
        }
        aa4 aa4Var3 = this.f35657l;
        if (aa4Var3 != null && (c1040pn = aa4Var3.f217h) != null) {
            c1040pn.m9573k();
        }
        this.f35657l = aa4Var;
        if (aa4Var != null) {
            aa4Var.m160f();
        }
        aa4 aa4Var4 = this.f35657l;
        if (aa4Var4 != null) {
            aa4Var4.m159e(this, zp0.f36244g, this.f35656k);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: E */
    public final Object m13277E(ym0 ym0Var) {
        wz3 wz3Var;
        Object value;
        Object obj;
        gx2 gx2Var = this.f35660o;
        if (ym0Var instanceof wz3) {
            wz3Var = (wz3) ym0Var;
            int i = wz3Var.f33879w;
            if ((i & Integer.MIN_VALUE) != 0) {
                wz3Var.f33879w = i - Integer.MIN_VALUE;
            } else {
                wz3Var = new wz3(this, ym0Var);
            }
        } else {
            wz3Var = new wz3(this, ym0Var);
        }
        Object obj2 = wz3Var.f33877u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = wz3Var.f33879w;
        if (i2 == 0) {
            k43.m7376J(obj2);
            value = this.f35651f.getValue();
            wz3Var.f33876t = value;
            wz3Var.f33879w = 1;
            if (gx2Var.m6191e(wz3Var) != ap0Var) {
            }
            return ap0Var;
        }
        if (i2 == 1) {
            Object obj3 = wz3Var.f33876t;
            k43.m7376J(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = wz3Var.f33876t;
            k43.m7376J(obj2);
        }
        if (z62.m13387o(obj2, obj)) {
            return ju4.f22634a;
        }
        this.f35662q = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        wz3Var.f33876t = value;
        wz3Var.f33879w = 2;
        b70 b70Var = new b70(1, C0006a5.m86x(wz3Var));
        b70Var.m3497u();
        this.f35659n = b70Var;
        gx2Var.m6193g(null);
        Object objM3495r = b70Var.m3495r();
        if (objM3495r != ap0Var) {
            obj = value;
            obj2 = objM3495r;
            if (z62.m13387o(obj2, obj)) {
                return ju4.f22634a;
            }
            this.f35662q = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return ap0Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0084, please report this as an issue */
    /* JADX INFO: renamed from: F */
    public final Object m13278F(ym0 ym0Var) {
        xz3 xz3Var;
        Object value;
        Object obj;
        gx2 gx2Var = this.f35660o;
        if (ym0Var instanceof xz3) {
            xz3Var = (xz3) ym0Var;
            int i = xz3Var.f34745w;
            if ((i & Integer.MIN_VALUE) != 0) {
                xz3Var.f34745w = i - Integer.MIN_VALUE;
            } else {
                xz3Var = new xz3(this, ym0Var);
            }
        } else {
            xz3Var = new xz3(this, ym0Var);
        }
        Object obj2 = xz3Var.f34743u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = xz3Var.f34745w;
        if (i2 == 0) {
            k43.m7376J(obj2);
            value = this.f35651f.getValue();
            xz3Var.f34742t = value;
            xz3Var.f34745w = 1;
            if (gx2Var.m6191e(xz3Var) != ap0Var) {
            }
            return ap0Var;
        }
        if (i2 == 1) {
            Object obj3 = xz3Var.f34742t;
            k43.m7376J(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = xz3Var.f34742t;
            k43.m7376J(obj2);
        }
        if (!z62.m13387o(obj2, obj)) {
            this.f35662q = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return ju4.f22634a;
        if (!z62.m13387o(value, this.f35653h)) {
            xz3Var.f34742t = value;
            xz3Var.f34745w = 2;
            b70 b70Var = new b70(1, C0006a5.m86x(xz3Var));
            b70Var.m3497u();
            this.f35659n = b70Var;
            gx2Var.m6193g(null);
            Object objM3495r = b70Var.m3495r();
            if (objM3495r != ap0Var) {
                obj = value;
                obj2 = objM3495r;
                if (!z62.m13387o(obj2, obj)) {
                    this.f35662q = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return ap0Var;
        }
        gx2Var.m6193g(null);
        return ju4.f22634a;
    }

    @Override // p000.zh0
    /* JADX INFO: renamed from: l */
    public final Object mo11188l() {
        return this.f35652g.getValue();
    }

    @Override // p000.zh0
    /* JADX INFO: renamed from: m */
    public final Object mo11189m() {
        return this.f35651f.getValue();
    }

    @Override // p000.zh0
    /* JADX INFO: renamed from: q */
    public final void mo11190q(Object obj) {
        this.f35652g.setValue(obj);
    }

    @Override // p000.zh0
    /* JADX INFO: renamed from: r */
    public final void mo13279r(dp4 dp4Var) {
        dp4 dp4Var2 = this.f35654i;
        if (dp4Var2 != null && !dp4Var.equals(dp4Var2)) {
            md3.m8285b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f35654i + ", new instance: " + dp4Var);
        }
        this.f35654i = dp4Var;
    }

    @Override // p000.zh0
    /* JADX INFO: renamed from: s */
    public final void mo13280s() {
        this.f35654i = null;
        aa4 aa4Var = this.f35657l;
        if (aa4Var != null) {
            aa4Var.m156b(this);
        }
    }

    /* JADX INFO: renamed from: u */
    public final Object m13281u(ym0 ym0Var) {
        float fM10076A = qs5.m10076A(ym0Var.getContext());
        ju4 ju4Var = ju4.f22634a;
        if (fM10076A <= 0.0f) {
            m13282v();
            return ju4Var;
        }
        this.f35649O = fM10076A;
        Object objMo9530l = C0006a5.m84v(ym0Var.getContext()).mo9530l(this.f35650P, ym0Var);
        return objMo9530l == ap0.f14763a ? objMo9530l : ju4Var;
    }

    /* JADX INFO: renamed from: v */
    public final void m13282v() {
        dp4 dp4Var = this.f35654i;
        if (dp4Var != null) {
            dp4Var.m4641c();
        }
        this.f35646L.m4203d();
        if (this.f35647M != null) {
            this.f35647M = null;
            m13275C(1.0f);
            m13274B();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m13283x() {
        z73 z73Var = this.f35658m;
        dp4 dp4Var = this.f35654i;
        if (dp4Var == null) {
            return;
        }
        rz3 rz3Var = this.f35647M;
        if (rz3Var == null) {
            if (this.f35655j <= 0 || z73Var.m13399h() == 1.0f || z62.m13387o(this.f35652g.getValue(), this.f35651f.getValue())) {
                rz3Var = null;
            } else {
                rz3Var = new rz3();
                rz3Var.f29750d = z73Var.m13399h();
                long j = this.f35655j;
                rz3Var.f29753g = j;
                rz3Var.f29754h = qq2.m10011F((1.0d - ((double) z73Var.m13399h())) * j);
                rz3Var.f29751e.mo3610e(z73Var.m13399h(), 0);
            }
        }
        if (rz3Var != null) {
            rz3Var.f29753g = this.f35655j;
            this.f35646L.m4200a(rz3Var);
            dp4Var.m4654p(rz3Var);
        }
        this.f35647M = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: z */
    public final Object m13284z(ym0 ym0Var) {
        tz3 tz3Var;
        cw2 cw2Var = this.f35646L;
        if (ym0Var instanceof tz3) {
            tz3Var = (tz3) ym0Var;
            int i = tz3Var.f31567v;
            if ((i & Integer.MIN_VALUE) != 0) {
                tz3Var.f31567v = i - Integer.MIN_VALUE;
            } else {
                tz3Var = new tz3(this, ym0Var);
            }
        } else {
            tz3Var = new tz3(this, ym0Var);
        }
        Object obj = tz3Var.f31565t;
        Object obj2 = ap0.f14763a;
        int i2 = tz3Var.f31567v;
        ju4 ju4Var = ju4.f22634a;
        if (i2 == 0) {
            k43.m7376J(obj);
            if (cw2Var.m4208i() && this.f35647M == null) {
                return ju4Var;
            }
            if (qs5.m10076A(tz3Var.getContext()) == 0.0f) {
                m13282v();
                this.f35662q = Long.MIN_VALUE;
                return ju4Var;
            }
            if (this.f35662q == Long.MIN_VALUE) {
                qz3 qz3Var = this.f35648N;
                tz3Var.f31567v = 1;
                if (C0006a5.m84v(tz3Var.getContext()).mo9530l(qz3Var, tz3Var) != obj2) {
                }
            }
            return obj2;
        }
        if (i2 != 1 && i2 != 2) {
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k43.m7376J(obj);
        do {
            if (!cw2Var.m4209j() && this.f35647M == null) {
                this.f35662q = Long.MIN_VALUE;
                return ju4Var;
            }
            tz3Var.f31567v = 2;
        } while (m13281u(tz3Var) != obj2);
        return obj2;
    }
}
