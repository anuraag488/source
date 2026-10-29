package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l94 implements Set, gc2 {

    /* JADX INFO: renamed from: a */
    public final y94 f23879a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ byte f23880b;

    public l94(y94 y94Var, byte b) {
        this.f23880b = b;
        this.f23879a = y94Var;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m7875a(Collection collection) {
        ha3 ha3Var;
        int i;
        e94 e94VarM7451h;
        boolean zM13053c;
        Set setM6322h1 = hb0.m6322h1(collection);
        y94 y94Var = this.f23879a;
        boolean z = false;
        do {
            synchronized (kx5.f23598j) {
                x94 x94Var = (x94) k94.m7449f(y94Var.f35052a);
                ha3Var = x94Var.f34083c;
                i = x94Var.f34084d;
            }
            ja3 ja3VarMo5946c = ha3Var.mo5946c();
            Object it = y94Var.f35053b.iterator();
            while (((AbstractC0856l1) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((gc4) it).next();
                if (!setM6322h1.contains(entry.getKey())) {
                    ja3VarMo5946c.remove(entry.getKey());
                    z = true;
                }
            }
            ha3 ha3VarMo5625b = ja3VarMo5946c.mo5625b();
            if (z62.m13387o(ha3VarMo5625b, ha3Var)) {
                break;
            }
            x94 x94Var2 = y94Var.f35052a;
            synchronized (k94.f23012c) {
                e94VarM7451h = k94.m7451h();
                zM13053c = y94.m13053c((x94) k94.m7466w(x94Var2, y94Var, e94VarM7451h), i, ha3VarMo5625b);
            }
            k94.m7455l(e94VarM7451h, y94Var);
        } while (!zM13053c);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f23880b) {
            case 0:
                kx5.m7741w0();
                throw null;
            case 1:
                kx5.m7741w0();
                throw null;
            default:
                kx5.m7741w0();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f23880b) {
            case 0:
                kx5.m7741w0();
                throw null;
            case 1:
                kx5.m7741w0();
                throw null;
            default:
                kx5.m7741w0();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f23879a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.f23880b;
        y94 y94Var = this.f23879a;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof cc2) && !(obj instanceof ec2))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return z62.m13387o(y94Var.get(entry.getKey()), entry.getValue());
            case 1:
                return y94Var.containsKey(obj);
            default:
                return y94Var.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        byte b = this.f23880b;
        y94 y94Var = this.f23879a;
        switch (b) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            return false;
                        }
                    }
                }
                return true;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!y94Var.containsKey(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!y94Var.containsValue(it3.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f23879a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.f23880b;
        y94 y94Var = this.f23879a;
        switch (b) {
            case 0:
                return new gc4(y94Var, ((y12) y94Var.m13054e().f34083c.entrySet()).iterator(), (byte) 0);
            case 1:
                return new gc4(y94Var, ((y12) y94Var.m13054e().f34083c.entrySet()).iterator(), (byte) 1);
            default:
                return new gc4(y94Var, ((y12) y94Var.m13054e().f34083c.entrySet()).iterator(), (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v8 java.lang.Object, still in use, count: 2, list:
          (r3v8 java.lang.Object) from 0x002e: PHI (r3 I:??) = (r3v3 java.lang.Object), (r3v8 java.lang.Object) binds: [B:10:0x002d, B:30:0x002e] A[DONT_GENERATE, DONT_INLINE]
          (r3v8 java.lang.Object) from 0x0020: CHECK_CAST (java.util.Map$Entry) (r3v8 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            byte r0 = r5.f23880b
            r1 = 0
            r2 = 1
            y94 r5 = r5.f23879a
            switch(r0) {
                case 0: goto L43;
                case 1: goto L3b;
                default: goto L9;
            }
        L9:
            l94 r0 = r5.f35053b
            java.util.Iterator r0 = r0.iterator()
        Lf:
            r3 = r0
            l1 r3 = (p000.AbstractC0856l1) r3
            boolean r3 = r3.hasNext()
            if (r3 == 0) goto L2d
            r3 = r0
            gc4 r3 = (p000.gc4) r3
            java.lang.Object r3 = r3.next()
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            boolean r4 = p000.z62.m13387o(r4, r6)
            if (r4 == 0) goto Lf
            goto L2e
        L2d:
            r3 = 0
        L2e:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 == 0) goto L3a
            java.lang.Object r6 = r3.getKey()
            r5.remove(r6)
            r1 = r2
        L3a:
            return r1
        L3b:
            java.lang.Object r5 = r5.remove(r6)
            if (r5 == 0) goto L42
            r1 = r2
        L42:
            return r1
        L43:
            boolean r0 = r6 instanceof java.util.Map.Entry
            if (r0 == 0) goto L5c
            boolean r0 = r6 instanceof p000.cc2
            if (r0 == 0) goto L4f
            boolean r0 = r6 instanceof p000.ec2
            if (r0 == 0) goto L5c
        L4f:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getKey()
            java.lang.Object r5 = r5.remove(r6)
            if (r5 == 0) goto L5c
            r1 = r2
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.l94.remove(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        ha3 ha3Var;
        int i;
        e94 e94VarM7451h;
        boolean zM13053c;
        boolean z = false;
        switch (this.f23880b) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.f23879a.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                }
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        if (this.f23879a.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                }
            default:
                Set setM6322h1 = hb0.m6322h1(collection);
                y94 y94Var = this.f23879a;
                do {
                    synchronized (kx5.f23598j) {
                        x94 x94Var = (x94) k94.m7449f(y94Var.f35052a);
                        ha3Var = x94Var.f34083c;
                        i = x94Var.f34084d;
                    }
                    ja3 ja3VarMo5946c = ha3Var.mo5946c();
                    Object it3 = y94Var.f35053b.iterator();
                    while (((AbstractC0856l1) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((gc4) it3).next();
                        if (setM6322h1.contains(entry.getValue())) {
                            ja3VarMo5946c.remove(entry.getKey());
                            z = true;
                        }
                    }
                    ha3 ha3VarMo5625b = ja3VarMo5946c.mo5625b();
                    if (!z62.m13387o(ha3VarMo5625b, ha3Var)) {
                        x94 x94Var2 = y94Var.f35052a;
                        synchronized (k94.f23012c) {
                            e94VarM7451h = k94.m7451h();
                            zM13053c = y94.m13053c((x94) k94.m7466w(x94Var2, y94Var, e94VarM7451h), i, ha3VarMo5625b);
                        }
                        k94.m7455l(e94VarM7451h, y94Var);
                    }
                    return z;
                } while (!zM13053c);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        ha3 ha3Var;
        int i;
        e94 e94VarM7451h;
        boolean zM13053c;
        ha3 ha3Var2;
        int i2;
        e94 e94VarM7451h2;
        boolean zM13053c2;
        boolean z = false;
        switch (this.f23880b) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int iM5779K = fq2.m5779K(ib0.m6717y0(collection2, 10));
                if (iM5779K < 16) {
                    iM5779K = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM5779K);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                y94 y94Var = this.f23879a;
                do {
                    synchronized (kx5.f23598j) {
                        x94 x94Var = (x94) k94.m7449f(y94Var.f35052a);
                        ha3Var = x94Var.f34083c;
                        i = x94Var.f34084d;
                    }
                    ja3 ja3VarMo5946c = ha3Var.mo5946c();
                    Object it = y94Var.f35053b.iterator();
                    while (((AbstractC0856l1) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((gc4) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !z62.m13387o(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            ja3VarMo5946c.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    ha3 ha3VarMo5625b = ja3VarMo5946c.mo5625b();
                    if (!z62.m13387o(ha3VarMo5625b, ha3Var)) {
                        x94 x94Var2 = y94Var.f35052a;
                        synchronized (k94.f23012c) {
                            e94VarM7451h = k94.m7451h();
                            zM13053c = y94.m13053c((x94) k94.m7466w(x94Var2, y94Var, e94VarM7451h), i, ha3VarMo5625b);
                        }
                        k94.m7455l(e94VarM7451h, y94Var);
                    }
                    return z;
                } while (!zM13053c);
                return z;
            case 1:
                return m7875a(collection);
            default:
                Set setM6322h1 = hb0.m6322h1(collection);
                y94 y94Var2 = this.f23879a;
                do {
                    synchronized (kx5.f23598j) {
                        x94 x94Var3 = (x94) k94.m7449f(y94Var2.f35052a);
                        ha3Var2 = x94Var3.f34083c;
                        i2 = x94Var3.f34084d;
                    }
                    ja3 ja3VarMo5946c2 = ha3Var2.mo5946c();
                    Object it2 = y94Var2.f35053b.iterator();
                    while (((AbstractC0856l1) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((gc4) it2).next();
                        if (!setM6322h1.contains(entry3.getValue())) {
                            ja3VarMo5946c2.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    ha3 ha3VarMo5625b2 = ja3VarMo5946c2.mo5625b();
                    if (!z62.m13387o(ha3VarMo5625b2, ha3Var2)) {
                        x94 x94Var4 = y94Var2.f35052a;
                        synchronized (k94.f23012c) {
                            e94VarM7451h2 = k94.m7451h();
                            zM13053c2 = y94.m13053c((x94) k94.m7466w(x94Var4, y94Var2, e94VarM7451h2), i2, ha3VarMo5625b2);
                        }
                        k94.m7455l(e94VarM7451h2, y94Var2);
                    }
                    return z;
                } while (!zM13053c2);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f23879a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return zy5.m13859W(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return zy5.m13860X(this, objArr);
    }
}
