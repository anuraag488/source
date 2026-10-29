package p000;

import android.os.Bundle;
import android.text.TextUtils;
import java.lang.invoke.VarHandle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cs5 {

    /* JADX INFO: renamed from: a */
    public String f16432a;

    /* JADX INFO: renamed from: b */
    public String f16433b;

    /* JADX INFO: renamed from: c */
    public String f16434c;

    /* JADX INFO: renamed from: d */
    public long f16435d;

    /* JADX INFO: renamed from: e */
    public long f16436e;

    /* JADX INFO: renamed from: f */
    public os5 f16437f;

    public cs5(oa6 oa6Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        os5 os5Var;
        y42.m12851X(str2);
        y42.m12851X(str3);
        this.f16432a = str2;
        this.f16433b = str3;
        this.f16434c = true == TextUtils.isEmpty(str) ? null : str;
        this.f16435d = j;
        this.f16436e = j2;
        if (j2 != 0 && j2 > j) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12505b(d76.m4401y(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            os5Var = new os5(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    d76 d76Var2 = oa6Var.f26514f;
                    oa6.m9016l(d76Var2);
                    d76Var2.f16835j.m12504a("Param name can't be null");
                    it.remove();
                } else {
                    dn6 dn6Var = oa6Var.f26517i;
                    oa6.m9014j(dn6Var);
                    Object objM4580B = dn6Var.m4580B(bundle2.get(next), next);
                    if (objM4580B == null) {
                        d76 d76Var3 = oa6Var.f26514f;
                        oa6.m9016l(d76Var3);
                        d76Var3.f16838m.m12505b(oa6Var.f26518j.m9367b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        dn6 dn6Var2 = oa6Var.f26517i;
                        oa6.m9014j(dn6Var2);
                        dn6Var2.m4592J(bundle2, next, objM4580B);
                    }
                }
            }
            os5Var = new os5(bundle2);
        }
        this.f16437f = os5Var;
    }

    /* JADX INFO: renamed from: a */
    public final cs5 m4166a(oa6 oa6Var, long j) {
        os5 os5Var = this.f16437f;
        String str = this.f16434c;
        String str2 = this.f16432a;
        String str3 = this.f16433b;
        long j2 = this.f16435d;
        cs5 cs5Var = new cs5();
        y42.m12851X(str2);
        y42.m12851X(str3);
        y42.m12854a0(os5Var);
        cs5Var.f16432a = str2;
        cs5Var.f16433b = str3;
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        cs5Var.f16434c = str;
        cs5Var.f16435d = j2;
        cs5Var.f16436e = j;
        if (j != 0 && j > j2) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12506c("Event created with reverse previous/current timestamps. appId, name", d76.m4401y(str2), d76.m4401y(str3));
        }
        cs5Var.f16437f = os5Var;
        VarHandle.storeStoreFence();
        return cs5Var;
    }

    public final String toString() {
        String string = this.f16437f.toString();
        String str = this.f16432a;
        int length = String.valueOf(str).length();
        String str2 = this.f16433b;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        zi4.m13599B(sb, "Event{appId='", str, "', name='", str2);
        return c75.m3881m(sb, "', params=", string, "}");
    }
}
