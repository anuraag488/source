package p000;

/* JADX INFO: renamed from: uv */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1233uv {

    /* JADX INFO: renamed from: a */
    public final float f32196a;

    /* JADX INFO: renamed from: b */
    public final float f32197b;

    /* JADX INFO: renamed from: c */
    public final float f32198c;

    /* JADX INFO: renamed from: d */
    public final int f32199d;

    /* JADX INFO: renamed from: e */
    public final long f32200e;

    public C1233uv(bz2 bz2Var) {
        float f = bz2Var.f15701c;
        float f2 = bz2Var.f15702d;
        float f3 = bz2Var.f15700b;
        int i = bz2Var.f15699a;
        long j = bz2Var.f15703e;
        this.f32196a = f;
        this.f32197b = f2;
        this.f32198c = f3;
        this.f32199d = i;
        this.f32200e = j;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.f32196a + ", touchY=" + this.f32197b + ", progress=" + this.f32198c + ", swipeEdge=" + this.f32199d + ", frameTimeMillis=" + this.f32200e + ')';
    }
}
