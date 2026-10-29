package p000;

/* JADX INFO: renamed from: a3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0004a3 {

    /* JADX INFO: renamed from: a */
    public final int f71a;

    /* JADX INFO: renamed from: b */
    public final int f72b;

    public C0004a3(int i, int i2) {
        this.f71a = i;
        this.f72b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0004a3)) {
            return false;
        }
        C0004a3 c0004a3 = (C0004a3) obj;
        return this.f71a == c0004a3.f71a && this.f72b == c0004a3.f72b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f72b) + (Integer.hashCode(this.f71a) * 31);
    }

    public final String toString() {
        return d55.m4367l("AccessibilityConfig(eventTypes=", this.f71a, ", flags=", this.f72b, ")");
    }
}
