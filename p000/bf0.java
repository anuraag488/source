package p000;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bf0 implements Comparator {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ yp1[] f15232a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        for (yp1 yp1Var : this.f15232a) {
            int iM10111p = qs5.m10111p((Comparable) yp1Var.invoke(obj), (Comparable) yp1Var.invoke(obj2));
            if (iM10111p != 0) {
                return iM10111p;
            }
        }
        return 0;
    }
}
