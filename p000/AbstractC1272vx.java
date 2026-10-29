package p000;

/* JADX INFO: renamed from: vx */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1272vx {
    /* JADX INFO: renamed from: a */
    public abstract jm3 mo24a();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1272vx) {
            return mo24a().equals(((AbstractC1272vx) obj).mo24a());
        }
        return false;
    }

    public final int hashCode() {
        return mo24a().hashCode();
    }

    public final String toString() {
        return mo24a().toString();
    }
}
