package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class og1 {

    /* JADX INFO: renamed from: a */
    public final String f26679a;

    /* JADX INFO: renamed from: b */
    public final String f26680b;

    public og1(String str, String str2) {
        this.f26679a = str;
        this.f26680b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og1)) {
            return false;
        }
        og1 og1Var = (og1) obj;
        return z62.m13387o(this.f26679a, og1Var.f26679a) && z62.m13387o(this.f26680b, og1Var.f26680b);
    }

    public final int hashCode() {
        String str = this.f26679a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26680b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "FirebaseInstallationId(fid=" + this.f26679a + ", authToken=" + this.f26680b + ')';
    }
}
