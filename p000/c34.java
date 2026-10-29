package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class c34 {

    /* JADX INFO: renamed from: a */
    public String f15784a;

    /* JADX INFO: renamed from: b */
    public String f15785b;

    /* JADX INFO: renamed from: c */
    public int f15786c;

    /* JADX INFO: renamed from: d */
    public long f15787d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c34)) {
            return false;
        }
        c34 c34Var = (c34) obj;
        return this.f15784a.equals(c34Var.f15784a) && z62.m13387o(this.f15785b, c34Var.f15785b) && this.f15786c == c34Var.f15786c && this.f15787d == c34Var.f15787d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15787d) + zi4.m13609i(this.f15786c, zi4.m13613m(this.f15784a.hashCode() * 31, this.f15785b, 31), 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f15784a + ", firstSessionId=" + this.f15785b + ", sessionIndex=" + this.f15786c + ", sessionStartTimestampUs=" + this.f15787d + ')';
    }
}
