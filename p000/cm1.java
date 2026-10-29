package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cm1 implements am1 {

    /* JADX INFO: renamed from: a */
    public C0572de f16121a;

    /* JADX INFO: renamed from: b */
    public pb3 f16122b;

    /* JADX INFO: renamed from: c */
    public pq3 f16123c;

    /* JADX INFO: renamed from: d */
    public im1 f16124d;

    /* JADX INFO: renamed from: e */
    public w42 f16125e;

    /* JADX INFO: renamed from: f */
    public b71 f16126f;

    /* JADX INFO: renamed from: a */
    public final is4 m4043a(fs4 fs4Var) {
        pq3 pq3Var = this.f16123c;
        na1 na1Var = new na1((byte) 5);
        na1Var.f25595b = this;
        na1Var.f25596c = fs4Var;
        VarHandle.storeStoreFence();
        synchronized (((f70) pq3Var.f27896b)) {
            is4 is4Var = (is4) ((bp2) pq3Var.f27897c).m3648c(fs4Var);
            if (is4Var != null) {
                if (is4Var.mo6154c()) {
                    return is4Var;
                }
            }
            try {
                cz3 cz3Var = new cz3((byte) 20);
                cz3Var.f16638b = pq3Var;
                cz3Var.f16639c = fs4Var;
                VarHandle.storeStoreFence();
                is4 is4Var2 = (is4) na1Var.invoke(cz3Var);
                synchronized (((f70) pq3Var.f27896b)) {
                    if (((bp2) pq3Var.f27897c).m3648c(fs4Var) == null && is4Var2.mo6154c()) {
                        ((bp2) pq3Var.f27897c).m3649d(fs4Var, is4Var2);
                    }
                }
                return is4Var2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final is4 m4044b(bm1 bm1Var, xm1 xm1Var, int i, int i2) {
        pb3 pb3Var = this.f16122b;
        pb3Var.getClass();
        return m4043a(new fs4(bm1Var, pb3Var.mo5094a(xm1Var), i, i2, null));
    }
}
