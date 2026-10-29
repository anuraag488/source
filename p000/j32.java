package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j32 implements ja4 {

    /* JADX INFO: renamed from: a */
    public ak3 f21985a;

    /* JADX INFO: renamed from: b */
    public Inflater f21986b;

    /* JADX INFO: renamed from: c */
    public int f21987c;

    /* JADX INFO: renamed from: d */
    public boolean f21988d;

    @Override // p000.ja4
    /* JADX INFO: renamed from: c */
    public final ym4 mo3025c() {
        return this.f21985a.f14585a.mo3025c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f21988d) {
            return;
        }
        this.f21986b.end();
        this.f21988d = true;
        this.f21985a.close();
    }

    @Override // p000.ja4
    /* JADX INFO: renamed from: w */
    public final long mo3038w(w30 w30Var, long j) throws IOException {
        long j2;
        while (j >= 0) {
            if (this.f21988d) {
                C1077qn.m9989o("closed");
                return 0L;
            }
            ak3 ak3Var = this.f21985a;
            Inflater inflater = this.f21986b;
            if (j == 0) {
                j2 = 0;
            } else {
                try {
                    zz3 zz3VarM12050K = w30Var.m12050K(1);
                    int iMin = (int) Math.min(j, 8192 - zz3VarM12050K.f36506c);
                    if (inflater.needsInput() && !ak3Var.m3023a()) {
                        zz3 zz3Var = ak3Var.f14586b.f33055a;
                        int i = zz3Var.f36506c;
                        int i2 = zz3Var.f36505b;
                        int i3 = i - i2;
                        this.f21987c = i3;
                        inflater.setInput(zz3Var.f36504a, i2, i3);
                    }
                    int iInflate = inflater.inflate(zz3VarM12050K.f36504a, zz3VarM12050K.f36506c, iMin);
                    int i4 = this.f21987c;
                    if (i4 != 0) {
                        int remaining = i4 - inflater.getRemaining();
                        this.f21987c -= remaining;
                        ak3Var.m3037t(remaining);
                    }
                    if (iInflate > 0) {
                        zz3VarM12050K.f36506c += iInflate;
                        j2 = iInflate;
                        w30Var.f33056b += j2;
                    } else {
                        if (zz3VarM12050K.f36505b == zz3VarM12050K.f36506c) {
                            w30Var.f33055a = zz3VarM12050K.m13894a();
                            c04.m3786a(zz3VarM12050K);
                        }
                        j2 = 0;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            if (j2 > 0) {
                return j2;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (ak3Var.m3023a()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        C1077qn.m9988n(zi4.m13619s("byteCount < 0: ", j));
        return 0L;
    }
}
