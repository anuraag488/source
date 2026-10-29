package p000;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class d12 implements Closeable {
    /* JADX INFO: renamed from: a */
    public byte[] m4274a() throws IOException {
        long jMo4275b = mo4275b();
        if (jMo4275b > 2147483647L) {
            wb1.m12191j(zi4.m13619s("Cannot buffer entire body for content length: ", jMo4275b));
            return null;
        }
        k40 k40VarMo4278j = mo4278j();
        try {
            byte[] bArrMo3033p = k40VarMo4278j.mo3033p();
            k40VarMo4278j.close();
            int length = bArrMo3033p.length;
            if (jMo4275b == -1 || jMo4275b == length) {
                return bArrMo3033p;
            }
            throw new IOException("Content-Length (" + jMo4275b + ") and stream length (" + length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                lb5.m7941v(k40VarMo4278j, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo4275b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zv4.m13808c(mo4278j());
    }

    /* JADX INFO: renamed from: e */
    public abstract qr2 mo4276e();

    /* JADX INFO: renamed from: g */
    public zc6 mo4277g() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public abstract k40 mo4278j();
}
