package p000;

/* JADX INFO: renamed from: tt */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1194tt extends mq0 {

    /* JADX INFO: renamed from: a */
    public String f31402a;

    /* JADX INFO: renamed from: b */
    public String f31403b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mq0) {
            C1194tt c1194tt = (C1194tt) ((mq0) obj);
            if (this.f31402a.equals(c1194tt.f31402a) && this.f31403b.equals(c1194tt.f31403b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f31403b.hashCode() ^ ((this.f31402a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.f31402a);
        sb.append(", variantId=");
        return zi4.m13623w(sb, this.f31403b, "}");
    }
}
