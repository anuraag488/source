package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uj4 {

    /* JADX INFO: renamed from: b */
    public static final uj4 f31938b = new uj4(0);

    /* JADX INFO: renamed from: c */
    public static final uj4 f31939c = new uj4(1);

    /* JADX INFO: renamed from: d */
    public static final uj4 f31940d = new uj4(2);

    /* JADX INFO: renamed from: a */
    public final int f31941a;

    public uj4(int i) {
        this.f31941a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uj4) {
            return this.f31941a == ((uj4) obj).f31941a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31941a;
    }

    public final String toString() {
        int i = this.f31941a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return zi4.m13621u("TextDecoration[", yl2.m13170a(arrayList, ", ", null, 62), "]");
        }
        return "TextDecoration." + arrayList.get(0);
    }
}
