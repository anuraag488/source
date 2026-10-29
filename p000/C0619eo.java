package p000;

import java.lang.invoke.VarHandle;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: eo */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0619eo extends AbstractSet {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18284a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Map f18285b;

    public /* synthetic */ C0619eo(Map map, byte b) {
        this.f18284a = b;
        this.f18285b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        byte b = this.f18284a;
        Map map = this.f18285b;
        switch (b) {
            case 3:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((lk6) map).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 4:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((mq6) map).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        byte b = this.f18284a;
        Map map = this.f18285b;
        switch (b) {
            case 3:
                ((lk6) map).clear();
                break;
            case 4:
                ((mq6) map).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        byte b = this.f18284a;
        Map map = this.f18285b;
        switch (b) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ((t84) map).get(entry.getKey());
                return entry.getValue() == null;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                ((nw5) map).get(entry2.getKey());
                return entry2.getValue() == null;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj2 = ((lk6) map).get(entry3.getKey());
                Object value = entry3.getValue();
                if (obj2 != value) {
                    return obj2 != null && obj2.equals(value);
                }
                return true;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                Object obj3 = ((mq6) map).get(entry4.getKey());
                Object value2 = entry4.getValue();
                if (obj3 != value2) {
                    return obj3 != null && obj3.equals(value2);
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.f18284a;
        byte b2 = 0;
        byte b3 = 1;
        Map map = this.f18285b;
        switch (b) {
            case 0:
                C0805jo c0805jo = (C0805jo) map;
                C0732ho c0732ho = new C0732ho();
                c0732ho.f20741d = c0805jo;
                c0732ho.f20738a = c0805jo.f34030c - 1;
                c0732ho.f20739b = -1;
                VarHandle.storeStoreFence();
                return c0732ho;
            case 1:
                s84 s84Var = new s84(b2);
                s84Var.f29971c = (t84) map;
                s84Var.f29970b = -1;
                VarHandle.storeStoreFence();
                return s84Var;
            case 2:
                s84 s84Var2 = new s84((byte) 2);
                s84Var2.f29971c = (nw5) map;
                s84Var2.f29970b = -1;
                VarHandle.storeStoreFence();
                return s84Var2;
            case 3:
                uk6 uk6Var = new uk6(b2);
                uk6Var.f31964e = (lk6) map;
                uk6Var.f31961b = -1;
                VarHandle.storeStoreFence();
                return uk6Var;
            default:
                uk6 uk6Var2 = new uk6(b3);
                uk6Var2.f31964e = (mq6) map;
                uk6Var2.f31961b = -1;
                VarHandle.storeStoreFence();
                return uk6Var2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        byte b = this.f18284a;
        Map map = this.f18285b;
        switch (b) {
            case 3:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((lk6) map).remove(entry.getKey());
                return true;
            case 4:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((mq6) map).remove(entry2.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.f18284a;
        Map map = this.f18285b;
        switch (b) {
            case 0:
                return ((C0805jo) map).f34030c;
            case 1:
                return ((t84) map).f30999b;
            case 2:
                return ((nw5) map).f26156b;
            case 3:
                return ((lk6) map).size();
            default:
                return ((mq6) map).size();
        }
    }
}
