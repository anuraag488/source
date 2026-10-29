package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w24 {

    /* JADX INFO: renamed from: a */
    public Boolean f33044a;

    /* JADX INFO: renamed from: b */
    public Double f33045b;

    /* JADX INFO: renamed from: c */
    public Integer f33046c;

    /* JADX INFO: renamed from: d */
    public Integer f33047d;

    /* JADX INFO: renamed from: e */
    public Long f33048e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w24)) {
            return false;
        }
        w24 w24Var = (w24) obj;
        return z62.m13387o(this.f33044a, w24Var.f33044a) && z62.m13387o(this.f33045b, w24Var.f33045b) && z62.m13387o(this.f33046c, w24Var.f33046c) && z62.m13387o(this.f33047d, w24Var.f33047d) && z62.m13387o(this.f33048e, w24Var.f33048e);
    }

    public final int hashCode() {
        Boolean bool = this.f33044a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.f33045b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.f33046c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f33047d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f33048e;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f33044a + ", sessionSamplingRate=" + this.f33045b + ", sessionRestartTimeout=" + this.f33046c + ", cacheDuration=" + this.f33047d + ", cacheUpdatedTime=" + this.f33048e + ')';
    }
}
