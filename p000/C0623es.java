package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: es */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0623es extends AbstractC0472az {

    /* JADX INFO: renamed from: a */
    public ArrayList f18426a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0472az) {
            return this.f18426a.equals(((C0623es) ((AbstractC0472az) obj)).f18426a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18426a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f18426a + "}";
    }
}
