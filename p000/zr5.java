package p000;

import android.os.Trace;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zr5 extends ht5 {

    /* JADX INFO: renamed from: d */
    public lt5 f36320d;

    /* JADX INFO: renamed from: e */
    public ByteBuffer f36321e;

    /* JADX INFO: renamed from: f */
    public cr5 f36322f;

    /* JADX INFO: renamed from: g */
    public boolean f36323g;

    @Override // p000.ht5
    /* JADX INFO: renamed from: a */
    public final UploadDataProvider mo5798a() {
        return this.f36322f;
    }

    @Override // p000.ht5, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f20854b = true;
        if (this.f36323g) {
            return;
        }
        this.f36323g = true;
    }

    /* JADX INFO: renamed from: j */
    public final void m13735j() {
        ByteBuffer byteBuffer = this.f36321e;
        if (byteBuffer.hasRemaining()) {
            return;
        }
        ry5.m10503a("CronetChunkedOutputStream#uploadBufferInternal");
        try {
            m6505g();
            this.f36320d.m8107a(0);
            IOException iOException = this.f20853a;
            if (iOException != null) {
                throw iOException;
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m6505g();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2;
        while (i3 > 0) {
            ByteBuffer byteBuffer = this.f36321e;
            int iMin = Math.min(i3, byteBuffer.remaining());
            byteBuffer.put(bArr, (i + i2) - i3, iMin);
            i3 -= iMin;
            m13735j();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        m13735j();
        this.f36321e.put((byte) i);
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final void mo6504b() {
    }
}
