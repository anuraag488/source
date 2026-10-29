package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class on6 implements Iterable {

    /* JADX INFO: renamed from: a */
    public ArrayList f26919a;

    /* JADX INFO: renamed from: b */
    public int f26920b;

    /* JADX INFO: renamed from: c */
    public int f26921c;

    /* JADX INFO: renamed from: d */
    public boolean f26922d;

    /* JADX INFO: renamed from: a */
    public final void m9193a(Object obj) {
        if (obj == null) {
            return;
        }
        ArrayList arrayList = this.f26919a;
        if (arrayList == null) {
            this.f26919a = new ArrayList(4);
        } else if (arrayList.contains(obj)) {
            return;
        }
        this.f26919a.add(obj);
        this.f26921c++;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9194b(Object obj) {
        ArrayList arrayList;
        int iIndexOf;
        if (obj == null || (arrayList = this.f26919a) == null || (iIndexOf = arrayList.indexOf(obj)) == -1) {
            return false;
        }
        if (this.f26920b == 0) {
            this.f26919a.remove(iIndexOf);
        } else {
            this.f26922d = true;
            this.f26919a.set(iIndexOf, null);
        }
        int i = this.f26921c - 1;
        this.f26921c = i;
        if (i == 0 && this.f26920b == 0) {
            this.f26919a = null;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        pk6 pk6Var = new pk6();
        pk6Var.f27723d = this;
        this.f26920b++;
        ArrayList arrayList = this.f26919a;
        pk6Var.f27720a = arrayList == null ? 0 : arrayList.size();
        VarHandle.storeStoreFence();
        return pk6Var;
    }
}
