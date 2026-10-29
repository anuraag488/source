package p000;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yb1 extends MediaDataSource {

    /* JADX INFO: renamed from: a */
    public long f35085a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dc1 f35086b;

    public yb1(dc1 dc1Var) {
        this.f35086b = dc1Var;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        dc1 dc1Var = this.f35086b;
        DataInputStream dataInputStream = dc1Var.f35914a;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.f35085a;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + ((long) dataInputStream.available())) {
                        dc1Var.m4429b(j);
                        this.f35085a = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int i3 = dc1Var.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.f35085a += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.f35085a = -1L;
            return -1;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
