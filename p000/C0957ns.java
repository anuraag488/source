package p000;

/* JADX INFO: renamed from: ns */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0957ns extends wp0 {

    /* JADX INFO: renamed from: a */
    public String f26063a;

    /* JADX INFO: renamed from: b */
    public String f26064b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wp0) {
            C0957ns c0957ns = (C0957ns) ((wp0) obj);
            if (this.f26063a.equals(c0957ns.f26063a) && this.f26064b.equals(c0957ns.f26064b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f26064b.hashCode() ^ ((this.f26063a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f26063a);
        sb.append(", value=");
        return zi4.m13623w(sb, this.f26064b, "}");
    }
}
