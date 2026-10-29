package p000;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class vx1 {

    /* JADX INFO: renamed from: a */
    public static final sv1[] f32905a;

    /* JADX INFO: renamed from: b */
    public static final Map f32906b;

    static {
        sv1 sv1Var = new sv1(sv1.f30585i, "");
        s50 s50Var = sv1.f30582f;
        sv1 sv1Var2 = new sv1(s50Var, "GET");
        sv1 sv1Var3 = new sv1(s50Var, "POST");
        s50 s50Var2 = sv1.f30583g;
        sv1 sv1Var4 = new sv1(s50Var2, "/");
        sv1 sv1Var5 = new sv1(s50Var2, "/index.html");
        s50 s50Var3 = sv1.f30584h;
        sv1 sv1Var6 = new sv1(s50Var3, "http");
        sv1 sv1Var7 = new sv1(s50Var3, "https");
        s50 s50Var4 = sv1.f30581e;
        sv1[] sv1VarArr = {sv1Var, sv1Var2, sv1Var3, sv1Var4, sv1Var5, sv1Var6, sv1Var7, new sv1(s50Var4, "200"), new sv1(s50Var4, "204"), new sv1(s50Var4, "206"), new sv1(s50Var4, "304"), new sv1(s50Var4, "400"), new sv1(s50Var4, "404"), new sv1(s50Var4, "500"), new sv1("accept-charset", ""), new sv1("accept-encoding", "gzip, deflate"), new sv1("accept-language", ""), new sv1("accept-ranges", ""), new sv1("accept", ""), new sv1("access-control-allow-origin", ""), new sv1("age", ""), new sv1("allow", ""), new sv1("authorization", ""), new sv1("cache-control", ""), new sv1("content-disposition", ""), new sv1("content-encoding", ""), new sv1("content-language", ""), new sv1("content-length", ""), new sv1("content-location", ""), new sv1("content-range", ""), new sv1("content-type", ""), new sv1("cookie", ""), new sv1("date", ""), new sv1("etag", ""), new sv1("expect", ""), new sv1("expires", ""), new sv1("from", ""), new sv1("host", ""), new sv1("if-match", ""), new sv1("if-modified-since", ""), new sv1("if-none-match", ""), new sv1("if-range", ""), new sv1("if-unmodified-since", ""), new sv1("last-modified", ""), new sv1("link", ""), new sv1("location", ""), new sv1("max-forwards", ""), new sv1("proxy-authenticate", ""), new sv1("proxy-authorization", ""), new sv1("range", ""), new sv1("referer", ""), new sv1("refresh", ""), new sv1("retry-after", ""), new sv1("server", ""), new sv1("set-cookie", ""), new sv1("strict-transport-security", ""), new sv1("transfer-encoding", ""), new sv1("user-agent", ""), new sv1("vary", ""), new sv1("via", ""), new sv1("www-authenticate", "")};
        f32905a = sv1VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(sv1VarArr[i].f30586a)) {
                linkedHashMap.put(sv1VarArr[i].f30586a, Integer.valueOf(i));
            }
        }
        f32906b = Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: a */
    public static void m12015a(s50 s50Var) throws IOException {
        int iMo4261b = s50Var.mo4261b();
        for (int i = 0; i < iMo4261b; i++) {
            byte bMo4265g = s50Var.mo4265g(i);
            if (65 <= bMo4265g && bMo4265g < 91) {
                wb1.m12191j("PROTOCOL_ERROR response malformed: mixed case name: ".concat(s50Var.m10524o()));
                return;
            }
        }
    }
}
