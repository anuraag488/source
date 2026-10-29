package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fl2 implements qm1 {

    /* JADX INFO: renamed from: a */
    public float f19079a;

    @Override // p000.qm1
    /* JADX INFO: renamed from: a */
    public final float mo5729a(float f) {
        return f / this.f19079a;
    }

    @Override // p000.qm1
    /* JADX INFO: renamed from: b */
    public final float mo5730b(float f) {
        return f * this.f19079a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fl2) && Float.compare(this.f19079a, ((fl2) obj).f19079a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19079a);
    }

    public final String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.f19079a + ")";
    }
}
