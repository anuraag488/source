package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g12 {

    /* JADX INFO: renamed from: k */
    public static int f19485k;

    /* JADX INFO: renamed from: l */
    public static final f70 f19486l = new f70(10);

    /* JADX INFO: renamed from: a */
    public String f19487a;

    /* JADX INFO: renamed from: b */
    public float f19488b;

    /* JADX INFO: renamed from: c */
    public float f19489c;

    /* JADX INFO: renamed from: d */
    public float f19490d;

    /* JADX INFO: renamed from: e */
    public float f19491e;

    /* JADX INFO: renamed from: f */
    public tw4 f19492f;

    /* JADX INFO: renamed from: g */
    public long f19493g;

    /* JADX INFO: renamed from: h */
    public int f19494h;

    /* JADX INFO: renamed from: i */
    public boolean f19495i;

    /* JADX INFO: renamed from: j */
    public int f19496j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g12)) {
            return false;
        }
        g12 g12Var = (g12) obj;
        if (!z62.m13387o(this.f19487a, g12Var.f19487a) || !p11.m9352c(this.f19488b, g12Var.f19488b) || !p11.m9352c(this.f19489c, g12Var.f19489c) || this.f19490d != g12Var.f19490d || this.f19491e != g12Var.f19491e || !this.f19492f.equals(g12Var.f19492f)) {
            return false;
        }
        long j = this.f19493g;
        long j2 = g12Var.f19493g;
        int i = pb0.f27502i;
        return ws4.m12408a(j, j2) && this.f19494h == g12Var.f19494h && this.f19495i == g12Var.f19495i;
    }

    public final int hashCode() {
        int iHashCode = (this.f19492f.hashCode() + c75.m3874f(this.f19491e, c75.m3874f(this.f19490d, c75.m3874f(this.f19489c, c75.m3874f(this.f19488b, this.f19487a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        long j = this.f19493g;
        int i = pb0.f27502i;
        return Boolean.hashCode(this.f19495i) + zi4.m13609i(this.f19494h, zi4.m13612l(iHashCode, j, 31), 31);
    }
}
