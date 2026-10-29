package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fc1 extends InputStream {

    /* JADX INFO: renamed from: a */
    public InputStream f18901a;

    /* JADX INFO: renamed from: b */
    public int f18902b;

    @Override // java.io.InputStream
    public final int available() {
        return this.f18902b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f18901a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f18901a.read();
        if (i == -1) {
            this.f18902b = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.f18901a.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.f18901a.read(bArr);
        if (i == -1) {
            this.f18902b = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f18901a.read(bArr, i, i2);
        if (i3 == -1) {
            this.f18902b = 0;
        }
        return i3;
    }
}
