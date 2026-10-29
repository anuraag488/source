package p000;

import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: wv */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1308wv extends o33 {

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ Object f33747b0;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ byte f33748y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1308wv(Object obj, byte b) {
        super(false);
        this.f33748y = b;
        this.f33747b0 = obj;
    }

    @Override // p000.o33
    public final void handleOnBackCancelled() {
        byte b = this.f33748y;
        Object obj = this.f33747b0;
        switch (b) {
            case 0:
                ((AbstractC0597e3) obj).mo4909i();
                break;
            default:
                eo1 eo1Var = (eo1) obj;
                if (eo1.m5212J(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + eo1Var);
                }
                eo1Var.m5243d();
                break;
        }
    }

    @Override // p000.o33
    public final void handleOnBackPressed() {
        byte b = this.f33748y;
        Object obj = this.f33747b0;
        switch (b) {
            case 0:
                ((AbstractC0597e3) obj).mo4910j();
                return;
            default:
                eo1 eo1Var = (eo1) obj;
                if (eo1.m5212J(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + eo1Var);
                }
                C1308wv c1308wv = eo1Var.f18313j;
                ArrayList arrayList = eo1Var.f18317n;
                eo1Var.f18312i = true;
                eo1Var.m5217A(true);
                int i = 0;
                eo1Var.f18312i = false;
                if (eo1Var.f18311h == null) {
                    if (c1308wv.isEnabled()) {
                        if (eo1.m5212J(3)) {
                            Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                        }
                        eo1Var.m5228Q();
                        return;
                    } else {
                        if (eo1.m5212J(3)) {
                            Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                        }
                        eo1Var.f18310g.m10975c();
                        return;
                    }
                }
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(eo1.m5211E(eo1Var.f18311h));
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        if (obj2 != null) {
                            xy4.m12778e();
                            return;
                        }
                        Iterator it = linkedHashSet.iterator();
                        if (it.hasNext()) {
                            throw null;
                        }
                    }
                }
                ArrayList arrayList2 = eo1Var.f18311h.f17434a;
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj3 = arrayList2.get(i3);
                    i3++;
                    pn1 pn1Var = ((po1) obj3).f27852b;
                    if (pn1Var != null) {
                        pn1Var.f27790m = false;
                    }
                }
                for (xw0 xw0Var : eo1Var.m5248g(new ArrayList(Collections.singletonList(eo1Var.f18311h)), 0, 1)) {
                    ArrayList arrayList3 = xw0Var.f34655c;
                    if (eo1.m5212J(3)) {
                        Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                    }
                    xw0Var.m12772e(arrayList3);
                    ArrayList arrayList4 = arrayList3;
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        ((va4) it2.next()).getClass();
                        mb0.m8260A0(arrayList5, null);
                    }
                    List listM6319e1 = hb0.m6319e1(hb0.m6322h1(arrayList5));
                    int size3 = listM6319e1.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        ((sa4) listM6319e1.get(i4)).mo10586a(xw0Var.f34653a);
                    }
                    int size4 = arrayList3.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        xw0Var.m12768a((va4) arrayList3.get(i5));
                    }
                    List listM6319e2 = hb0.m6319e1(arrayList4);
                    if (listM6319e2.size() > 0) {
                        ((va4) listM6319e2.get(0)).getClass();
                        throw null;
                    }
                }
                ArrayList arrayList6 = eo1Var.f18311h.f17434a;
                int size5 = arrayList6.size();
                while (i < size5) {
                    Object obj4 = arrayList6.get(i);
                    i++;
                    pn1 pn1Var2 = ((po1) obj4).f27852b;
                    if (pn1Var2 != null && pn1Var2.f27761F == null) {
                        eo1Var.m5249h(pn1Var2).m8053j();
                    }
                }
                eo1Var.f18311h = null;
                eo1Var.m5246e0();
                if (eo1.m5212J(3)) {
                    Log.d("FragmentManager", "Op is being set to null");
                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + c1308wv.isEnabled() + " for  FragmentManager " + eo1Var);
                    return;
                }
                return;
        }
    }

    @Override // p000.o33
    public final void handleOnBackProgressed(C1233uv c1233uv) {
        byte b = this.f33748y;
        Object obj = this.f33747b0;
        switch (b) {
            case 0:
                ((AbstractC0597e3) obj).mo4911k(c1233uv);
                break;
            default:
                eo1 eo1Var = (eo1) obj;
                if (eo1.m5212J(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + eo1Var);
                }
                if (eo1Var.f18311h != null) {
                    for (xw0 xw0Var : eo1Var.m5248g(new ArrayList(Collections.singletonList(eo1Var.f18311h)), 0, 1)) {
                        xw0Var.getClass();
                        if (eo1.m5212J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + c1233uv.f32198c);
                        }
                        ArrayList arrayList = xw0Var.f34655c;
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            ((va4) obj2).getClass();
                            mb0.m8260A0(arrayList2, null);
                        }
                        List listM6319e1 = hb0.m6319e1(hb0.m6322h1(arrayList2));
                        int size2 = listM6319e1.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ((sa4) listM6319e1.get(i2)).mo10587b(c1233uv);
                        }
                    }
                    Iterator it = eo1Var.f18317n.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        xy4.m12778e();
                        break;
                    }
                }
                break;
        }
    }

    @Override // p000.o33
    public final void handleOnBackStarted(C1233uv c1233uv) {
        byte b = this.f33748y;
        Object obj = this.f33747b0;
        switch (b) {
            case 0:
                ((AbstractC0597e3) obj).mo4912l();
                break;
            default:
                eo1 eo1Var = (eo1) obj;
                if (eo1.m5212J(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + eo1Var);
                }
                eo1Var.m5265x();
                do1 do1Var = new do1();
                do1Var.f17235a = eo1Var;
                VarHandle.storeStoreFence();
                eo1Var.m5266y(do1Var, false);
                break;
        }
    }
}
