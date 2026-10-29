package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class xz5 {
    /* JADX INFO: renamed from: a */
    public static void m12800a(int i, int i2) {
        String strM5439a;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM5439a = f06.m5439a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    C1077qn.m9987m(c75.m3877i(i2, "negative size: "));
                    return;
                }
                strM5439a = f06.m5439a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM5439a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m12801b(int i, int i2) {
        if (i < 0 || i > i2) {
            xy4.m12792u(m12804e(i, "index", i2));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m12802c(int i, int i2) {
        String strM9355b;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM9355b = p16.m9355b("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    qm5.m9913d(String.valueOf(i2).length() + 15, i2, "negative size: ");
                    return;
                }
                strM9355b = p16.m9355b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM9355b);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m12803d(int i, int i2, int i3) {
        String strM12804e;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM12804e = m12804e(i, "start index", i3);
            } else {
                strM12804e = (i2 < 0 || i2 > i3) ? m12804e(i2, "end index", i3) : f06.m5439a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM12804e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m12804e(int i, String str, int i2) {
        if (i < 0) {
            return f06.m5439a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return f06.m5439a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        C1077qn.m9987m(c75.m3877i(i2, "negative size: "));
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static void m12805f(int i, int i2, int i3) {
        String strM12806g;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM12806g = m12806g(i, "start index", i3);
            } else {
                strM12806g = (i2 < 0 || i2 > i3) ? m12806g(i2, "end index", i3) : p16.m9355b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM12806g);
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m12806g(int i, String str, int i2) {
        if (i < 0) {
            return p16.m9355b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return p16.m9355b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        qm5.m9913d(String.valueOf(i2).length() + 15, i2, "negative size: ");
        return null;
    }
}
