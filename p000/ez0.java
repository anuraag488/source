package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ez0 {

    /* JADX INFO: renamed from: a */
    @s24("battery")
    public final C0669fz f18587a;

    /* JADX INFO: renamed from: b */
    @s24("browser")
    public final s30 f18588b;

    /* JADX INFO: renamed from: c */
    @s24("android_mem_info")
    public js2 f18589c;

    /* JADX INFO: renamed from: d */
    @s24("device_tier")
    public final fz0 f18590d;

    /* JADX INFO: renamed from: e */
    @s24("network")
    public final r03 f18591e;

    /* JADX INFO: renamed from: f */
    @s24("play_store")
    public final bc3 f18592f;

    /* JADX INFO: renamed from: g */
    @s24("cloc")
    public sa0 f18593g;

    /* JADX INFO: renamed from: h */
    @s24("build")
    public String f18594h;

    /* JADX INFO: renamed from: i */
    @s24("remaining_data_partition_space")
    public Long f18595i;

    public ez0(int i) {
        C0669fz c0669fz = new C0669fz(0);
        s30 s30Var = new s30(0);
        js2 js2Var = new js2(0);
        fz0 fz0Var = new fz0(0);
        r03 r03Var = new r03(0);
        bc3 bc3Var = new bc3(0);
        this.f18587a = c0669fz;
        this.f18588b = s30Var;
        this.f18589c = js2Var;
        this.f18590d = fz0Var;
        this.f18591e = r03Var;
        this.f18592f = bc3Var;
        this.f18593g = null;
        this.f18594h = null;
        this.f18595i = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez0)) {
            return false;
        }
        ez0 ez0Var = (ez0) obj;
        return z62.m13387o(this.f18587a, ez0Var.f18587a) && z62.m13387o(this.f18588b, ez0Var.f18588b) && z62.m13387o(this.f18589c, ez0Var.f18589c) && z62.m13387o(this.f18590d, ez0Var.f18590d) && z62.m13387o(this.f18591e, ez0Var.f18591e) && z62.m13387o(this.f18592f, ez0Var.f18592f) && z62.m13387o(this.f18593g, ez0Var.f18593g) && z62.m13387o(this.f18594h, ez0Var.f18594h) && z62.m13387o(this.f18595i, ez0Var.f18595i);
    }

    public final int hashCode() {
        int iHashCode = (this.f18592f.hashCode() + ((this.f18591e.hashCode() + ((this.f18590d.hashCode() + ((this.f18589c.hashCode() + ((this.f18588b.hashCode() + (this.f18587a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        sa0 sa0Var = this.f18593g;
        int iHashCode2 = (iHashCode + (sa0Var == null ? 0 : sa0Var.hashCode())) * 31;
        String str = this.f18594h;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f18595i;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceSignals(batterySignals=" + this.f18587a + ", browserSignals=" + this.f18588b + ", memorySignals=" + this.f18589c + ", deviceTierSignals=" + this.f18590d + ", networkSignals=" + this.f18591e + ", playStoreSignals=" + this.f18592f + ", coarseLocation=" + this.f18593g + ", buildName=" + this.f18594h + ", remainingDataPartitionSpaceKilobytes=" + this.f18595i + ")";
    }

    public ez0() {
        this(0);
    }
}
