package p000;

import java.util.Set;

/* JADX INFO: renamed from: wu */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1307wu {

    /* JADX INFO: renamed from: a */
    public long f33726a;

    /* JADX INFO: renamed from: b */
    public long f33727b;

    /* JADX INFO: renamed from: c */
    public Set f33728c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1307wu) {
            C1307wu c1307wu = (C1307wu) obj;
            if (this.f33726a == c1307wu.f33726a && this.f33727b == c1307wu.f33727b && this.f33728c.equals(c1307wu.f33728c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f33726a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f33727b;
        return this.f33728c.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f33726a + ", maxAllowedDelay=" + this.f33727b + ", flags=" + this.f33728c + "}";
    }
}
