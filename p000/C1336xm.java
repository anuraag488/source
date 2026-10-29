package p000;

import java.util.Map;

/* JADX INFO: renamed from: xm */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1336xm {

    /* JADX INFO: renamed from: a */
    @s24("seq_num")
    public final String f34403a;

    /* JADX INFO: renamed from: b */
    @s24("preqs")
    public final int f34404b;

    /* JADX INFO: renamed from: c */
    @s24("preqs_in_session")
    public final int f34405c;

    /* JADX INFO: renamed from: d */
    @s24("time_in_session")
    public final long f34406d;

    /* JADX INFO: renamed from: e */
    @s24("preqs_by_format")
    public final Map<String, Integer> f34407e;

    /* JADX INFO: renamed from: f */
    @s24("consent_form_action_identifier")
    public final int f34408f;

    public C1336xm(String str, int i, int i2, long j, Map map, int i3) {
        this.f34403a = str;
        this.f34404b = i;
        this.f34405c = i2;
        this.f34406d = j;
        this.f34407e = map;
        this.f34408f = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1336xm)) {
            return false;
        }
        C1336xm c1336xm = (C1336xm) obj;
        return z62.m13387o(this.f34403a, c1336xm.f34403a) && this.f34404b == c1336xm.f34404b && this.f34405c == c1336xm.f34405c && this.f34406d == c1336xm.f34406d && z62.m13387o(this.f34407e, c1336xm.f34407e) && this.f34408f == c1336xm.f34408f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34408f) + ((this.f34407e.hashCode() + zi4.m13612l(zc6.m13526k(this.f34405c, zc6.m13526k(this.f34404b, this.f34403a.hashCode() * 31)), this.f34406d, 31)) * 31);
    }

    public final String toString() {
        return "AppStats(sequenceNumber=" + this.f34403a + ", priorRequestCount=" + this.f34404b + ", priorRequestInSessionCount=" + this.f34405c + ", timeInSessionMilliseconds=" + this.f34406d + ", priorRequestCountByFormat=" + this.f34407e + ", numberOfConsentFormsShown=" + this.f34408f + ")";
    }
}
