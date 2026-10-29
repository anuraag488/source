package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k84 implements m31 {

    /* JADX INFO: renamed from: a */
    public ma0 f22986a;

    /* JADX INFO: renamed from: b */
    public z73 f22987b;

    /* JADX INFO: renamed from: c */
    public boolean f22988c;

    /* JADX INFO: renamed from: d */
    public float[] f22989d;

    /* JADX INFO: renamed from: e */
    public a83 f22990e;

    /* JADX INFO: renamed from: f */
    public a83 f22991f;

    /* JADX INFO: renamed from: g */
    public d63 f22992g;

    /* JADX INFO: renamed from: h */
    public boolean f22993h;

    /* JADX INFO: renamed from: i */
    public d83 f22994i;

    /* JADX INFO: renamed from: j */
    public a83 f22995j;

    /* JADX INFO: renamed from: k */
    public a83 f22996k;

    /* JADX INFO: renamed from: l */
    public d83 f22997l;

    /* JADX INFO: renamed from: m */
    public z73 f22998m;

    /* JADX INFO: renamed from: n */
    public z73 f22999n;

    /* JADX INFO: renamed from: o */
    public vv0 f23000o;

    /* JADX INFO: renamed from: p */
    public dx2 f23001p;

    @Override // p000.m31
    /* JADX INFO: renamed from: a */
    public final Object mo7424a(C1031pe c1031pe, C1312wz c1312wz) {
        xw2 xw2Var = xw2.f34665a;
        Object objM13685q = zp0.m13685q(new it1(this, c1031pe, (wm0) null), c1312wz);
        return objM13685q == ap0.f14763a ? objM13685q : ju4.f22634a;
    }

    /* JADX INFO: renamed from: b */
    public final void m7425b(float f, yp1 yp1Var) {
        float fMin;
        float fMax;
        z73 z73Var = this.f22987b;
        ma0 ma0Var = this.f22986a;
        float[] fArr = this.f22989d;
        z73 z73Var2 = this.f22999n;
        a83 a83Var = this.f22995j;
        a83 a83Var2 = this.f22996k;
        z73 z73Var3 = this.f22998m;
        if (this.f22992g == d63.f16814a) {
            fMax = Math.max(this.f22991f.m132h() - (a83Var2.m132h() / 2.0f), 0.0f);
            fMin = Math.min(a83Var2.m132h() / 2.0f, fMax);
        } else {
            float fMax2 = Math.max(this.f22990e.m132h() - (a83Var.m132h() / 2.0f), 0.0f);
            fMin = Math.min(a83Var.m132h() / 2.0f, fMax2);
            fMax = fMax2;
        }
        z73Var3.m13400i(z73Var2.m13399h() + z73Var3.m13399h() + f);
        z73Var2.m13400i(0.0f);
        float fM7051e = j84.m7051e(z73Var3.m13399h(), fMin, fMax, fArr);
        float f2 = fMax - fMin;
        float fM13656G = zp0.m13656G(ma0Var.f24778a, ma0Var.f24779b, sc6.m10674o(f2 == 0.0f ? 0.0f : (fM7051e - fMin) / f2, 0.0f, 1.0f));
        if (fM13656G == z73Var.m13399h()) {
            return;
        }
        if (yp1Var != null) {
            yp1Var.invoke(Float.valueOf(fM13656G));
            return;
        }
        if (this.f22988c) {
            float f3 = ma0Var.f24778a;
            float f4 = ma0Var.f24779b;
            fM13656G = j84.m7051e(sc6.m10674o(fM13656G, f3, f4), ma0Var.f24778a, f4, fArr);
        }
        z73Var.m13400i(fM13656G);
    }

    /* JADX INFO: renamed from: c */
    public final float m7426c() {
        ma0 ma0Var = this.f22986a;
        float f = ma0Var.f24778a;
        float f2 = ma0Var.f24779b;
        float fM10674o = sc6.m10674o(this.f22987b.m13399h(), ma0Var.f24778a, f2);
        float f3 = f2 - f;
        return sc6.m10674o(f3 == 0.0f ? 0.0f : (fM10674o - f) / f3, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: d */
    public final void m7427d(boolean z) {
        this.f22997l.setValue(Boolean.valueOf(z));
    }
}
