package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u83 extends k93 {

    /* JADX INFO: renamed from: c */
    public final float f31730c;

    public u83(float f) {
        super(3);
        this.f31730c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u83) && Float.compare(this.f31730c, ((u83) obj).f31730c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f31730c);
    }

    public final String toString() {
        return "HorizontalTo(x=" + this.f31730c + ")";
    }
}
