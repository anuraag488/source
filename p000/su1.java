package p000;

import java.io.EOFException;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class su1 implements ja4 {

    /* JADX INFO: renamed from: a */
    public byte f30565a;

    /* JADX INFO: renamed from: b */
    public final ak3 f30566b;

    /* JADX INFO: renamed from: c */
    public final Inflater f30567c;

    /* JADX INFO: renamed from: d */
    public final j32 f30568d;

    /* JADX INFO: renamed from: e */
    public final CRC32 f30569e;

    public su1(ja4 ja4Var) {
        ak3 ak3Var = new ak3(ja4Var);
        this.f30566b = ak3Var;
        Inflater inflater = new Inflater(true);
        this.f30567c = inflater;
        j32 j32Var = new j32();
        j32Var.f21985a = ak3Var;
        j32Var.f21986b = inflater;
        VarHandle.storeStoreFence();
        this.f30568d = j32Var;
        this.f30569e = new CRC32();
    }

    /* JADX INFO: renamed from: a */
    public static void m10919a(int i, String str, int i2) throws IOException {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + hd4.m6347m0(8, dt0.m4693V(i2)) + " != expected 0x" + hd4.m6347m0(8, dt0.m4693V(i)));
    }

    /* JADX INFO: renamed from: b */
    public final void m10920b(w30 w30Var, long j, long j2) {
        zz3 zz3Var = w30Var.f33055a;
        while (true) {
            long j3 = zz3Var.f36506c - zz3Var.f36505b;
            if (j < j3) {
                break;
            }
            j -= j3;
            zz3Var = zz3Var.f36509f;
        }
        while (j2 > 0) {
            int i = (int) (((long) zz3Var.f36505b) + j);
            int iMin = (int) Math.min(zz3Var.f36506c - i, j2);
            this.f30569e.update(zz3Var.f36504a, i, iMin);
            j2 -= (long) iMin;
            zz3Var = zz3Var.f36509f;
            j = 0;
        }
    }

    @Override // p000.ja4
    /* JADX INFO: renamed from: c */
    public final ym4 mo3025c() {
        return this.f30566b.f14585a.mo3025c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f30568d.close();
    }

    @Override // p000.ja4
    /* JADX INFO: renamed from: w */
    public final long mo3038w(w30 w30Var, long j) throws IOException {
        long j2;
        su1 su1Var = this;
        ak3 ak3Var = su1Var.f30566b;
        w30 w30Var2 = ak3Var.f14586b;
        long j3 = 0;
        if (j < 0) {
            C1077qn.m9988n(zi4.m13619s("byteCount < 0: ", j));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b = su1Var.f30565a;
        CRC32 crc32 = su1Var.f30569e;
        if (b == 0) {
            ak3Var.m3034q(10L);
            byte bM12063g = w30Var2.m12063g(3L);
            boolean z = ((bM12063g >> 1) & 1) == 1;
            if (z) {
                su1Var.m10920b(w30Var2, 0L, 10L);
            }
            m10919a(8075, "ID1ID2", ak3Var.m3031l());
            ak3Var.m3037t(8L);
            if (((bM12063g >> 2) & 1) == 1) {
                ak3Var.m3034q(2L);
                if (z) {
                    j2 = 2;
                    m10920b(w30Var2, 0L, 2L);
                } else {
                    j2 = 2;
                }
                long jM12046B = w30Var2.m12046B() & 65535;
                ak3Var.m3034q(jM12046B);
                if (z) {
                    m10920b(w30Var2, 0L, jM12046B);
                }
                ak3Var.m3037t(jM12046B);
            } else {
                j3 = 0;
                j2 = 2;
            }
            if (((bM12063g >> 3) & 1) == 1) {
                long jM3024b = ak3Var.m3024b((byte) 0, 0L, Long.MAX_VALUE);
                if (jM3024b == -1) {
                    throw new EOFException();
                }
                if (z) {
                    m10920b(w30Var2, 0L, jM3024b + 1);
                }
                ak3Var.m3037t(jM3024b + 1);
            }
            if (((bM12063g >> 4) & 1) == 1) {
                long jM3024b2 = ak3Var.m3024b((byte) 0, 0L, Long.MAX_VALUE);
                if (jM3024b2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    su1Var = this;
                    su1Var.m10920b(w30Var2, 0L, jM3024b2 + 1);
                } else {
                    su1Var = this;
                }
                ak3Var.m3037t(jM3024b2 + 1);
            } else {
                su1Var = this;
            }
            if (z) {
                ak3Var.m3034q(j2);
                m10919a(ak3Var.f14586b.m12046B(), "FHCRC", (short) crc32.getValue());
                crc32.reset();
            }
            su1Var.f30565a = (byte) 1;
            b = 1;
        } else {
            j3 = 0;
        }
        if (b == 1) {
            long j4 = w30Var.f33056b;
            long jMo3038w = su1Var.f30568d.mo3038w(w30Var, j);
            if (jMo3038w != -1) {
                su1Var.m10920b(w30Var, j4, jMo3038w);
                return jMo3038w;
            }
            su1Var.f30565a = (byte) 2;
            b = 2;
        }
        if (b == 2) {
            m10919a(ak3Var.m3030k(), "CRC", (int) crc32.getValue());
            m10919a(ak3Var.m3030k(), "ISIZE", (int) su1Var.f30567c.getBytesWritten());
            su1Var.f30565a = (byte) 3;
            if (!ak3Var.m3023a()) {
                wb1.m12191j("gzip finished without exhausting source");
                return j3;
            }
        }
        return -1L;
    }
}
