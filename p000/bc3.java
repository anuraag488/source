package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bc3 {

    /* JADX INFO: renamed from: a */
    @s24("package_version")
    public String f15206a;

    public bc3(int i) {
        this.f15206a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bc3) && z62.m13387o(this.f15206a, ((bc3) obj).f15206a);
    }

    public final int hashCode() {
        String str = this.f15206a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return zi4.m13621u("PlayStoreSignals(playStoreVersion=", this.f15206a, ")");
    }

    public bc3() {
        this(0);
    }
}
