package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hw2 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f20901a;

    /* JADX INFO: renamed from: b */
    public final C1302wp f20902b;

    public hw2(LinkedHashMap linkedHashMap, boolean z) {
        this.f20901a = linkedHashMap;
        C1302wp c1302wp = new C1302wp();
        c1302wp.f33577a = new AtomicBoolean(z);
        VarHandle.storeStoreFence();
        this.f20902b = c1302wp;
    }

    /* JADX INFO: renamed from: a */
    public final Map m6523a() {
        l73 l73Var;
        Set<Map.Entry> setEntrySet = this.f20901a.entrySet();
        int iM5779K = fq2.m5779K(ib0.m6717y0(setEntrySet, 10));
        if (iM5779K < 16) {
            iM5779K = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM5779K);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                l73Var = new l73(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                l73Var = new l73(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(l73Var.f23833a, l73Var.f23834b);
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: b */
    public final void m6524b() {
        if (this.f20902b.f33577a.get()) {
            C1077qn.m9989o("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m6525c(xd3 xd3Var) {
        Object obj = this.f20901a.get(xd3Var);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: d */
    public final void m6526d(xd3 xd3Var) {
        m6524b();
        this.f20901a.remove(xd3Var);
    }

    /* JADX INFO: renamed from: e */
    public final void m6527e(xd3 xd3Var, Object obj) {
        m6524b();
        if (obj == null) {
            m6526d(xd3Var);
            return;
        }
        boolean z = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f20901a;
        if (z) {
            linkedHashMap.put(xd3Var, Collections.unmodifiableSet(hb0.m6322h1((Set) obj)));
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(xd3Var, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(xd3Var, Arrays.copyOf(bArr, bArr.length));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public final boolean equals(Object obj) {
        boolean zM13387o;
        if (obj instanceof hw2) {
            LinkedHashMap linkedHashMap = ((hw2) obj).f20901a;
            LinkedHashMap linkedHashMap2 = this.f20901a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zM13387o = z62.m13387o(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zM13387o = true;
                                } else {
                                    zM13387o = false;
                                }
                            } else {
                                zM13387o = false;
                            }
                            if (!zM13387o) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.f20901a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return hb0.m6305Q0(this.f20901a.entrySet(), ",\n", "{\n", "\n}", 0, new kr2((byte) 7), 24);
    }

    public /* synthetic */ hw2(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
