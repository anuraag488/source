package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ac6 extends UploadDataProvider {

    /* JADX INFO: renamed from: a */
    public volatile FileChannel f249a;

    /* JADX INFO: renamed from: b */
    public final ha6 f250b;

    /* JADX INFO: renamed from: c */
    public final Object f251c = new Object();

    /* JADX INFO: renamed from: a */
    public final FileChannel m202a() {
        if (this.f249a == null) {
            synchronized (this.f251c) {
                try {
                    if (this.f249a == null) {
                        this.f249a = this.f250b.mo3679f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f249a;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileChannel fileChannel = this.f249a;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return m202a().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        int i;
        if (!byteBuffer.hasRemaining()) {
            C1077qn.m9989o("Cronet passed a buffer with no bytes remaining");
            return;
        }
        FileChannel fileChannelM202a = m202a();
        do {
            i = fileChannelM202a.read(byteBuffer);
            if (i == -1) {
                break;
            }
        } while (i == 0);
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) throws IOException {
        m202a().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
