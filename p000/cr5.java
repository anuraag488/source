package p000;

import android.os.Trace;
import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cr5 extends UploadDataProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f16399a;

    /* JADX INFO: renamed from: b */
    public final Object f16400b;

    public /* synthetic */ cr5(Object obj, byte b) {
        this.f16399a = b;
        this.f16400b = obj;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.f16399a) {
            case 3:
                ((UploadDataProvider) this.f16400b).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        byte b = this.f16399a;
        Object obj = this.f16400b;
        switch (b) {
            case 0:
                fr5 fr5Var = (fr5) obj;
                int i = fr5Var.f19240d;
                if (i != -1) {
                    return i;
                }
                boolean z = fr5Var.f19245i;
                ByteBuffer byteBuffer = fr5Var.f19243g;
                return z ? byteBuffer.limit() : byteBuffer.position();
            case 1:
                return -1L;
            case 2:
                return ((ls5) obj).f24336e;
            case 3:
                return ((UploadDataProvider) obj).getLength();
            default:
                return ((ByteBuffer) obj).limit();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        byte b = this.f16399a;
        Object obj = this.f16400b;
        switch (b) {
            case 0:
                ry5.m10503a("CronetBufferedOutputStream.UploadDataProviderImpl#read");
                try {
                    int iRemaining = byteBuffer.remaining();
                    fr5 fr5Var = (fr5) obj;
                    int iRemaining2 = fr5Var.f19243g.remaining();
                    ByteBuffer byteBuffer2 = fr5Var.f19243g;
                    if (iRemaining < iRemaining2) {
                        byteBuffer.put(byteBuffer2.array(), fr5Var.f19243g.position(), iRemaining);
                        ByteBuffer byteBuffer3 = fr5Var.f19243g;
                    } else {
                        byteBuffer.put(byteBuffer2);
                    }
                    uploadDataSink.onReadSucceeded(false);
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 1:
                ry5.m10503a("CronetChunkedOutputStream.UploadDataProviderImpl#read");
                try {
                    int iRemaining3 = byteBuffer.remaining();
                    zr5 zr5Var = (zr5) obj;
                    ByteBuffer byteBuffer4 = zr5Var.f36321e;
                    if (iRemaining3 >= byteBuffer4.remaining()) {
                        byteBuffer.put(byteBuffer4);
                        uploadDataSink.onReadSucceeded(zr5Var.f36323g);
                        if (!zr5Var.f36323g) {
                            zr5Var.f36320d.f24362b = false;
                        }
                    } else {
                        int iLimit = byteBuffer4.limit();
                        byteBuffer.put(byteBuffer4);
                        uploadDataSink.onReadSucceeded(false);
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th3) {
                    try {
                        Trace.endSection();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 2:
                ry5.m10503a("CronetFixedModeOutputStream.UploadDataProviderImpl#read");
                try {
                    int iRemaining4 = byteBuffer.remaining();
                    ls5 ls5Var = (ls5) obj;
                    ByteBuffer byteBuffer5 = ls5Var.f24337f;
                    if (iRemaining4 >= byteBuffer5.remaining()) {
                        byteBuffer.put(byteBuffer5);
                        uploadDataSink.onReadSucceeded(false);
                        ls5Var.f24335d.f24362b = false;
                    } else {
                        int iLimit2 = byteBuffer5.limit();
                        byteBuffer.put(byteBuffer5);
                        uploadDataSink.onReadSucceeded(false);
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th5) {
                    try {
                        Trace.endSection();
                        break;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            case 3:
                ((UploadDataProvider) obj).read(uploadDataSink, byteBuffer);
                return;
            default:
                if (!byteBuffer.hasRemaining()) {
                    C1077qn.m9989o("Cronet passed a buffer with no bytes remaining");
                    return;
                }
                ByteBuffer byteBuffer6 = (ByteBuffer) obj;
                if (byteBuffer.remaining() >= byteBuffer6.remaining()) {
                    byteBuffer.put(byteBuffer6);
                } else {
                    int iLimit3 = byteBuffer6.limit();
                    byteBuffer.put(byteBuffer6);
                }
                uploadDataSink.onReadSucceeded(false);
                return;
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        byte b = this.f16399a;
        Object obj = this.f16400b;
        switch (b) {
            case 0:
                ry5.m10503a("CronetBufferedOutputStream.UploadDataProviderImpl#rewind");
                try {
                    uploadDataSink.onRewindSucceeded();
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 1:
                uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
                return;
            case 2:
                uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
                return;
            case 3:
                ((UploadDataProvider) obj).rewind(uploadDataSink);
                return;
            default:
                uploadDataSink.onRewindSucceeded();
                return;
        }
    }

    public /* synthetic */ cr5(ht5 ht5Var, byte b) {
        this.f16399a = b;
        this.f16400b = ht5Var;
    }
}
