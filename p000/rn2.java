package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rn2 {

    /* JADX INFO: renamed from: a */
    public long f29435a;

    /* JADX INFO: renamed from: b */
    public k44 f29436b;

    /* JADX INFO: renamed from: c */
    public String f29437c;

    /* JADX INFO: renamed from: d */
    public String f29438d;

    /* JADX INFO: renamed from: e */
    public String f29439e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn2)) {
            return false;
        }
        rn2 rn2Var = (rn2) obj;
        return i41.m6646e(this.f29435a, rn2Var.f29435a) && this.f29436b == rn2Var.f29436b && z62.m13387o(this.f29437c, rn2Var.f29437c) && z62.m13387o(this.f29438d, rn2Var.f29438d) && z62.m13387o(this.f29439e, rn2Var.f29439e);
    }

    public final int hashCode() {
        long j = this.f29435a;
        r50 r50Var = i41.f21117b;
        int iM13613m = zi4.m13613m(zi4.m13613m((this.f29436b.hashCode() + (Long.hashCode(j) * 31)) * 31, this.f29437c, 31), this.f29438d, 31);
        String str = this.f29439e;
        return iM13613m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String strM6656o = i41.m6656o(this.f29435a);
        k44 k44Var = this.f29436b;
        String str = this.f29437c;
        String str2 = this.f29438d;
        String str3 = this.f29439e;
        StringBuilder sb = new StringBuilder("LogcatEntry(timestamp=");
        sb.append(strM6656o);
        sb.append(", severity=");
        sb.append(k44Var);
        sb.append(", tag=");
        zi4.m13599B(sb, str, ", message=", str2, ", throwable=");
        return zi4.m13623w(sb, str3, ")");
    }
}
