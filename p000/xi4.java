package p000;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class xi4 {

    /* JADX INFO: renamed from: a */
    public static final Layout.Alignment f34307a;

    /* JADX INFO: renamed from: b */
    public static final Layout.Alignment f34308b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (z62.m13387o(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (z62.m13387o(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f34307a = alignment;
        f34308b = alignment2;
    }
}
