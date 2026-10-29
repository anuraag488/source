package p000;

import java.util.HashSet;

/* JADX INFO: renamed from: uu */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1232uu {

    /* JADX INFO: renamed from: a */
    public HashSet f32169a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1232uu) {
            return this.f32169a.equals(((C1232uu) obj).f32169a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32169a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f32169a + "}";
    }
}
