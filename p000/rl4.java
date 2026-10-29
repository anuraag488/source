package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rl4 {

    /* JADX INFO: renamed from: a */
    public final long f29397a;

    /* JADX INFO: renamed from: b */
    public final long f29398b;

    public rl4(long j, long j2) {
        this.f29397a = j;
        this.f29398b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl4)) {
            return false;
        }
        rl4 rl4Var = (rl4) obj;
        long j = rl4Var.f29397a;
        int i = pb0.f27502i;
        return ws4.m12408a(this.f29397a, j) && ws4.m12408a(this.f29398b, rl4Var.f29398b);
    }

    public final int hashCode() {
        int i = pb0.f27502i;
        return Long.hashCode(this.f29398b) + (Long.hashCode(this.f29397a) * 31);
    }

    public final String toString() {
        return zi4.m13622v("SelectionColors(selectionHandleColor=", pb0.m9470i(this.f29397a), ", selectionBackgroundColor=", pb0.m9470i(this.f29398b), ")");
    }
}
