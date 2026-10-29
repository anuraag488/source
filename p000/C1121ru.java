package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: ru */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1121ru {

    /* JADX INFO: renamed from: a */
    public String f29619a;

    /* JADX INFO: renamed from: b */
    public String f29620b;

    /* JADX INFO: renamed from: c */
    public String f29621c;

    /* JADX INFO: renamed from: d */
    public String f29622d;

    /* JADX INFO: renamed from: e */
    public long f29623e;

    /* JADX INFO: renamed from: f */
    public byte f29624f;

    /* JADX INFO: renamed from: a */
    public final C1158su m10428a() {
        if (this.f29624f != 1 || this.f29619a == null || this.f29620b == null || this.f29621c == null || this.f29622d == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f29619a == null) {
                sb.append(" rolloutId");
            }
            if (this.f29620b == null) {
                sb.append(" variantId");
            }
            if (this.f29621c == null) {
                sb.append(" parameterKey");
            }
            if (this.f29622d == null) {
                sb.append(" parameterValue");
            }
            if ((this.f29624f & 1) == 0) {
                sb.append(" templateVersion");
            }
            C1077qn.m9989o(d55.m4368m("Missing required properties:", sb));
            return null;
        }
        String str = this.f29619a;
        String str2 = this.f29620b;
        String str3 = this.f29621c;
        String str4 = this.f29622d;
        long j = this.f29623e;
        C1158su c1158su = new C1158su();
        c1158su.f30559b = str;
        c1158su.f30560c = str2;
        c1158su.f30561d = str3;
        c1158su.f30562e = str4;
        c1158su.f30563f = j;
        VarHandle.storeStoreFence();
        return c1158su;
    }
}
