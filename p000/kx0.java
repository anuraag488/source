package p000;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kx0 implements ca4 {

    /* JADX INFO: renamed from: a */
    public final jx0 f23568a;

    /* JADX INFO: renamed from: b */
    public ca4 f23569b;

    public kx0(jx0 jx0Var) {
        this.f23568a = jx0Var;
    }

    @Override // p000.ca4
    /* JADX INFO: renamed from: a */
    public final boolean mo3933a(SSLSocket sSLSocket) {
        return this.f23568a.mo4903a(sSLSocket);
    }

    @Override // p000.ca4
    /* JADX INFO: renamed from: b */
    public final String mo3934b(SSLSocket sSLSocket) {
        ca4 ca4VarM7674e = m7674e(sSLSocket);
        if (ca4VarM7674e != null) {
            return ca4VarM7674e.mo3934b(sSLSocket);
        }
        return null;
    }

    @Override // p000.ca4
    /* JADX INFO: renamed from: c */
    public final boolean mo3935c() {
        return true;
    }

    @Override // p000.ca4
    /* JADX INFO: renamed from: d */
    public final void mo3936d(SSLSocket sSLSocket, String str, List list) {
        ca4 ca4VarM7674e = m7674e(sSLSocket);
        if (ca4VarM7674e != null) {
            ca4VarM7674e.mo3936d(sSLSocket, str, list);
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized ca4 m7674e(SSLSocket sSLSocket) {
        try {
            if (this.f23569b == null && this.f23568a.mo4903a(sSLSocket)) {
                this.f23569b = this.f23568a.mo4904b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f23569b;
    }
}
