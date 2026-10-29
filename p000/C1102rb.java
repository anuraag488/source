package p000;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: rb */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1102rb implements ca4 {
    @Override // p000.ca4
    /* JADX INFO: renamed from: a */
    public final boolean mo3933a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // p000.ca4
    /* JADX INFO: renamed from: b */
    public final String mo3934b(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p000.ca4
    /* JADX INFO: renamed from: c */
    public final boolean mo3935c() {
        hb3 hb3Var = hb3.f20468a;
        return sc6.m10635G();
    }

    @Override // p000.ca4
    /* JADX INFO: renamed from: d */
    public final void mo3936d(SSLSocket sSLSocket, String str, List list) throws IOException {
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            hb3 hb3Var = hb3.f20468a;
            sSLParameters.setApplicationProtocols((String[]) sc6.m10665f(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
