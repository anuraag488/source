package p000;

/* JADX INFO: renamed from: qt */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1083qt extends lq0 {

    /* JADX INFO: renamed from: a */
    public String f28779a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lq0) {
            return this.f28779a.equals(((C1083qt) ((lq0) obj)).f28779a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28779a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return zi4.m13623w(new StringBuilder("Log{content="), this.f28779a, "}");
    }
}
