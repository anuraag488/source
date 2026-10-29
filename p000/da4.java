package p000;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class da4 extends C1116rp {

    /* JADX INFO: renamed from: n */
    public final Socket f16884n;

    public da4(Socket socket) {
        this.f16884n = socket;
    }

    @Override // p000.C1116rp
    /* JADX INFO: renamed from: j */
    public final void mo4413j() {
        Socket socket = this.f16884n;
        try {
            socket.close();
        } catch (AssertionError e) {
            Logger logger = u45.f31653a;
            if (e.getCause() != null) {
                String message = e.getMessage();
                if (message != null ? hd4.m6335a0(message, "getsockname failed", false) : false) {
                    u45.f31653a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
                    return;
                }
            }
            throw e;
        } catch (Exception e2) {
            u45.f31653a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    /* JADX INFO: renamed from: k */
    public final IOException m4414k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
