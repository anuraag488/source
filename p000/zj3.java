package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zj3 extends InputStream {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ak3 f36152a;

    public zj3(ak3 ak3Var) {
        this.f36152a = ak3Var;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        ak3 ak3Var = this.f36152a;
        if (!ak3Var.f14587c) {
            return (int) Math.min(ak3Var.f14586b.f33056b, 2147483647L);
        }
        wb1.m12191j("closed");
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f36152a.close();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        ak3 ak3Var = this.f36152a;
        w30 w30Var = ak3Var.f14586b;
        if (ak3Var.f14587c) {
            wb1.m12191j("closed");
            return 0;
        }
        dt0.m4719u(bArr.length, i, i2);
        if (w30Var.f33056b == 0 && ak3Var.f14585a.mo3038w(w30Var, 8192L) == -1) {
            return -1;
        }
        return w30Var.read(bArr, i, i2);
    }

    public final String toString() {
        return this.f36152a + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final long transferTo(OutputStream outputStream) throws IOException {
        ak3 ak3Var = this.f36152a;
        w30 w30Var = ak3Var.f14586b;
        if (ak3Var.f14587c) {
            wb1.m12191j("closed");
            return 0L;
        }
        long j = 0;
        while (true) {
            if (w30Var.f33056b == 0 && ak3Var.f14585a.mo3038w(w30Var, 8192L) == -1) {
                return j;
            }
            long j2 = w30Var.f33056b;
            j += j2;
            dt0.m4719u(j2, 0L, j2);
            zz3 zz3Var = w30Var.f33055a;
            while (j2 > 0) {
                int iMin = (int) Math.min(j2, zz3Var.f36506c - zz3Var.f36505b);
                outputStream.write(zz3Var.f36504a, zz3Var.f36505b, iMin);
                int i = zz3Var.f36505b + iMin;
                zz3Var.f36505b = i;
                long j3 = iMin;
                w30Var.f33056b -= j3;
                j2 -= j3;
                if (i == zz3Var.f36506c) {
                    zz3 zz3VarM13894a = zz3Var.m13894a();
                    w30Var.f33055a = zz3VarM13894a;
                    c04.m3786a(zz3Var);
                    zz3Var = zz3VarM13894a;
                }
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        ak3 ak3Var = this.f36152a;
        w30 w30Var = ak3Var.f14586b;
        if (ak3Var.f14587c) {
            wb1.m12191j("closed");
            return 0;
        }
        if (w30Var.f33056b == 0 && ak3Var.f14585a.mo3038w(w30Var, 8192L) == -1) {
            return -1;
        }
        return w30Var.m12067q() & 255;
    }
}
