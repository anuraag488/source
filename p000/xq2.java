package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface xq2 {
    /* JADX INFO: renamed from: a */
    default int mo6053a(s62 s62Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new fw0((sq2) list.get(i2), t62.f30798b, w62.f33121b, b));
        }
        return mo5763f(new e72(s62Var, s62Var.getLayoutDirection()), arrayList, ll0.m8010b(0, i, 0, 0, 13)).mo4504d();
    }

    /* JADX INFO: renamed from: b */
    default int mo5762b(s62 s62Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new fw0((sq2) list.get(i2), t62.f30798b, w62.f33120a, b));
        }
        return mo5763f(new e72(s62Var, s62Var.getLayoutDirection()), arrayList, ll0.m8010b(0, 0, 0, i, 7)).mo4506g();
    }

    /* JADX INFO: renamed from: f */
    yq2 mo5763f(zq2 zq2Var, List list, long j);

    /* JADX INFO: renamed from: g */
    default int mo6054g(s62 s62Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new fw0((sq2) list.get(i2), t62.f30797a, w62.f33121b, b));
        }
        return mo5763f(new e72(s62Var, s62Var.getLayoutDirection()), arrayList, ll0.m8010b(0, i, 0, 0, 13)).mo4504d();
    }

    /* JADX INFO: renamed from: i */
    default int mo6055i(s62 s62Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new fw0((sq2) list.get(i2), t62.f30797a, w62.f33120a, b));
        }
        return mo5763f(new e72(s62Var, s62Var.getLayoutDirection()), arrayList, ll0.m8010b(0, 0, 0, i, 7)).mo4506g();
    }
}
