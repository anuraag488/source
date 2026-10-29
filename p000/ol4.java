package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ol4 {

    /* JADX INFO: renamed from: c */
    public static final ol4 f26852c = new ol4(2, false);

    /* JADX INFO: renamed from: d */
    public static final ol4 f26853d = new ol4(1, true);

    /* JADX INFO: renamed from: a */
    public final int f26854a;

    /* JADX INFO: renamed from: b */
    public final boolean f26855b;

    public ol4(int i, boolean z) {
        this.f26854a = i;
        this.f26855b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol4)) {
            return false;
        }
        ol4 ol4Var = (ol4) obj;
        return this.f26854a == ol4Var.f26854a && this.f26855b == ol4Var.f26855b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26855b) + (Integer.hashCode(this.f26854a) * 31);
    }

    public final String toString() {
        if (equals(f26852c)) {
            return "TextMotion.Static";
        }
        return equals(f26853d) ? "TextMotion.Animated" : "Invalid";
    }
}
