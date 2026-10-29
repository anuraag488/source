package p000;

/* JADX INFO: renamed from: cm */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0532cm {

    /* JADX INFO: renamed from: a */
    public final String f16117a;

    /* JADX INFO: renamed from: b */
    public final boolean f16118b;

    public C0532cm(String str, boolean z) {
        this.f16117a = str;
        this.f16118b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0532cm)) {
            return false;
        }
        C0532cm c0532cm = (C0532cm) obj;
        return z62.m13387o(this.f16117a, c0532cm.f16117a) && this.f16118b == c0532cm.f16118b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16118b) + (this.f16117a.hashCode() * 31);
    }

    public final String toString() {
        return "AppIcon(packageName=" + this.f16117a + ", monochrome=" + this.f16118b + ")";
    }
}
