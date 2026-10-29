package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dg3 {

    /* JADX INFO: renamed from: a */
    public final String f17037a;

    /* JADX INFO: renamed from: b */
    public final int f17038b;

    /* JADX INFO: renamed from: c */
    public final int f17039c;

    /* JADX INFO: renamed from: d */
    public final boolean f17040d;

    public dg3(String str, int i, int i2, boolean z) {
        this.f17037a = str;
        this.f17038b = i;
        this.f17039c = i2;
        this.f17040d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg3)) {
            return false;
        }
        dg3 dg3Var = (dg3) obj;
        return this.f17037a.equals(dg3Var.f17037a) && this.f17038b == dg3Var.f17038b && this.f17039c == dg3Var.f17039c && this.f17040d == dg3Var.f17040d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final int hashCode() {
        int iM13609i = zi4.m13609i(this.f17039c, zi4.m13609i(this.f17038b, this.f17037a.hashCode() * 31, 31), 31);
        boolean z = this.f17040d;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iM13609i + r3;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f17037a + ", pid=" + this.f17038b + ", importance=" + this.f17039c + ", isDefaultProcess=" + this.f17040d + ')';
    }
}
