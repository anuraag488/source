package p000;

/* JADX INFO: renamed from: pt */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1046pt extends kq0 {

    /* JADX INFO: renamed from: a */
    public Double f27955a;

    /* JADX INFO: renamed from: b */
    public int f27956b;

    /* JADX INFO: renamed from: c */
    public boolean f27957c;

    /* JADX INFO: renamed from: d */
    public int f27958d;

    /* JADX INFO: renamed from: e */
    public long f27959e;

    /* JADX INFO: renamed from: f */
    public long f27960f;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kq0) {
            kq0 kq0Var = (kq0) obj;
            Double d = this.f27955a;
            if (d != null ? d.equals(((C1046pt) kq0Var).f27955a) : ((C1046pt) kq0Var).f27955a == null) {
                C1046pt c1046pt = (C1046pt) kq0Var;
                if (this.f27956b == c1046pt.f27956b && this.f27957c == c1046pt.f27957c && this.f27958d == c1046pt.f27958d && this.f27959e == c1046pt.f27959e && this.f27960f == c1046pt.f27960f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d = this.f27955a;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f27956b) * 1000003) ^ (this.f27957c ? 1231 : 1237)) * 1000003) ^ this.f27958d) * 1000003;
        long j = this.f27959e;
        long j2 = this.f27960f;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.f27955a);
        sb.append(", batteryVelocity=");
        sb.append(this.f27956b);
        sb.append(", proximityOn=");
        sb.append(this.f27957c);
        sb.append(", orientation=");
        sb.append(this.f27958d);
        sb.append(", ramUsed=");
        sb.append(this.f27959e);
        sb.append(", diskUsed=");
        return d55.m4369n(sb, this.f27960f, "}");
    }
}
