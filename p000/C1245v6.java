package p000;

/* JADX INFO: renamed from: v6 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1245v6 {

    /* JADX INFO: renamed from: a */
    @s24("adapter_version")
    public final String f32424a;

    /* JADX INFO: renamed from: b */
    @s24("sdk_version")
    public final String f32425b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1245v6)) {
            return false;
        }
        C1245v6 c1245v6 = (C1245v6) obj;
        return z62.m13387o(this.f32424a, c1245v6.f32424a) && z62.m13387o(this.f32425b, c1245v6.f32425b);
    }

    public final int hashCode() {
        String str = this.f32424a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f32425b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return zi4.m13622v("AdapterVersionData(adapterVersion=", this.f32424a, ", sdkVersion=", this.f32425b, ")");
    }
}
