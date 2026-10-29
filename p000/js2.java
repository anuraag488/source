package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class js2 {

    /* JADX INFO: renamed from: a */
    @s24("runtime_free")
    public Long f22556a;

    /* JADX INFO: renamed from: b */
    @s24("runtime_max")
    public Long f22557b;

    /* JADX INFO: renamed from: c */
    @s24("runtime_total")
    public Long f22558c;

    /* JADX INFO: renamed from: d */
    @s24("web_view_count")
    public Integer f22559d;

    public js2(int i) {
        this.f22556a = null;
        this.f22557b = null;
        this.f22558c = null;
        this.f22559d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js2)) {
            return false;
        }
        js2 js2Var = (js2) obj;
        return z62.m13387o(this.f22556a, js2Var.f22556a) && z62.m13387o(this.f22557b, js2Var.f22557b) && z62.m13387o(this.f22558c, js2Var.f22558c) && z62.m13387o(this.f22559d, js2Var.f22559d);
    }

    public final int hashCode() {
        Long l = this.f22556a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f22557b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f22558c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.f22559d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "MemorySignals(runtimeFreeMemory=" + this.f22556a + ", runtimeMaxMemory=" + this.f22557b + ", runtimeTotalMemory=" + this.f22558c + ", webviewCount=" + this.f22559d + ")";
    }

    public js2() {
        this(0);
    }
}
