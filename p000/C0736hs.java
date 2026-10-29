package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: hs */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0736hs {

    /* JADX INFO: renamed from: a */
    public String f20810a;

    /* JADX INFO: renamed from: b */
    public String f20811b;

    /* JADX INFO: renamed from: c */
    public int f20812c;

    /* JADX INFO: renamed from: d */
    public String f20813d;

    /* JADX INFO: renamed from: e */
    public String f20814e;

    /* JADX INFO: renamed from: f */
    public String f20815f;

    /* JADX INFO: renamed from: g */
    public String f20816g;

    /* JADX INFO: renamed from: h */
    public String f20817h;

    /* JADX INFO: renamed from: i */
    public String f20818i;

    /* JADX INFO: renamed from: j */
    public sq0 f20819j;

    /* JADX INFO: renamed from: k */
    public yp0 f20820k;

    /* JADX INFO: renamed from: l */
    public vp0 f20821l;

    /* JADX INFO: renamed from: m */
    public byte f20822m;

    /* JADX INFO: renamed from: a */
    public final C0773is m6491a() {
        if (this.f20822m != 1 || this.f20810a == null || this.f20811b == null || this.f20813d == null || this.f20817h == null || this.f20818i == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f20810a == null) {
                sb.append(" sdkVersion");
            }
            if (this.f20811b == null) {
                sb.append(" gmpAppId");
            }
            if ((1 & this.f20822m) == 0) {
                sb.append(" platform");
            }
            if (this.f20813d == null) {
                sb.append(" installationUuid");
            }
            if (this.f20817h == null) {
                sb.append(" buildVersion");
            }
            if (this.f20818i == null) {
                sb.append(" displayVersion");
            }
            C1077qn.m9989o(d55.m4368m("Missing required properties:", sb));
            return null;
        }
        String str = this.f20810a;
        String str2 = this.f20811b;
        int i = this.f20812c;
        String str3 = this.f20813d;
        String str4 = this.f20814e;
        String str5 = this.f20815f;
        String str6 = this.f20816g;
        String str7 = this.f20817h;
        String str8 = this.f20818i;
        sq0 sq0Var = this.f20819j;
        yp0 yp0Var = this.f20820k;
        vp0 vp0Var = this.f20821l;
        C0773is c0773is = new C0773is();
        c0773is.f21723b = str;
        c0773is.f21724c = str2;
        c0773is.f21725d = i;
        c0773is.f21726e = str3;
        c0773is.f21727f = str4;
        c0773is.f21728g = str5;
        c0773is.f21729h = str6;
        c0773is.f21730i = str7;
        c0773is.f21731j = str8;
        c0773is.f21732k = sq0Var;
        c0773is.f21733l = yp0Var;
        c0773is.f21734m = vp0Var;
        VarHandle.storeStoreFence();
        return c0773is;
    }
}
