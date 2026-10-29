package p000;

import android.os.Trace;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ls5 extends ht5 {

    /* JADX INFO: renamed from: d */
    public lt5 f24335d;

    /* JADX INFO: renamed from: e */
    public long f24336e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f24337f;

    /* JADX INFO: renamed from: g */
    public cr5 f24338g;

    /* JADX INFO: renamed from: h */
    public long f24339h;

    @Override // p000.ht5
    /* JADX INFO: renamed from: a */
    public final UploadDataProvider mo5798a() {
        return this.f24338g;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final void mo6504b() throws ProtocolException {
        if (this.f24339h < this.f24336e) {
            throw new ProtocolException("Content received is less than Content-Length.");
        }
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: e */
    public final boolean mo5799e() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final void m8104j(int i) throws ProtocolException {
        long j = this.f24339h + ((long) i);
        long j2 = this.f24336e;
        if (j <= j2) {
            return;
        }
        throw new ProtocolException("expected " + (j2 - this.f24339h) + " bytes but received " + i);
    }

    /* JADX INFO: renamed from: k */
    public final void m8105k() {
        ry5.m10503a("CronetFixedModeOutputStream#uploadBufferInternal");
        try {
            m6505g();
            this.f24335d.m8107a(0);
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
        ByteBuffer byteBuffer = this.f24337f;
        m6505g();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        m8104j(i2);
        int i3 = i2;
        while (i3 > 0) {
            if (!byteBuffer.hasRemaining()) {
                m8105k();
            }
            int iMin = Math.min(i3, byteBuffer.remaining());
            byteBuffer.put(bArr, (i + i2) - i3, iMin);
            i3 -= iMin;
        }
        long j = this.f24339h + ((long) i2);
        this.f24339h = j;
        if (j == this.f24336e) {
            m8105k();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        m6505g();
        m8104j(1);
        ByteBuffer byteBuffer = this.f24337f;
        if (!byteBuffer.hasRemaining()) {
            m8105k();
        }
        byteBuffer.put((byte) i);
        long j = this.f24339h + 1;
        this.f24339h = j;
        if (j == this.f24336e) {
            m8105k();
        }
    }
}
