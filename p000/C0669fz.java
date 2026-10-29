package p000;

/* JADX INFO: renamed from: fz */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0669fz {

    /* JADX INFO: renamed from: a */
    @s24("is_charging")
    public boolean f19424a;

    /* JADX INFO: renamed from: b */
    @s24("battery_level")
    public double f19425b;

    public C0669fz(int i) {
        this.f19424a = false;
        this.f19425b = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0669fz)) {
            return false;
        }
        C0669fz c0669fz = (C0669fz) obj;
        return this.f19424a == c0669fz.f19424a && Double.compare(this.f19425b, c0669fz.f19425b) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.f19424a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return Double.hashCode(this.f19425b) + (r0 * 31);
    }

    public final String toString() {
        return "BatterySignals(isCharging=" + this.f19424a + ", batteryLevel=" + this.f19425b + ")";
    }

    public C0669fz() {
        this(0);
    }
}
