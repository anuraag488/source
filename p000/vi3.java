package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vi3 {

    /* JADX INFO: renamed from: d */
    public static final vi3 f32647d;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32648a;

    /* JADX INFO: renamed from: b */
    public int f32649b;

    /* JADX INFO: renamed from: c */
    public int f32650c;

    static {
        int i = 0;
        f32647d = new vi3(i, i, (byte) 0);
    }

    public /* synthetic */ vi3(int i, int i2, byte b) {
        this.f32648a = b;
        this.f32649b = i;
        this.f32650c = i2;
    }

    /* JADX INFO: renamed from: a */
    public int m11898a(int i) {
        if (i >= 0 && i <= this.f32649b) {
            dt0.m4699b0(i, this.f32650c, i);
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public int m11899b(int i) {
        if (i >= 0 && i <= this.f32650c) {
            dt0.m4701c0(i, this.f32649b, i);
        }
        return i;
    }

    public String toString() {
        switch (this.f32648a) {
            case 0:
                StringBuilder sb = new StringBuilder(vi3.class.getSimpleName());
                sb.append("[position = ");
                sb.append(this.f32649b);
                sb.append(", length = ");
                return c75.m3880l(sb, this.f32650c, "]");
            default:
                return super.toString();
        }
    }
}
