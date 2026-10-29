package p000;

/* JADX INFO: renamed from: xu */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1344xu {

    /* JADX INFO: renamed from: a */
    public long f34622a;

    /* JADX INFO: renamed from: b */
    public long f34623b;

    /* JADX INFO: renamed from: c */
    public long f34624c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1344xu) {
            C1344xu c1344xu = (C1344xu) obj;
            if (this.f34622a == c1344xu.f34622a && this.f34623b == c1344xu.f34623b && this.f34624c == c1344xu.f34624c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f34622a;
        long j2 = this.f34623b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f34624c;
        return ((int) ((j3 >>> 32) ^ j3)) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f34622a);
        sb.append(", elapsedRealtime=");
        sb.append(this.f34623b);
        sb.append(", uptimeMillis=");
        return d55.m4369n(sb, this.f34624c, "}");
    }
}
