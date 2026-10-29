package p000;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y86 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35028a;

    /* JADX INFO: renamed from: b */
    public oa6 f35029b;

    public /* synthetic */ y86(byte b) {
        this.f35028a = b;
    }

    /* JADX INFO: renamed from: a */
    public boolean m13049a() {
        switch (this.f35028a) {
            case 0:
                oa6 oa6Var = this.f35029b;
                try {
                    return r35.m10189a(oa6Var.f26509a).m12998b(128, "com.android.vending").versionCode >= 80837300;
                } catch (Exception e) {
                    d76 d76Var = oa6Var.f26514f;
                    oa6.m9016l(d76Var);
                    d76Var.f16831L.m12505b(e, "Failed to retrieve Play Store version for Install Referrer");
                    return false;
                }
            default:
                d76 d76Var2 = this.f35029b.f26514f;
                oa6.m9016l(d76Var2);
                return Log.isLoggable(d76Var2.m4402A(), 3);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m13050b(String str, Bundle bundle) {
        String string;
        oa6 oa6Var = this.f35029b;
        ea6 ea6Var = oa6Var.f26515g;
        s86 s86Var = oa6Var.f26513e;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        if (oa6Var.m9018a()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        oa6.m9014j(s86Var);
        s86Var.f29982U.m10507d(string);
        n86 n86Var = s86Var.f29983V;
        oa6Var.f26519k.getClass();
        n86Var.m8624b(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: c */
    public boolean m13051c() {
        if (!m13052d()) {
            return false;
        }
        oa6 oa6Var = this.f35029b;
        oa6Var.f26519k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        s86 s86Var = oa6Var.f26513e;
        oa6.m9014j(s86Var);
        return jCurrentTimeMillis - s86Var.f29983V.m8623a() > oa6Var.f26512d.m9222B(null, e56.f17797j0);
    }

    /* JADX INFO: renamed from: d */
    public boolean m13052d() {
        s86 s86Var = this.f35029b.f26513e;
        oa6.m9014j(s86Var);
        return s86Var.f29983V.m8623a() > 0;
    }
}
