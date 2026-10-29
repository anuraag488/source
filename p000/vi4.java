package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vi4 {

    /* JADX INFO: renamed from: a */
    public final int f32651a;

    /* JADX INFO: renamed from: b */
    public final String f32652b;

    public vi4(int i, String str) {
        this.f32651a = i;
        this.f32652b = str;
    }

    /* JADX INFO: renamed from: a */
    public final r72 m11900a() {
        int i = this.f32651a;
        if (i != 2) {
            return i != 3 ? new r72(toString()) : new is2(toString());
        }
        return new eu3(toString());
    }

    public final String toString() {
        String strM3877i;
        int i = this.f32651a;
        if (i == 1) {
            strM3877i = "unknown error";
        } else if (i != 2) {
            strM3877i = i != 3 ? c75.m3877i(i, "unknown error code ") : "memory limit exceeded";
        } else {
            strM3877i = "sandbox dead";
        }
        return strM3877i + ": " + this.f32652b;
    }
}
