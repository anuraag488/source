package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vl6 extends gl6 {
    /* JADX INFO: renamed from: w */
    public static final boolean m11931w(String str) {
        String str2 = (String) e56.f17817t.m4379a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.m8552D().m6690o()) goto L28;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sl6 m11932u(String str) {
        oa6 oa6Var = (oa6) this.f36084a;
        qm6 qm6Var = this.f19870f;
        ar5 ar5Var = qm6Var.f28593c;
        n96 n96Var = qm6Var.f28591a;
        qm6.m9925S(ar5Var);
        z76 z76VarM3212y0 = ar5Var.m3212y0(str);
        ch6 ch6Var = ch6.f16032b;
        sl6 sl6Var = null;
        if (z76VarM3212y0 == null || !z76VarM3212y0.m13444y()) {
            return new sl6(m11933v(str), Collections.EMPTY_MAP, ch6Var, null);
        }
        hb6 hb6VarM8681p = nb6.m8681p();
        hb6VarM8681p.m11054c();
        ((nb6) hb6VarM8681p.f31181b).m8687u(2);
        int iM10835a = sk5.m10835a(z76VarM3212y0.m13439t());
        if (iM10835a == 0) {
            xy4.m12782k("null reference");
        }
        hb6VarM8681p.m6331h(iM10835a);
        String strM13405E = z76VarM3212y0.m13405E();
        qm6.m9925S(n96Var);
        n66 n66VarM8642G = n96Var.m8642G(str);
        if (n66VarM8642G != null) {
            ar5 ar5Var2 = qm6Var.f28593c;
            qm6.m9925S(ar5Var2);
            z76 z76VarM3212y1 = ar5Var2.m3212y0(str);
            if (z76VarM3212y1 != null) {
                if (!n66VarM8642G.m8551C() || n66VarM8642G.m8552D().m6690o() != 100) {
                    dn6 dn6Var = oa6Var.f26517i;
                    oa6.m9014j(dn6Var);
                    if (!dn6Var.m4596U(str, z76VarM3212y1.m13403C())) {
                        if (!TextUtils.isEmpty(strM13405E)) {
                        }
                    }
                }
                String strM13404D = z76VarM3212y0.m13404D();
                hb6VarM8681p.m11054c();
                ((nb6) hb6VarM8681p.f31181b).m8687u(2);
                qm6.m9925S(n96Var);
                n66 n66VarM8642G2 = n96Var.m8642G(z76VarM3212y0.m13404D());
                if (n66VarM8642G2 == null || !n66VarM8642G2.m8551C()) {
                    d76 d76Var = oa6Var.f26514f;
                    oa6.m9016l(d76Var);
                    d76Var.f16831L.m12505b(strM13404D, "[sgtm] Missing sgtm_setting in remote config. appId");
                    hb6VarM8681p.m11054c();
                    ((nb6) hb6VarM8681p.f31181b).m8688v(4);
                } else {
                    HashMap map = new HashMap();
                    if (!TextUtils.isEmpty(z76VarM3212y0.m13403C())) {
                        map.put("x-gtm-server-preview", z76VarM3212y0.m13403C());
                    }
                    String strM6691p = n66VarM8642G2.m8552D().m6691p();
                    int iM10835a2 = sk5.m10835a(z76VarM3212y0.m13439t());
                    if (iM10835a2 != 0 && iM10835a2 != 2) {
                        hb6VarM8681p.m6331h(iM10835a2);
                    } else if (m11931w(z76VarM3212y0.m13404D())) {
                        hb6VarM8681p.m6331h(11);
                    } else if (TextUtils.isEmpty(strM6691p)) {
                        hb6VarM8681p.m6331h(12);
                    } else {
                        d76 d76Var2 = oa6Var.f26514f;
                        oa6.m9016l(d76Var2);
                        d76Var2.f16831L.m12505b(strM13404D, "[sgtm] Eligible for client side upload. appId");
                        hb6VarM8681p.m11054c();
                        ((nb6) hb6VarM8681p.f31181b).m8687u(3);
                        hb6VarM8681p.m6331h(2);
                        sl6Var = new sl6(strM6691p, map, ch6.f16035e, (nb6) hb6VarM8681p.m11056e());
                    }
                    n66VarM8642G2.m8552D().getClass();
                    n66VarM8642G2.m8552D().getClass();
                    oa6Var.getClass();
                    d76 d76Var3 = oa6Var.f26514f;
                    if (TextUtils.isEmpty(strM6691p)) {
                        hb6VarM8681p.m11054c();
                        ((nb6) hb6VarM8681p.f31181b).m8688v(6);
                        oa6.m9016l(d76Var3);
                        d76Var3.f16831L.m12505b(z76VarM3212y0.m13404D(), "[sgtm] Local service, missing sgtm_server_url");
                    } else {
                        oa6.m9016l(d76Var3);
                        d76Var3.f16831L.m12505b(strM13404D, "[sgtm] Eligible for local service direct upload. appId");
                        hb6VarM8681p.m11054c();
                        ((nb6) hb6VarM8681p.f31181b).m8687u(5);
                        hb6VarM8681p.m11054c();
                        ((nb6) hb6VarM8681p.f31181b).m8688v(2);
                        sl6Var = new sl6(strM6691p, map, ch6.f16034d, (nb6) hb6VarM8681p.m11056e());
                    }
                }
                return sl6Var != null ? sl6Var : new sl6(m11933v(str), Collections.EMPTY_MAP, ch6Var, (nb6) hb6VarM8681p.m11056e());
            }
        }
        hb6VarM8681p.m11054c();
        ((nb6) hb6VarM8681p.f31181b).m8688v(3);
        return new sl6(m11933v(str), Collections.EMPTY_MAP, ch6Var, (nb6) hb6VarM8681p.m11056e());
    }

    /* JADX INFO: renamed from: v */
    public final String m11933v(String str) {
        n96 n96Var = this.f19870f.f28591a;
        qm6.m9925S(n96Var);
        String strM8643H = n96Var.m8643H(str);
        if (TextUtils.isEmpty(strM8643H)) {
            return (String) e56.f17813r.m4379a(null);
        }
        Uri uri = Uri.parse((String) e56.f17813r.m4379a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strM8643H).length() + 1 + String.valueOf(authority).length());
        sb.append(strM8643H);
        sb.append(".");
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }
}
