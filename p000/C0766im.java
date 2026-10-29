package p000;

/* JADX INFO: renamed from: im */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0766im {

    /* JADX INFO: renamed from: a */
    public final String f21544a;

    /* JADX INFO: renamed from: b */
    public final String f21545b;

    public C0766im(String str, String str2) {
        this.f21544a = str;
        this.f21545b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0766im)) {
            return false;
        }
        C0766im c0766im = (C0766im) obj;
        return z62.m13387o(this.f21544a, c0766im.f21544a) && z62.m13387o(this.f21545b, c0766im.f21545b);
    }

    public final int hashCode() {
        return this.f21545b.hashCode() + (this.f21544a.hashCode() * 31);
    }

    public final String toString() {
        return zi4.m13622v("AppInfo(packageName=", this.f21544a, ", appName=", this.f21545b, ")");
    }
}
