package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public enum pv1 implements h62 {
    f28019b(0),
    f28020c(1),
    f28021d(2),
    f28022e(3),
    f28023f(4),
    f28024g(5),
    f28025h(-1);


    /* JADX INFO: renamed from: a */
    public final int f28027a;

    pv1(int i) {
        this.f28027a = i;
    }

    /* JADX INFO: renamed from: a */
    public static pv1 m9680a(int i) {
        if (i == 0) {
            return f28019b;
        }
        if (i == 1) {
            return f28020c;
        }
        if (i == 2) {
            return f28021d;
        }
        if (i == 3) {
            return f28022e;
        }
        if (i == 4) {
            return f28023f;
        }
        if (i != 5) {
            return null;
        }
        return f28024g;
    }

    /* JADX INFO: renamed from: b */
    public final int m9681b() {
        if (this != f28025h) {
            return this.f28027a;
        }
        C1077qn.m9987m("Can't get the number of an unknown enum value.");
        return 0;
    }
}
