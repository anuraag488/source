package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: ot */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1009ot {

    /* JADX INFO: renamed from: a */
    public Double f27066a;

    /* JADX INFO: renamed from: b */
    public int f27067b;

    /* JADX INFO: renamed from: c */
    public boolean f27068c;

    /* JADX INFO: renamed from: d */
    public int f27069d;

    /* JADX INFO: renamed from: e */
    public long f27070e;

    /* JADX INFO: renamed from: f */
    public long f27071f;

    /* JADX INFO: renamed from: g */
    public byte f27072g;

    /* JADX INFO: renamed from: a */
    public final C1046pt m9262a() {
        if (this.f27072g != 31) {
            StringBuilder sb = new StringBuilder();
            if ((this.f27072g & 1) == 0) {
                sb.append(" batteryVelocity");
            }
            if ((this.f27072g & 2) == 0) {
                sb.append(" proximityOn");
            }
            if ((this.f27072g & 4) == 0) {
                sb.append(" orientation");
            }
            if ((this.f27072g & 8) == 0) {
                sb.append(" ramUsed");
            }
            if ((this.f27072g & 16) == 0) {
                sb.append(" diskUsed");
            }
            C1077qn.m9989o(d55.m4368m("Missing required properties:", sb));
            return null;
        }
        Double d = this.f27066a;
        int i = this.f27067b;
        boolean z = this.f27068c;
        int i2 = this.f27069d;
        long j = this.f27070e;
        long j2 = this.f27071f;
        C1046pt c1046pt = new C1046pt();
        c1046pt.f27955a = d;
        c1046pt.f27956b = i;
        c1046pt.f27957c = z;
        c1046pt.f27958d = i2;
        c1046pt.f27959e = j;
        c1046pt.f27960f = j2;
        VarHandle.storeStoreFence();
        return c1046pt;
    }
}
