package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class hg3 extends s74 {

    /* JADX INFO: renamed from: e */
    public final sv2 f20555e;

    /* JADX INFO: renamed from: f */
    public volatile jm4 f20556f;

    /* JADX INFO: renamed from: g */
    public volatile jm4 f20557g;

    public hg3(d81 d81Var, int i, String str) {
        super(d81Var, ke0.f23081a.incrementAndGet());
        int i2 = do2.f17236a;
        this.f20555e = new sv2(6);
        new lw2();
    }

    /* JADX INFO: renamed from: b */
    public jm4 mo6392b(long j, long j2, String str) {
        jm4 jm4Var;
        synchronized (this.f20555e) {
            try {
                sv2 sv2Var = this.f20555e;
                Object objM10924d = sv2Var.m10924d(j);
                if (objM10924d == null) {
                    jm4 jm4Var2 = new jm4(j, j2, str, this);
                    sv2Var.m10927g(j, jm4Var2);
                    objM10924d = jm4Var2;
                }
                jm4Var = (jm4) objM10924d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jm4Var;
    }
}
