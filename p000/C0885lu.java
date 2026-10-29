package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: lu */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0885lu extends nn2 {

    /* JADX INFO: renamed from: a */
    public long f24366a;

    /* JADX INFO: renamed from: b */
    public long f24367b;

    /* JADX INFO: renamed from: c */
    public C0662fs f24368c;

    /* JADX INFO: renamed from: d */
    public Integer f24369d;

    /* JADX INFO: renamed from: e */
    public String f24370e;

    /* JADX INFO: renamed from: f */
    public ArrayList f24371f;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nn2)) {
            return false;
        }
        C0885lu c0885lu = (C0885lu) ((nn2) obj);
        if (this.f24366a != c0885lu.f24366a || this.f24367b != c0885lu.f24367b || !this.f24368c.equals(c0885lu.f24368c)) {
            return false;
        }
        Integer num = this.f24369d;
        Integer num2 = c0885lu.f24369d;
        if (num == null) {
            if (num2 != null) {
                return false;
            }
        } else if (!num.equals(num2)) {
            return false;
        }
        String str = this.f24370e;
        String str2 = c0885lu.f24370e;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        if (!this.f24371f.equals(c0885lu.f24371f)) {
            return false;
        }
        Object obj2 = li3.f24057a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.f24366a;
        long j2 = this.f24367b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f24368c.hashCode()) * 1000003;
        Integer num = this.f24369d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f24370e;
        return ((this.f24371f.hashCode() ^ ((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ li3.f24057a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f24366a + ", requestUptimeMs=" + this.f24367b + ", clientInfo=" + this.f24368c + ", logSource=" + this.f24369d + ", logSourceName=" + this.f24370e + ", logEvents=" + this.f24371f + ", qosTier=" + li3.f24057a + "}";
    }
}
