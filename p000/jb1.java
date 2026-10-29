package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public enum jb1 implements k23 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0(0),
    f22147b(1);


    /* JADX INFO: renamed from: a */
    public final boolean f22149a;

    /* JADX WARN: Multi-variable type inference failed */
    jb1(int i) {
        this.f22149a = i;
    }

    @Override // p000.k23
    public final int getNumber() {
        return this.f22149a ? 1 : 0;
    }
}
