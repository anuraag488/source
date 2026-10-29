package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fs0 {

    /* JADX INFO: renamed from: a */
    public final String f19247a;

    /* JADX INFO: renamed from: b */
    public final wp1 f19248b;

    public fs0(String str, wp1 wp1Var) {
        this.f19247a = str;
        this.f19248b = wp1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs0)) {
            return false;
        }
        fs0 fs0Var = (fs0) obj;
        return z62.m13387o(this.f19247a, fs0Var.f19247a) && this.f19248b == fs0Var.f19248b;
    }

    public final int hashCode() {
        return this.f19248b.hashCode() + (this.f19247a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.f19247a + ", action=" + this.f19248b + ")";
    }
}
