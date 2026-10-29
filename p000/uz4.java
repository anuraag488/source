package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uz4 {

    /* JADX INFO: renamed from: a */
    public final float f32275a;

    /* JADX INFO: renamed from: b */
    public final float f32276b;

    public uz4(float f, float f2) {
        this.f32275a = f;
        this.f32276b = f2;
    }

    /* JADX INFO: renamed from: a */
    public final float[] m11687a() {
        float f = this.f32275a;
        float f2 = this.f32276b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz4)) {
            return false;
        }
        uz4 uz4Var = (uz4) obj;
        return Float.compare(this.f32275a, uz4Var.f32275a) == 0 && Float.compare(this.f32276b, uz4Var.f32276b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32276b) + (Float.hashCode(this.f32275a) * 31);
    }

    public final String toString() {
        return "WhitePoint(x=" + this.f32275a + ", y=" + this.f32276b + ")";
    }
}
