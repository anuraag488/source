package p000;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xt4 extends OutputStream {

    /* JADX INFO: renamed from: a */
    public FileOutputStream f34621a;

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f34621a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f34621a.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f34621a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f34621a.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
