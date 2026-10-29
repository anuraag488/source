package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zh3 {

    /* JADX INFO: renamed from: a */
    public final xh3 f36091a;

    /* JADX INFO: renamed from: b */
    public final boolean f36092b;

    /* JADX INFO: renamed from: c */
    public final r94 f36093c;

    /* JADX INFO: renamed from: d */
    public final sw2 f36094d;

    /* JADX INFO: renamed from: e */
    public final yp1 f36095e;

    /* JADX INFO: renamed from: f */
    public final boolean f36096f;

    /* JADX INFO: renamed from: g */
    public final Object f36097g;

    /* JADX INFO: renamed from: h */
    public boolean f36098h = true;

    public zh3(xh3 xh3Var, Object obj, boolean z, r94 r94Var, sw2 sw2Var, yp1 yp1Var, boolean z2) {
        this.f36091a = xh3Var;
        this.f36092b = z;
        this.f36093c = r94Var;
        this.f36094d = sw2Var;
        this.f36095e = yp1Var;
        this.f36096f = z2;
        this.f36097g = obj;
    }

    /* JADX INFO: renamed from: a */
    public final Object m13560a() {
        if (this.f36092b) {
            return null;
        }
        sw2 sw2Var = this.f36094d;
        if (sw2Var != null) {
            return sw2Var.getValue();
        }
        Object obj = this.f36097g;
        if (obj != null) {
            return obj;
        }
        qi0.m9890b("Unexpected form of a provided value");
        xy4.m12794w();
        return null;
    }
}
