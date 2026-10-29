package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pe2 implements Comparable {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f27563b = 0;

    /* JADX INFO: renamed from: a */
    public int f27564a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f27564a - ((pe2) obj).f27564a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        pe2 pe2Var = obj instanceof pe2 ? (pe2) obj : null;
        return pe2Var != null && this.f27564a == pe2Var.f27564a;
    }

    public final int hashCode() {
        return this.f27564a;
    }

    public final String toString() {
        return "2.4.21";
    }
}
