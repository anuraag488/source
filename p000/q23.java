package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class q23 {

    /* JADX INFO: renamed from: a */
    public static final Object[] f28158a = new Object[0];

    /* JADX INFO: renamed from: b */
    public static final cw2 f28159b = new cw2(0);

    /* JADX INFO: renamed from: a */
    public static final void m9714a(List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            kx5.m7733s0("Index " + i + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9715b(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            kx5.m7731r0("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
            throw null;
        }
        if (i < 0) {
            kx5.m7733s0("fromIndex (" + i + ") is less than 0.");
            throw null;
        }
        if (i2 <= size) {
            return;
        }
        kx5.m7733s0("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
