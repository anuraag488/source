package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x50 {

    /* JADX INFO: renamed from: n */
    public static final x50 f33992n = new x50(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: o */
    public static final x50 f33993o = new x50(false, false, -1, -1, false, false, false, Integer.MAX_VALUE, -1, true, false, false, null);

    /* JADX INFO: renamed from: a */
    public final boolean f33994a;

    /* JADX INFO: renamed from: b */
    public final boolean f33995b;

    /* JADX INFO: renamed from: c */
    public final int f33996c;

    /* JADX INFO: renamed from: d */
    public final int f33997d;

    /* JADX INFO: renamed from: e */
    public final boolean f33998e;

    /* JADX INFO: renamed from: f */
    public final boolean f33999f;

    /* JADX INFO: renamed from: g */
    public final boolean f34000g;

    /* JADX INFO: renamed from: h */
    public final int f34001h;

    /* JADX INFO: renamed from: i */
    public final int f34002i;

    /* JADX INFO: renamed from: j */
    public final boolean f34003j;

    /* JADX INFO: renamed from: k */
    public final boolean f34004k;

    /* JADX INFO: renamed from: l */
    public final boolean f34005l;

    /* JADX INFO: renamed from: m */
    public String f34006m;

    public x50(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f33994a = z;
        this.f33995b = z2;
        this.f33996c = i;
        this.f33997d = i2;
        this.f33998e = z3;
        this.f33999f = z4;
        this.f34000g = z5;
        this.f34001h = i3;
        this.f34002i = i4;
        this.f34003j = z6;
        this.f34004k = z7;
        this.f34005l = z8;
        this.f34006m = str;
    }

    public final String toString() {
        String str = this.f34006m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f33994a) {
            sb.append("no-cache, ");
        }
        if (this.f33995b) {
            sb.append("no-store, ");
        }
        int i = this.f33996c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.f33997d;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.f33998e) {
            sb.append("private, ");
        }
        if (this.f33999f) {
            sb.append("public, ");
        }
        if (this.f34000g) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.f34001h;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.f34002i;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f34003j) {
            sb.append("only-if-cached, ");
        }
        if (this.f34004k) {
            sb.append("no-transform, ");
        }
        if (this.f34005l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        this.f34006m = string;
        return string;
    }
}
