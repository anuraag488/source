package p000;

import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sy1 implements f74 {

    /* JADX INFO: renamed from: a */
    public boolean f30644a;

    /* JADX INFO: renamed from: b */
    public w30 f30645b;

    /* JADX INFO: renamed from: c */
    public boolean f30646c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ vy1 f30647d;

    /* JADX INFO: renamed from: a */
    public final void m10954a(boolean z) {
        long jMin;
        boolean z2;
        vy1 vy1Var = this.f30647d;
        synchronized (vy1Var) {
            vy1Var.f32943l.m10384h();
            while (vy1Var.f32936e >= vy1Var.f32937f && !this.f30644a && !this.f30646c) {
                try {
                    synchronized (vy1Var) {
                        int i = vy1Var.f32944m;
                        if (i != 0) {
                            break;
                        }
                        try {
                            vy1Var.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    vy1Var.f32943l.m11682k();
                    throw th;
                }
            }
            vy1Var.f32943l.m11682k();
            vy1Var.m12020b();
            jMin = Math.min(vy1Var.f32937f - vy1Var.f32936e, this.f30645b.f33056b);
            vy1Var.f32936e += jMin;
            z2 = z && jMin == this.f30645b.f33056b;
        }
        this.f30647d.f32943l.m10384h();
        try {
            vy1 vy1Var2 = this.f30647d;
            vy1Var2.f32933b.m9333k(vy1Var2.f32932a, z2, this.f30645b, jMin);
        } finally {
            this.f30647d.f32943l.m11682k();
        }
    }

    @Override // p000.f74
    /* JADX INFO: renamed from: c */
    public final ym4 mo3367c() {
        return this.f30647d.f32943l;
    }

    @Override // p000.f74, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        vy1 vy1Var = this.f30647d;
        byte[] bArr = zv4.f36415a;
        synchronized (vy1Var) {
            if (this.f30646c) {
                return;
            }
            synchronized (vy1Var) {
                z = vy1Var.f32944m == 0;
            }
            vy1 vy1Var2 = this.f30647d;
            if (!vy1Var2.f32941j.f30644a) {
                if (this.f30645b.f33056b > 0) {
                    while (this.f30645b.f33056b > 0) {
                        m10954a(true);
                    }
                } else if (z) {
                    vy1Var2.f32933b.m9333k(vy1Var2.f32932a, true, null, 0L);
                }
            }
            synchronized (this.f30647d) {
                this.f30646c = true;
            }
            this.f30647d.f32933b.flush();
            this.f30647d.m12019a();
        }
    }

    @Override // p000.f74
    /* JADX INFO: renamed from: d */
    public final void mo3368d(w30 w30Var, long j) {
        w30 w30Var2 = this.f30645b;
        byte[] bArr = zv4.f36415a;
        w30Var2.mo3368d(w30Var, j);
        while (w30Var2.f33056b >= 16384) {
            m10954a(false);
        }
    }

    @Override // p000.f74, java.io.Flushable
    public final void flush() {
        vy1 vy1Var = this.f30647d;
        byte[] bArr = zv4.f36415a;
        synchronized (vy1Var) {
            vy1Var.m12020b();
        }
        while (this.f30645b.f33056b > 0) {
            m10954a(false);
            this.f30647d.f32933b.flush();
        }
    }
}
