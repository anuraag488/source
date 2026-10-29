package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class vw2 {
    /* JADX INFO: renamed from: a */
    public static final void m12009a(List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            m12011c(i, size);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m12010b(List list, int i, int i2) {
        if (i > i2) {
            m12014f(i, i2);
        }
        if (i < 0) {
            m12012d(i);
        }
        if (i2 > list.size()) {
            m12013e(i2, list.size());
        }
    }

    /* JADX INFO: renamed from: c */
    private static final void m12011c(int i, int i2) {
        throw new IndexOutOfBoundsException(d55.m4367l("Index ", i, " is out of bounds. The list has ", i2, " elements."));
    }

    /* JADX INFO: renamed from: d */
    private static final void m12012d(int i) {
        throw new IndexOutOfBoundsException(c75.m3878j("fromIndex (", i, ") is less than 0."));
    }

    /* JADX INFO: renamed from: e */
    private static final void m12013e(int i, int i2) {
        throw new IndexOutOfBoundsException(d55.m4367l("toIndex (", i, ") is more than than the list size (", i2, ")"));
    }

    /* JADX INFO: renamed from: f */
    private static final void m12014f(int i, int i2) {
        throw new IllegalArgumentException(d55.m4367l("Indices are out of order. fromIndex (", i, ") is greater than toIndex (", i2, ")."));
    }
}
