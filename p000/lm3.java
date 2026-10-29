package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lm3 extends as4 {

    /* JADX INFO: renamed from: f */
    public as4 f24171f;

    /* JADX INFO: renamed from: g */
    public int f24172g;

    public final boolean equals(Object obj) {
        if (!(obj instanceof lm3)) {
            return false;
        }
        lm3 lm3Var = (lm3) obj;
        return lm3Var.f24171f.equals(this.f24171f) && lm3Var.f24172g == this.f24172g;
    }

    public final int hashCode() {
        return this.f24171f.hashCode() + (this.f24172g * 31);
    }
}
