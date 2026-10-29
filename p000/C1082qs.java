package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: renamed from: qs */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1082qs {

    /* JADX INFO: renamed from: a */
    public String f28731a;

    /* JADX INFO: renamed from: b */
    public String f28732b;

    /* JADX INFO: renamed from: c */
    public String f28733c;

    /* JADX INFO: renamed from: d */
    public long f28734d;

    /* JADX INFO: renamed from: e */
    public Long f28735e;

    /* JADX INFO: renamed from: f */
    public boolean f28736f;

    /* JADX INFO: renamed from: g */
    public aq0 f28737g;

    /* JADX INFO: renamed from: h */
    public rq0 f28738h;

    /* JADX INFO: renamed from: i */
    public qq0 f28739i;

    /* JADX INFO: renamed from: j */
    public bq0 f28740j;

    /* JADX INFO: renamed from: k */
    public List f28741k;

    /* JADX INFO: renamed from: l */
    public int f28742l;

    /* JADX INFO: renamed from: m */
    public byte f28743m;

    /* JADX INFO: renamed from: a */
    public final C1119rs m10049a() {
        String str;
        String str2;
        aq0 aq0Var;
        if (this.f28743m != 7 || (str = this.f28731a) == null || (str2 = this.f28732b) == null || (aq0Var = this.f28737g) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f28731a == null) {
                sb.append(" generator");
            }
            if (this.f28732b == null) {
                sb.append(" identifier");
            }
            if ((this.f28743m & 1) == 0) {
                sb.append(" startedAt");
            }
            if ((this.f28743m & 2) == 0) {
                sb.append(" crashed");
            }
            if (this.f28737g == null) {
                sb.append(" app");
            }
            if ((this.f28743m & 4) == 0) {
                sb.append(" generatorType");
            }
            C1077qn.m9989o(d55.m4368m("Missing required properties:", sb));
            return null;
        }
        String str3 = this.f28733c;
        long j = this.f28734d;
        Long l = this.f28735e;
        boolean z = this.f28736f;
        rq0 rq0Var = this.f28738h;
        qq0 qq0Var = this.f28739i;
        bq0 bq0Var = this.f28740j;
        List list = this.f28741k;
        int i = this.f28742l;
        C1119rs c1119rs = new C1119rs();
        c1119rs.f29559a = str;
        c1119rs.f29560b = str2;
        c1119rs.f29561c = str3;
        c1119rs.f29562d = j;
        c1119rs.f29563e = l;
        c1119rs.f29564f = z;
        c1119rs.f29565g = aq0Var;
        c1119rs.f29566h = rq0Var;
        c1119rs.f29567i = qq0Var;
        c1119rs.f29568j = bq0Var;
        c1119rs.f29569k = list;
        c1119rs.f29570l = i;
        VarHandle.storeStoreFence();
        return c1119rs;
    }
}
