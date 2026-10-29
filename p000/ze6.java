package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public enum ze6 implements fi6 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0(0),
    f36024b(1),
    f36025c(2),
    f36026d(3),
    f36027e(4),
    /* JADX INFO: Fake field, exist only in values array */
    EF5(5),
    /* JADX INFO: Fake field, exist only in values array */
    EF6(6),
    f36028f(7),
    /* JADX INFO: Fake field, exist only in values array */
    EF8(8),
    f36029g(9),
    f36030h(10),
    /* JADX INFO: Fake field, exist only in values array */
    EF11(11),
    f36031i(-1);


    /* JADX INFO: renamed from: a */
    public final int f36033a;

    ze6(int i) {
        this.f36033a = i;
    }

    @Override // p000.fi6
    /* JADX INFO: renamed from: f */
    public final int mo4016f() {
        if (this != f36031i) {
            return this.f36033a;
        }
        C1077qn.m9987m("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f36033a);
    }
}
