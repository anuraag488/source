package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public enum j63 implements h62 {
    f22044b(0),
    f22045c(1),
    f22046d(2),
    f22047e(3),
    f22048f(4),
    f22049g(5),
    f22050h(-1);


    /* JADX INFO: renamed from: a */
    public final int f22052a;

    j63(int i) {
        this.f22052a = i;
    }

    /* JADX INFO: renamed from: a */
    public static j63 m7023a(int i) {
        if (i == 0) {
            return f22044b;
        }
        if (i == 1) {
            return f22045c;
        }
        if (i == 2) {
            return f22046d;
        }
        if (i == 3) {
            return f22047e;
        }
        if (i == 4) {
            return f22048f;
        }
        if (i != 5) {
            return null;
        }
        return f22049g;
    }

    /* JADX INFO: renamed from: b */
    public final int m7024b() {
        if (this != f22050h) {
            return this.f22052a;
        }
        C1077qn.m9987m("Can't get the number of an unknown enum value.");
        return 0;
    }
}
