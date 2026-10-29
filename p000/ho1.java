package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ho1 extends jy4 {

    /* JADX INFO: renamed from: h */
    public static final go1 f20746h = new go1((byte) 0);

    /* JADX INFO: renamed from: e */
    public final boolean f20750e;

    /* JADX INFO: renamed from: b */
    public final HashMap f20747b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f20748c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f20749d = new HashMap();

    /* JADX INFO: renamed from: f */
    public boolean f20751f = false;

    /* JADX INFO: renamed from: g */
    public boolean f20752g = false;

    public ho1(boolean z) {
        this.f20750e = z;
    }

    @Override // p000.jy4
    /* JADX INFO: renamed from: b */
    public final void mo5324b() {
        if (eo1.m5212J(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f20751f = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m6460c(pn1 pn1Var, boolean z) {
        if (eo1.m5212J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + pn1Var);
        }
        m6462e(pn1Var.f27782e, z);
    }

    /* JADX INFO: renamed from: d */
    public final void m6461d(String str, boolean z) {
        if (eo1.m5212J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        m6462e(str, z);
    }

    /* JADX INFO: renamed from: e */
    public final void m6462e(String str, boolean z) {
        HashMap map = this.f20748c;
        ho1 ho1Var = (ho1) map.get(str);
        if (ho1Var != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(ho1Var.f20748c.keySet());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ho1Var.m6461d((String) obj, true);
                }
            }
            ho1Var.mo5324b();
            map.remove(str);
        }
        HashMap map2 = this.f20749d;
        oy4 oy4Var = (oy4) map2.get(str);
        if (oy4Var != null) {
            oy4Var.m9336a();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ho1.class == obj.getClass()) {
            ho1 ho1Var = (ho1) obj;
            if (this.f20747b.equals(ho1Var.f20747b) && this.f20748c.equals(ho1Var.f20748c) && this.f20749d.equals(ho1Var.f20749d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m6463f(pn1 pn1Var) {
        if (this.f20752g) {
            if (eo1.m5212J(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f20747b.remove(pn1Var.f27782e) == null || !eo1.m5212J(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + pn1Var);
        }
    }

    public final int hashCode() {
        return this.f20749d.hashCode() + ((this.f20748c.hashCode() + (this.f20747b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f20747b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f20748c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f20749d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
