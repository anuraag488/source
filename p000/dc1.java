package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dc1 extends zb1 {
    public dc1(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f35914a.mark(Integer.MAX_VALUE);
        } else {
            C1077qn.m9987m("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4429b(long j) throws IOException {
        int i = this.f35915b;
        if (i > j) {
            this.f35915b = 0;
            this.f35914a.reset();
        } else {
            j -= (long) i;
        }
        m13465a((int) j);
    }

    public dc1(byte[] bArr) {
        super(bArr);
        this.f35914a.mark(Integer.MAX_VALUE);
    }
}
