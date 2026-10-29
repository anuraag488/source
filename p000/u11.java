package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u11 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u11) && p11.m9352c(10.0f, 10.0f) && p11.m9352c(40.0f, 40.0f) && p11.m9352c(10.0f, 10.0f) && p11.m9352c(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + c75.m3874f(40.0f, c75.m3874f(10.0f, c75.m3874f(40.0f, Float.hashCode(10.0f) * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM9353d = p11.m9353d(10.0f);
        String strM9353d2 = p11.m9353d(40.0f);
        return c75.m3882n(zi4.m13625y("DpTouchBoundsExpansion(start=", strM9353d, ", top=", strM9353d2, ", end="), p11.m9353d(10.0f), ", bottom=", p11.m9353d(40.0f), ", isLayoutDirectionAware=true)");
    }
}
