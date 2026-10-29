package p000;

import android.os.Trace;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class et5 extends InputStream {

    /* JADX INFO: renamed from: a */
    public ws5 f18478a;

    /* JADX INFO: renamed from: b */
    public boolean f18479b;

    /* JADX INFO: renamed from: c */
    public ByteBuffer f18480c;

    /* JADX INFO: renamed from: d */
    public IOException f18481d;

    /* JADX INFO: renamed from: a */
    public final void m5327a() throws IOException {
        if (this.f18479b) {
            IOException iOException = this.f18481d;
            if (iOException != null) {
                throw iOException;
            }
            return;
        }
        if (m5328b()) {
            return;
        }
        ByteBuffer byteBufferAllocateDirect = this.f18480c;
        if (byteBufferAllocateDirect == null) {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(32768);
            this.f18480c = byteBufferAllocateDirect;
        }
        ws5 ws5Var = this.f18478a;
        ByteBuffer byteBuffer = this.f18480c;
        ws5Var.getClass();
        ry5.m10503a("CronetHttpURLConnection#getMoreData");
        try {
            ws5Var.f33696c.read(byteBuffer);
            ws5Var.f33695b.m8107a(ws5Var.getReadTimeout());
            Trace.endSection();
            IOException iOException2 = this.f18481d;
            if (iOException2 != null) {
                throw iOException2;
            }
            ByteBuffer byteBuffer2 = this.f18480c;
            if (byteBuffer2 != null) {
            }
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (!this.f18479b) {
            if (m5328b()) {
                return this.f18480c.remaining();
            }
            return 0;
        }
        IOException iOException = this.f18481d;
        if (iOException == null) {
            return 0;
        }
        throw iOException;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5328b() {
        ByteBuffer byteBuffer = this.f18480c;
        return byteBuffer != null && byteBuffer.hasRemaining();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        m5327a();
        if (!m5328b()) {
            return -1;
        }
        int iMin = Math.min(this.f18480c.limit() - this.f18480c.position(), i2);
        this.f18480c.get(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        m5327a();
        if (m5328b()) {
            return this.f18480c.get() & 255;
        }
        return -1;
    }
}
