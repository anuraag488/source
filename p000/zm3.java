package p000;

import android.net.Uri;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zm3 {

    /* JADX INFO: renamed from: a */
    public C0533cn f36185a;

    /* JADX INFO: renamed from: b */
    public ro0 f36186b;

    /* JADX INFO: renamed from: a */
    public final URL m13640a() {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        C0533cn c0533cn = this.f36185a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(c0533cn.f16131a).appendPath("settings");
        C1213ub c1213ub = c0533cn.f16132b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", c1213ub.f31764c).appendQueryParameter("display_version", c1213ub.f31763b).build().toString());
    }
}
