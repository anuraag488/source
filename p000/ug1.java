package p000;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.lang.invoke.VarHandle;
import java.util.Objects;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ug1 {

    /* JADX INFO: renamed from: a */
    public String f31842a;

    /* JADX INFO: renamed from: b */
    public String f31843b;

    /* JADX INFO: renamed from: c */
    public String f31844c;

    /* JADX INFO: renamed from: d */
    public String f31845d;

    /* JADX INFO: renamed from: e */
    public String f31846e;

    /* JADX INFO: renamed from: f */
    public String f31847f;

    /* JADX INFO: renamed from: g */
    public String f31848g;

    /* JADX INFO: renamed from: h */
    public String f31849h;

    /* JADX INFO: renamed from: a */
    public static ug1 m11543a(Context context) {
        yg3 yg3Var = new yg3((byte) 5);
        Resources resources = context.getResources();
        yg3Var.f35215b = resources;
        yg3Var.f35216c = resources.getResourcePackageName(C0995R.string.common_google_play_services_unknown_issue);
        VarHandle.storeStoreFence();
        String strM13117o = yg3Var.m13117o("google_app_id");
        if (TextUtils.isEmpty(strM13117o)) {
            return null;
        }
        String strM13117o2 = yg3Var.m13117o("google_api_key");
        String strM13117o3 = yg3Var.m13117o("firebase_database_url");
        String strM13117o4 = yg3Var.m13117o("ga_trackingId");
        String strM13117o5 = yg3Var.m13117o("gcm_defaultSenderId");
        String strM13117o6 = yg3Var.m13117o("google_storage_bucket");
        String strM13117o7 = yg3Var.m13117o("recaptcha_site_key");
        String strM13117o8 = yg3Var.m13117o("project_id");
        ug1 ug1Var = new ug1();
        int i = gd4.f19749a;
        y42.m12856c0("ApplicationId must be set.", true ^ (strM13117o == null || strM13117o.trim().isEmpty()));
        ug1Var.f31843b = strM13117o;
        ug1Var.f31842a = strM13117o2;
        ug1Var.f31844c = strM13117o3;
        ug1Var.f31845d = strM13117o4;
        ug1Var.f31846e = strM13117o5;
        ug1Var.f31847f = strM13117o6;
        ug1Var.f31848g = strM13117o7;
        ug1Var.f31849h = strM13117o8;
        VarHandle.storeStoreFence();
        return ug1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ug1)) {
            return false;
        }
        ug1 ug1Var = (ug1) obj;
        return Objects.equals(this.f31843b, ug1Var.f31843b) && Objects.equals(this.f31842a, ug1Var.f31842a) && Objects.equals(this.f31844c, ug1Var.f31844c) && Objects.equals(this.f31845d, ug1Var.f31845d) && Objects.equals(this.f31846e, ug1Var.f31846e) && Objects.equals(this.f31847f, ug1Var.f31847f) && Objects.equals(this.f31848g, ug1Var.f31848g) && Objects.equals(this.f31849h, ug1Var.f31849h);
    }

    public final int hashCode() {
        return Objects.hash(this.f31843b, this.f31842a, this.f31844c, this.f31845d, this.f31846e, this.f31847f, this.f31848g, this.f31849h);
    }

    public final String toString() {
        z32 z32VarM12903L = AbstractC1356y5.m12903L(this);
        z32VarM12903L.m13323p(this.f31843b, "applicationId");
        z32VarM12903L.m13323p(this.f31842a, "apiKey");
        z32VarM12903L.m13323p(this.f31844c, "databaseUrl");
        z32VarM12903L.m13323p(this.f31846e, "gcmSenderId");
        z32VarM12903L.m13323p(this.f31847f, "storageBucket");
        z32VarM12903L.m13323p(this.f31848g, "recaptchaSiteKey");
        z32VarM12903L.m13323p(this.f31849h, "projectId");
        return z32VarM12903L.toString();
    }
}
