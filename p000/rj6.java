package p000;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rj6 extends rl6 {

    /* JADX INFO: renamed from: h */
    public HashMap f29362h;

    /* JADX INFO: renamed from: i */
    public n86 f29363i;

    /* JADX INFO: renamed from: j */
    public n86 f29364j;

    /* JADX INFO: renamed from: k */
    public n86 f29365k;

    /* JADX INFO: renamed from: l */
    public n86 f29366l;

    /* JADX INFO: renamed from: m */
    public n86 f29367m;

    /* JADX INFO: renamed from: n */
    public n86 f29368n;

    /* JADX INFO: renamed from: y */
    public final Pair m10347y(String str) {
        pj6 pj6Var;
        C0008a7 c0008a7M3471a;
        mo5038t();
        oa6 oa6Var = (oa6) this.f36084a;
        ia5 ia5Var = oa6Var.f26519k;
        op5 op5Var = oa6Var.f26512d;
        ia5Var.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f29362h;
        pj6 pj6Var2 = (pj6) map.get(str);
        if (pj6Var2 != null && jElapsedRealtime < pj6Var2.f27681c) {
            return new Pair(pj6Var2.f27679a, Boolean.valueOf(pj6Var2.f27680b));
        }
        long jM9222B = op5Var.m9222B(str, e56.f17772b) + jElapsedRealtime;
        try {
            try {
                c0008a7M3471a = C0481b7.m3471a(oa6Var.f26509a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (pj6Var2 != null && jElapsedRealtime < pj6Var2.f27681c + op5Var.m9222B(str, e56.f17775c)) {
                    return new Pair(pj6Var2.f27679a, Boolean.valueOf(pj6Var2.f27680b));
                }
                c0008a7M3471a = null;
            }
            if (c0008a7M3471a == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String str2 = c0008a7M3471a.f144a;
            pj6Var = str2 != null ? new pj6(jM9222B, str2, c0008a7M3471a.f145b) : new pj6(jM9222B, "", c0008a7M3471a.f145b);
            map.put(str, pj6Var);
            return new Pair(pj6Var.f27679a, Boolean.valueOf(pj6Var.f27680b));
        } catch (Exception e) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16842q.m12505b(e, "Unable to get advertising id");
            pj6Var = new pj6(jM9222B, "", false);
        }
    }

    /* JADX INFO: renamed from: z */
    public final String m10348z(String str, boolean z) {
        mo5038t();
        String str2 = z ? (String) m10347y(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestM4565L = dn6.m4565L();
        if (messageDigestM4565L == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestM4565L.digest(str2.getBytes())));
    }

    @Override // p000.rl6
    /* JADX INFO: renamed from: x */
    public final void mo3209x() {
    }
}
