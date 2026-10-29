package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: jo */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0805jo extends x64 implements Map {

    /* JADX INFO: renamed from: d */
    public C0619eo f22457d;

    /* JADX INFO: renamed from: e */
    public C0695go f22458e;

    /* JADX INFO: renamed from: f */
    public C0769io f22459f;

    @Override // java.util.Map
    public final Set entrySet() {
        C0619eo c0619eo = this.f22457d;
        if (c0619eo != null) {
            return c0619eo;
        }
        C0619eo c0619eo2 = new C0619eo(this, (byte) 0);
        this.f22457d = c0619eo2;
        return c0619eo2;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m7193j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m7194k(Collection collection) {
        int i = this.f34030c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f34030c;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0695go c0695go = this.f22458e;
        if (c0695go != null) {
            return c0695go;
        }
        C0695go c0695go2 = new C0695go();
        c0695go2.f19987a = this;
        VarHandle.storeStoreFence();
        this.f22458e = c0695go2;
        return c0695go2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f34030c;
        int i = this.f34030c;
        int[] iArr = this.f34028a;
        if (iArr.length < size) {
            this.f34028a = Arrays.copyOf(iArr, size);
            this.f34029b = Arrays.copyOf(this.f34029b, size * 2);
        }
        if (this.f34030c != i) {
            C1077qn.m9983c();
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C0769io c0769io = this.f22459f;
        if (c0769io != null) {
            return c0769io;
        }
        C0769io c0769io2 = new C0769io();
        c0769io2.f21602a = this;
        VarHandle.storeStoreFence();
        this.f22459f = c0769io2;
        return c0769io2;
    }
}
