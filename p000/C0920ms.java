package p000;

/* JADX INFO: renamed from: ms */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0920ms extends up0 {

    /* JADX INFO: renamed from: a */
    public String f25176a;

    /* JADX INFO: renamed from: b */
    public String f25177b;

    /* JADX INFO: renamed from: c */
    public String f25178c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof up0) {
            C0920ms c0920ms = (C0920ms) ((up0) obj);
            if (this.f25176a.equals(c0920ms.f25176a) && this.f25177b.equals(c0920ms.f25177b) && this.f25178c.equals(c0920ms.f25178c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f25178c.hashCode() ^ ((((this.f25176a.hashCode() ^ 1000003) * 1000003) ^ this.f25177b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.f25176a);
        sb.append(", libraryName=");
        sb.append(this.f25177b);
        sb.append(", buildId=");
        return zi4.m13623w(sb, this.f25178c, "}");
    }
}
