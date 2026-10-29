package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xy3 {

    /* JADX INFO: renamed from: a */
    public final long f34722a;

    /* JADX INFO: renamed from: b */
    public final long f34723b;

    /* JADX INFO: renamed from: c */
    public final long f34724c;

    /* JADX INFO: renamed from: d */
    public final long f34725d;

    public xy3(long j, long j2, long j3, long j4) {
        this.f34722a = j;
        this.f34723b = j2;
        this.f34724c = j3;
        this.f34725d = j4;
    }

    /* JADX INFO: renamed from: a */
    public static xy3 m12776a(xy3 xy3Var, long j) {
        return new xy3(xy3Var.f34722a, xy3Var.f34723b, xy3Var.f34724c, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy3)) {
            return false;
        }
        xy3 xy3Var = (xy3) obj;
        long j = xy3Var.f34722a;
        int i = pb0.f27502i;
        return ws4.m12408a(this.f34722a, j) && ws4.m12408a(this.f34723b, xy3Var.f34723b) && ws4.m12408a(this.f34724c, xy3Var.f34724c) && ws4.m12408a(this.f34725d, xy3Var.f34725d);
    }

    public final int hashCode() {
        int i = pb0.f27502i;
        return Long.hashCode(this.f34725d) + zi4.m13612l(zi4.m13612l(Long.hashCode(this.f34722a) * 31, this.f34723b, 31), this.f34724c, 31);
    }

    public final String toString() {
        String strM9470i = pb0.m9470i(this.f34722a);
        String strM9470i2 = pb0.m9470i(this.f34723b);
        return c75.m3882n(zi4.m13625y("SectionColors(containerColor=", strM9470i, ", contentColor=", strM9470i2, ", primaryIconColor="), pb0.m9470i(this.f34724c), ", secondaryIconColor=", pb0.m9470i(this.f34725d), ")");
    }
}
