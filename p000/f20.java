package p000;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f20 implements ca4 {

    /* JADX INFO: renamed from: a */
    public static final e20 f18670a = new e20();

    @Override // p000.ca4
    /* JADX INFO: renamed from: a */
    public final boolean mo3933a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // p000.ca4
    /* JADX INFO: renamed from: b */
    public final String mo3934b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p000.ca4
    /* JADX INFO: renamed from: c */
    public final boolean mo3935c() {
        boolean z = d20.f16739d;
        return d20.f16739d;
    }

    @Override // p000.ca4
    /* JADX INFO: renamed from: d */
    public final void mo3936d(SSLSocket sSLSocket, String str, List list) {
        if (mo3933a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            hb3 hb3Var = hb3.f20468a;
            parameters.setApplicationProtocols((String[]) sc6.m10665f(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
