package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bq6 {

    /* JADX INFO: renamed from: a */
    public final hm6 f15509a;

    /* JADX INFO: renamed from: b */
    public final String f15510b;

    /* JADX INFO: renamed from: c */
    public final Object[] f15511c;

    /* JADX INFO: renamed from: d */
    public final int f15512d;

    public bq6(hm6 hm6Var, String str, Object[] objArr) {
        this.f15509a = hm6Var;
        this.f15510b = str;
        this.f15511c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f15512d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f15512d = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m3661a() {
        int i = this.f15512d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
