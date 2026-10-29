package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ok0 {

    /* JADX INFO: renamed from: e */
    public static final ok0 f26796e;

    /* JADX INFO: renamed from: f */
    public static final ok0 f26797f;

    /* JADX INFO: renamed from: a */
    public boolean f26798a;

    /* JADX INFO: renamed from: b */
    public boolean f26799b;

    /* JADX INFO: renamed from: c */
    public String[] f26800c;

    /* JADX INFO: renamed from: d */
    public String[] f26801d;

    static {
        m90 m90Var = m90.f24760r;
        m90 m90Var2 = m90.f24761s;
        m90 m90Var3 = m90.f24762t;
        m90 m90Var4 = m90.f24754l;
        m90 m90Var5 = m90.f24756n;
        m90 m90Var6 = m90.f24755m;
        m90 m90Var7 = m90.f24757o;
        m90 m90Var8 = m90.f24759q;
        m90 m90Var9 = m90.f24758p;
        m90[] m90VarArr = {m90Var, m90Var2, m90Var3, m90Var4, m90Var5, m90Var6, m90Var7, m90Var8, m90Var9};
        m90[] m90VarArr2 = {m90Var, m90Var2, m90Var3, m90Var4, m90Var5, m90Var6, m90Var7, m90Var8, m90Var9, m90.f24752j, m90.f24753k, m90.f24750h, m90.f24751i, m90.f24748f, m90.f24749g, m90.f24747e};
        nk0 nk0Var = new nk0();
        nk0Var.m8786b((m90[]) Arrays.copyOf(m90VarArr, 9));
        dn4 dn4Var = dn4.TLS_1_3;
        dn4 dn4Var2 = dn4.TLS_1_2;
        nk0Var.m8788d(dn4Var, dn4Var2);
        nk0Var.f25903d = true;
        nk0Var.m8785a();
        nk0 nk0Var2 = new nk0();
        nk0Var2.m8786b((m90[]) Arrays.copyOf(m90VarArr2, 16));
        nk0Var2.m8788d(dn4Var, dn4Var2);
        nk0Var2.f25903d = true;
        f26796e = nk0Var2.m8785a();
        nk0 nk0Var3 = new nk0();
        nk0Var3.m8786b((m90[]) Arrays.copyOf(m90VarArr2, 16));
        nk0Var3.m8788d(dn4Var, dn4Var2, dn4.TLS_1_1, dn4.TLS_1_0);
        nk0Var3.f25903d = true;
        nk0Var3.m8785a();
        ok0 ok0Var = new ok0();
        ok0Var.f26798a = false;
        ok0Var.f26799b = false;
        ok0Var.f26800c = null;
        ok0Var.f26801d = null;
        VarHandle.storeStoreFence();
        f26797f = ok0Var;
    }

    /* JADX INFO: renamed from: a */
    public final List m9149a() {
        String[] strArr = this.f26800c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(m90.f24744b.m6234z(str));
        }
        return hb0.m6319e1(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9150b(SSLSocket sSLSocket) {
        if (!this.f26798a) {
            return false;
        }
        String[] strArr = this.f26801d;
        if (strArr != null && !zv4.m13813h(strArr, sSLSocket.getEnabledProtocols(), rx2.f29704b)) {
            return false;
        }
        String[] strArr2 = this.f26800c;
        return strArr2 == null || zv4.m13813h(strArr2, sSLSocket.getEnabledCipherSuites(), m90.f24745c);
    }

    /* JADX INFO: renamed from: c */
    public final List m9151c() {
        String[] strArr = this.f26801d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(AbstractC1356y5.m12928v(str));
        }
        return hb0.m6319e1(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ok0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f26798a;
        ok0 ok0Var = (ok0) obj;
        if (z != ok0Var.f26798a) {
            return false;
        }
        if (z) {
            return Arrays.equals(this.f26800c, ok0Var.f26800c) && Arrays.equals(this.f26801d, ok0Var.f26801d) && this.f26799b == ok0Var.f26799b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f26798a) {
            return 17;
        }
        String[] strArr = this.f26800c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f26801d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f26799b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f26798a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m9149a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m9151c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f26799b + ')';
    }
}
