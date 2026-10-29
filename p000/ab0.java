package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ab0 extends AbstractC1323x9 {

    /* JADX INFO: renamed from: p */
    public List f229p;

    public ab0(u12 u12Var) {
        List arrayList;
        super(u12Var, true, true);
        if (u12Var.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            int size = u12Var.size();
            y70.m13035o(size, "initialArraySize");
            arrayList = new ArrayList(size);
        }
        for (int i = 0; i < u12Var.size(); i++) {
            arrayList.add(null);
        }
        this.f229p = arrayList;
        m12533w();
    }

    @Override // p000.AbstractC1323x9
    /* JADX INFO: renamed from: r */
    public final void mo162r(int i, Object obj) {
        List list = this.f229p;
        if (list != null) {
            bb0 bb0Var = new bb0();
            bb0Var.f15195a = obj;
            VarHandle.storeStoreFence();
            list.set(i, bb0Var);
        }
    }

    @Override // p000.AbstractC1323x9
    /* JADX INFO: renamed from: u */
    public final void mo163u() {
        List<bb0> list = this.f229p;
        if (list != null) {
            int size = list.size();
            y70.m13035o(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            for (bb0 bb0Var : list) {
                arrayList.add(bb0Var != null ? bb0Var.f15195a : null);
            }
            m6986m(Collections.unmodifiableList(arrayList));
        }
    }

    @Override // p000.AbstractC1323x9
    /* JADX INFO: renamed from: x */
    public final void mo164x(int i) {
        if (i == 0) {
            throw null;
        }
        this.f34070l = null;
        this.f229p = null;
    }
}
