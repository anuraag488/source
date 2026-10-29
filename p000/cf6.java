package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public enum cf6 implements fi6 {
    f15984b(0),
    f15985c(1),
    f15986d(2),
    f15987e(3),
    f15988f(-1);


    /* JADX INFO: renamed from: a */
    public final int f15990a;

    cf6(int i) {
        this.f15990a = i;
    }

    @Override // p000.fi6
    /* JADX INFO: renamed from: f */
    public final int mo4016f() {
        if (this != f15988f) {
            return this.f15990a;
        }
        C1077qn.m9987m("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f15990a);
    }
}
