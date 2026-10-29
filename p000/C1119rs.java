package p000;

import java.util.List;

/* JADX INFO: renamed from: rs */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1119rs extends sq0 {

    /* JADX INFO: renamed from: a */
    public String f29559a;

    /* JADX INFO: renamed from: b */
    public String f29560b;

    /* JADX INFO: renamed from: c */
    public String f29561c;

    /* JADX INFO: renamed from: d */
    public long f29562d;

    /* JADX INFO: renamed from: e */
    public Long f29563e;

    /* JADX INFO: renamed from: f */
    public boolean f29564f;

    /* JADX INFO: renamed from: g */
    public aq0 f29565g;

    /* JADX INFO: renamed from: h */
    public rq0 f29566h;

    /* JADX INFO: renamed from: i */
    public qq0 f29567i;

    /* JADX INFO: renamed from: j */
    public bq0 f29568j;

    /* JADX INFO: renamed from: k */
    public List f29569k;

    /* JADX INFO: renamed from: l */
    public int f29570l;

    @Override // p000.sq0
    /* JADX INFO: renamed from: a */
    public final C1082qs mo10421a() {
        C1082qs c1082qs = new C1082qs();
        c1082qs.f28731a = this.f29559a;
        c1082qs.f28732b = this.f29560b;
        c1082qs.f28733c = this.f29561c;
        c1082qs.f28734d = this.f29562d;
        c1082qs.f28735e = this.f29563e;
        c1082qs.f28736f = this.f29564f;
        c1082qs.f28737g = this.f29565g;
        c1082qs.f28738h = this.f29566h;
        c1082qs.f28739i = this.f29567i;
        c1082qs.f28740j = this.f29568j;
        c1082qs.f28741k = this.f29569k;
        c1082qs.f28742l = this.f29570l;
        c1082qs.f28743m = (byte) 7;
        return c1082qs;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sq0) {
            C1119rs c1119rs = (C1119rs) ((sq0) obj);
            if (this.f29559a.equals(c1119rs.f29559a) && this.f29560b.equals(c1119rs.f29560b)) {
                String str = this.f29561c;
                String str2 = c1119rs.f29561c;
                if (str != null ? str.equals(str2) : str2 == null) {
                    if (this.f29562d == c1119rs.f29562d) {
                        Long l = this.f29563e;
                        Long l2 = c1119rs.f29563e;
                        if (l != null ? l.equals(l2) : l2 == null) {
                            if (this.f29564f == c1119rs.f29564f && this.f29565g.equals(c1119rs.f29565g)) {
                                rq0 rq0Var = this.f29566h;
                                rq0 rq0Var2 = c1119rs.f29566h;
                                if (rq0Var != null ? rq0Var.equals(rq0Var2) : rq0Var2 == null) {
                                    qq0 qq0Var = this.f29567i;
                                    qq0 qq0Var2 = c1119rs.f29567i;
                                    if (qq0Var != null ? qq0Var.equals(qq0Var2) : qq0Var2 == null) {
                                        bq0 bq0Var = this.f29568j;
                                        bq0 bq0Var2 = c1119rs.f29568j;
                                        if (bq0Var != null ? bq0Var.equals(bq0Var2) : bq0Var2 == null) {
                                            List list = this.f29569k;
                                            List list2 = c1119rs.f29569k;
                                            if (list != null ? list.equals(list2) : list2 == null) {
                                                if (this.f29570l == c1119rs.f29570l) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f29559a.hashCode() ^ 1000003) * 1000003) ^ this.f29560b.hashCode()) * 1000003;
        String str = this.f29561c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.f29562d;
        int i = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f29563e;
        int iHashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f29564f ? 1231 : 1237)) * 1000003) ^ this.f29565g.hashCode()) * 1000003;
        rq0 rq0Var = this.f29566h;
        int iHashCode4 = (iHashCode3 ^ (rq0Var == null ? 0 : rq0Var.hashCode())) * 1000003;
        qq0 qq0Var = this.f29567i;
        int iHashCode5 = (iHashCode4 ^ (qq0Var == null ? 0 : qq0Var.hashCode())) * 1000003;
        bq0 bq0Var = this.f29568j;
        int iHashCode6 = (iHashCode5 ^ (bq0Var == null ? 0 : bq0Var.hashCode())) * 1000003;
        List list = this.f29569k;
        return this.f29570l ^ ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f29559a);
        sb.append(", identifier=");
        sb.append(this.f29560b);
        sb.append(", appQualitySessionId=");
        sb.append(this.f29561c);
        sb.append(", startedAt=");
        sb.append(this.f29562d);
        sb.append(", endedAt=");
        sb.append(this.f29563e);
        sb.append(", crashed=");
        sb.append(this.f29564f);
        sb.append(", app=");
        sb.append(this.f29565g);
        sb.append(", user=");
        sb.append(this.f29566h);
        sb.append(", os=");
        sb.append(this.f29567i);
        sb.append(", device=");
        sb.append(this.f29568j);
        sb.append(", events=");
        sb.append(this.f29569k);
        sb.append(", generatorType=");
        return c75.m3880l(sb, this.f29570l, "}");
    }
}
