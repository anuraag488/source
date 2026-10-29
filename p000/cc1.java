package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cc1 {

    /* JADX INFO: renamed from: a */
    public final long f15922a;

    /* JADX INFO: renamed from: b */
    public final long f15923b;

    public cc1(long j, long j2) {
        if (j2 == 0) {
            this.f15922a = 0L;
            this.f15923b = 1L;
        } else {
            this.f15922a = j;
            this.f15923b = j2;
        }
    }

    public final String toString() {
        return this.f15922a + "/" + this.f15923b;
    }
}
