package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l63 {

    /* JADX INFO: renamed from: a */
    public long f23818a;

    /* JADX INFO: renamed from: b */
    public g73 f23819b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l63.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l63 l63Var = (l63) obj;
        long j = this.f23818a;
        long j2 = l63Var.f23818a;
        int i = pb0.f27502i;
        return ws4.m12408a(j, j2) && this.f23819b.equals(l63Var.f23819b);
    }

    public final int hashCode() {
        long j = this.f23818a;
        int i = pb0.f27502i;
        return this.f23819b.hashCode() + (Long.hashCode(j) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + pb0.m9470i(this.f23818a) + ", drawPadding=" + this.f23819b + ")";
    }
}
