package p000;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.VarHandle;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kw5 implements ReadableByteChannel {

    /* JADX INFO: renamed from: a */
    public InputStream f23564a;

    /* JADX INFO: renamed from: b */
    public AtomicBoolean f23565b;

    /* JADX INFO: renamed from: a */
    public static ReadableByteChannel m7673a(InputStream inputStream) {
        if (inputStream instanceof FileInputStream) {
            return ((FileInputStream) inputStream).getChannel();
        }
        kw5 kw5Var = new kw5();
        kw5Var.f23565b = new AtomicBoolean(true);
        kw5Var.f23564a = inputStream;
        VarHandle.storeStoreFence();
        return kw5Var;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f23565b.compareAndSet(true, false)) {
            this.f23564a.close();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.f23565b.get();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        boolean zHasArray = byteBuffer.hasArray();
        InputStream inputStream = this.f23564a;
        if (zHasArray) {
            int i = inputStream.read(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
            if (i > 0) {
            }
            return i;
        }
        byte[] bArr = new byte[Math.min(16384, Math.min(Math.max(inputStream.available(), 4096), byteBuffer.remaining()))];
        int i2 = inputStream.read(bArr);
        if (i2 <= 0) {
            return i2;
        }
        byteBuffer.put(bArr, 0, i2);
        return i2;
    }
}
