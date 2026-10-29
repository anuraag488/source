package p000;

/* JADX INFO: renamed from: ds */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0585ds {

    /* JADX INFO: renamed from: a */
    public final int f17311a;

    /* JADX INFO: renamed from: b */
    public final long f17312b;

    public C0585ds(int i, long j) {
        if (i == 0) {
            xy4.m12782k("Null status");
            throw null;
        }
        this.f17311a = i;
        this.f17312b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0585ds)) {
            return false;
        }
        C0585ds c0585ds = (C0585ds) obj;
        return d55.m4358c(this.f17311a, c0585ds.f17311a) && this.f17312b == c0585ds.f17312b;
    }

    public final int hashCode() {
        int iM4376u = (d55.m4376u(this.f17311a) ^ 1000003) * 1000003;
        long j = this.f17312b;
        return ((int) ((j >>> 32) ^ j)) ^ iM4376u;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.f17311a;
        if (i == 1) {
            str = "OK";
        } else if (i == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i != 3) {
            str = i != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        return d55.m4369n(sb, this.f17312b, "}");
    }
}
