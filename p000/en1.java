package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class en1 implements Comparable {

    /* JADX INFO: renamed from: a */
    public int f18268a;

    /* JADX INFO: renamed from: b */
    public int f18269b;

    /* JADX INFO: renamed from: c */
    public String f18270c;

    /* JADX INFO: renamed from: d */
    public String f18271d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        en1 en1Var = (en1) obj;
        int i = this.f18268a - en1Var.f18268a;
        return i == 0 ? this.f18269b - en1Var.f18269b : i;
    }
}
