package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zt3 implements Iterable {

    /* JADX INFO: renamed from: a */
    public wt3 f36360a;

    /* JADX INFO: renamed from: b */
    public wt3 f36361b;

    /* JADX INFO: renamed from: c */
    public final WeakHashMap f36362c = new WeakHashMap();

    /* JADX INFO: renamed from: d */
    public int f36363d = 0;

    public final boolean equals(Object obj) {
        vt3 vt3Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zt3)) {
            return false;
        }
        zt3 zt3Var = (zt3) obj;
        if (this.f36363d != zt3Var.f36363d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = zt3Var.iterator();
        while (true) {
            vt3Var = (vt3) it;
            if (!vt3Var.hasNext()) {
                break;
            }
            vt3 vt3Var2 = (vt3) it2;
            if (!vt3Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) vt3Var.next();
            Object next = vt3Var2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (vt3Var.hasNext() || ((vt3) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            vt3 vt3Var = (vt3) it;
            if (!vt3Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) vt3Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        wt3 wt3Var = this.f36360a;
        wt3 wt3Var2 = this.f36361b;
        vt3 vt3Var = new vt3();
        vt3Var.f32859a = wt3Var2;
        vt3Var.f32860b = wt3Var;
        this.f36362c.put(vt3Var, Boolean.FALSE);
        return vt3Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            vt3 vt3Var = (vt3) it;
            if (!vt3Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) vt3Var.next()).toString());
            if (vt3Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
