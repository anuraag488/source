package p000;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yk0 implements jx0 {
    @Override // p000.jx0
    /* JADX INFO: renamed from: a */
    public final boolean mo4903a(SSLSocket sSLSocket) {
        return xk0.f34325d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p000.jx0
    /* JADX INFO: renamed from: b */
    public final ca4 mo4904b(SSLSocket sSLSocket) {
        return new zk0();
    }
}
