package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z70 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0520ca f35799a;

    /* JADX INFO: renamed from: b */
    public final yp1 f35800b;

    /* JADX INFO: renamed from: c */
    public final ag1 f35801c;

    /* JADX INFO: renamed from: d */
    public final boolean f35802d;

    public z70(InterfaceC0520ca interfaceC0520ca, yp1 yp1Var, ag1 ag1Var, boolean z) {
        this.f35799a = interfaceC0520ca;
        this.f35800b = yp1Var;
        this.f35801c = ag1Var;
        this.f35802d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z70)) {
            return false;
        }
        z70 z70Var = (z70) obj;
        return z62.m13387o(this.f35799a, z70Var.f35799a) && z62.m13387o(this.f35800b, z70Var.f35800b) && z62.m13387o(this.f35801c, z70Var.f35801c) && this.f35802d == z70Var.f35802d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35802d) + ((this.f35801c.hashCode() + ((this.f35800b.hashCode() + (this.f35799a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f35799a + ", size=" + this.f35800b + ", animationSpec=" + this.f35801c + ", clip=" + this.f35802d + ")";
    }
}
