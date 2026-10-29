package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wm1 {

    /* JADX INFO: renamed from: a */
    public List f33488a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wm1) && this.f33488a.equals(((wm1) obj).f33488a);
    }

    public final int hashCode() {
        return this.f33488a.hashCode();
    }

    public final String toString() {
        return "Settings(settings=" + this.f33488a + ")";
    }
}
