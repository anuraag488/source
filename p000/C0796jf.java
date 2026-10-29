package p000;

/* JADX INFO: renamed from: jf */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0796jf implements jc3 {

    /* JADX INFO: renamed from: b */
    public final short f22201b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0796jf(int i) {
        this.f22201b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return C0796jf.class.equals(obj != null ? obj.getClass() : null) && this.f22201b == ((C0796jf) obj).f22201b;
    }

    public final int hashCode() {
        return this.f22201b;
    }

    public final String toString() {
        return c75.m3878j("AndroidPointerIcon(type=", this.f22201b, ")");
    }
}
