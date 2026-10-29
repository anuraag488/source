package p000;

/* JADX INFO: renamed from: du */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0587du extends vc1 {

    /* JADX INFO: renamed from: a */
    public Integer f17384a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vc1)) {
            return false;
        }
        Integer num = this.f17384a;
        C0587du c0587du = (C0587du) ((vc1) obj);
        if (num == null) {
            return c0587du.f17384a == null;
        }
        return num.equals(c0587du.f17384a);
    }

    public final int hashCode() {
        Integer num = this.f17384a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f17384a + "}";
    }
}
