package p000;

import java.io.File;

/* JADX INFO: renamed from: zl */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1409zl {

    /* JADX INFO: renamed from: a */
    public File f36164a;

    /* JADX INFO: renamed from: b */
    public File f36165b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1409zl)) {
            return false;
        }
        C1409zl c1409zl = (C1409zl) obj;
        return z62.m13387o(this.f36164a, c1409zl.f36164a) && z62.m13387o(this.f36165b, c1409zl.f36165b);
    }

    public final int hashCode() {
        return this.f36165b.hashCode() + (this.f36164a.hashCode() * 31);
    }

    public final String toString() {
        return "AppDirs(cache=" + this.f36164a + ", data=" + this.f36165b + ")";
    }
}
