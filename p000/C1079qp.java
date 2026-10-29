package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/* JADX INFO: renamed from: qp */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1079qp implements ja4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28648a = 0;

    /* JADX INFO: renamed from: b */
    public Object f28649b;

    /* JADX INFO: renamed from: c */
    public Object f28650c;

    public C1079qp(InputStream inputStream, ym4 ym4Var) {
        this.f28649b = inputStream;
        this.f28650c = ym4Var;
    }

    @Override // p000.ja4
    /* JADX INFO: renamed from: c */
    public final ym4 mo3025c() {
        switch (this.f28648a) {
            case 0:
                return (da4) this.f28649b;
            default:
                return (ym4) this.f28650c;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f28648a) {
            case 0:
                da4 da4Var = (da4) this.f28649b;
                C1079qp c1079qp = (C1079qp) this.f28650c;
                da4Var.m10384h();
                try {
                    try {
                        c1079qp.close();
                        if (da4Var.m10385i()) {
                            throw da4Var.m4414k(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!da4Var.m10385i()) {
                            throw e;
                        }
                        throw da4Var.m4414k(e);
                    }
                } catch (Throwable th) {
                    da4Var.m10385i();
                    throw th;
                }
            default:
                ((InputStream) this.f28649b).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f28648a) {
            case 0:
                return "AsyncTimeout.source(" + ((C1079qp) this.f28650c) + ')';
            default:
                return "source(" + ((InputStream) this.f28649b) + ')';
        }
    }

    @Override // p000.ja4
    /* JADX INFO: renamed from: w */
    public final long mo3038w(w30 w30Var, long j) throws IOException {
        switch (this.f28648a) {
            case 0:
                da4 da4Var = (da4) this.f28649b;
                C1079qp c1079qp = (C1079qp) this.f28650c;
                da4Var.m10384h();
                try {
                    try {
                        long jMo3038w = c1079qp.mo3038w(w30Var, j);
                        if (da4Var.m10385i()) {
                            throw da4Var.m4414k(null);
                        }
                        return jMo3038w;
                    } catch (IOException e) {
                        if (da4Var.m10385i()) {
                            throw da4Var.m4414k(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    da4Var.m10385i();
                    throw th;
                }
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    C1077qn.m9988n(zi4.m13619s("byteCount < 0: ", j));
                    return 0L;
                }
                try {
                    ((ym4) this.f28650c).mo7566f();
                    zz3 zz3VarM12050K = w30Var.m12050K(1);
                    int i = ((InputStream) this.f28649b).read(zz3VarM12050K.f36504a, zz3VarM12050K.f36506c, (int) Math.min(j, 8192 - zz3VarM12050K.f36506c));
                    if (i == -1) {
                        if (zz3VarM12050K.f36505b == zz3VarM12050K.f36506c) {
                            w30Var.f33055a = zz3VarM12050K.m13894a();
                            c04.m3786a(zz3VarM12050K);
                        }
                        return -1L;
                    }
                    zz3VarM12050K.f36506c += i;
                    long j2 = i;
                    w30Var.f33056b += j2;
                    return j2;
                } catch (AssertionError e2) {
                    Logger logger = u45.f31653a;
                    if (e2.getCause() != null) {
                        String message = e2.getMessage();
                        if (message != null ? hd4.m6335a0(message, "getsockname failed", false) : false) {
                            throw new IOException(e2);
                        }
                    }
                    throw e2;
                }
        }
    }

    public /* synthetic */ C1079qp() {
    }
}
