package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j93 extends k93 {

    /* JADX INFO: renamed from: c */
    public final float f22111c;

    public j93(float f) {
        super(3);
        this.f22111c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j93) && Float.compare(this.f22111c, ((j93) obj).f22111c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22111c);
    }

    public final String toString() {
        return "VerticalTo(y=" + this.f22111c + ")";
    }
}
