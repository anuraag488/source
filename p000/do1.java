package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class do1 implements bo1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ eo1 f17235a;

    @Override // p000.bo1
    /* JADX INFO: renamed from: a */
    public final boolean mo3642a(ArrayList arrayList, ArrayList arrayList2) {
        boolean zM5229R;
        eo1 eo1Var = this.f17235a;
        ArrayList arrayList3 = eo1Var.f18317n;
        if (eo1.m5212J(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + eo1Var.f18304a);
        }
        if (eo1Var.f18307d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            zM5229R = false;
        } else {
            ArrayList arrayList4 = eo1Var.f18307d;
            C0589dw c0589dw = (C0589dw) arrayList4.get(arrayList4.size() - 1);
            eo1Var.f18311h = c0589dw;
            ArrayList arrayList5 = c0589dw.f17434a;
            int size = arrayList5.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList5.get(i);
                i++;
                pn1 pn1Var = ((po1) obj).f27852b;
                if (pn1Var != null) {
                    pn1Var.f27790m = true;
                }
            }
            zM5229R = eo1Var.m5229R(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                linkedHashSet.addAll(eo1.m5211E((C0589dw) obj2));
            }
            int size3 = arrayList3.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList3.get(i3);
                i3++;
                if (obj3 != null) {
                    xy4.m12778e();
                    return false;
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            }
        }
        return zM5229R;
    }
}
