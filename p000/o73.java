package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o73 {

    /* JADX INFO: renamed from: a */
    public C0452af f26411a;

    /* JADX INFO: renamed from: b */
    public int f26412b;

    /* JADX INFO: renamed from: c */
    public int f26413c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o73) {
            o73 o73Var = (o73) obj;
            if (this.f26411a == o73Var.f26411a && this.f26412b == o73Var.f26412b && this.f26413c == o73Var.f26413c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26413c) + zi4.m13609i(this.f26412b, this.f26411a.hashCode() * 31, 31);
    }

    public final String toString() {
        C0452af c0452af = this.f26411a;
        int i = this.f26412b;
        int i2 = this.f26413c;
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(c0452af);
        sb.append(", startIndex=");
        sb.append(i);
        sb.append(", endIndex=");
        return c75.m3880l(sb, i2, ")");
    }
}
