package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uk4 {

    /* JADX INFO: renamed from: a */
    public df2 f31953a;

    /* JADX INFO: renamed from: b */
    public ky0 f31954b;

    /* JADX INFO: renamed from: c */
    public am1 f31955c;

    /* JADX INFO: renamed from: d */
    public xl4 f31956d;

    /* JADX INFO: renamed from: e */
    public Object f31957e;

    /* JADX INFO: renamed from: f */
    public d83 f31958f;

    /* JADX INFO: renamed from: g */
    public long f31959g;

    /* JADX INFO: renamed from: a */
    public static void m11580a(uk4 uk4Var, df2 df2Var, ky0 ky0Var, xl4 xl4Var, int i) {
        if ((i & 1) != 0) {
            df2Var = uk4Var.f31953a;
        }
        if ((i & 2) != 0) {
            ky0Var = uk4Var.f31954b;
        }
        am1 am1Var = uk4Var.f31955c;
        if ((i & 8) != 0) {
            xl4Var = uk4Var.f31956d;
        }
        Object obj = uk4Var.f31957e;
        df2 df2Var2 = uk4Var.f31953a;
        d83 d83Var = uk4Var.f31958f;
        if (df2Var == df2Var2 && z62.m13387o(ky0Var, uk4Var.f31954b) && z62.m13387o(am1Var, uk4Var.f31955c) && z62.m13387o(xl4Var, uk4Var.f31956d)) {
            if (z62.m13387o(obj, uk4Var.f31957e)) {
                return;
            }
            uk4Var.f31957e = obj;
            d83Var.setValue(Boolean.TRUE);
            return;
        }
        uk4Var.f31953a = df2Var;
        uk4Var.f31954b = ky0Var;
        uk4Var.f31955c = am1Var;
        uk4Var.f31956d = xl4Var;
        d83Var.setValue(Boolean.TRUE);
    }
}
