package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class br2 extends AbstractC1129s1 {

    /* JADX INFO: renamed from: a */
    public final i50 f15521a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f15522b;

    /* JADX INFO: renamed from: c */
    public final List f15523c;

    public br2(i50 i50Var, sl2 sl2Var, ArrayList arrayList, iv2 iv2Var) {
        if (iv2Var.f21821b != arrayList.size() + 1) {
            C1077qn.m9987m("Outline progress size is expected to be the cubics size + 1");
            throw null;
        }
        int i = iv2Var.f21821b;
        if (i == 0) {
            kx5.m7737u0("FloatList is empty.");
            throw null;
        }
        float[] fArr = iv2Var.f21820a;
        int i2 = 0;
        float fM6945b = 0.0f;
        if (fArr[0] != 0.0f) {
            C1077qn.m9987m("First outline progress value is expected to be zero");
            throw null;
        }
        if (i == 0) {
            kx5.m7737u0("FloatList is empty.");
            throw null;
        }
        if (fArr[i - 1] != 1.0f) {
            C1077qn.m9987m("Last outline progress value is expected to be one");
            throw null;
        }
        this.f15521a = i50Var;
        this.f15523c = sl2Var;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i2 < size) {
            int i3 = i2 + 1;
            if (iv2Var.m6945b(i3) - iv2Var.m6945b(i2) > 1.0E-4f) {
                arrayList2.add(new ar2(this, (as0) arrayList.get(i2), fM6945b, iv2Var.m6945b(i3)));
                fM6945b = iv2Var.m6945b(i3);
            }
            i2 = i3;
        }
        ar2 ar2Var = (ar2) arrayList2.get(kx5.m7689T(arrayList2));
        float f = ar2Var.f14802c;
        if (1.0f < f) {
            C1077qn.m9987m("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
            throw null;
        }
        ar2Var.f14802c = f;
        ar2Var.f14803d = 1.0f;
        this.f15522b = arrayList2;
    }

    @Override // p000.AbstractC0929n0
    /* JADX INFO: renamed from: a */
    public final int mo103a() {
        return this.f15522b.size();
    }

    @Override // p000.AbstractC0929n0, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ar2) {
            return super.contains((ar2) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (ar2) this.f15522b.get(i);
    }

    @Override // p000.AbstractC1129s1, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ar2) {
            return super.indexOf((ar2) obj);
        }
        return -1;
    }

    @Override // p000.AbstractC1129s1, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ar2) {
            return super.lastIndexOf((ar2) obj);
        }
        return -1;
    }
}
