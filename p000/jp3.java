package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jp3 implements ky0 {

    /* JADX INFO: renamed from: a */
    public int f22489a;

    /* JADX INFO: renamed from: b */
    public float f22490b = 1.0f;

    /* JADX INFO: renamed from: c */
    public float f22491c = 1.0f;

    /* JADX INFO: renamed from: d */
    public float f22492d = 1.0f;

    /* JADX INFO: renamed from: e */
    public float f22493e;

    /* JADX INFO: renamed from: f */
    public float f22494f;

    /* JADX INFO: renamed from: g */
    public float f22495g;

    /* JADX INFO: renamed from: h */
    public long f22496h;

    /* JADX INFO: renamed from: i */
    public long f22497i;

    /* JADX INFO: renamed from: j */
    public float f22498j;

    /* JADX INFO: renamed from: k */
    public float f22499k;

    /* JADX INFO: renamed from: l */
    public long f22500l;

    /* JADX INFO: renamed from: m */
    public p44 f22501m;

    /* JADX INFO: renamed from: n */
    public boolean f22502n;

    /* JADX INFO: renamed from: o */
    public long f22503o;

    /* JADX INFO: renamed from: p */
    public ye2 f22504p;

    /* JADX INFO: renamed from: q */
    public ky0 f22505q;

    /* JADX INFO: renamed from: r */
    public df2 f22506r;

    /* JADX INFO: renamed from: s */
    public byte f22507s;

    /* JADX INFO: renamed from: t */
    public lb5 f22508t;

    public jp3() {
        long j = eu1.f18488a;
        this.f22496h = j;
        this.f22497i = j;
        this.f22499k = 8.0f;
        this.f22500l = to4.f31292b;
        this.f22501m = k43.f22879x;
        this.f22503o = 9205357640488583168L;
        this.f22504p = ye2.f35161a;
        this.f22505q = oh6.m9098d(1.0f, 1.0f);
        this.f22506r = df2.f17011a;
        this.f22507s = (byte) 3;
    }

    /* JADX INFO: renamed from: a */
    public final void m7252a() {
        m7257k(1.0f);
        m7258l(1.0f);
        m7253b(1.0f);
        m7263v(0.0f);
        m7264w(0.0f);
        m7259m(0.0f);
        long j = eu1.f18488a;
        m7254e(j);
        m7261s(j);
        m7256j(0.0f);
        if (this.f22499k != 8.0f) {
            this.f22489a |= 2048;
            this.f22499k = 8.0f;
        }
        m7262u(to4.f31292b);
        m7260n(k43.f22879x);
        m7255h(false);
        if (this.f22507s != 3) {
            this.f22489a |= 524288;
            this.f22507s = (byte) 3;
        }
        ye2 ye2Var = ye2.f35161a;
        if (!z62.m13387o(this.f22504p, ye2Var)) {
            this.f22489a |= 1048576;
            this.f22504p = ye2Var;
        }
        this.f22503o = 9205357640488583168L;
        this.f22508t = null;
        this.f22489a = 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m7253b(float f) {
        if (this.f22492d == f) {
            return;
        }
        this.f22489a |= 4;
        this.f22492d = f;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: c */
    public final float mo3580c() {
        return this.f22505q.mo3580c();
    }

    /* JADX INFO: renamed from: e */
    public final void m7254e(long j) {
        long j2 = this.f22496h;
        int i = pb0.f27502i;
        if (ws4.m12408a(j2, j)) {
            return;
        }
        this.f22489a |= 64;
        this.f22496h = j;
    }

    /* JADX INFO: renamed from: h */
    public final void m7255h(boolean z) {
        if (this.f22502n != z) {
            this.f22489a |= 16384;
            this.f22502n = z;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m7256j(float f) {
        if (this.f22498j == f) {
            return;
        }
        this.f22489a |= 1024;
        this.f22498j = f;
    }

    /* JADX INFO: renamed from: k */
    public final void m7257k(float f) {
        if (this.f22490b == f) {
            return;
        }
        this.f22489a |= 1;
        this.f22490b = f;
    }

    /* JADX INFO: renamed from: l */
    public final void m7258l(float f) {
        if (this.f22491c == f) {
            return;
        }
        this.f22489a |= 2;
        this.f22491c = f;
    }

    /* JADX INFO: renamed from: m */
    public final void m7259m(float f) {
        if (this.f22495g == f) {
            return;
        }
        this.f22489a |= 32;
        this.f22495g = f;
    }

    /* JADX INFO: renamed from: n */
    public final void m7260n(p44 p44Var) {
        if (z62.m13387o(this.f22501m, p44Var)) {
            return;
        }
        this.f22489a |= 8192;
        this.f22501m = p44Var;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: r */
    public final float mo3585r() {
        return this.f22505q.mo3585r();
    }

    /* JADX INFO: renamed from: s */
    public final void m7261s(long j) {
        long j2 = this.f22497i;
        int i = pb0.f27502i;
        if (ws4.m12408a(j2, j)) {
            return;
        }
        this.f22489a |= 128;
        this.f22497i = j;
    }

    /* JADX INFO: renamed from: u */
    public final void m7262u(long j) {
        if (to4.m11081b(this.f22500l, j)) {
            return;
        }
        this.f22489a |= 4096;
        this.f22500l = j;
    }

    /* JADX INFO: renamed from: v */
    public final void m7263v(float f) {
        if (this.f22493e == f) {
            return;
        }
        this.f22489a |= 8;
        this.f22493e = f;
    }

    /* JADX INFO: renamed from: w */
    public final void m7264w(float f) {
        if (this.f22494f == f) {
            return;
        }
        this.f22489a |= 16;
        this.f22494f = f;
    }
}
