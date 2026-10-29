package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yj3 implements j40 {

    /* JADX INFO: renamed from: a */
    public f74 f35265a;

    /* JADX INFO: renamed from: b */
    public w30 f35266b;

    /* JADX INFO: renamed from: c */
    public boolean f35267c;

    @Override // p000.j40
    /* JADX INFO: renamed from: F */
    public final j40 mo6998F(String str) {
        if (this.f35267c) {
            C1077qn.m9989o("closed");
            return null;
        }
        this.f35266b.m12058S(str);
        m13147a();
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final j40 m13147a() {
        w30 w30Var = this.f35266b;
        if (this.f35267c) {
            C1077qn.m9989o("closed");
            return null;
        }
        long jM12060a = w30Var.m12060a();
        if (jM12060a > 0) {
            this.f35265a.mo3368d(w30Var, jM12060a);
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final j40 m13148b(long j) {
        boolean z;
        if (this.f35267c) {
            C1077qn.m9989o("closed");
            return null;
        }
        w30 w30Var = this.f35266b;
        w30Var.getClass();
        if (j == 0) {
            w30Var.m12054O(48);
        } else {
            if (j < 0) {
                j = -j;
                if (j < 0) {
                    w30Var.m12058S("-9223372036854775808");
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            byte[] bArr = AbstractC0473b.f14970a;
            int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
            int i = iNumberOfLeadingZeros + (j > AbstractC0473b.f14971b[iNumberOfLeadingZeros] ? 1 : 0);
            if (z) {
                i++;
            }
            zz3 zz3VarM12050K = w30Var.m12050K(i);
            byte[] bArr2 = zz3VarM12050K.f36504a;
            int i2 = zz3VarM12050K.f36506c + i;
            while (j != 0) {
                i2--;
                bArr2[i2] = AbstractC0473b.f14970a[(int) (j % 10)];
                j /= 10;
            }
            if (z) {
                bArr2[i2 - 1] = 45;
            }
            zz3VarM12050K.f36506c += i;
            w30Var.f33056b += (long) i;
        }
        m13147a();
        return this;
    }

    @Override // p000.f74
    /* JADX INFO: renamed from: c */
    public final ym4 mo3367c() {
        return this.f35265a.mo3367c();
    }

    @Override // p000.f74, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        f74 f74Var = this.f35265a;
        if (this.f35267c) {
            return;
        }
        w30 w30Var = this.f35266b;
        long j = w30Var.f33056b;
        if (j > 0) {
            f74Var.mo3368d(w30Var, j);
        }
        th = null;
        try {
            f74Var.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f35267c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p000.f74
    /* JADX INFO: renamed from: d */
    public final void mo3368d(w30 w30Var, long j) {
        if (this.f35267c) {
            C1077qn.m9989o("closed");
        } else {
            this.f35266b.mo3368d(w30Var, j);
            m13147a();
        }
    }

    /* JADX INFO: renamed from: e */
    public final j40 m13149e(int i) {
        if (this.f35267c) {
            C1077qn.m9989o("closed");
            return null;
        }
        this.f35266b.m12056Q(i);
        m13147a();
        return this;
    }

    @Override // p000.j40
    /* JADX INFO: renamed from: f */
    public final j40 mo6999f(long j) {
        if (this.f35267c) {
            C1077qn.m9989o("closed");
            return null;
        }
        this.f35266b.m12055P(j);
        m13147a();
        return this;
    }

    @Override // p000.j40, p000.f74, java.io.Flushable
    public final void flush() {
        f74 f74Var = this.f35265a;
        if (this.f35267c) {
            C1077qn.m9989o("closed");
            return;
        }
        w30 w30Var = this.f35266b;
        long j = w30Var.f33056b;
        if (j > 0) {
            f74Var.mo3368d(w30Var, j);
        }
        f74Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f35267c;
    }

    public final String toString() {
        return "buffer(" + this.f35265a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f35267c) {
            C1077qn.m9989o("closed");
            return 0;
        }
        int iWrite = this.f35266b.write(byteBuffer);
        m13147a();
        return iWrite;
    }

    @Override // p000.j40
    public final j40 writeByte(int i) {
        if (this.f35267c) {
            C1077qn.m9989o("closed");
            return null;
        }
        this.f35266b.m12054O(i);
        m13147a();
        return this;
    }
}
