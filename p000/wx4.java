package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wx4 {

    /* JADX INFO: renamed from: a */
    @s24("startMuted")
    public boolean f33838a;

    /* JADX INFO: renamed from: b */
    @s24("clickToExpandRequested")
    public boolean f33839b;

    /* JADX INFO: renamed from: c */
    @s24("customControlsRequested")
    public boolean f33840c;

    public wx4(boolean z, boolean z2, boolean z3) {
        this.f33838a = z;
        this.f33839b = z2;
        this.f33840c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx4)) {
            return false;
        }
        wx4 wx4Var = (wx4) obj;
        return this.f33838a == wx4Var.f33838a && this.f33839b == wx4Var.f33839b && this.f33840c == wx4Var.f33840c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public final int hashCode() {
        boolean z = this.f33838a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.f33839b;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.f33840c;
        return i2 + (z3 ? 1 : z3);
    }

    public final String toString() {
        return "VideoOptionsSignal(startMuted=" + this.f33838a + ", clickToExpandRequested=" + this.f33839b + ", customControlsRequested=" + this.f33840c + ")";
    }

    public wx4() {
        this(true, false, false);
    }
}
