package p000;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xw0 {

    /* JADX INFO: renamed from: a */
    public ViewGroup f34653a;

    /* JADX INFO: renamed from: b */
    public ArrayList f34654b;

    /* JADX INFO: renamed from: c */
    public ArrayList f34655c;

    /* JADX INFO: renamed from: d */
    public boolean f34656d;

    /* JADX INFO: renamed from: e */
    public boolean f34657e;

    /* JADX INFO: renamed from: f */
    public boolean f34658f;

    /* JADX INFO: renamed from: a */
    public final void m12768a(va4 va4Var) {
        if (va4Var.f32497a) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12769b(ArrayList arrayList, boolean z) {
        if (eo1.m5212J(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            va4 va4Var = (va4) it.next();
            ua4 ua4Var = ua4.f31759a;
            va4Var.getClass();
            throw null;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        if (listIterator.hasPrevious()) {
            va4 va4Var2 = (va4) listIterator.previous();
            ua4 ua4Var2 = ua4.f31759a;
            va4Var2.getClass();
            throw null;
        }
        if (eo1.m5212J(2)) {
            Log.v("FragmentManager", "Executing operations from null to null");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ((va4) hb0.m6306R0(arrayList)).getClass();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            ((va4) it2.next()).getClass();
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            uw0 uw0Var = new uw0();
            VarHandle.storeStoreFence();
            arrayList2.add(uw0Var);
            ua4 ua4Var3 = ua4.f31759a;
            if (!z) {
                throw null;
            }
            throw null;
        }
        ArrayList arrayList4 = new ArrayList();
        int i = 0;
        if (arrayList3.size() > 0) {
            ((ww0) arrayList3.get(0)).getClass();
            throw null;
        }
        ArrayList arrayList5 = new ArrayList();
        int size = arrayList4.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList4.get(i2);
            i2++;
            ((ww0) obj).getClass();
        }
        int size2 = arrayList5.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList5.get(i3);
            i3++;
            ((ww0) obj2).getClass();
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        int size3 = arrayList2.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            ((uw0) obj3).getClass();
            mb0.m8260A0(arrayList7, null);
        }
        boolean zIsEmpty = arrayList7.isEmpty();
        if (arrayList2.size() > 0) {
            uw0 uw0Var2 = (uw0) arrayList2.get(0);
            this.f34653a.getContext();
            uw0Var2.getClass();
            ua4 ua4Var4 = ua4.f31759a;
            throw null;
        }
        int size4 = arrayList6.size();
        while (i < size4) {
            Object obj4 = arrayList6.get(i);
            i++;
            ((uw0) obj4).getClass();
            if (zIsEmpty) {
                throw null;
            }
            if (eo1.m5212J(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on null as Animations cannot run alongside Transitions.");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12770c() {
        if (this.f34658f) {
            return;
        }
        if (!this.f34653a.isAttachedToWindow()) {
            m12771d();
            this.f34657e = false;
            return;
        }
        synchronized (this.f34654b) {
            try {
                ArrayList arrayList = new ArrayList(this.f34655c);
                this.f34655c.clear();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    va4 va4Var = (va4) obj;
                    if (!this.f34654b.isEmpty()) {
                        va4Var.getClass();
                        throw null;
                    }
                    va4Var.getClass();
                }
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    va4 va4Var2 = (va4) obj2;
                    if (this.f34656d) {
                        if (eo1.m5212J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + va4Var2);
                        }
                        va4Var2.m11787b();
                        throw null;
                    }
                    if (eo1.m5212J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + va4Var2);
                    }
                    va4Var2.m11786a(this.f34653a);
                    this.f34656d = false;
                    this.f34655c.add(va4Var2);
                }
                if (!this.f34654b.isEmpty()) {
                    m12773f();
                    ArrayList arrayList2 = new ArrayList(this.f34654b);
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    this.f34654b.clear();
                    this.f34655c.addAll(arrayList2);
                    if (eo1.m5212J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    m12769b(arrayList2, this.f34657e);
                    if (arrayList2.size() > 0) {
                        ((va4) arrayList2.get(0)).getClass();
                        throw null;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size3 = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        Object obj3 = arrayList2.get(i3);
                        i3++;
                        ((va4) obj3).getClass();
                        mb0.m8260A0(arrayList3, null);
                    }
                    boolean zIsEmpty = arrayList3.isEmpty();
                    boolean z = !zIsEmpty;
                    if (arrayList2.size() > 0) {
                        ((va4) arrayList2.get(0)).getClass();
                        throw null;
                    }
                    this.f34656d = !z;
                    if (eo1.m5212J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + z + " \ntransition = true");
                    }
                    if (!zIsEmpty) {
                        m12772e(arrayList2);
                        int size4 = arrayList2.size();
                        for (int i4 = 0; i4 < size4; i4++) {
                            m12768a((va4) arrayList2.get(i4));
                        }
                    }
                    this.f34657e = false;
                    if (eo1.m5212J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m12771d() {
        String str;
        String str2;
        if (eo1.m5212J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f34653a.isAttachedToWindow();
        synchronized (this.f34654b) {
            try {
                m12773f();
                m12772e(this.f34654b);
                ArrayList arrayList = new ArrayList(this.f34655c);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((va4) obj).getClass();
                }
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    va4 va4Var = (va4) obj2;
                    if (eo1.m5212J(2)) {
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f34653a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + va4Var);
                    }
                    va4Var.m11786a(this.f34653a);
                }
                ArrayList arrayList2 = new ArrayList(this.f34654b);
                int size3 = arrayList2.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    ((va4) obj3).getClass();
                }
                int size4 = arrayList2.size();
                while (i < size4) {
                    Object obj4 = arrayList2.get(i);
                    i++;
                    va4 va4Var2 = (va4) obj4;
                    if (eo1.m5212J(2)) {
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f34653a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + va4Var2);
                    }
                    va4Var2.m11786a(this.f34653a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m12772e(List list) {
        if (list.size() > 0) {
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((va4) it.next()).getClass();
            mb0.m8260A0(arrayList, null);
        }
        List listM6319e1 = hb0.m6319e1(hb0.m6322h1(arrayList));
        int size = listM6319e1.size();
        for (int i = 0; i < size; i++) {
            sa4 sa4Var = (sa4) listM6319e1.get(i);
            ViewGroup viewGroup = this.f34653a;
            if (!sa4Var.f30040a) {
                sa4Var.mo10588c(viewGroup);
            }
            sa4Var.f30040a = true;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m12773f() {
        ArrayList arrayList = this.f34654b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((va4) obj).getClass();
            ta4 ta4Var = ta4.f31042a;
        }
    }
}
