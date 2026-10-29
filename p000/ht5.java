package p000;

import java.io.IOException;
import java.io.OutputStream;
import org.chromium.net.UploadDataProvider;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ht5 extends OutputStream {

    /* JADX INFO: renamed from: a */
    public IOException f20853a;

    /* JADX INFO: renamed from: b */
    public boolean f20854b;

    /* JADX INFO: renamed from: c */
    public boolean f20855c;

    /* JADX INFO: renamed from: a */
    public abstract UploadDataProvider mo5798a();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20854b = true;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo5799e() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m6505g() throws IOException {
        if (!this.f20855c) {
            if (this.f20854b) {
                wb1.m12191j("Stream has been closed.");
            }
        } else {
            IOException iOException = this.f20853a;
            if (iOException != null) {
                throw iOException;
            }
            wb1.m12191j("Writing after request completed.");
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo6504b() {
    }
}
