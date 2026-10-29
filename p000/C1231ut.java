package p000;

import java.util.List;

/* JADX INFO: renamed from: ut */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1231ut extends oq0 {

    /* JADX INFO: renamed from: a */
    public List f32150a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oq0) {
            return this.f32150a.equals(((C1231ut) ((oq0) obj)).f32150a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32150a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f32150a + "}";
    }
}
