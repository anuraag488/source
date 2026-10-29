package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: pu */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1047pu {

    /* JADX INFO: renamed from: a */
    public String f27982a;

    /* JADX INFO: renamed from: b */
    public int f27983b;

    /* JADX INFO: renamed from: c */
    public String f27984c;

    /* JADX INFO: renamed from: d */
    public String f27985d;

    /* JADX INFO: renamed from: e */
    public long f27986e;

    /* JADX INFO: renamed from: f */
    public long f27987f;

    /* JADX INFO: renamed from: g */
    public String f27988g;

    /* JADX INFO: renamed from: h */
    public byte f27989h;

    /* JADX INFO: renamed from: a */
    public final C1084qu m9676a() {
        if (this.f27989h != 3 || this.f27983b == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.f27983b == 0) {
                sb.append(" registrationStatus");
            }
            if ((this.f27989h & 1) == 0) {
                sb.append(" expiresInSecs");
            }
            if ((this.f27989h & 2) == 0) {
                sb.append(" tokenCreationEpochInSecs");
            }
            C1077qn.m9989o(d55.m4368m("Missing required properties:", sb));
            return null;
        }
        String str = this.f27982a;
        int i = this.f27983b;
        String str2 = this.f27984c;
        String str3 = this.f27985d;
        long j = this.f27986e;
        long j2 = this.f27987f;
        String str4 = this.f27988g;
        C1084qu c1084qu = new C1084qu();
        c1084qu.f28794a = str;
        c1084qu.f28795b = i;
        c1084qu.f28796c = str2;
        c1084qu.f28797d = str3;
        c1084qu.f28798e = j;
        c1084qu.f28799f = j2;
        c1084qu.f28800g = str4;
        VarHandle.storeStoreFence();
        return c1084qu;
    }
}
