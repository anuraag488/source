package p000;

import ads_mobile_sdk.C0226lu;
import ads_mobile_sdk.i11;
import ads_mobile_sdk.m11;
import ads_mobile_sdk.pm1;
import ads_mobile_sdk.q11;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mb5 {
    /* JADX INFO: renamed from: a */
    public static mi5 m8266a(mi5 mi5Var) {
        String strMo3532s;
        String strMo3532s2;
        String strMo3532s3;
        if (!(mi5Var instanceof q11)) {
            if (mi5Var instanceof i11) {
                return mi5Var;
            }
            C0670g.m5864c();
            return null;
        }
        wa2 wa2Var = (wa2) ((q11) mi5Var).f8791b;
        ba2 ba2VarM12186z = wa2Var.m12186z("errors");
        String strMo3532s4 = ba2VarM12186z != null ? ba2VarM12186z.mo3532s() : null;
        ba2 ba2VarM12186z2 = wa2Var.m12186z("valid");
        if (ba2VarM12186z2 != null) {
            boolean z = true;
            if (ba2VarM12186z2.mo3526e() == 1) {
                ba2 ba2VarM12186z3 = wa2Var.m12186z("url");
                String strMo3532s5 = ba2VarM12186z3 != null ? ba2VarM12186z3.mo3532s() : null;
                if (strMo3532s5 == null) {
                    return new m11("BuildAdUrlResult url is null");
                }
                ba2 ba2VarM12186z4 = wa2Var.m12186z("base_uri");
                String strMo3532s6 = ba2VarM12186z4 != null ? ba2VarM12186z4.mo3532s() : null;
                ba2 ba2VarM12186z5 = wa2Var.m12186z("post_parameters");
                String strMo3532s7 = ba2VarM12186z5 != null ? ba2VarM12186z5.mo3532s() : null;
                ba2 ba2VarM12186z6 = wa2Var.m12186z("cookies_include");
                boolean z2 = ba2VarM12186z6 == null || (strMo3532s3 = ba2VarM12186z6.mo3532s()) == null || strMo3532s3.equals("1") || strMo3532s3.equals("true");
                ba2 ba2VarM12186z7 = wa2Var.m12186z("csrb_errors");
                List listM6353s0 = (ba2VarM12186z7 == null || (strMo3532s2 = ba2VarM12186z7.mo3532s()) == null) ? null : hd4.m6353s0(strMo3532s2, new String[]{","}, 6);
                ba2 ba2VarM12186z8 = wa2Var.m12186z("use_compression");
                if (ba2VarM12186z8 == null || (strMo3532s = ba2VarM12186z8.mo3532s()) == null || (!strMo3532s.equals("1") && !strMo3532s.equals("true"))) {
                    z = false;
                }
                ba2 ba2VarM12186z9 = wa2Var.m12186z("content_type");
                return new q11(new C0226lu(strMo3532s4 != null ? hd4.m6353s0(strMo3532s4, new String[]{","}, 6) : null, strMo3532s6, strMo3532s7, z2, strMo3532s5, null, listM6353s0, z, ba2VarM12186z9 != null ? ba2VarM12186z9.mo3532s() : null));
            }
        }
        return new m11(zi4.m13620t("Error building request URL: ", strMo3532s4), pm1.f8671b);
    }
}
