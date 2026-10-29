package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class la6 {

    /* JADX INFO: renamed from: a */
    public u36 f23898a;

    /* JADX INFO: renamed from: b */
    public String f23899b;

    /* JADX INFO: renamed from: c */
    public Object[] f23900c;

    /* JADX INFO: renamed from: d */
    public int f23901d;

    /* JADX INFO: renamed from: a */
    public final int m7890a() {
        int i = this.f23901d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
