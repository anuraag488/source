package p000;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pk0 {

    /* JADX INFO: renamed from: a */
    public List f27683a;

    /* JADX INFO: renamed from: b */
    public int f27684b;

    /* JADX INFO: renamed from: c */
    public boolean f27685c;

    /* JADX INFO: renamed from: d */
    public boolean f27686d;

    /* JADX INFO: renamed from: a */
    public final ok0 m9538a(SSLSocket sSLSocket) throws UnknownServiceException {
        ok0 ok0Var;
        int i;
        boolean z;
        int i2 = this.f27684b;
        List list = this.f27683a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                ok0Var = null;
                break;
            }
            ok0Var = (ok0) list.get(i2);
            if (ok0Var.m9150b(sSLSocket)) {
                this.f27684b = i2 + 1;
                break;
            }
            i2++;
        }
        if (ok0Var == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f27686d);
            sb.append(", modes=");
            sb.append(list);
            String string = Arrays.toString(sSLSocket.getEnabledProtocols());
            sb.append(", supported protocols=");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.f27684b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z = false;
                break;
            }
            if (((ok0) list.get(i3)).m9150b(sSLSocket)) {
                z = true;
                break;
            }
            i3++;
        }
        this.f27685c = z;
        boolean z2 = this.f27686d;
        String[] strArr = ok0Var.f26801d;
        String[] strArr2 = ok0Var.f26800c;
        String[] strArrM13819n = strArr2 != null ? zv4.m13819n(sSLSocket.getEnabledCipherSuites(), strArr2, m90.f24745c) : sSLSocket.getEnabledCipherSuites();
        String[] strArrM13819n2 = strArr != null ? zv4.m13819n(sSLSocket.getEnabledProtocols(), strArr, rx2.f29704b) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        vl1 vl1Var = m90.f24745c;
        byte[] bArr = zv4.f36415a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (vl1Var.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z2 && i != -1) {
            String str = supportedCipherSuites[i];
            strArrM13819n = (String[]) Arrays.copyOf(strArrM13819n, strArrM13819n.length + 1);
            strArrM13819n[strArrM13819n.length - 1] = str;
        }
        nk0 nk0Var = new nk0();
        nk0Var.f25900a = ok0Var.f26798a;
        nk0Var.f25901b = strArr2;
        nk0Var.f25902c = strArr;
        nk0Var.f25903d = ok0Var.f26799b;
        nk0Var.m8787c((String[]) Arrays.copyOf(strArrM13819n, strArrM13819n.length));
        nk0Var.m8789e((String[]) Arrays.copyOf(strArrM13819n2, strArrM13819n2.length));
        ok0 ok0VarM8785a = nk0Var.m8785a();
        if (ok0VarM8785a.m9151c() != null) {
            sSLSocket.setEnabledProtocols(ok0VarM8785a.f26801d);
        }
        if (ok0VarM8785a.m9149a() != null) {
            sSLSocket.setEnabledCipherSuites(ok0VarM8785a.f26800c);
        }
        return ok0Var;
    }
}
