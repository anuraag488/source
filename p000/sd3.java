package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sd3 {

    /* JADX INFO: renamed from: a */
    public final String f30183a;

    /* JADX INFO: renamed from: b */
    public final Long f30184b;

    public sd3(String str, Long l) {
        this.f30183a = str;
        this.f30184b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd3)) {
            return false;
        }
        sd3 sd3Var = (sd3) obj;
        return this.f30183a.equals(sd3Var.f30183a) && this.f30184b.equals(sd3Var.f30184b);
    }

    public final int hashCode() {
        return this.f30184b.hashCode() + (this.f30183a.hashCode() * 31);
    }

    public final String toString() {
        return "Preference(key=" + this.f30183a + ", value=" + this.f30184b + ")";
    }
}
