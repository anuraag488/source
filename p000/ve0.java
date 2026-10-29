package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ve0 extends AbstractSet {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32552a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ye0 f32553b;

    public /* synthetic */ ve0(ye0 ye0Var, byte b) {
        this.f32552a = b;
        this.f32553b = ye0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.f32552a;
        ye0 ye0Var = this.f32553b;
        switch (b) {
            case 0:
                ye0Var.clear();
                break;
            default:
                ye0Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.f32552a;
        ye0 ye0Var = this.f32553b;
        switch (b) {
            case 0:
                Map mapM13099b = ye0Var.m13099b();
                if (mapM13099b != null) {
                    return mapM13099b.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iM13101d = ye0Var.m13101d(entry.getKey());
                    if (iM13101d != -1 && qs5.m10116u(ye0Var.m13107k()[iM13101d], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return ye0Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.f32552a;
        ye0 ye0Var = this.f32553b;
        switch (b) {
            case 0:
                Map mapM13099b = ye0Var.m13099b();
                return mapM13099b != null ? mapM13099b.entrySet().iterator() : new ue0(ye0Var, (byte) 1);
            default:
                Map mapM13099b2 = ye0Var.m13099b();
                return mapM13099b2 != null ? mapM13099b2.keySet().iterator() : new ue0(ye0Var, (byte) 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.f32552a;
        ye0 ye0Var = this.f32553b;
        switch (b) {
            case 0:
                Map mapM13099b = ye0Var.m13099b();
                if (mapM13099b != null) {
                    return mapM13099b.entrySet().remove(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (ye0Var.m13103f()) {
                    return false;
                }
                int iM13100c = ye0Var.m13100c();
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = ye0Var.f35150a;
                Objects.requireNonNull(obj2);
                int iM10707V = se0.m10707V(key, value, iM13100c, obj2, ye0Var.m13105i(), ye0Var.m13106j(), ye0Var.m13107k());
                if (iM10707V == -1) {
                    return false;
                }
                ye0Var.m13102e(iM10707V, iM13100c);
                ye0Var.f35155f--;
                ye0Var.f35154e += 32;
                return true;
            default:
                Map mapM13099b2 = ye0Var.m13099b();
                if (mapM13099b2 != null) {
                    return mapM13099b2.keySet().remove(obj);
                }
                return ye0Var.m13104h(obj) != ye0.f35149j;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.f32552a;
        ye0 ye0Var = this.f32553b;
        switch (b) {
            case 0:
                break;
        }
        return ye0Var.size();
    }
}
