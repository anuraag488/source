package p000;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: x2 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1316x2 {

    /* JADX INFO: renamed from: g */
    public static final String[] f33932g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* JADX INFO: renamed from: h */
    public static final SimpleDateFormat f33933h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: a */
    public final String f33934a;

    /* JADX INFO: renamed from: b */
    public final String f33935b;

    /* JADX INFO: renamed from: c */
    public final String f33936c;

    /* JADX INFO: renamed from: d */
    public final Date f33937d;

    /* JADX INFO: renamed from: e */
    public final long f33938e;

    /* JADX INFO: renamed from: f */
    public final long f33939f;

    public C1316x2(String str, String str2, String str3, Date date, long j, long j2) {
        this.f33934a = str;
        this.f33935b = str2;
        this.f33936c = str3;
        this.f33937d = date;
        this.f33938e = j;
        this.f33939f = j2;
    }

    /* JADX INFO: renamed from: a */
    public final C0791ja m12462a(String str) {
        C0791ja c0791ja = new C0791ja();
        c0791ja.f22115a = str;
        c0791ja.f22127m = this.f33937d.getTime();
        c0791ja.f22116b = this.f33934a;
        c0791ja.f22117c = this.f33935b;
        String str2 = this.f33936c;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        c0791ja.f22118d = str2;
        c0791ja.f22119e = this.f33938e;
        c0791ja.f22124j = this.f33939f;
        return c0791ja;
    }
}
