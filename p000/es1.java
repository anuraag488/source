package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class es1 implements fs1 {

    /* JADX INFO: renamed from: a */
    public final float f18430a;

    public es1(float f) {
        this.f18430a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof es1) && Float.compare(this.f18430a, ((es1) obj).f18430a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f18430a);
    }

    public final String toString() {
        return "None(progress=" + this.f18430a + ")";
    }
}
