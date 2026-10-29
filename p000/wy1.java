package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wy1 implements Closeable {

    /* JADX INFO: renamed from: f */
    public static final Logger f33849f = Logger.getLogger(gy1.class.getName());

    /* JADX INFO: renamed from: a */
    public yj3 f33850a;

    /* JADX INFO: renamed from: b */
    public w30 f33851b;

    /* JADX INFO: renamed from: c */
    public int f33852c;

    /* JADX INFO: renamed from: d */
    public boolean f33853d;

    /* JADX INFO: renamed from: e */
    public ux1 f33854e;

    /* JADX INFO: renamed from: a */
    public final synchronized void m12440a(b44 b44Var) {
        try {
            if (this.f33853d) {
                throw new IOException("closed");
            }
            int i = this.f33852c;
            int i2 = b44Var.f15078a;
            if ((i2 & 32) != 0) {
                i = b44Var.f15079b[5];
            }
            this.f33852c = i;
            if (((i2 & 2) != 0 ? b44Var.f15079b[1] : -1) != -1) {
                ux1 ux1Var = this.f33854e;
                int i3 = (i2 & 2) != 0 ? b44Var.f15079b[1] : -1;
                ux1Var.getClass();
                int iMin = Math.min(i3, 16384);
                int i4 = ux1Var.f32228d;
                if (i4 != iMin) {
                    if (iMin < i4) {
                        ux1Var.f32226b = Math.min(ux1Var.f32226b, iMin);
                    }
                    ux1Var.f32227c = true;
                    ux1Var.f32228d = iMin;
                    int i5 = ux1Var.f32232h;
                    if (iMin < i5) {
                        if (iMin == 0) {
                            AbstractC0990oo.m9206a0(null, ux1Var.f32229e);
                            ux1Var.f32230f = ux1Var.f32229e.length - 1;
                            ux1Var.f32231g = 0;
                            ux1Var.f32232h = 0;
                        } else {
                            ux1Var.m11677a(i5 - iMin);
                        }
                    }
                }
            }
            m12442e(0, 0, 4, 1);
            this.f33850a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m12441b(boolean z, int i, w30 w30Var, int i2) {
        if (this.f33853d) {
            throw new IOException("closed");
        }
        m12442e(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            this.f33850a.mo3368d(w30Var, i2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f33853d = true;
        this.f33850a.close();
    }

    /* JADX INFO: renamed from: e */
    public final void m12442e(int i, int i2, int i3, int i4) {
        yj3 yj3Var = this.f33850a;
        Level level = Level.FINE;
        Logger logger = f33849f;
        if (logger.isLoggable(level)) {
            logger.fine(gy1.m6195a(false, i, i2, i3, i4));
        }
        if (i2 > this.f33852c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f33852c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            C1077qn.m9988n(c75.m3877i(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = zv4.f36415a;
        yj3Var.writeByte((i2 >>> 16) & 255);
        yj3Var.writeByte((i2 >>> 8) & 255);
        yj3Var.writeByte(i2 & 255);
        yj3Var.writeByte(i3 & 255);
        yj3Var.writeByte(i4 & 255);
        yj3Var.m13149e(Integer.MAX_VALUE & i);
    }

    public final synchronized void flush() {
        if (this.f33853d) {
            throw new IOException("closed");
        }
        this.f33850a.flush();
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m12443g(byte[] bArr, int i, int i2) {
        if (this.f33853d) {
            throw new IOException("closed");
        }
        if (d55.m4359d(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        m12442e(0, bArr.length + 8, 7, 0);
        this.f33850a.m13149e(i);
        this.f33850a.m13149e(d55.m4359d(i2));
        if (bArr.length != 0) {
            yj3 yj3Var = this.f33850a;
            if (yj3Var.f35267c) {
                throw new IllegalStateException("closed");
            }
            yj3Var.f35266b.m12051L(bArr.length, bArr);
            yj3Var.m13147a();
        }
        this.f33850a.flush();
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m12444j(boolean z, int i, ArrayList arrayList) {
        if (this.f33853d) {
            throw new IOException("closed");
        }
        this.f33854e.m11680d(arrayList);
        long j = this.f33851b.f33056b;
        long jMin = Math.min(this.f33852c, j);
        int i2 = j == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        m12442e(i, (int) jMin, 1, i2);
        this.f33850a.mo3368d(this.f33851b, jMin);
        if (j > jMin) {
            long j2 = j - jMin;
            while (j2 > 0) {
                long jMin2 = Math.min(this.f33852c, j2);
                j2 -= jMin2;
                m12442e(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                this.f33850a.mo3368d(this.f33851b, jMin2);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m12445k(int i, int i2, boolean z) {
        if (this.f33853d) {
            throw new IOException("closed");
        }
        m12442e(0, 8, 6, z ? 1 : 0);
        this.f33850a.m13149e(i);
        this.f33850a.m13149e(i2);
        this.f33850a.flush();
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m12446l(int i, int i2) {
        if (this.f33853d) {
            throw new IOException("closed");
        }
        if (d55.m4359d(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        m12442e(i, 4, 3, 0);
        this.f33850a.m13149e(d55.m4359d(i2));
        this.f33850a.flush();
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m12447q(int i, long j) {
        if (this.f33853d) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        m12442e(i, 4, 8, 0);
        this.f33850a.m13149e((int) j);
        this.f33850a.flush();
    }
}
