package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: vu */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1269vu {

    /* JADX INFO: renamed from: a */
    public ja0 f32873a;

    /* JADX INFO: renamed from: b */
    public HashMap f32874b;

    /* JADX INFO: renamed from: a */
    public final long m11989a(ag3 ag3Var, long j, int i) {
        long jMo5609j = j - this.f32873a.mo5609j();
        C1307wu c1307wu = (C1307wu) this.f32874b.get(ag3Var);
        long j2 = c1307wu.f33726a;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) i2)))), jMo5609j), c1307wu.f33727b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1269vu)) {
            return false;
        }
        C1269vu c1269vu = (C1269vu) obj;
        return this.f32873a.equals(c1269vu.f32873a) && this.f32874b.equals(c1269vu.f32874b);
    }

    public final int hashCode() {
        return this.f32874b.hashCode() ^ ((this.f32873a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f32873a + ", values=" + this.f32874b + "}";
    }
}
