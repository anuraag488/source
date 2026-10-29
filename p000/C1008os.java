package p000;

import java.util.List;

/* JADX INFO: renamed from: os */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1008os extends yp0 {

    /* JADX INFO: renamed from: a */
    public List f27049a;

    /* JADX INFO: renamed from: b */
    public String f27050b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yp0)) {
            return false;
        }
        C1008os c1008os = (C1008os) ((yp0) obj);
        if (!this.f27049a.equals(c1008os.f27049a)) {
            return false;
        }
        String str = this.f27050b;
        String str2 = c1008os.f27050b;
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public final int hashCode() {
        int iHashCode = (this.f27049a.hashCode() ^ 1000003) * 1000003;
        String str = this.f27050b;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.f27049a);
        sb.append(", orgId=");
        return zi4.m13623w(sb, this.f27050b, "}");
    }
}
