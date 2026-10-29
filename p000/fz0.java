package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fz0 {

    /* JADX INFO: renamed from: a */
    @s24("ad_mem_tier")
    public Integer f19426a;

    /* JADX INFO: renamed from: b */
    @s24("avai_mem_tier")
    public Integer f19427b;

    /* JADX INFO: renamed from: c */
    @s24("avai_proc_tier")
    public Integer f19428c;

    public fz0(int i) {
        this.f19426a = null;
        this.f19427b = null;
        this.f19428c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz0)) {
            return false;
        }
        fz0 fz0Var = (fz0) obj;
        return z62.m13387o(this.f19426a, fz0Var.f19426a) && z62.m13387o(this.f19427b, fz0Var.f19427b) && z62.m13387o(this.f19428c, fz0Var.f19428c);
    }

    public final int hashCode() {
        Integer num = this.f19426a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f19427b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f19428c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceTierSignals(advertisedMemoryTier=" + this.f19426a + ", availableMemoryTier=" + this.f19427b + ", availableProcessorsTier=" + this.f19428c + ")";
    }

    public fz0() {
        this(0);
    }
}
