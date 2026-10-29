package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: renamed from: ks */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0846ks {

    /* JADX INFO: renamed from: a */
    public int f23369a;

    /* JADX INFO: renamed from: b */
    public String f23370b;

    /* JADX INFO: renamed from: c */
    public int f23371c;

    /* JADX INFO: renamed from: d */
    public int f23372d;

    /* JADX INFO: renamed from: e */
    public long f23373e;

    /* JADX INFO: renamed from: f */
    public long f23374f;

    /* JADX INFO: renamed from: g */
    public long f23375g;

    /* JADX INFO: renamed from: h */
    public String f23376h;

    /* JADX INFO: renamed from: i */
    public List f23377i;

    /* JADX INFO: renamed from: j */
    public byte f23378j;

    /* JADX INFO: renamed from: a */
    public final C0883ls m7590a() {
        String str;
        if (this.f23378j != 63 || (str = this.f23370b) == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.f23378j & 1) == 0) {
                sb.append(" pid");
            }
            if (this.f23370b == null) {
                sb.append(" processName");
            }
            if ((this.f23378j & 2) == 0) {
                sb.append(" reasonCode");
            }
            if ((this.f23378j & 4) == 0) {
                sb.append(" importance");
            }
            if ((this.f23378j & 8) == 0) {
                sb.append(" pss");
            }
            if ((this.f23378j & 16) == 0) {
                sb.append(" rss");
            }
            if ((this.f23378j & 32) == 0) {
                sb.append(" timestamp");
            }
            C1077qn.m9989o(d55.m4368m("Missing required properties:", sb));
            return null;
        }
        int i = this.f23369a;
        int i2 = this.f23371c;
        int i3 = this.f23372d;
        long j = this.f23373e;
        long j2 = this.f23374f;
        long j3 = this.f23375g;
        String str2 = this.f23376h;
        List list = this.f23377i;
        C0883ls c0883ls = new C0883ls();
        c0883ls.f24321a = i;
        c0883ls.f24322b = str;
        c0883ls.f24323c = i2;
        c0883ls.f24324d = i3;
        c0883ls.f24325e = j;
        c0883ls.f24326f = j2;
        c0883ls.f24327g = j3;
        c0883ls.f24328h = str2;
        c0883ls.f24329i = list;
        VarHandle.storeStoreFence();
        return c0883ls;
    }
}
