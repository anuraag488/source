package p000;

import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ty1 implements ja4 {

    /* JADX INFO: renamed from: a */
    public long f31527a;

    /* JADX INFO: renamed from: b */
    public boolean f31528b;

    /* JADX INFO: renamed from: c */
    public w30 f31529c;

    /* JADX INFO: renamed from: d */
    public w30 f31530d;

    /* JADX INFO: renamed from: e */
    public boolean f31531e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ vy1 f31532f;

    @Override // p000.ja4
    /* JADX INFO: renamed from: c */
    public final ym4 mo3025c() {
        return this.f31532f.f32942k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        vy1 vy1Var = this.f31532f;
        synchronized (vy1Var) {
            this.f31531e = true;
            w30 w30Var = this.f31530d;
            j = w30Var.f33056b;
            w30Var.m12048D(j);
            vy1Var.notifyAll();
        }
        if (j > 0) {
            vy1 vy1Var2 = this.f31532f;
            byte[] bArr = zv4.f36415a;
            vy1Var2.f32933b.m9332j(j);
        }
        this.f31532f.m12019a();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0096 A[LOOP:0: B:4:0x000a->B:47:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:76:0x009a A[SYNTHETIC] */
    @Override // p000.ja4
    /* JADX INFO: renamed from: w */
    public final long mo3038w(w30 w30Var, long j) throws Throwable {
        int i;
        Throwable vc4Var;
        boolean z;
        long j2;
        long jMo3038w;
        long j3 = 0;
        if (j < 0) {
            C1077qn.m9988n(zi4.m13619s("byteCount < 0: ", j));
            return 0L;
        }
        while (true) {
            vy1 vy1Var = this.f31532f;
            synchronized (vy1Var) {
                vy1Var.f32942k.m10384h();
                try {
                    synchronized (vy1Var) {
                        i = vy1Var.f32944m;
                    }
                    if (z) {
                        if (jMo3038w != -1) {
                            return jMo3038w;
                        }
                        if (vc4Var == null) {
                            return -1L;
                        }
                        throw vc4Var;
                    }
                    j3 = j2;
                } catch (Throwable th) {
                    vy1Var.f32942k.m11682k();
                    throw th;
                }
            }
            if (i != 0 && !this.f31528b) {
                vc4Var = vy1Var.f32945n;
                if (vc4Var == null) {
                    synchronized (vy1Var) {
                        vc4Var = new vc4(vy1Var.f32944m);
                    }
                }
                throw th;
            }
            vc4Var = null;
            if (this.f31531e) {
                throw new IOException("stream closed");
            }
            w30 w30Var2 = this.f31530d;
            long j4 = w30Var2.f33056b;
            z = false;
            if (j4 > j3) {
                jMo3038w = w30Var2.mo3038w(w30Var, Math.min(j, j4));
                long j5 = vy1Var.f32934c + jMo3038w;
                vy1Var.f32934c = j5;
                j2 = j3;
                long j6 = j5 - vy1Var.f32935d;
                if (vc4Var == null && j6 >= vy1Var.f32933b.f27222p.m3433a() / 2) {
                    vy1Var.f32933b.m9335q(vy1Var.f32932a, j6);
                    vy1Var.f32935d = vy1Var.f32934c;
                }
            } else {
                j2 = j3;
                if (!this.f31528b && vc4Var == null) {
                    try {
                        vy1Var.wait();
                        z = true;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                jMo3038w = -1;
            }
            vy1Var.f32942k.m11682k();
            if (z) {
                if (jMo3038w != -1) {
                    return jMo3038w;
                }
                if (vc4Var == null) {
                    return -1L;
                }
                throw vc4Var;
            }
            j3 = j2;
        }
    }
}
