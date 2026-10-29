package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class eq3 implements fq3 {

    /* JADX INFO: renamed from: a */
    public float f18374a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eq3) && this.f18374a == ((eq3) obj).f18374a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f18374a);
    }
}
