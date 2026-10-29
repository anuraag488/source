package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ly0 implements ky0 {

    /* JADX INFO: renamed from: a */
    public float f24459a;

    /* JADX INFO: renamed from: b */
    public float f24460b;

    @Override // p000.ky0
    /* JADX INFO: renamed from: c */
    public final float mo3580c() {
        return this.f24459a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly0)) {
            return false;
        }
        ly0 ly0Var = (ly0) obj;
        return Float.compare(this.f24459a, ly0Var.f24459a) == 0 && Float.compare(this.f24460b, ly0Var.f24460b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f24460b) + (Float.hashCode(this.f24459a) * 31);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: r */
    public final float mo3585r() {
        return this.f24460b;
    }

    public final String toString() {
        return "DensityImpl(density=" + this.f24459a + ", fontScale=" + this.f24460b + ")";
    }
}
