package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: mk */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0912mk {

    /* JADX INFO: renamed from: a */
    public static final C0875lk f24972a = new C0875lk("");

    /* JADX INFO: renamed from: a */
    public static final List m8335a(C0875lk c0875lk, int i, int i2, C0891m c0891m) {
        List list;
        if (i == i2 || (list = c0875lk.f24091a) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= c0875lk.f24092b.length()) {
            if (c0891m == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) c0891m.invoke(((C0838kk) obj).f23186a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            C0838kk c0838kk = (C0838kk) list.get(i3);
            if (c0891m != null ? ((Boolean) c0891m.invoke(c0838kk.f23186a)).booleanValue() : true) {
                int i4 = c0838kk.f23187b;
                int i5 = c0838kk.f23188c;
                if (m8336b(i, i2, i4, i5)) {
                    arrayList2.add(new C0838kk((InterfaceC0728hk) c0838kk.f23186a, sc6.m10675p(c0838kk.f23187b, i, i2) - i, sc6.m10675p(i5, i, i2) - i, c0838kk.f23189d));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m8336b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
