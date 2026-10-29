package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class tv3 {

    /* JADX INFO: renamed from: a */
    public static final long[] f31472a = {-9187201950435737345L, -1};

    /* JADX INFO: renamed from: b */
    public static final lw2 f31473b = new lw2(0);

    /* JADX INFO: renamed from: a */
    public static final int m11184a(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    /* JADX INFO: renamed from: b */
    public static final int m11185b(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    /* JADX INFO: renamed from: c */
    public static final int m11186c(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static final int m11187d(int i) {
        if (i == 7) {
            return 8;
        }
        return ((i - 1) / 7) + i;
    }
}
