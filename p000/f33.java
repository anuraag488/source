package p000;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f33 implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final f33 f18714a = new f33();

    /* JADX INFO: renamed from: a */
    public static List m5463a(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && z62.m13387o(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return v71.f32439a;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5464b(String str) {
        long j;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            C1077qn.m9988n(c75.m3878j("endIndex < beginIndex: ", length2, " < 0"));
            return false;
        }
        if (length2 > str.length()) {
            StringBuilder sbM3883o = c75.m3883o("endIndex > string.length: ", length2, " > ");
            sbM3883o.append(str.length());
            throw new IllegalArgumentException(sbM3883o.toString().toString());
        }
        long j2 = 0;
        int i = 0;
        while (i < length2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                j2++;
            } else {
                if (cCharAt < 2048) {
                    j = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    j = 3;
                } else {
                    int i2 = i + 1;
                    char cCharAt2 = i2 < length2 ? str.charAt(i2) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j2++;
                        i = i2;
                    } else {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
            }
            i++;
        }
        return length == ((int) j2);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00ed  */
    /* JADX INFO: renamed from: c */
    public static boolean m5465c(String str, X509Certificate x509Certificate) {
        boolean zEquals;
        int length;
        if (zv4.f36420f.m4046b(str)) {
            String strM7916Y = lb5.m7916Y(str);
            List listM5463a = m5463a(x509Certificate, 7);
            if (!(listM5463a instanceof Collection) || !listM5463a.isEmpty()) {
                Iterator it = listM5463a.iterator();
                while (it.hasNext()) {
                    if (z62.m13387o(strM7916Y, lb5.m7916Y((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (m5464b(str)) {
            str = str.toLowerCase(Locale.US);
        }
        List<String> listM5463a2 = m5463a(x509Certificate, 2);
        if (!(listM5463a2 instanceof Collection) || !listM5463a2.isEmpty()) {
            for (String lowerCase : listM5463a2) {
                if (str.length() == 0 || od4.m9043X(str, ".", false) || od4.m9038S(str, "..", false) || lowerCase == null || lowerCase.length() == 0 || od4.m9043X(lowerCase, ".", false) || od4.m9038S(lowerCase, "..", false)) {
                    zEquals = false;
                } else {
                    String strConcat = !od4.m9038S(str, ".", false) ? str.concat(".") : str;
                    if (!od4.m9038S(lowerCase, ".", false)) {
                        lowerCase = lowerCase.concat(".");
                    }
                    if (m5464b(lowerCase)) {
                        lowerCase = lowerCase.toLowerCase(Locale.US);
                    }
                    if (!hd4.m6335a0(lowerCase, "*", false)) {
                        zEquals = strConcat.equals(lowerCase);
                    } else if (!od4.m9043X(lowerCase, "*.", false) || hd4.m6342h0(lowerCase, '*', 1, 4) != -1 || strConcat.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                        zEquals = false;
                    } else {
                        String strSubstring = lowerCase.substring(1);
                        if (od4.m9038S(strConcat, strSubstring, false) && ((length = strConcat.length() - strSubstring.length()) <= 0 || hd4.m6346l0(strConcat, '.', length - 1, 4) == -1)) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    }
                }
                if (zEquals) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        if (m5464b(str)) {
            try {
                return m5465c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
