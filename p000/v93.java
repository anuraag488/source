package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v93 implements InterfaceC1347xx {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ sw2 f32478a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ mq1 f32479b;

    @Override // p000.InterfaceC1347xx
    /* JADX INFO: renamed from: a */
    public final Boolean mo11770a() {
        sw2 sw2Var = this.f32478a;
        List list = (List) sw2Var.getValue();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((u93) it.next()).mo11770a() == null) {
                    return null;
                }
            }
        }
        List list2 = (List) sw2Var.getValue();
        boolean z = true;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (!z62.m13387o(((u93) it2.next()).mo11770a(), Boolean.TRUE)) {
                    z = false;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // p000.InterfaceC1347xx
    /* JADX INFO: renamed from: c */
    public final Object mo11771c(wm0 wm0Var) {
        return this.f32479b.invoke((List) this.f32478a.getValue(), wm0Var);
    }

    public final String toString() {
        List<u93> list = (List) this.f32478a.getValue();
        ArrayList arrayList = new ArrayList(ib0.m6717y0(list, 10));
        for (u93 u93Var : list) {
            arrayList.add(new l73(u93Var.getTitle(), u93Var.mo11770a()));
        }
        return "Permission(permissions=" + arrayList + ", status=" + mo11770a() + ")";
    }
}
