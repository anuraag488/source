package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f82 {

    /* JADX INFO: renamed from: a */
    public int f18836a;

    /* JADX INFO: renamed from: b */
    public String f18837b;

    /* JADX INFO: renamed from: c */
    public String f18838c;

    /* JADX INFO: renamed from: d */
    public int f18839d;

    /* JADX INFO: renamed from: e */
    public int f18840e;

    public final String toString() {
        String str;
        int i = this.f18836a;
        if (i == 1) {
            str = "L";
        } else if (i == 2) {
            str = "D";
        } else if (i == 4) {
            str = "I";
        } else if (i != 8) {
            str = i != 16 ? "?" : "W";
        } else {
            str = "E";
        }
        return str + " <expression>:" + this.f18839d + ":" + this.f18840e + ": " + this.f18837b;
    }
}
