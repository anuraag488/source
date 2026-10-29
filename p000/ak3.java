package p000;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ak3 implements k40 {

    /* JADX INFO: renamed from: a */
    public final ja4 f14585a;

    /* JADX INFO: renamed from: b */
    public final w30 f14586b = new w30();

    /* JADX INFO: renamed from: c */
    public boolean f14587c;

    public ak3(ja4 ja4Var) {
        this.f14585a = ja4Var;
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: H */
    public final long mo3021H() throws EOFException {
        w30 w30Var;
        m3034q(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zMo3028i = mo3028i(i2);
            w30Var = this.f14586b;
            if (!zMo3028i) {
                break;
            }
            byte bM12063g = w30Var.m12063g(i);
            if ((bM12063g < 48 || bM12063g > 57) && ((bM12063g < 97 || bM12063g > 102) && (bM12063g < 65 || bM12063g > 70))) {
                if (i != 0) {
                    break;
                }
                y62.m12992v(16);
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(Integer.toString(bM12063g, 16)));
            }
            i = i2;
        }
        return w30Var.mo3021H();
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: I */
    public final String mo3022I(Charset charset) {
        ja4 ja4Var = this.f14585a;
        w30 w30Var = this.f14586b;
        w30Var.m12053N(ja4Var);
        return w30Var.m12047C(w30Var.f33056b, charset);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3023a() {
        if (this.f14587c) {
            C1077qn.m9989o("closed");
            return false;
        }
        w30 w30Var = this.f14586b;
        return w30Var.m12062e() && this.f14585a.mo3038w(w30Var, 8192L) == -1;
    }

    /* JADX INFO: renamed from: b */
    public final long m3024b(byte b, long j, long j2) {
        if (this.f14587c) {
            C1077qn.m9989o("closed");
            return 0L;
        }
        if (0 > j2) {
            C1077qn.m9988n(zi4.m13619s("fromIndex=0 toIndex=", j2));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            w30 w30Var = this.f14586b;
            byte b2 = b;
            long j3 = j2;
            long jM12064j = w30Var.m12064j(b2, jMax, j3);
            if (jM12064j != -1) {
                return jM12064j;
            }
            long j4 = w30Var.f33056b;
            if (j4 >= j3 || this.f14585a.mo3038w(w30Var, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // p000.ja4
    /* JADX INFO: renamed from: c */
    public final ym4 mo3025c() {
        return this.f14585a.mo3025c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f14587c) {
            return;
        }
        this.f14587c = true;
        this.f14585a.close();
        w30 w30Var = this.f14586b;
        w30Var.m12048D(w30Var.f33056b);
    }

    /* JADX INFO: renamed from: e */
    public final byte m3026e() throws EOFException {
        m3034q(1L);
        return this.f14586b.m12067q();
    }

    /* JADX INFO: renamed from: g */
    public final s50 m3027g(long j) throws EOFException {
        m3034q(j);
        return this.f14586b.m12069u(j);
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: i */
    public final boolean mo3028i(long j) {
        w30 w30Var;
        if (j < 0) {
            C1077qn.m9988n(zi4.m13619s("byteCount < 0: ", j));
            return false;
        }
        if (this.f14587c) {
            C1077qn.m9989o("closed");
            return false;
        }
        do {
            w30Var = this.f14586b;
            if (w30Var.f33056b >= j) {
                return true;
            }
        } while (this.f14585a.mo3038w(w30Var, 8192L) != -1);
        return false;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f14587c;
    }

    /* JADX INFO: renamed from: j */
    public final int m3029j() throws EOFException {
        m3034q(4L);
        return this.f14586b.m12070v();
    }

    /* JADX INFO: renamed from: k */
    public final int m3030k() throws EOFException {
        m3034q(4L);
        int iM12070v = this.f14586b.m12070v();
        return ((iM12070v & 255) << 24) | (((-16777216) & iM12070v) >>> 24) | ((16711680 & iM12070v) >>> 8) | ((65280 & iM12070v) << 8);
    }

    /* JADX INFO: renamed from: l */
    public final short m3031l() throws EOFException {
        m3034q(2L);
        return this.f14586b.m12045A();
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: n */
    public final String mo3032n() {
        return mo3040y(Long.MAX_VALUE);
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: p */
    public final byte[] mo3033p() {
        ja4 ja4Var = this.f14585a;
        w30 w30Var = this.f14586b;
        w30Var.m12053N(ja4Var);
        return w30Var.m12068t(w30Var.f33056b);
    }

    /* JADX INFO: renamed from: q */
    public final void m3034q(long j) throws EOFException {
        if (!mo3028i(j)) {
            throw new EOFException();
        }
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: r */
    public final w30 mo3035r() {
        return this.f14586b;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        w30 w30Var = this.f14586b;
        if (w30Var.f33056b == 0 && this.f14585a.mo3038w(w30Var, 8192L) == -1) {
            return -1;
        }
        return w30Var.read(byteBuffer);
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: s */
    public final int mo3036s(a63 a63Var) throws EOFException {
        w30 w30Var;
        if (this.f14587c) {
            C1077qn.m9989o("closed");
            return 0;
        }
        do {
            w30Var = this.f14586b;
            int iM3379c = AbstractC0473b.m3379c(w30Var, a63Var, true);
            if (iM3379c != -2) {
                if (iM3379c == -1) {
                    break;
                }
                w30Var.m12048D(a63Var.f141a[iM3379c].mo4261b());
                return iM3379c;
            }
        } while (this.f14585a.mo3038w(w30Var, 8192L) != -1);
        return -1;
    }

    /* JADX INFO: renamed from: t */
    public final void m3037t(long j) throws EOFException {
        if (this.f14587c) {
            C1077qn.m9989o("closed");
            return;
        }
        while (j > 0) {
            w30 w30Var = this.f14586b;
            if (w30Var.f33056b == 0 && this.f14585a.mo3038w(w30Var, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, w30Var.f33056b);
            w30Var.m12048D(jMin);
            j -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.f14585a + ')';
    }

    @Override // p000.ja4
    /* JADX INFO: renamed from: w */
    public final long mo3038w(w30 w30Var, long j) {
        if (j < 0) {
            C1077qn.m9988n(zi4.m13619s("byteCount < 0: ", j));
            return 0L;
        }
        if (this.f14587c) {
            C1077qn.m9989o("closed");
            return 0L;
        }
        w30 w30Var2 = this.f14586b;
        if (w30Var2.f33056b == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.f14585a.mo3038w(w30Var2, 8192L) == -1) {
                return -1L;
            }
        }
        return w30Var2.mo3038w(w30Var, Math.min(j, w30Var2.f33056b));
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: x */
    public final long mo3039x(yj3 yj3Var) {
        w30 w30Var;
        long j = 0;
        while (true) {
            ja4 ja4Var = this.f14585a;
            w30Var = this.f14586b;
            if (ja4Var.mo3038w(w30Var, 8192L) == -1) {
                break;
            }
            long jM12060a = w30Var.m12060a();
            if (jM12060a > 0) {
                j += jM12060a;
                yj3Var.mo3368d(w30Var, jM12060a);
            }
        }
        long j2 = w30Var.f33056b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        yj3Var.mo3368d(w30Var, j2);
        return j3;
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: y */
    public final String mo3040y(long j) throws EOFException {
        if (j < 0) {
            C1077qn.m9988n(zi4.m13619s("limit < 0: ", j));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jM3024b = m3024b((byte) 10, 0L, j2);
        w30 w30Var = this.f14586b;
        if (jM3024b != -1) {
            return AbstractC0473b.m3378b(w30Var, jM3024b);
        }
        if (j2 < Long.MAX_VALUE && mo3028i(j2) && w30Var.m12063g(j2 - 1) == 13 && mo3028i(j2 + 1) && w30Var.m12063g(j2) == 10) {
            return AbstractC0473b.m3378b(w30Var, j2);
        }
        w30 w30Var2 = new w30();
        w30Var.m12061b(w30Var2, 0L, Math.min(32L, w30Var.f33056b));
        throw new EOFException("\\n not found: limit=" + Math.min(w30Var.f33056b, j) + " content=" + w30Var2.m12069u(w30Var2.f33056b).mo4262c() + (char) 8230);
    }
}
