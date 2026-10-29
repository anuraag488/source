package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q93 implements ja4 {

    /* JADX INFO: renamed from: a */
    public final k40 f28323a;

    /* JADX INFO: renamed from: b */
    public final w30 f28324b;

    /* JADX INFO: renamed from: c */
    public zz3 f28325c;

    /* JADX INFO: renamed from: d */
    public int f28326d;

    /* JADX INFO: renamed from: e */
    public boolean f28327e;

    /* JADX INFO: renamed from: f */
    public long f28328f;

    public q93(k40 k40Var) {
        this.f28323a = k40Var;
        w30 w30VarMo3035r = k40Var.mo3035r();
        this.f28324b = w30VarMo3035r;
        zz3 zz3Var = w30VarMo3035r.f33055a;
        this.f28325c = zz3Var;
        this.f28326d = zz3Var != null ? zz3Var.f36505b : -1;
    }

    @Override // p000.ja4
    /* JADX INFO: renamed from: c */
    public final ym4 mo3025c() {
        return this.f28323a.mo3025c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f28327e = true;
    }

    @Override // p000.ja4
    /* JADX INFO: renamed from: w */
    public final long mo3038w(w30 w30Var, long j) {
        zz3 zz3Var;
        zz3 zz3Var2;
        if (j < 0) {
            C1077qn.m9988n(zi4.m13619s("byteCount < 0: ", j));
            return 0L;
        }
        if (this.f28327e) {
            C1077qn.m9989o("closed");
            return 0L;
        }
        zz3 zz3Var3 = this.f28325c;
        w30 w30Var2 = this.f28324b;
        if (zz3Var3 != null && (zz3Var3 != (zz3Var2 = w30Var2.f33055a) || this.f28326d != zz3Var2.f36505b)) {
            C1077qn.m9989o("Peek source is invalid because upstream source was used");
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.f28323a.mo3028i(this.f28328f + 1)) {
            return -1L;
        }
        if (this.f28325c == null && (zz3Var = w30Var2.f33055a) != null) {
            this.f28325c = zz3Var;
            this.f28326d = zz3Var.f36505b;
        }
        long jMin = Math.min(j, w30Var2.f33056b - this.f28328f);
        this.f28324b.m12061b(w30Var, this.f28328f, jMin);
        this.f28328f += jMin;
        return jMin;
    }
}
