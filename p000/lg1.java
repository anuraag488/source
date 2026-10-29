package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class lg1 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg1(String str) {
        super(str);
        y42.m12852Y(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg1(String str, Throwable th) {
        super(str, th);
        y42.m12852Y(str, "Detail message must not be empty");
    }
}
