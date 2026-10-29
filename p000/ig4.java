package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ig4 {

    /* JADX INFO: renamed from: a */
    public final String f21408a;

    /* JADX INFO: renamed from: b */
    public final int f21409b;

    /* JADX INFO: renamed from: c */
    public final int f21410c;

    public ig4(int i, String str, int i2) {
        this.f21408a = str;
        this.f21409b = i;
        this.f21410c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig4)) {
            return false;
        }
        ig4 ig4Var = (ig4) obj;
        return z62.m13387o(this.f21408a, ig4Var.f21408a) && this.f21409b == ig4Var.f21409b && this.f21410c == ig4Var.f21410c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21410c) + zi4.m13609i(this.f21409b, this.f21408a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.f21408a);
        sb.append(", generation=");
        sb.append(this.f21409b);
        sb.append(", systemId=");
        return c75.m3880l(sb, this.f21410c, ")");
    }
}
