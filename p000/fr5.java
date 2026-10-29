package p000;

import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fr5 extends ht5 {

    /* JADX INFO: renamed from: d */
    public int f19240d;

    /* JADX INFO: renamed from: e */
    public ws5 f19241e;

    /* JADX INFO: renamed from: f */
    public cr5 f19242f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f19243g;

    /* JADX INFO: renamed from: h */
    public boolean f19244h;

    /* JADX INFO: renamed from: i */
    public boolean f19245i;

    @Override // p000.ht5
    /* JADX INFO: renamed from: a */
    public final UploadDataProvider mo5798a() {
        return this.f19242f;
    }

    @Override // p000.ht5, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f20854b = true;
        if (this.f19244h) {
            this.f19241e.connect();
            this.f19244h = false;
        }
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: e */
    public final boolean mo5799e() throws ProtocolException {
        if (!this.f20854b) {
            this.f19244h = true;
            return false;
        }
        this.f19245i = true;
        if (this.f19243g.position() < this.f19240d) {
            throw new ProtocolException("Content received is less than Content-Length");
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final void m5800j(int i) throws ProtocolException {
        int i2 = this.f19240d;
        ByteBuffer byteBuffer = this.f19243g;
        if (i2 != -1) {
            if (byteBuffer.position() + i > i2) {
                throw new ProtocolException(c75.m3878j("exceeded content-length limit of ", i2, " bytes"));
            }
        } else if (byteBuffer.limit() - this.f19243g.position() <= i) {
            int iCapacity = this.f19243g.capacity();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(Math.max(iCapacity + iCapacity, this.f19243g.capacity() + i));
            byteBufferAllocate.put(this.f19243g);
            this.f19243g = byteBufferAllocate;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        m6505g();
        m5800j(1);
        this.f19243g.put((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m6505g();
        m5800j(i2);
        this.f19243g.put(bArr, i, i2);
    }
}
