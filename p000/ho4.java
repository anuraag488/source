package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ho4 {

    /* JADX INFO: renamed from: e */
    public static final yg3 f20755e = AbstractC0647fd.m5645C(new n14(16), new r54(29));

    /* JADX INFO: renamed from: a */
    public float f20756a;

    /* JADX INFO: renamed from: b */
    public final z73 f20757b;

    /* JADX INFO: renamed from: c */
    public final wp1 f20758c = new fj0(6);

    /* JADX INFO: renamed from: d */
    public final z73 f20759d;

    public ho4(float f, float f2, float f3) {
        this.f20756a = f;
        this.f20757b = new z73(f3);
        this.f20759d = new z73(f2);
    }

    /* JADX INFO: renamed from: a */
    public final float m6464a() {
        if (this.f20756a == 0.0f) {
            return 0.0f;
        }
        return this.f20759d.m13399h() / this.f20756a;
    }

    /* JADX INFO: renamed from: b */
    public final void m6465b(float f) {
        this.f20759d.m13400i(sc6.m10674o(f, this.f20756a, 0.0f));
    }
}
