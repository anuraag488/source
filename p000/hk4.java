package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hk4 {

    /* JADX INFO: renamed from: g */
    public static final yg3 f20658g = AbstractC0647fd.m5645C(new n14(10), new r54(22));

    /* JADX INFO: renamed from: a */
    public final z73 f20659a;

    /* JADX INFO: renamed from: b */
    public final z73 f20660b = new z73(0.0f);

    /* JADX INFO: renamed from: c */
    public final a83 f20661c = new a83(0);

    /* JADX INFO: renamed from: d */
    public jl3 f20662d = jl3.f22395e;

    /* JADX INFO: renamed from: e */
    public long f20663e = ql4.f28556b;

    /* JADX INFO: renamed from: f */
    public final d83 f20664f;

    public hk4(d63 d63Var, float f) {
        this.f20659a = new z73(f);
        this.f20664f = new d83(d63Var, ia5.f21230u);
    }

    /* JADX INFO: renamed from: a */
    public final void m6425a(d63 d63Var, jl3 jl3Var, int i, int i2) {
        float f;
        float f2 = i2 - i;
        this.f20660b.m13400i(f2);
        float f3 = jl3Var.f22396a;
        float f4 = jl3Var.f22397b;
        jl3 jl3Var2 = this.f20662d;
        float f5 = jl3Var2.f22396a;
        z73 z73Var = this.f20659a;
        if (f3 != f5 || f4 != jl3Var2.f22397b) {
            boolean z = d63Var == d63.f16814a;
            if (z) {
                f3 = f4;
            }
            float f6 = z ? jl3Var.f22399d : jl3Var.f22398c;
            float fM13399h = z73Var.m13399h();
            float f7 = i;
            float f8 = fM13399h + f7;
            if (f6 <= f8 && (f3 >= fM13399h || f6 - f3 <= f7)) {
                f = (f3 >= fM13399h || f6 - f3 > f7) ? 0.0f : f3 - fM13399h;
            } else {
                f = f6 - f8;
            }
            z73Var.m13400i(z73Var.m13399h() + f);
            this.f20662d = jl3Var;
        }
        z73Var.m13400i(sc6.m10674o(z73Var.m13399h(), 0.0f, f2));
        this.f20661c.m133i(i);
    }
}
