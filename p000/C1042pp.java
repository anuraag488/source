package p000;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: pp */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1042pp implements f74 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f27872a = 0;

    /* JADX INFO: renamed from: b */
    public Object f27873b;

    /* JADX INFO: renamed from: c */
    public Object f27874c;

    public C1042pp(OutputStream outputStream, ym4 ym4Var) {
        this.f27873b = outputStream;
        this.f27874c = ym4Var;
    }

    @Override // p000.f74
    /* JADX INFO: renamed from: c */
    public final ym4 mo3367c() {
        switch (this.f27872a) {
            case 0:
                return (da4) this.f27873b;
            default:
                return (ym4) this.f27874c;
        }
    }

    @Override // p000.f74, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f27872a) {
            case 0:
                da4 da4Var = (da4) this.f27873b;
                C1042pp c1042pp = (C1042pp) this.f27874c;
                da4Var.m10384h();
                try {
                    try {
                        c1042pp.close();
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
                ((OutputStream) this.f27873b).close();
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008d A[LOOP:1: B:12:0x005b->B:25:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x008f A[SYNTHETIC] */
    @Override // p000.f74
    /* JADX INFO: renamed from: d */
    public final void mo3368d(w30 w30Var, long j) throws IOException {
        long j2;
        da4 da4Var;
        switch (this.f27872a) {
            case 0:
                dt0.m4719u(w30Var.f33056b, 0L, j);
                for (long j3 = j; j3 > 0; j3 -= j2) {
                    zz3 zz3Var = w30Var.f33055a;
                    j2 = 0;
                    try {
                        try {
                            while (j2 < 65536) {
                                j2 += (long) (zz3Var.f36506c - zz3Var.f36505b);
                                if (j2 >= j3) {
                                    j2 = j3;
                                    da4Var = (da4) this.f27873b;
                                    C1042pp c1042pp = (C1042pp) this.f27874c;
                                    da4Var.m10384h();
                                    c1042pp.mo3368d(w30Var, j2);
                                    if (!da4Var.m10385i()) {
                                        throw da4Var.m4414k(null);
                                    }
                                } else {
                                    zz3Var = zz3Var.f36509f;
                                }
                            }
                            c1042pp.mo3368d(w30Var, j2);
                            if (!da4Var.m10385i()) {
                                throw da4Var.m4414k(null);
                            }
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
                    da4Var = (da4) this.f27873b;
                    C1042pp c1042pp2 = (C1042pp) this.f27874c;
                    da4Var.m10384h();
                }
                return;
            default:
                dt0.m4719u(w30Var.f33056b, 0L, j);
                long j4 = j;
                while (j4 > 0) {
                    ((ym4) this.f27874c).mo7566f();
                    zz3 zz3Var2 = w30Var.f33055a;
                    int iMin = (int) Math.min(j4, zz3Var2.f36506c - zz3Var2.f36505b);
                    ((OutputStream) this.f27873b).write(zz3Var2.f36504a, zz3Var2.f36505b, iMin);
                    int i = zz3Var2.f36505b + iMin;
                    zz3Var2.f36505b = i;
                    long j5 = iMin;
                    j4 -= j5;
                    w30Var.f33056b -= j5;
                    if (i == zz3Var2.f36506c) {
                        w30Var.f33055a = zz3Var2.m13894a();
                        c04.m3786a(zz3Var2);
                    }
                }
                return;
        }
    }

    @Override // p000.f74, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f27872a) {
            case 0:
                da4 da4Var = (da4) this.f27873b;
                C1042pp c1042pp = (C1042pp) this.f27874c;
                da4Var.m10384h();
                try {
                    try {
                        c1042pp.flush();
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
                ((OutputStream) this.f27873b).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f27872a) {
            case 0:
                return "AsyncTimeout.sink(" + ((C1042pp) this.f27874c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f27873b) + ')';
        }
    }

    public /* synthetic */ C1042pp() {
    }
}
