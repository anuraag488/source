package p000;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zk0 implements ca4 {

    /* JADX INFO: renamed from: a */
    public static final yk0 f36158a = new yk0();

    @Override // p000.ca4
    /* JADX INFO: renamed from: a */
    public final boolean mo3933a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p000.ca4
    /* JADX INFO: renamed from: b */
    public final String mo3934b(SSLSocket sSLSocket) {
        if (mo3933a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p000.ca4
    /* JADX INFO: renamed from: c */
    public final boolean mo3935c() {
        boolean z = xk0.f34325d;
        return xk0.f34325d;
    }

    @Override // p000.ca4
    /* JADX INFO: renamed from: d */
    public final void mo3936d(SSLSocket sSLSocket, String str, List list) {
        if (mo3933a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            hb3 hb3Var = hb3.f20468a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) sc6.m10665f(list).toArray(new String[0]));
        }
    }
}
