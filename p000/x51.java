package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public enum x51 implements h62 {
    f34007b(0),
    f34008c(1),
    f34009d(2),
    f34010e(-1);


    /* JADX INFO: renamed from: a */
    public final int f34012a;

    x51(int i) {
        this.f34012a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m12483a() {
        if (this != f34010e) {
            return this.f34012a;
        }
        C1077qn.m9987m("Can't get the number of an unknown enum value.");
        return 0;
    }
}
