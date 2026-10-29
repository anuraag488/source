package p000;

/* JADX INFO: renamed from: xt */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1343xt extends rq0 {

    /* JADX INFO: renamed from: a */
    public String f34611a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rq0) {
            return this.f34611a.equals(((C1343xt) ((rq0) obj)).f34611a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34611a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return zi4.m13623w(new StringBuilder("User{identifier="), this.f34611a, "}");
    }
}
