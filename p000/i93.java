package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i93 extends k93 {

    /* JADX INFO: renamed from: c */
    public final float f21190c;

    public i93(float f) {
        super(3);
        this.f21190c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i93) && Float.compare(this.f21190c, ((i93) obj).f21190c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f21190c);
    }

    public final String toString() {
        return "RelativeVerticalTo(dy=" + this.f21190c + ")";
    }
}
