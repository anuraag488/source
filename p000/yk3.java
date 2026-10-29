package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yk3 {

    /* JADX INFO: renamed from: a */
    public zk3 f35297a;

    /* JADX INFO: renamed from: b */
    public int f35298b;

    /* JADX INFO: renamed from: c */
    public cr1 f35299c;

    /* JADX INFO: renamed from: d */
    public mq1 f35300d;

    /* JADX INFO: renamed from: e */
    public int f35301e;

    /* JADX INFO: renamed from: f */
    public yv2 f35302f;

    /* JADX INFO: renamed from: g */
    public lw2 f35303g;

    public yk3(zk3 zk3Var) {
        this.f35297a = zk3Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13152a() {
        if (this.f35297a != null) {
            cr1 cr1Var = this.f35299c;
            if (cr1Var != null ? cr1Var.m4142a() : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final m72 m13153b(Object obj) {
        m72 m72VarMo13320f;
        zk3 zk3Var = this.f35297a;
        return (zk3Var == null || (m72VarMo13320f = zk3Var.mo13320f(this, obj)) == null) ? m72.f24705a : m72VarMo13320f;
    }

    /* JADX INFO: renamed from: c */
    public final void m13154c() {
        zk3 zk3Var = this.f35297a;
        if (zk3Var != null) {
            zk3Var.mo13321g();
        }
        this.f35297a = null;
        this.f35302f = null;
        this.f35303g = null;
        this.f35300d = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m13155d(boolean z) {
        int i = this.f35298b;
        this.f35298b = z ? i | 32 : i & (-33);
    }
}
