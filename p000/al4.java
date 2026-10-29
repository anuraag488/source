package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class al4 {

    /* JADX INFO: renamed from: c */
    public static final al4 f14615c = new al4(vd6.m11817A(0), vd6.m11817A(0));

    /* JADX INFO: renamed from: a */
    public final long f14616a;

    /* JADX INFO: renamed from: b */
    public final long f14617b;

    public al4(long j, long j2) {
        this.f14616a = j;
        this.f14617b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al4)) {
            return false;
        }
        al4 al4Var = (al4) obj;
        return bm4.m3632b(this.f14616a, al4Var.f14616a) && bm4.m3632b(this.f14617b, al4Var.f14617b);
    }

    public final int hashCode() {
        cm4[] cm4VarArr = bm4.f15418b;
        return Long.hashCode(this.f14617b) + (Long.hashCode(this.f14616a) * 31);
    }

    public final String toString() {
        return zi4.m13622v("TextIndent(firstLine=", bm4.m3635e(this.f14616a), ", restLine=", bm4.m3635e(this.f14617b), ")");
    }
}
