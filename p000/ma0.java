package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ma0 implements na0 {

    /* JADX INFO: renamed from: a */
    public float f24778a;

    /* JADX INFO: renamed from: b */
    public float f24779b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static boolean m8255c(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final boolean m8256a(Comparable comparable) {
        float fFloatValue = ((Number) comparable).floatValue();
        return fFloatValue >= this.f24778a && fFloatValue <= this.f24779b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8257b() {
        return this.f24778a > this.f24779b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ma0)) {
            return false;
        }
        if (m8257b() && ((ma0) obj).m8257b()) {
            return true;
        }
        ma0 ma0Var = (ma0) obj;
        return this.f24778a == ma0Var.f24778a && this.f24779b == ma0Var.f24779b;
    }

    public final int hashCode() {
        if (m8257b()) {
            return -1;
        }
        return Float.hashCode(this.f24779b) + (Float.hashCode(this.f24778a) * 31);
    }

    public final String toString() {
        return this.f24778a + ".." + this.f24779b;
    }
}
