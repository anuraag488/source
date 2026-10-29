package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public enum hd2 implements h62 {
    f20488b(0),
    f20489c(1),
    f20490d(2),
    f20491e(3),
    f20492f(-1);


    /* JADX INFO: renamed from: a */
    public final int f20494a;

    hd2(int i) {
        this.f20494a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m6334a() {
        if (this != f20492f) {
            return this.f20494a;
        }
        C1077qn.m9987m("Can't get the number of an unknown enum value.");
        return 0;
    }
}
